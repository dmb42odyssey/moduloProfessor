package pdfmodule;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.common.PDMetadata;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Metadata {

    public static void test(String path) throws IOException {
        try (PDDocument document = PDDocument.load(new File(path)))
        {
            PDDocumentInformation docInfo = document.getDocumentInformation();
            System.out.println("Author: " + docInfo.getAuthor());
            System.out.println("Title: " + docInfo.getTitle());
            System.out.println("Date: " + docInfo.getCreationDate());
        }
    }

}
