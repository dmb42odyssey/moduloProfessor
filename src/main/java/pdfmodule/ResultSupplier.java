package pdfmodule;

import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.AbstractGuideline;
import datatype.accessibility.AbstractPrinciple;
import datatype.accessibility.ConformanceLevel;

import java.io.Console;
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
    static ConformanceLevel conformanceLevel;

    public ResultSupplier(List<AbstractPrinciple> abstractPrincipleList, ConformanceLevel conformanceLevel)
    {
        getAllApplicable(abstractPrincipleList, conformanceLevel);
    }

    private void getAllApplicable(List<AbstractPrinciple> abstractPrincipleList, ConformanceLevel conformanceLevel)
    {
       succeededCriteriaList = getAllSuccessful(abstractPrincipleList);
       failedCriteriaList = getAllFailed(abstractPrincipleList);
       this.conformanceLevel = conformanceLevel;
    }

    public String ConformanceLevel()
    {

        if(conformanceLevel == null)
        {
            return "Nível de conformidade do documento: -";
        }
        return "Nível de conformidade do documento: " + conformanceLevel;

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
                    if(criteria.getIsApplicable() && criteria.isSufficient())
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
                    if(criteria.getIsApplicable() && !criteria.isSufficient())
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

    public String formatedHTMLresult()
    {
        String bodyHTML = "<h1> Resultado </h1>\n";
        bodyHTML += ConformanceLevel() + "\n";

        bodyHTML += "<h2>" + "Critérios atendidos:" + "</h2>" + "\n";

        for(AbstractCriteria criteria : succeededCriteriaList)
        {
            bodyHTML += "<h3>" + criteria.getName() +  "</h3>"  + "\n";
            bodyHTML += "<p>" + criteria.getDescription() + "</p>" + "\n";
        }

        bodyHTML += "<h2>" + "Critérios não atendidos: " + "</h2>" + "\n";

        for(AbstractCriteria criteria : failedCriteriaList)
        {
            bodyHTML += "<h3>" + criteria.getName() + "</h3>" + "\n";
            bodyHTML += "<p>" + criteria.getDescription() + "</p>" + "\n";
            bodyHTML += "<p>" + "Solução:" + criteria.getSolutionText() + "</p>" + "\n";
        }

        return bodyHTML;
    }
}
