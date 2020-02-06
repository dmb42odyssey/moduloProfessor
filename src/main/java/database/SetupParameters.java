package database;

import datatype.guidance.AbstractCriteria;
import datatype.guidance.AbstractGuideline;
import datatype.guidance.AbstractPrinciple;

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
            AbstractPrinciple newPrinciple = PrincipleSetup.selectPrincipleInitialization(principle);

            for(String guideline : principleToGuidelines.get(principle))
            {
                AbstractGuideline newGuideline = GuidelineSetup.GuidelineInitialization(principle,guideline);

                for(String criteria : guideLineToCriterias.get(guideline))
                {
                    AbstractCriteria newCriteria = CriteriaSetup.CriteriaInitialization(criteria);
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
        principleList.add(PrincipleSetup.PrincipleConstants.Perceivable);
        principleList.add(PrincipleSetup.PrincipleConstants.Operable);
        principleList.add(PrincipleSetup.PrincipleConstants.Understandable);
        principleList.add(PrincipleSetup.PrincipleConstants.Robust);
        return principleList;
    }

    private Map<String, List<String>> buildPrincipleToGuidelinesMap()
    {
        Map<String, List<String>> principleToGuidelinesMap  =  new HashMap<>();
        principleToGuidelinesMap.put(PrincipleSetup.PrincipleConstants.Perceivable, Arrays.asList(
                GuidelineSetup.GuidelineConstants.TextAlternatives,
                GuidelineSetup.GuidelineConstants.TimeBasedMedia,
                GuidelineSetup.GuidelineConstants.Adaptable,
                GuidelineSetup.GuidelineConstants.Distinguishable
        ));
        principleToGuidelinesMap.put(PrincipleSetup.PrincipleConstants.Operable, Arrays.asList(
                GuidelineSetup.GuidelineConstants.KeyboardAccessible,
                GuidelineSetup.GuidelineConstants.EnoughTime,
                GuidelineSetup.GuidelineConstants.Seizures,
                GuidelineSetup.GuidelineConstants.Navigable
        ));
        principleToGuidelinesMap.put(PrincipleSetup.PrincipleConstants.Understandable, Arrays.asList(
                GuidelineSetup.GuidelineConstants.Readable,
                GuidelineSetup.GuidelineConstants.Predictable,
                GuidelineSetup.GuidelineConstants.InputAssistance
        ));
        principleToGuidelinesMap.put(PrincipleSetup.PrincipleConstants.Robust, Arrays.asList(
                GuidelineSetup.GuidelineConstants.Compatible
        ));
        return principleToGuidelinesMap;
    }

    private Map<String, List<String>> buildGuideLineToCriteriasMap()
    {
        Map<String, List<String>> guideLineToCriteriasMap =  new HashMap<>();
        guideLineToCriteriasMap.put(GuidelineSetup.GuidelineConstants.TextAlternatives, Arrays.asList(
                CriteriaSetup.CriteriaConstants.NonTextContent
        ));
        guideLineToCriteriasMap.put(GuidelineSetup.GuidelineConstants.TimeBasedMedia, Arrays.asList(
                CriteriaSetup.CriteriaConstants.AudioOnlyVideoOnly,
                CriteriaSetup.CriteriaConstants.CaptionsPreRecorded,
                CriteriaSetup.CriteriaConstants.AudioDescriptionMediaAlternative,
                CriteriaSetup.CriteriaConstants.CaptionsLive,
                CriteriaSetup.CriteriaConstants.AudioDescription,
                CriteriaSetup.CriteriaConstants.SignLanguage,
                CriteriaSetup.CriteriaConstants.ExtendedAudioDescription,
                CriteriaSetup.CriteriaConstants.MediaAlternative,
                CriteriaSetup.CriteriaConstants.AudioOnlyLive
        ));
        guideLineToCriteriasMap.put(GuidelineSetup.GuidelineConstants.Adaptable, Arrays.asList(
                CriteriaSetup.CriteriaConstants.InfoRelationship,
                CriteriaSetup.CriteriaConstants.MeaningfulSequence,
                CriteriaSetup.CriteriaConstants.SensoryCharacteristics
        ));
        guideLineToCriteriasMap.put(GuidelineSetup.GuidelineConstants.Distinguishable, Arrays.asList(
                CriteriaSetup.CriteriaConstants.UseOfColor,
                CriteriaSetup.CriteriaConstants.AudioControl,
                CriteriaSetup.CriteriaConstants.ContrastMinimum,
                CriteriaSetup.CriteriaConstants.ResizeText,
                CriteriaSetup.CriteriaConstants.ImagesOfText,
                CriteriaSetup.CriteriaConstants.ContrastEnchanced,
                CriteriaSetup.CriteriaConstants.LowOrNoBackgroundAudio,
                CriteriaSetup.CriteriaConstants.VisualPresentation,
                CriteriaSetup.CriteriaConstants.ImageOfTextNoException
        ));
        guideLineToCriteriasMap.put(GuidelineSetup.GuidelineConstants.KeyboardAccessible, Arrays.asList(
                CriteriaSetup.CriteriaConstants.Keyboard,
                CriteriaSetup.CriteriaConstants.NoKeyboardTrap,
                CriteriaSetup.CriteriaConstants.KeyboardNoException
        ));
        guideLineToCriteriasMap.put(GuidelineSetup.GuidelineConstants.EnoughTime, Arrays.asList(
                CriteriaSetup.CriteriaConstants.TimingAdjustable,
                CriteriaSetup.CriteriaConstants.PauseStopHide,
                CriteriaSetup.CriteriaConstants.NoTiming,
                CriteriaSetup.CriteriaConstants.Interruptions,
                CriteriaSetup.CriteriaConstants.ReAuthenticating
        ));
        guideLineToCriteriasMap.put(GuidelineSetup.GuidelineConstants.Seizures, Arrays.asList(
                CriteriaSetup.CriteriaConstants.ThreeFlashesOrBelowThreshold ,
                CriteriaSetup.CriteriaConstants.ThreeFlashes
        ));
        guideLineToCriteriasMap.put(GuidelineSetup.GuidelineConstants.Navigable, Arrays.asList(
                CriteriaSetup.CriteriaConstants.BypassBlocks,
                CriteriaSetup.CriteriaConstants.PageTitled,
                CriteriaSetup.CriteriaConstants.FocusOrder,
                CriteriaSetup.CriteriaConstants.LinkPurposeInContext,
                CriteriaSetup.CriteriaConstants.MultipleWays,
                CriteriaSetup.CriteriaConstants.HeadingsAndLabels,
                CriteriaSetup.CriteriaConstants.FocusVisible,
                CriteriaSetup.CriteriaConstants.Location,
                CriteriaSetup.CriteriaConstants.LinkPurposeLinkOnly,
                CriteriaSetup.CriteriaConstants.SectionHeadings
        ));
        guideLineToCriteriasMap.put(GuidelineSetup.GuidelineConstants.Readable, Arrays.asList(
                CriteriaSetup.CriteriaConstants.LanguageOfPage,
                CriteriaSetup.CriteriaConstants.LanguageOfParts,
                CriteriaSetup.CriteriaConstants.UnusualWords,
                CriteriaSetup.CriteriaConstants.Abbreviations,
                CriteriaSetup.CriteriaConstants.ReadingLevel,
                CriteriaSetup.CriteriaConstants.Pronunciation
        ));
        guideLineToCriteriasMap.put(GuidelineSetup.GuidelineConstants.Predictable, Arrays.asList(
                CriteriaSetup.CriteriaConstants.OnFocus,
                CriteriaSetup.CriteriaConstants.OnInput,
                CriteriaSetup.CriteriaConstants.ConsistentNavigation,
                CriteriaSetup.CriteriaConstants.ConsistentIdentification,
                CriteriaSetup.CriteriaConstants.ChangeOnRequest
        ));
        guideLineToCriteriasMap.put(GuidelineSetup.GuidelineConstants.InputAssistance, Arrays.asList(
                CriteriaSetup.CriteriaConstants.ErrorIdentification,
                CriteriaSetup.CriteriaConstants.LabelsOrInstructions,
                CriteriaSetup.CriteriaConstants.ErrorSuggestion,
                CriteriaSetup.CriteriaConstants.ErrorPrevention ,
                CriteriaSetup.CriteriaConstants.Help ,
                CriteriaSetup.CriteriaConstants.ErrorPreventionAll
        ));
        guideLineToCriteriasMap.put(GuidelineSetup.GuidelineConstants.Compatible, Arrays.asList(
                CriteriaSetup.CriteriaConstants.Parsing,
                CriteriaSetup.CriteriaConstants.NameRoleValue
        ));
        return guideLineToCriteriasMap;
    }
}
