package com.example.factory;

import com.example.document.Document;
import com.example.document.PdfDocumentImpl;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocumentImpl();
    }
}