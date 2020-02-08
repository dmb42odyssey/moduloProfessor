package database;

import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.AbstractGuideline;
import datatype.accessibility.AbstractPrinciple;

import java.util.*;

public class SetupParameters {

    private List<String> ValidPrincipleList;
    public Map<String, List<String>>  principleToGuidelines;
    public Map<String, List<String>> guideLineToCriterias;

    public SetupParameters()
    {
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
                    AbstractCriteria newCriteria = CriteriaDatabase.CriteriaInitialization(criteria);
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
                CriteriaDatabase.CriteriaConstants.NonTextContent
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.TimeBasedMedia, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.AudioOnlyVideoOnly,
                CriteriaDatabase.CriteriaConstants.CaptionsPreRecorded,
                CriteriaDatabase.CriteriaConstants.AudioDescriptionMediaAlternative,
                CriteriaDatabase.CriteriaConstants.CaptionsLive,
                CriteriaDatabase.CriteriaConstants.AudioDescription,
                CriteriaDatabase.CriteriaConstants.SignLanguage,
                CriteriaDatabase.CriteriaConstants.ExtendedAudioDescription,
                CriteriaDatabase.CriteriaConstants.MediaAlternative,
                CriteriaDatabase.CriteriaConstants.AudioOnlyLive
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Adaptable, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.InfoRelationship,
                CriteriaDatabase.CriteriaConstants.MeaningfulSequence,
                CriteriaDatabase.CriteriaConstants.SensoryCharacteristics
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Distinguishable, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.UseOfColor,
                CriteriaDatabase.CriteriaConstants.AudioControl,
                CriteriaDatabase.CriteriaConstants.ContrastMinimum,
                CriteriaDatabase.CriteriaConstants.ResizeText,
                CriteriaDatabase.CriteriaConstants.ImagesOfText,
                CriteriaDatabase.CriteriaConstants.ContrastEnchanced,
                CriteriaDatabase.CriteriaConstants.LowOrNoBackgroundAudio,
                CriteriaDatabase.CriteriaConstants.VisualPresentation,
                CriteriaDatabase.CriteriaConstants.ImageOfTextNoException
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.KeyboardAccessible, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.Keyboard,
                CriteriaDatabase.CriteriaConstants.NoKeyboardTrap,
                CriteriaDatabase.CriteriaConstants.KeyboardNoException
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.EnoughTime, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.TimingAdjustable,
                CriteriaDatabase.CriteriaConstants.PauseStopHide,
                CriteriaDatabase.CriteriaConstants.NoTiming,
                CriteriaDatabase.CriteriaConstants.Interruptions,
                CriteriaDatabase.CriteriaConstants.ReAuthenticating
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Seizures, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ThreeFlashesOrBelowThreshold ,
                CriteriaDatabase.CriteriaConstants.ThreeFlashes
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Navigable, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.BypassBlocks,
                CriteriaDatabase.CriteriaConstants.PageTitled,
                CriteriaDatabase.CriteriaConstants.FocusOrder,
                CriteriaDatabase.CriteriaConstants.LinkPurposeInContext,
                CriteriaDatabase.CriteriaConstants.MultipleWays,
                CriteriaDatabase.CriteriaConstants.HeadingsAndLabels,
                CriteriaDatabase.CriteriaConstants.FocusVisible,
                CriteriaDatabase.CriteriaConstants.Location,
                CriteriaDatabase.CriteriaConstants.LinkPurposeLinkOnly,
                CriteriaDatabase.CriteriaConstants.SectionHeadings
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Readable, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.LanguageOfPage,
                CriteriaDatabase.CriteriaConstants.LanguageOfParts,
                CriteriaDatabase.CriteriaConstants.UnusualWords,
                CriteriaDatabase.CriteriaConstants.Abbreviations,
                CriteriaDatabase.CriteriaConstants.ReadingLevel,
                CriteriaDatabase.CriteriaConstants.Pronunciation
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Predictable, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.OnFocus,
                CriteriaDatabase.CriteriaConstants.OnInput,
                CriteriaDatabase.CriteriaConstants.ConsistentNavigation,
                CriteriaDatabase.CriteriaConstants.ConsistentIdentification,
                CriteriaDatabase.CriteriaConstants.ChangeOnRequest
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.InputAssistance, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ErrorIdentification,
                CriteriaDatabase.CriteriaConstants.LabelsOrInstructions,
                CriteriaDatabase.CriteriaConstants.ErrorSuggestion,
                CriteriaDatabase.CriteriaConstants.ErrorPrevention ,
                CriteriaDatabase.CriteriaConstants.Help ,
                CriteriaDatabase.CriteriaConstants.ErrorPreventionAll
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Compatible, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.Parsing,
                CriteriaDatabase.CriteriaConstants.NameRoleValue
        ));
        return guideLineToCriteriasMap;
    }
}
