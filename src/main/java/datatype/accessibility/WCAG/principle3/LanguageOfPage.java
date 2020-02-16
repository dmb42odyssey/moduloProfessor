package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;

public class LanguageOfPage extends AbstractCriteria
{
    public LanguageOfPage()
    {
        super(CriteriaDatabase.CriteriaConstants.LanguageOfPage,
                CriteriaDatabase.CriteriaConstants.LanguageOfPageName,
                CriteriaDatabase.CriteriaConstants.LanguageOfPageDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }

    public void testSufficience(PDDocumentCatalog documentCatalog)
    {

        if(documentCatalog.getLanguage() != null)
        {
            setCurrentConformanceLevel(getConformanceLevel());
        }
        else
        {
            setCurrentConformanceLevel(null);
        }
    }
}
