package datatype.accessibility.check.concreteCheck;

import datatype.accessibility.WCAG.principle3.LanguageOfPage;
import datatype.accessibility.check.ICriteriaCheck;
import org.apache.pdfbox.pdmodel.PDDocument;

public class LanguageOfPageCheck implements ICriteriaCheck
{
    private LanguageOfPage languageOfPage;
    private PDDocument document;

    public LanguageOfPageCheck(LanguageOfPage languageOfPage, PDDocument document)
    {
        this.languageOfPage = languageOfPage;
        this.document = document;
    }

    @Override
    public void check()
    {
        if(document.getDocumentCatalog().getLanguage() != null)
        {
            languageOfPage.setCurrentConformanceLevel(languageOfPage.getConformanceLevel());
        }
        else
        {
            languageOfPage.setCurrentConformanceLevel(null);
        }
    }
}
