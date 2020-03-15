package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.Image;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class AudioDescriptionOrMediaAlternative extends AbstractCriteria {


    public AudioDescriptionOrMediaAlternative()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.AudioDescriptionMediaAlternative,
                CriteriaDatabase.CriteriaConstants.Name.AudioDescriptionMediaAlternative,
                CriteriaDatabase.CriteriaConstants.Description.AudioDescriptionMediaAlternative,
                CriteriaDatabase.CriteriaConstants.Solution.AudioDescriptionMediaAlternative);
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
