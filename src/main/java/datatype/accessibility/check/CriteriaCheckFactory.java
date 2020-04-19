package datatype.accessibility.check;

import database.CriteriaDatabase;
import datatype.accessibility.Criteria;
import datatype.accessibility.check.concreteCheck.LanguageOfPageCheck;
import datatype.accessibility.check.concreteCheck.PageTitledCheck;
import org.apache.pdfbox.pdmodel.PDDocument;

public class CriteriaCheckFactory
{
    public ICriteriaCheck getCriteriaCheck(Criteria criteria, PDDocument document)
    {
        switch (criteria.getId())
        {
            case CriteriaDatabase
                    .CriteriaConstants.ID.PageTitled:
                return new PageTitledCheck(criteria, document);
            case CriteriaDatabase
                    .CriteriaConstants.ID.LanguageOfPage:
                return new LanguageOfPageCheck(criteria, document);
            default:
                return null;
        }
    }
}
