package pdfmodule;

import database.PrincipleSetup;
import database.SetupParameters;
import datatype.guidance.AbstractCriteria;
import datatype.guidance.AbstractGuideline;
import datatype.guidance.AbstractPrinciple;
import datatype.guidance.ConformanceLevel;
import database.PrincipleSetup.PrincipleConstants;
import database.GuidelineSetup.GuidelineConstants;
import database.CriteriaSetup.CriteriaConstants;



import java.util.List;
import java.util.Map;

// Verificaçao
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
