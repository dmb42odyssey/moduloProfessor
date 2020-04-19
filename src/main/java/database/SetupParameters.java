package database;

import datatype.accessibility.Criteria;
import datatype.accessibility.AbstractGuideline;
import datatype.accessibility.AbstractPrinciple;

import java.util.*;

public class SetupParameters {

    private List<String> ValidPrincipleList;
    public Map<String, List<String>>  principleToGuidelines;
    public Map<String, List<String>> guideLineToCriterias;

    public SetupParameters()
    {

        // Building Dictionares


        // WCAG 2.0
        ValidPrincipleList = buildPrincipleList();
        principleToGuidelines = buildPrincipleToGuidelinesMap();
        guideLineToCriterias = buildGuideLineToCriteriasMap();
    }

    public List<AbstractPrinciple> buildDataSctructure()
    {
        List<AbstractPrinciple> PrincipleList = new ArrayList<>();

        for(String principle : ValidPrincipleList)
        {
            AbstractPrinciple newPrinciple = PrincipleDatabase.selectPrincipleInitialization(principle);

            for(String guideline : principleToGuidelines.get(principle))
            {
                AbstractGuideline newGuideline = GuidelineDatabase.GuidelineInitialization(principle,guideline);

                for(String criteria : guideLineToCriterias.get(guideline))
                {
                    Criteria newCriteria = CriteriaFactory.WCAG.getCriteria(criteria);
                    newGuideline.getCriteriaList().add(newCriteria);
                }

                newPrinciple.getGuidelineMap().add(newGuideline);
            }

            PrincipleList.add(newPrinciple);
        }

        return PrincipleList;
    }

    private List<String> buildPrincipleList()
    {
        List<String> principleList = new ArrayList<>();
        principleList.add(PrincipleDatabase.PrincipleConstants.Perceivable);
        principleList.add(PrincipleDatabase.PrincipleConstants.Operable);
        principleList.add(PrincipleDatabase.PrincipleConstants.Understandable);
        principleList.add(PrincipleDatabase.PrincipleConstants.Robust);
        return principleList;
    }

    private Map<String, List<String>> buildPrincipleToGuidelinesMap()
    {
        Map<String, List<String>> principleToGuidelinesMap  =  new HashMap<>();
        principleToGuidelinesMap.put(PrincipleDatabase.PrincipleConstants.Perceivable, Arrays.asList(
                GuidelineDatabase.GuidelineConstants.TextAlternatives,
                GuidelineDatabase.GuidelineConstants.TimeBasedMedia,
                GuidelineDatabase.GuidelineConstants.Adaptable,
                GuidelineDatabase.GuidelineConstants.Distinguishable
        ));
        principleToGuidelinesMap.put(PrincipleDatabase.PrincipleConstants.Operable, Arrays.asList(
                GuidelineDatabase.GuidelineConstants.KeyboardAccessible,
                GuidelineDatabase.GuidelineConstants.EnoughTime,
                GuidelineDatabase.GuidelineConstants.Seizures,
                GuidelineDatabase.GuidelineConstants.Navigable
        ));
        principleToGuidelinesMap.put(PrincipleDatabase.PrincipleConstants.Understandable, Arrays.asList(
                GuidelineDatabase.GuidelineConstants.Readable,
                GuidelineDatabase.GuidelineConstants.Predictable,
                GuidelineDatabase.GuidelineConstants.InputAssistance
        ));
        principleToGuidelinesMap.put(PrincipleDatabase.PrincipleConstants.Robust, Arrays.asList(
                GuidelineDatabase.GuidelineConstants.Compatible
        ));
        return principleToGuidelinesMap;
    }

    private Map<String, List<String>> buildGuideLineToCriteriasMap()
    {
        Map<String, List<String>> guideLineToCriteriasMap =  new HashMap<>();
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.TextAlternatives, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.NonTextContent
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.TimeBasedMedia, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.AudioOnlyVideoOnly,
                CriteriaDatabase.CriteriaConstants.ID.CaptionsPreRecorded,
                CriteriaDatabase.CriteriaConstants.ID.AudioDescription
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Adaptable, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.MeaningfulSequence
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Distinguishable, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.UseOfColor,
                CriteriaDatabase.CriteriaConstants.ID.ContrastMinimum,
                CriteriaDatabase.CriteriaConstants.ID.ResizeText,
                CriteriaDatabase.CriteriaConstants.ID.ImagesOfText,
                CriteriaDatabase.CriteriaConstants.ID.ContrastEnchanced,
                CriteriaDatabase.CriteriaConstants.ID.LowOrNoBackgroundAudio,
                CriteriaDatabase.CriteriaConstants.ID.VisualPresentation,
                CriteriaDatabase.CriteriaConstants.ID.ImageOfTextNoException
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.KeyboardAccessible, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.KeyboardNoException
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.EnoughTime, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.PauseStopHide,
                CriteriaDatabase.CriteriaConstants.ID.NoTiming
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Seizures, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.ThreeFlashes
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Navigable, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.PageTitled,
                CriteriaDatabase.CriteriaConstants.ID.LinkPurposeInContext,
                CriteriaDatabase.CriteriaConstants.ID.HeadingsAndLabels,
                CriteriaDatabase.CriteriaConstants.ID.LinkPurposeLinkOnly,
                CriteriaDatabase.CriteriaConstants.ID.SectionHeadings
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Readable, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.LanguageOfPage,
                CriteriaDatabase.CriteriaConstants.ID.LanguageOfParts,
                CriteriaDatabase.CriteriaConstants.ID.UnusualWords,
                CriteriaDatabase.CriteriaConstants.ID.Abbreviations,
                CriteriaDatabase.CriteriaConstants.ID.ReadingLevel,
                CriteriaDatabase.CriteriaConstants.ID.Pronunciation
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Predictable, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.ChangeOnRequest
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.InputAssistance, Arrays.asList(

        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Compatible, Arrays.asList(
        ));
        return guideLineToCriteriasMap;
    }
}
