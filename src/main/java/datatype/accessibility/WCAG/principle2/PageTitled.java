package datatype.accessibility.WCAG.principle2;

import database.CriteriaDatabase;
import datatype.Text;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

import java.util.List;

public class PageTitled extends AbstractCriteria
{
    public PageTitled()
    {
        super(CriteriaDatabase.CriteriaConstants.PageTitled,
                CriteriaDatabase.CriteriaConstants.PageTitledName,
                CriteriaDatabase.CriteriaConstants.PageTitledDescription);
        super.conformanceLevel = ConformanceLevel.A;
    }

    /*
     * TO DO: Also test if the title's content is relevant to the
     * text.
     */
    public void testSufficience(List<Text> textList)
    {
        boolean textTitle = false;
        for(Text text : textList)
        {
            if (text.getClassification().equals("header-1")) {
                textTitle = true;
                break;
            }
        }
        setIsSufficient(textTitle);
    }
}
