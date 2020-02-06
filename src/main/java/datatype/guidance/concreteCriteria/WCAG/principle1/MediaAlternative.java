package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.Image;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class MediaAlternative extends AbstractCriteria
{

    public MediaAlternative()
    {
        super(CriteriaSetup.CriteriaConstants.MediaAlternative,
                CriteriaSetup.CriteriaConstants.MediaAlternativeName,
                CriteriaSetup.CriteriaConstants.MediaAlternativeDescription);
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
