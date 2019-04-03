package com.assignment2.maven.MavenProject;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.pdfbox.util.PDFTextStripperByArea;

public class Thread_4 extends MultiThread implements Runnable {
	
	public void run() {
		int socCourse = 0;
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

				//for (String line : lines) { 
				for(int i = 0; i < lines.length; i++) {
					if (lines[i].contains("STIA1") || lines[i].contains("STIA2")) {
						socCourse++;
					}
					else if(lines[i].contains("STID1") || lines[i].contains("STID3") || lines[i].contains("STID4")) {
						socCourse++;
					}
					else if(lines[i].contains("STIJ2") || lines[i].contains("STIJ3")) {
						socCourse++;
					}
					else if(lines[i].contains("STIK1") || lines[i].contains("STIK2")) {
						socCourse++;
					}
					else if(lines[i].contains("STIN1") || lines[i].contains("STIN2") || lines[i].contains("STIN3")) {
						socCourse++;
					}
					else if(lines[i].contains("STIW2") || lines[i].contains("STIW3")) {
						socCourse++;
					}
					else if(lines[i].contains("STQM1") || lines[i].contains("STQM2")) {
						socCourse++;
					}
					else if(lines[i].contains("STQS1")) {
						socCourse++;
					}
				}
				
				System.out.println("\nNumber of courses from SOC are " + socCourse);
			}
		} catch (IOException e) {
			System.out.println("FAILED.\n[" + e.getMessage() + "]\n");
		}
	}
}
