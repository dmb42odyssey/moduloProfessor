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
                CriteriaDatabase.CriteriaConstants.ID.NonTextContent
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.TimeBasedMedia, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.AudioOnlyVideoOnly,
                CriteriaDatabase.CriteriaConstants.ID.CaptionsPreRecorded,
                CriteriaDatabase.CriteriaConstants.ID.AudioDescriptionMediaAlternative,
                CriteriaDatabase.CriteriaConstants.ID.CaptionsLive,
                CriteriaDatabase.CriteriaConstants.ID.AudioDescription,
                CriteriaDatabase.CriteriaConstants.ID.SignLanguage,
                CriteriaDatabase.CriteriaConstants.ID.ExtendedAudioDescription,
                CriteriaDatabase.CriteriaConstants.ID.MediaAlternative,
                CriteriaDatabase.CriteriaConstants.ID.AudioOnlyLive
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Adaptable, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.InfoRelationship,
                CriteriaDatabase.CriteriaConstants.ID.MeaningfulSequence,
                CriteriaDatabase.CriteriaConstants.ID.SensoryCharacteristics
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Distinguishable, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.UseOfColor,
                CriteriaDatabase.CriteriaConstants.ID.AudioControl,
                CriteriaDatabase.CriteriaConstants.ID.ContrastMinimum,
                CriteriaDatabase.CriteriaConstants.ID.ResizeText,
                CriteriaDatabase.CriteriaConstants.ID.ImagesOfText,
                CriteriaDatabase.CriteriaConstants.ID.ContrastEnchanced,
                CriteriaDatabase.CriteriaConstants.ID.LowOrNoBackgroundAudio,
                CriteriaDatabase.CriteriaConstants.ID.VisualPresentation,
                CriteriaDatabase.CriteriaConstants.ID.ImageOfTextNoException
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.KeyboardAccessible, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.Keyboard,
                CriteriaDatabase.CriteriaConstants.ID.NoKeyboardTrap,
                CriteriaDatabase.CriteriaConstants.ID.KeyboardNoException
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.EnoughTime, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.TimingAdjustable,
                CriteriaDatabase.CriteriaConstants.ID.PauseStopHide,
                CriteriaDatabase.CriteriaConstants.ID.NoTiming,
                CriteriaDatabase.CriteriaConstants.ID.Interruptions,
                CriteriaDatabase.CriteriaConstants.ID.ReAuthenticating
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Seizures, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.ThreeFlashesOrBelowThreshold ,
                CriteriaDatabase.CriteriaConstants.ID.ThreeFlashes
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Navigable, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.BypassBlocks,
                CriteriaDatabase.CriteriaConstants.ID.PageTitled,
                CriteriaDatabase.CriteriaConstants.ID.FocusOrder,
                CriteriaDatabase.CriteriaConstants.ID.LinkPurposeInContext,
                CriteriaDatabase.CriteriaConstants.ID.MultipleWays,
                CriteriaDatabase.CriteriaConstants.ID.HeadingsAndLabels,
                CriteriaDatabase.CriteriaConstants.ID.FocusVisible,
                CriteriaDatabase.CriteriaConstants.ID.Location,
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
                CriteriaDatabase.CriteriaConstants.ID.OnFocus,
                CriteriaDatabase.CriteriaConstants.ID.OnInput,
                CriteriaDatabase.CriteriaConstants.ID.ConsistentNavigation,
                CriteriaDatabase.CriteriaConstants.ID.ConsistentIdentification,
                CriteriaDatabase.CriteriaConstants.ID.ChangeOnRequest
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.InputAssistance, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.ErrorIdentification,
                CriteriaDatabase.CriteriaConstants.ID.LabelsOrInstructions,
                CriteriaDatabase.CriteriaConstants.ID.ErrorSuggestion,
                CriteriaDatabase.CriteriaConstants.ID.ErrorPrevention ,
                CriteriaDatabase.CriteriaConstants.ID.Help ,
                CriteriaDatabase.CriteriaConstants.ID.ErrorPreventionAll
        ));
        guideLineToCriteriasMap.put(GuidelineDatabase.GuidelineConstants.Compatible, Arrays.asList(
                CriteriaDatabase.CriteriaConstants.ID.Parsing,
                CriteriaDatabase.CriteriaConstants.ID.NameRoleValue
        ));
        return guideLineToCriteriasMap;
    }
}
