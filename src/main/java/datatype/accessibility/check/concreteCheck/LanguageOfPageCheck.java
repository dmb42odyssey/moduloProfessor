package datatype.accessibility.check.concreteCheck;

import datatype.accessibility.Criteria;
import datatype.accessibility.check.ICriteriaCheck;
import org.apache.pdfbox.pdmodel.PDDocument;

public class LanguageOfPageCheck implements ICriteriaCheck
{
    private Criteria criteria;
    private PDDocument document;

    public LanguageOfPageCheck(Criteria criteria, PDDocument document)
    {
        this.criteria = criteria;
        this.document = document;
    }

    @Override
    public void check()
    {
        if(document.getDocumentCatalog().getLanguage() != null)
        {
            criteria.setCurrentConformanceLevel(criteria.getConformanceLevel());
        }
        else
        {
            criteria.setCurrentConformanceLevel(null);
        }
    }
}
