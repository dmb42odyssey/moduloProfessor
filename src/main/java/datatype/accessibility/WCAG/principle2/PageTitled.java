package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.Text;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;

import java.util.List;

public class PageTitled extends AbstractCriteria
{
    public PageTitled()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.PageTitled,
                CriteriaDatabase.CriteriaConstants.Name.PageTitled,
                CriteriaDatabase.CriteriaConstants.Description.PageTitled);
        super.conformanceLevel = ConformanceLevel.A;
    }

    public void testSufficience(PDDocumentInformation documentInformation)
    {
        if(documentInformation.getTitle() != null)
        {
            setCurrentConformanceLevel(getConformanceLevel());
        }
        else
        {
            setCurrentConformanceLevel(null);
        }
    }
}
