package datatype.guidance.concreteCriteria.WCAG.principle1;

import database.CriteriaSetup;
import datatype.Image;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.ConformanceLevel;

public class SignLanguage extends AbstractCriteria {

    public SignLanguage()
    {
        super(CriteriaSetup.CriteriaConstants.SignLanguage,
                CriteriaSetup.CriteriaConstants.SignLanguageName,
                CriteriaSetup.CriteriaConstants.SignLanguageDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
    /* VIDEO ONLY
     * TRUE: No videos OR if Video has sign languiange itnerpreter
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
