package com.fileCompression;

import java.io.*;
import java.util.zip.*;

public class FileGZIPCompression {

	public static void compress(File source, File destination) throws IOException {

		byte[] buffer = new byte[1024];
		FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(destination);
		GZIPOutputStream gzos = new GZIPOutputStream(fos);

		int read;
		while ((read = fis.read(buffer)) != -1) {
			gzos.write(buffer, 0, read);
		}
		gzos.finish();
		gzos.close();
		fis.close();
		fos.close();
	}

	public static void main(String[] args) {
		File source = new File("C://Users//lenovo//Desktop//zipexample.txt");

		File destination = new File("D://compress2.txt");
		try {
			compress(source, destination);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
