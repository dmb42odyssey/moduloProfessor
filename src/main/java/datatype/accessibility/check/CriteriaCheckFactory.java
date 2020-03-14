package datatype.accessibility.check;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.WCAG.principle2.PageTitled;
import datatype.accessibility.WCAG.principle3.LanguageOfPage;
import datatype.accessibility.check.concreteCheck.LanguageOfPageCheck;
import datatype.accessibility.check.concreteCheck.PageTitledCheck;
import org.apache.pdfbox.pdmodel.PDDocument;

public class CriteriaCheckFactory
{
    public ICriteriaCheck getCriteriaCheck(AbstractCriteria criteria, PDDocument document)
    {
        switch (criteria.getId())
        {
            case CriteriaDatabase
                    .CriteriaConstants.ID.PageTitled:
                return new PageTitledCheck((PageTitled) criteria, document);
            case CriteriaDatabase
                    .CriteriaConstants.ID.LanguageOfPage:
                return new LanguageOfPageCheck((LanguageOfPage) criteria, document);
            default:
                return null;
        }
    }
}
