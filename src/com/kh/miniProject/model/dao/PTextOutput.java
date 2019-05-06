package com.kh.miniProject.model.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.kh.miniProject.view.Main;

public class PTextOutput {
	

	public File PtextOutput(String place) {

		File movielove = new File("Story/prologue" + Main.ec.ev.getEpilogueNum());
		return movielove;

	}

	public File EtextOutput(String place) {
		
		File movielove = new File("Story/Epilogue" + Main.ec.ev.getEpilogueNum());
		
		return movielove;

	}

}
