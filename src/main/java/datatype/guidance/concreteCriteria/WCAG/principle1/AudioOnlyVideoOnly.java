package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.Image;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class AudioOnlyVideoOnly extends AbstractCriteria {

    /* TRUE: Text (File) alternative
     * FALSE: Missing key parts of content
     */

    public AudioOnlyVideoOnly()
    {
        super(CriteriaSetup.CriteriaConstants.AudioOnlyVideoOnly,
                CriteriaSetup.CriteriaConstants.AudioOnlyVideoOnlyName,
                CriteriaSetup.CriteriaConstants.AudioOnlyVideoOnlyDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }

    public boolean checkIsSufficient(Image image)
    {
        // Is there a file (TEXT, DOC) associated with the multimedia? (video onlu or audio onlu)
        // * TO DO: MUST check if doc's contentes are the same of the audio
        // YES -> true
        // NO -> False.
        return true;
    }
}
