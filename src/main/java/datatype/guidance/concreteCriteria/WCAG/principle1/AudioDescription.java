package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.Image;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class AudioDescription extends AbstractCriteria
{

    public AudioDescription()
    {
        super(CriteriaSetup.CriteriaConstants.AudioDescription,
                CriteriaSetup.CriteriaConstants.AudioDescriptionName,
                CriteriaSetup.CriteriaConstants.AudioDescriptionDescription);
        super.conformanceLevel = ConformanceLevel.AA;
    }


    /* TRUE: Audio description
     * FALSE: Missing
     */
    public boolean checkIsSufficient(Image image)
    {
        // Is there a text associated with this image? (Extractor should ahve done this)
        // YES -> true
        // NO -> False.
        return true;
    }
}
