package pdfmodule;

import database.SetupParameters;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.AbstractGuideline;
import datatype.accessibility.AbstractPrinciple;
import datatype.accessibility.ConformanceLevel;
import database.CriteriaDatabase.CriteriaConstants;



import java.util.List;


/* All tasks related to checking if the conformity level is assured
 * goes here.
 */
public class Analyzer {

    private List<AbstractPrinciple> principleList;

    public Analyzer()
    {

    }

    public void analyzeDocument()
    {
        SetupParameters setupParameters = new SetupParameters();
        principleList = setupParameters.buildDataSctructure();
        // debugPrint();
    }

    private ConformanceLevel checkAllCriterias()
    {
        System.out.println("Creation ended");
        for(AbstractPrinciple principle : principleList)
        {
            for(AbstractGuideline guideline :principle.getGuidelineMap())
            {
                for(AbstractCriteria criteria: guideline.getCriteriaList())
                {
                    if(criteria.getIsApplicable())
                    {
                        selectCriteriaCheck(criteria);
                    }
                    else
                    {
                        criteria.setIsSufficient(true);
                    }
                }
            }
        }

        // TO DO
        return ConformanceLevel.A;
    }

    private void selectCriteriaCheck(AbstractCriteria criteria)
    {
        // 61

        // Text and Image
        String criteriaName = criteria.getName();
        if(criteriaName == CriteriaConstants.NonTextContentName)
        {

        }
        // Only ETxt
        //else if()
        //{
        //
        //}
    }

    // DEBUG
    private void debugPrint()
    {
        System.out.println("Creation ended");
        for(AbstractPrinciple principle : principleList)
        {
            System.out.println(principle.getName());
            for(AbstractGuideline guideline :principle.getGuidelineMap())
            {
                System.out.println("----" + guideline.getName());
                for(AbstractCriteria criteria: guideline.getCriteriaList())
                {
                    System.out.println("--------" + criteria.getName() + " (" + criteria.getConformanceLevel() + ")");
                }
            }
        }
    }
}
