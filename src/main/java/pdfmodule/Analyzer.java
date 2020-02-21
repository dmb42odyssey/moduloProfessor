package pdfmodule;

import database.SetupParameters;
import datatype.ExtractionResult;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.AbstractGuideline;
import datatype.accessibility.AbstractPrinciple;
import datatype.accessibility.ConformanceLevel;
import database.CriteriaDatabase.CriteriaConstants;
import datatype.accessibility.WCAG.principle2.PageTitled;
import datatype.accessibility.WCAG.principle3.LanguageOfPage;
import org.apache.pdfbox.pdmodel.PDDocument;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/* All tasks related to checking if the conformity level is assured
 * goes here.
 */
public class Analyzer {

    private List<AbstractPrinciple> principleList;
    private PDDocument document;
    private ExtractionResult extractionResult;
    private ConformanceLevel overallConformace;

    public Analyzer(ExtractionResult extractionResult, PDDocument document)
    {
        this.extractionResult = extractionResult;
        this.document = document;
    }

    public List<AbstractPrinciple> getPrincipleList()
    {
        return principleList;
    }

    public ConformanceLevel getOverallConformance()
    {
        return overallConformace;
    }

    public List<AbstractPrinciple> analyzeDocument()
    {
        SetupParameters setupParameters = new SetupParameters();
        principleList = setupParameters.buildDataSctructure();
        overallConformace = checkAllCriterias();
        return principleList;
    }

    private ConformanceLevel checkAllCriterias()
    {
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
        return obtainConformity();
    }

    /* This method selects the criteria's respective check
     * In total, there is 61. (Work In Progress)
     */
    private void selectCriteriaCheck(AbstractCriteria criteria)
    {
        switch(criteria.getId())
        {
            case CriteriaConstants.ID.PageTitled:
                ((PageTitled) criteria).testSufficience(document.getDocumentInformation());
                break;
            case CriteriaConstants.ID.LanguageOfPage:
                ((LanguageOfPage) criteria).testSufficience(document.getDocumentCatalog());
                break;
            default:
                break;
        }
    }

    private ConformanceLevel obtainConformity()
    {
        List<AbstractCriteria> criteriaList = new ArrayList<AbstractCriteria>();

        /* Create a list with criteria only */
        for(AbstractPrinciple principle : principleList)
        {
            for(AbstractGuideline guideline :principle.getGuidelineMap())
            {
                criteriaList.addAll(guideline.getCriteriaList());
            }
        }

        /* Sort criterias based on conformity level (lowest to highest) */
        criteriaList.sort(new Comparator<AbstractCriteria>() {
            @Override
            public int compare(AbstractCriteria ac1, AbstractCriteria ac2) {
                return ac1.getConformanceLevel().compareTo(ac2.getConformanceLevel());
            }
        });

        /* Finally, get the document's conformance level, by comparing the criteria's conformance level
           with the obtained (current) conformance.*/
        ConformanceLevel finalConformanceLevel = ConformanceLevel.AAA;

        for(AbstractCriteria criteria : criteriaList)
        {
            if(criteria.getConformanceLevel() != criteria.getCurrentConformanceLevel())
            {
                /* Final conformance level is criteria's conformance lowered by a conformance level.
                 */
                finalConformanceLevel = criteria.getConformanceLevel().lowerConformance(criteria.getConformanceLevel());
                break;
            }
        }

        return finalConformanceLevel;
    }

    private void debugPrintStructure()
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
