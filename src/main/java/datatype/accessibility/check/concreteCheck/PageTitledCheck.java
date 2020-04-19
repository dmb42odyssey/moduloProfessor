package datatype.accessibility.check.concreteCheck;

import datatype.accessibility.Criteria;
import datatype.accessibility.check.ICriteriaCheck;
import org.apache.pdfbox.pdmodel.PDDocument;

public class PageTitledCheck implements ICriteriaCheck
{
    private Criteria criteria;
    private PDDocument document;

    public PageTitledCheck(Criteria criteria, PDDocument document)
    {
        this.criteria = criteria;
        this.document = document;
    }

    @Override
    public void check()
    {
        if(document.getDocumentInformation().getTitle() != null)
        {
            criteria.setCurrentConformanceLevel(criteria.getConformanceLevel());
        }
        else
        {
            criteria.setCurrentConformanceLevel(null);
        }
    }
}
