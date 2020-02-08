package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.Image;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class MediaAlternative extends AbstractCriteria
{

    public MediaAlternative()
    {
        super(CriteriaDatabase.CriteriaConstants.MediaAlternative,
                CriteriaDatabase.CriteriaConstants.MediaAlternativeName,
                CriteriaDatabase.CriteriaConstants.MediaAlternativeDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
    /* VIDEO ONLY
     * TRUE: Audio Descripition
     * FALSE:
     */
    public boolean checkIsSufficient(Image image)
    {
        // Is there a text associated with this image? (Extractor should ahve done this)
        // YES -> true
        // NO -> False.
        return true;
    }
}
