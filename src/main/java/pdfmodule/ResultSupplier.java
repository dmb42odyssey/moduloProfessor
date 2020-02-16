package pdfmodule;

import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.AbstractGuideline;
import datatype.accessibility.AbstractPrinciple;

import java.util.ArrayList;
import java.util.List;

/*
 * This class handles all the results from the Analyzer
 *
 */
public class ResultSupplier
{

    static List<AbstractCriteria> succeededCriteriaList;
    static List<AbstractCriteria> failedCriteriaList;

    public static void getAllApplicable(List<AbstractPrinciple> abstractPrincipleList)
    {
       succeededCriteriaList = getAllSuccessful(abstractPrincipleList);
       failedCriteriaList = getAllFailed(abstractPrincipleList);
    }

    public static List<AbstractCriteria> getAllSuccessful(List<AbstractPrinciple> abstractPrincipleList)
    {

        List<AbstractCriteria> successList = new ArrayList<>();

        for(AbstractPrinciple principle : abstractPrincipleList)
        {
            for(AbstractGuideline guideline :principle.getGuidelineMap())
            {
                for(AbstractCriteria criteria: guideline.getCriteriaList())
                {
                    if(criteria.getIsApplicable() && criteria.getIsSufficient())
                    {
                        //
                    }
                }
            }
        }

        return successList;

    }

    public static List<AbstractCriteria> getAllFailed(List<AbstractPrinciple> abstractPrincipleList)
    {

        List<AbstractCriteria> faiList = new ArrayList<>();

        for(AbstractPrinciple principle : abstractPrincipleList)
        {
            for(AbstractGuideline guideline :principle.getGuidelineMap())
            {
                for(AbstractCriteria criteria: guideline.getCriteriaList())
                {
                    if(criteria.getIsApplicable() && !criteria.getIsSufficient())
                    {
                        System.out.println("Criteria failed: ");
                        printCriteria(criteria);
                    }
                }
            }
        }

        return faiList;

    }

    private static void printCriteria(AbstractCriteria criteria)
    {
        System.out.println(criteria.getName());
        System.out.println(criteria.getDescription());
    }

}
