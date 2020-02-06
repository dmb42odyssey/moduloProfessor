package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.Image;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class AudioDescriptionOrMediaAlternative extends AbstractCriteria {


    public AudioDescriptionOrMediaAlternative()
    {
        super(CriteriaSetup.CriteriaConstants.AudioDescriptionMediaAlternative,
                CriteriaSetup.CriteriaConstants.AudioDescriptionMediaAlternativeName,
                CriteriaSetup.CriteriaConstants.AudioDescriptionMediaAlternativeDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }

    /* TRUE: Audio description OR Audio Description is TRUE
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
