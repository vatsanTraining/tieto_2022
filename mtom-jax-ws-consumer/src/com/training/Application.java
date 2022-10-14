package com.training;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.training.client.ImageProcessing;
import com.training.client.ImageProcessingImplService;

public class Application {

	
	public static void uploadImage() {

		 ImageProcessing service =
				
				new ImageProcessingImplService().getImageProcessingImplPort();
		 
		 try {
			BufferedImage buffImage = ImageIO.read(new File("doctor.png"));
			
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			
			  ImageIO.write(buffImage, "png", stream);
			  
			  byte[] bytes = stream.toByteArray();

			System.out.println(service.sendImage(bytes));

			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void downloadImage()
	{

		ImageProcessing service =
				
				new ImageProcessingImplService().getImageProcessingImplPort();
		
		String imageName = "developer.png";
		    byte[] bytes=service.getImage(imageName);
		    
                InputStream stream = new ByteArrayInputStream(bytes);
                
                try {
					BufferedImage buffImage = ImageIO.read(stream);
					 ImageIO.write(buffImage, "png", new File(imageName));
					 
					 System.out.println("Image Saved ");
					 
					 JFrame frame = new JFrame("Show Image");
					 frame.setSize(300,250);
					 
					 JLabel label = new JLabel(new ImageIcon(buffImage));
					 frame.add(label);
					 frame.setVisible(true);
					 

					 
				} catch (IOException e) {
					e.printStackTrace();
				}
                
                

	}
	public static void main(String[] args) {

                
		//downloadImage();
                uploadImage();
	}

}
