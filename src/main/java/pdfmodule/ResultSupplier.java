package pdfmodule;

import datatype.accessibility.Criteria;
import datatype.accessibility.AbstractGuideline;
import datatype.accessibility.AbstractPrinciple;
import datatype.accessibility.ConformanceLevel;

import java.util.ArrayList;
import java.util.List;

/*
 * This class handles all the results from the Analyzer
 *
 */
public class ResultSupplier
{

    static List<Criteria> succeededCriteriaList;
    static List<Criteria> failedCriteriaList;
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

    private List<Criteria> getAllSuccessful(List<AbstractPrinciple> abstractPrincipleList)
    {

        List<Criteria> successList = new ArrayList<>();

        for(AbstractPrinciple principle : abstractPrincipleList)
        {
            for(AbstractGuideline guideline :principle.getGuidelineMap())
            {
                for(Criteria criteria: guideline.getCriteriaList())
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

    private List<Criteria> getAllFailed(List<AbstractPrinciple> abstractPrincipleList)
    {

        List<Criteria> faiList = new ArrayList<>();

        for(AbstractPrinciple principle : abstractPrincipleList)
        {
            for(AbstractGuideline guideline :principle.getGuidelineMap())
            {
                for(Criteria criteria: guideline.getCriteriaList())
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
        for(Criteria criteria : succeededCriteriaList)
        {
            printCriteria(criteria);
        }
    }

    public void printAllFailed()
    {
        System.out.println("-- Critérios que não foram atendidos --");
        for(Criteria criteria : failedCriteriaList)
        {
            printCriteria(criteria);
            System.out.println(criteria.getSolutionText());
        }
    }

    private void printCriteria(Criteria criteria)
    {
        System.out.println(criteria.getName());
        System.out.println(criteria.getDescription());
    }

    public String formatedHTMLresult()
    {
        String bodyHTML = "<h1> Relatório </h1>\n";
        bodyHTML += "<div id=\"relatorio\">" + "\n";

        if(succeededCriteriaList != null)
        {

            bodyHTML += "<h2>" + "Critérios atendidos:" + "</h2>" + "\n";
            bodyHTML += "<ul class=\"atendidos\">";

            for(Criteria criteria : succeededCriteriaList)
            {
                bodyHTML += "<li><h3>" + criteria.getName() +  "</h3></li>"  + "\n";
                bodyHTML += "<p>" + criteria.getDescription() + "</p>" + "\n";
            }

            bodyHTML += "</ul>";

        }

        if(failedCriteriaList != null)
        {

            bodyHTML += "<h2>" + "Critérios não atendidos: " + "</h2>" + "\n";
            bodyHTML += "<ul class=\"nao_atendidos\">";

            for(Criteria criteria : failedCriteriaList)
            {
                bodyHTML += "<li><h3>" + criteria.getName() +  "</h3></li>"  + "\n";
                bodyHTML += "<p>" + criteria.getDescription() + "</p>" + "\n";
                bodyHTML += "<p>" + "<b>Sugestão:</b>" + criteria.getSolutionText() + "</p>" + "\n";
            }

            bodyHTML += "</ul>";
            bodyHTML += "</div>";

        }

        bodyHTML += "<h4>Encontrou algum problema? Envie um email para <a href=\"mailto:lirte.ufabc@gmail.com?Subject=[ADD%20-%20AVALIADOR%20DE%20DOCUMENTOS%20DIGITAIS]\">lirte.ufabc@gmail.com</a>.</h4>";

        return bodyHTML;
    }
}
