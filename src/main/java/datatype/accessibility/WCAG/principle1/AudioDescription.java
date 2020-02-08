package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.Image;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class AudioDescription extends AbstractCriteria
{

    public AudioDescription()
    {
        super(CriteriaDatabase.CriteriaConstants.AudioDescription,
                CriteriaDatabase.CriteriaConstants.AudioDescriptionName,
                CriteriaDatabase.CriteriaConstants.AudioDescriptionDescription);
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
