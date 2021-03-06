package pdfmodule;

import database.SetupParameters;
import datatype.ExtractionResult;
import datatype.accessibility.Criteria;
import datatype.accessibility.AbstractGuideline;
import datatype.accessibility.AbstractPrinciple;
import datatype.accessibility.ConformanceLevel;
import datatype.accessibility.check.CheckAgent;
import datatype.accessibility.check.CriteriaCheckFactory;
import datatype.accessibility.check.ICriteriaCheck;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.util.*;


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

        /* Checking conformance test for all enabled criterias*/
        overallConformace = checkAllCriterias();
        return principleList;
    }

    private ConformanceLevel checkAllCriterias()
    {
        /* Invoker for ICriteriaCheck */
        CheckAgent checkAgent = new CheckAgent();

        CriteriaCheckFactory criteriaCheckFactory = new CriteriaCheckFactory();

        for(AbstractPrinciple principle : principleList)
        {
            for(AbstractGuideline guideline :principle.getGuidelineMap())
            {
                for(Criteria criteria: guideline.getCriteriaList())
                {
                    /* Get respective check command */
                    ICriteriaCheck criteriaCheck = criteriaCheckFactory.getCriteriaCheck(criteria, document);
                    /* TO DO: Only add implemented checks (61 total) */
                    if(criteriaCheck != null)
                    {
                        /* Invoker executes check command */
                        checkAgent.placeCheck(criteriaCheck);
                    }
                    else
                    {
                        criteria.setIsApplicable(false);
                    }
                }
            }
        }

        return obtainConformity();
    }

    private ConformanceLevel obtainConformity()
    {
        List<Criteria> criteriaList = new ArrayList<Criteria>();

        /* Create a list with applicable criteria only */
        for(AbstractPrinciple principle : principleList)
        {
            for(AbstractGuideline guideline :principle.getGuidelineMap())
            {
                for(Criteria criteria : guideline.getCriteriaList())
                {
                    if(criteria.getIsApplicable())
                    {
                        criteriaList.add(criteria);
                    }
                }
            }
        }

        /* Sort criterias based on conformity level (lowest to highest) */
        criteriaList.sort(new Comparator<Criteria>() {
            @Override
            public int compare(Criteria ac1, Criteria ac2) {
                return ac1.getConformanceLevel().compareTo(ac2.getConformanceLevel());
            }
        });

        /* Finally, get the document's conformance level, by comparing the criteria's conformance level
           with the obtained (current) conformance.*/
        ConformanceLevel finalConformanceLevel = criteriaList.get(criteriaList.size() - 1).getConformanceLevel();

        for(Criteria criteria : criteriaList)
        {
            if(criteria.getConformanceLevel() != criteria.getCurrentConformanceLevel())
            {
                /*
                 * Final conformance level is criteria's conformance lowered by a conformance level.
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
                for(Criteria criteria: guideline.getCriteriaList())
                {
                    System.out.println("--------" + criteria.getName() + " (" + criteria.getConformanceLevel() + ")");
                }
            }
        }
    }
}
