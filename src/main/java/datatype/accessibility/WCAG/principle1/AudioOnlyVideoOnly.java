package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.Image;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class AudioOnlyVideoOnly extends AbstractCriteria {

    /* TRUE: Text (File) alternative
     * FALSE: Missing key parts of content
     */

    public AudioOnlyVideoOnly()
    {
        super(CriteriaDatabase.CriteriaConstants.ID.AudioOnlyVideoOnly,
                CriteriaDatabase.CriteriaConstants.Name.AudioOnlyVideoOnly,
                CriteriaDatabase.CriteriaConstants.Description.AudioOnlyVideoOnly,
                CriteriaDatabase.CriteriaConstants.Solution.AudioOnlyVideoOnly );
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
