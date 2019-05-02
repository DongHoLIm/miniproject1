package com.kh.miniProject.model.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PTextOutput {
	private ArrayList al;
	public static int prologueNum = 0;
	public static int epilogueNum = 0;
	public int getPrologueNum() {
		return prologueNum;
	}

	public void setPrologueNum(int prologueNum) {
		this.prologueNum = prologueNum;
	}

	public File PtextOutput(String place) {

		File movielove = new File("Story/prologue" + prologueNum);
		return movielove;

	}

	public File EtextOutput(String place) {

		File movielove = new File("Story/Epilogue" + epilogueNum);
		return movielove;

	}

}
