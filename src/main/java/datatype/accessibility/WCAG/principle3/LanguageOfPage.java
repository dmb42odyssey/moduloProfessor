package datatype.accessibility.WCAG.principle3;

import database.CriteriaDatabase;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;

public class LanguageOfPage extends AbstractCriteria
{
    public LanguageOfPage()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.LanguageOfPage,
                CriteriaDatabase.CriteriaConstants.Name.LanguageOfPage,
                CriteriaDatabase.CriteriaConstants.Description.LanguageOfPage);
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
