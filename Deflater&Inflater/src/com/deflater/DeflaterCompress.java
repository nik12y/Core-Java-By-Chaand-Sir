package com.deflater;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class DeflaterCompress {

	public static void main(String[] args) throws IOException {
		//Assign the file input
		FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\Desktop\\zipexample.txt");
		System.out.println("Successfull");
		//Assign fileOutPutStram
		FileOutputStream fos=new FileOutputStream("C:\\Users\\lenovo\\Desktop\\zipDeflater1.txt");
		
		//add fileOutPotStream into Deflater
		DeflaterOutputStream compress=new DeflaterOutputStream(fos);
		
		//read the data from fileInputStream and write it into DeflaterOutputStream
		int data;
		while((data=fis.read())!=-1) {
			compress.write(data);
		}
		fis.close();
		compress.close();
		
	}
}
