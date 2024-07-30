// com/example/main/FactoryMethodPatternExample.java
package com.example.test;

import com.example.document.Document;
import com.example.factory.DocumentFactory;
import com.example.factory.WordDocumentFactory;
import com.example.factory.PdfDocumentFactory;
import com.example.factory.ExcelDocumentFactory;

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        // Create factories
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        // Create documents
        Document wordDocument = wordFactory.createDocument();
        Document pdfDocument = pdfFactory.createDocument();
        Document excelDocument = excelFactory.createDocument();

        // Use documents
        wordDocument.open();
        wordDocument.close();

        pdfDocument.open();
        pdfDocument.close();

        excelDocument.open();
        excelDocument.close();
    }
}
