package com.assignment2.maven.MavenProject;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.pdfbox.util.PDFTextStripperByArea;

public class Thread_1 implements Runnable {
	
	public void run() {
		int course = 0;
		try (PDDocument pdf = PDDocument.load(new File("A182 Draft Stud.pdf"))) {
			pdf.getClass();
			if (!pdf.isEncrypted()) {
				PDFTextStripperByArea pdfTextStripperByArea = new PDFTextStripperByArea();
				pdfTextStripperByArea.setSortByPosition(Boolean.TRUE);

				PDFTextStripper pdfTextStripper = new PDFTextStripper();
				
				//load all lines into a string
				String pdfFileInText = pdfTextStripper.getText(pdf);
				
				for(int i = 1; i <= pdfFileInText.length(); i++) {
					if (pdfFileInText.contains(i + ".")) {
						course = course + 1;
					}
				}
				System.out.println("Total number of course are " + course);
			}
		} catch (IOException e) {
			System.out.println("FAILED.\n[" + e.getMessage() + "]\n");
		}
	}
}
