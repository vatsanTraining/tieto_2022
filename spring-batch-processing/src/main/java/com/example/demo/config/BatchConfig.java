package com.example.demo.config;

import java.util.List;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Student;
import com.example.demo.repos.StudentRepository;



@Configuration
@EnableBatchProcessing
public class BatchConfig {


	/*
	 * class Dummy implements ItemWriter<Student>{
	 * 
	 * @Autowired StudentRepository repo;
	 * 
	 * @Override public void write(List<? extends Student> items) throws Exception {
	 * 
	 * this.repo.saveAll(items); }
	 * 
	 * 
	 * }
	 */
	
	@Bean
	public ItemWriter<Student> writer(StudentRepository repo){
		
		return students -> repo.saveAll(students);
		
		
	}
	
	@Bean
	public ItemProcessor<Student, Student> processor(){
		
	
		 return student ->{
			
			 if(student.getMarkScored()<60) {
				 student.setMarkScored(student.getMarkScored()+7);
			 }
			 return student;

		 };
	}
}
