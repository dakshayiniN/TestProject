package com.danske.training.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DosCommands {

	public static void main(String[] args) {
		String command = args[0];
		// System.out.println(command);
		switch (command) {
		case "copy":
			doCopy(args);
			break;
		case "dir":
			doDir(args);
			break;
		default:
			System.out.println("Bad Command!!");
		}

	}

	private static void doDir(String[] args) {
		String path = args[1];
		File aDirectory = new File(path);
		if(aDirectory.exists() && aDirectory.isDirectory()) {
			String[] contents = aDirectory.list();
			for(String s:contents) {
				System.out.println(s);
			}
		}

	}

	private static void doCopy(String[] args) {
		String src = args[1];
		String dest = args[2];
		long start = System.currentTimeMillis();
		try (FileInputStream fin = new FileInputStream(src); FileOutputStream fout = new FileOutputStream(dest);) {
			BufferedInputStream bin = new BufferedInputStream(fin);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			int aByte;
			while ((aByte = bin.read()) != -1) {
				bout.write(aByte);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		long stop = System.currentTimeMillis();
		System.out.println("Time taken is "+(stop - start)+" ms.");

	}

}
