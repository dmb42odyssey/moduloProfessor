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

    public ResultSupplier(List<AbstractPrinciple> abstractPrincipleList)
    {
        getAllApplicable(abstractPrincipleList);
    }

    private void getAllApplicable(List<AbstractPrinciple> abstractPrincipleList)
    {
       succeededCriteriaList = getAllSuccessful(abstractPrincipleList);
       failedCriteriaList = getAllFailed(abstractPrincipleList);
    }

    private List<AbstractCriteria> getAllSuccessful(List<AbstractPrinciple> abstractPrincipleList)
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
                        successList.add(criteria);
                    }
                }
            }
        }

        return successList;

    }

    private List<AbstractCriteria> getAllFailed(List<AbstractPrinciple> abstractPrincipleList)
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
                        faiList.add(criteria);
                    }
                }
            }
        }

        return faiList;
    }

    public void printAllSuccessful()
    {
        System.out.println("-- Critérios atendidos com sucesso: --");
        for(AbstractCriteria criteria : succeededCriteriaList)
        {
            printCriteria(criteria);
        }
    }

    public void printAllFailed()
    {
        System.out.println("-- Critérios que não foram atendidos --");
        for(AbstractCriteria criteria : failedCriteriaList)
        {
            printCriteria(criteria);
            System.out.println(criteria.getSolutionText());
        }
    }

    private void printCriteria(AbstractCriteria criteria)
    {
        System.out.println(criteria.getName());
        System.out.println(criteria.getDescription());
    }

}
