package com.example.factory;

import com.example.document.Document;
import com.example.document.ExcelDocumentImpl;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocumentImpl();
    }
}