package com.assignment2.maven.MavenProject;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.pdfbox.util.PDFTextStripperByArea;

public class Thread_3 extends MultiThread implements Runnable {
	
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

				System.out.println("\nList of courses from SOC :");
				for (String line : lines) {
					if (line.contains("STIA1") || line.contains("STIA2")) {
						System.out.println(" " + line);
					}
					else if(line.contains("STID1") || line.contains("STID3") || line.contains("STID4")) {
						System.out.println(" " + line);
					}
					else if(line.contains("STIJ2") || line.contains("STIJ3")) {
						System.out.println(" " + line);
					}
					else if(line.contains("STIK1") || line.contains("STIK2")) {
						System.out.println(" " + line);
					}
					else if(line.contains("STIN1") || line.contains("STIN2") || line.contains("STIN3")) {
						System.out.println(" " + line);
					}
					else if(line.contains("STIW2") || line.contains("STIW3")) {
						System.out.println(" " + line);
					}
					else if(line.contains("STQM1") || line.contains("STQM2")) {
						System.out.println(" " + line);
					}
					else if(line.contains("STQS1")) {
						System.out.println(" " + line);
					}
				}
			}
		} catch (IOException e) {
			System.out.println("FAILED.\n[" + e.getMessage() + "]\n");
		}
	}
}
