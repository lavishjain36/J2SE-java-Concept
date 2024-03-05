package com.exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception5 {

	public static void main(String[] args) {
		try {
			//Create a file 
			File file=new File("E://file.txt");
			//To read the 
			FileReader fr=new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File doesn't exist");
		}

	}

}
