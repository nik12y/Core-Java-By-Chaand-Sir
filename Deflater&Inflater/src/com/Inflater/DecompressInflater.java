package com.Inflater;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class DecompressInflater {

	public static void main(String[] args) throws IOException {
		// Assign the file input Stream
		FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\\\Desktop\\zipDeflater1.txt");

		// FileOutPutStream
		FileOutputStream fos = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\zipInflater.txt");
         System.out.println("SuccessFull");
		// add fileInput Stream to inflaterInputStram
		InflaterInputStream iisDecompress = new InflaterInputStream(fis);

		// read the data from InflaterInputStream and write it into FileOutPutStream
		int data;
		while ((data = iisDecompress.read()) != -1) {
			fos.write(data);
		}

		fis.close();
		iisDecompress.close();
		fos.close();
	}

}
