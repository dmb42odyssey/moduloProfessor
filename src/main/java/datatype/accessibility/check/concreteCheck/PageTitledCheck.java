package datatype.accessibility.check.concreteCheck;

import datatype.accessibility.WCAG.principle2.PageTitled;
import datatype.accessibility.check.ICriteriaCheck;
import org.apache.pdfbox.pdmodel.PDDocument;

public class PageTitledCheck implements ICriteriaCheck
{
    PageTitled pageTitled;
    PDDocument document;

    public PageTitledCheck(PageTitled pageTitled, PDDocument document)
    {
        this.pageTitled = pageTitled;
        this.document = document;
    }

    @Override
    public void check()
    {
        if(document.getDocumentInformation().getTitle() != null)
        {
            pageTitled.setCurrentConformanceLevel(pageTitled.getConformanceLevel());
        }
        else
        {
            pageTitled.setCurrentConformanceLevel(null);
        }
    }
}
