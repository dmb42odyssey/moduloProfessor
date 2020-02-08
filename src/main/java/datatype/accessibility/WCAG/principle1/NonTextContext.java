package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.Image;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class NonTextContext extends AbstractCriteria
{
    public NonTextContext()
    {
        super(CriteriaDatabase.CriteriaConstants.NonTextContent,
              CriteriaDatabase.CriteriaConstants.NonTextContentName,
              CriteriaDatabase.CriteriaConstants.NonTextContentDescription);
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
