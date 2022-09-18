package com.decompress;

import java.io.*;
import java.util.zip.GZIPInputStream;

public class FileDecomressGZIP {

	public static void decompress(File source , File destination) throws IOException {
		byte[] buffer=new byte[1024];
		FileInputStream fis=new FileInputStream(source);
		GZIPInputStream gzis= new GZIPInputStream(fis) ;
		FileOutputStream fos=new FileOutputStream(destination);
		int read;
		while((read=gzis.read(buffer))!=-1) {
			fos.write(buffer, 0, read);
		}
		gzis.close();
		fos.close();
		fis.close();
	}
	
	public static void main(String[] args) {
		File source=new File("C:\\Users\\lenovo\\Desktop\\zip.txt");
		File destination=new File("D://zipdecompresexample.txt");
		try {
			decompress(source, destination);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

