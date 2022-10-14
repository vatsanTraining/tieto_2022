package com.training.services;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

import com.training.ifaces.ImageProcessing;

@WebService(endpointInterface = "com.training.ifaces.ImageProcessing")
@MTOM(enabled =true)
public class ImageProcessingImpl implements ImageProcessing {

	@Override
	public Image getImage(String imageName) {
		
		try {
			return ImageIO.read(new File(imageName));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String sendImage(Image image) {

		
		BufferedImage buffImage = (BufferedImage)image;
		
		try {
			ImageIO.write(buffImage, "png", new File("download.png"));
			
			return "Image Upload Sucess";
		} catch (IOException e) {
			
			e.printStackTrace();
			
			return "Image Upload FAILED";
		}
		
		
	}

}
