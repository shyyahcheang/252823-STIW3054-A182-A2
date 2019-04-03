package com.assignment2.maven.MavenProject;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.pdfbox.util.PDFTextStripperByArea;

public class Thread_5 implements Runnable {
	
	public void run() {
		try (PDDocument pdf = PDDocument.load(new File("A182 Draft Stud.pdf"))) {
			pdf.getClass();
			if (!pdf.isEncrypted()) {
				PDFTextStripperByArea pdfTextStripperByArea = new PDFTextStripperByArea();
				pdfTextStripperByArea.setSortByPosition(Boolean.TRUE);

				PDFTextStripper pdfTextStripper = new PDFTextStripper();
				
				//load all lines into a string
				String pdfFileInText = pdfTextStripper.getText(pdf);
           
				//split by detecting newline
				String lines[] = pdfFileInText.split("\\r?\\n");

				System.out.println("\nDisplay the information of STIW3054 :");
				for (String line : lines) {
					if (line.contains("STIW3054")) {
						System.out.print(" " + line);
					}
				}
			}
		} catch (IOException e) {
			System.out.println("FAILED.\n[" + e.getMessage() + "]\n");
		}
	}
}
