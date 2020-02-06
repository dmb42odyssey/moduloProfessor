package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.Image;
import datatype.Text;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class NonTextContext extends AbstractCriteria
{
    public NonTextContext()
    {
        super(CriteriaSetup.CriteriaConstants.NonTextContent,
              CriteriaSetup.CriteriaConstants.NonTextContentName,
              CriteriaSetup.CriteriaConstants.NonTextContentDescription);
        super.conformanceLevel = ConformanceLevel.A;
        System.out.println("!!!!");
    }
    /* TRUE: Text (File) alternative
     * FALSE: Missing key parts of content
     */
    public boolean checkIsSufficient(Image image)
    {
        // Is there a text associated with this image? (Extractor should ahve done this)
        // YES -> true
        // NO -> False.
        return true;
    }
}
