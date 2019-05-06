package com.kh.miniProject.controller;

import java.awt.Image;
import java.io.File;

import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.dao.ImageOutput;
import com.kh.miniProject.model.dao.PTextOutput;
import com.kh.miniProject.model.dao.TextOutput;

public class FileController {

	public String[] goGirlImages(int lev) {

		return new GirlImageController().girlImageOut(lev, new GirlImages().girlImages(lev));

	}

	public Image goImageOutput(int i) {

		return new ImageOutput().imageOutput(i);
		
	}

	public File textOutgoTput(String place) {

		return new TextOutput().textOutput(place);
		
	}

	public File PtextOutgoTput(String place) {

		return new PTextOutput().PtextOutput(place);
		
	}

	public File EtextOutgoTput(String place) {

		return new PTextOutput().EtextOutput(place);
		
	}

}
