package com.test.main;

import java.io.IOException;

import com.util.reader.PDFTextParser;

public class JavaPDFTest {

    public static void main(String[] args) throws IOException {

       PDFTextParser pdfManager = new PDFTextParser();
       pdfManager.setFilePath("/home/shankar/Desktop/read/java/test.pdf");
       System.out.println(pdfManager.ToText());       
    
}    
}
