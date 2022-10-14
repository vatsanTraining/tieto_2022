package com.training.ifaces;

import java.awt.Image;

import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

@WebService
public interface ImageProcessing {

	public Image getImage(String imageName);
	public String sendImage(Image image);
	
}
