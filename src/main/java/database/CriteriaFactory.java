package database;

import datatype.accessibility.Criteria;

public class CriteriaFactory
{
    public static class WCAG
    {
        public static Criteria getCriteria(String criteria)
        {
            switch(criteria) {
                case CriteriaDatabase.CriteriaConstants.ID.NonTextContent:
                    return NonTextContext();
                case CriteriaDatabase.CriteriaConstants.ID.AudioOnlyVideoOnly:
                    return AudioOnlyVideoOnly();
                case CriteriaDatabase.CriteriaConstants.ID.CaptionsPreRecorded:
                    return CaptionsPreRecorded();
                case CriteriaDatabase.CriteriaConstants.ID.AudioDescription:
                    return AudioDescription();
                case CriteriaDatabase.CriteriaConstants.ID.MeaningfulSequence:
                    return MeaningfulSequence();
                case CriteriaDatabase.CriteriaConstants.ID.UseOfColor:
                    return UseOfColor();
                case CriteriaDatabase.CriteriaConstants.ID.ContrastMinimum:
                    return ContrastMinimum();
                case CriteriaDatabase.CriteriaConstants.ID.ResizeText:
                    return ResizeText();
                case CriteriaDatabase.CriteriaConstants.ID.ImagesOfText:
                    return ImagesOfText();
                case CriteriaDatabase.CriteriaConstants.ID.ContrastEnchanced:
                    return ContrastEnchanced();
                case CriteriaDatabase.CriteriaConstants.ID.LowOrNoBackgroundAudio:
                    return LowOrNoBackgroundAudio();
                case CriteriaDatabase.CriteriaConstants.ID.VisualPresentation:
                    return VisualPresentation();
                case CriteriaDatabase.CriteriaConstants.ID.ImageOfTextNoException:
                    return ImageOfTextNoException();
                case CriteriaDatabase.CriteriaConstants.ID.KeyboardNoException:
                    return KeyboardNoException();
                case CriteriaDatabase.CriteriaConstants.ID.PauseStopHide:
                    return PauseStopHide();
                case CriteriaDatabase.CriteriaConstants.ID.NoTiming:
                    return NoTiming();
                case CriteriaDatabase.CriteriaConstants.ID.ThreeFlashes:
                    return ThreeFlashes();
                case CriteriaDatabase.CriteriaConstants.ID.PageTitled:
                    return PageTitled();
                case CriteriaDatabase.CriteriaConstants.ID.LinkPurposeInContext:
                    return LinkPurposeInContext();
                case CriteriaDatabase.CriteriaConstants.ID.HeadingsAndLabels:
                    return HeadingsAndLabels();
                case CriteriaDatabase.CriteriaConstants.ID.LinkPurposeLinkOnly:
                    return LinkPurposeLinkOnly();
                case CriteriaDatabase.CriteriaConstants.ID.SectionHeadings:
                    return SectionHeadings();
                case CriteriaDatabase.CriteriaConstants.ID.LanguageOfPage:
                    return LanguageOfPage();
                case CriteriaDatabase.CriteriaConstants.ID.LanguageOfParts:
                    return LanguageOfParts();
                case CriteriaDatabase.CriteriaConstants.ID.UnusualWords:
                    return UnusualWords();
                case CriteriaDatabase.CriteriaConstants.ID.Abbreviations:
                    return Abbreviations();
                case CriteriaDatabase.CriteriaConstants.ID.ReadingLevel:
                    return ReadingLevel();
                case CriteriaDatabase.CriteriaConstants.ID.Pronunciation:
                    return Pronunciation();
                case CriteriaDatabase.CriteriaConstants.ID.ChangeOnRequest:
                    return ChangeOnRequest();
            }
            return null;
        }

        private static Criteria NonTextContext()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.NonTextContent,
                    CriteriaDatabase.CriteriaConstants.Name.NonTextContent,
                    CriteriaDatabase.CriteriaConstants.Description.NonTextContent,
                    CriteriaDatabase.CriteriaConstants.Solution.NonTextContent,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.NonTextContent)
            );
        }

        private static Criteria AudioOnlyVideoOnly()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.AudioOnlyVideoOnly,
                    CriteriaDatabase.CriteriaConstants.Name.AudioOnlyVideoOnly,
                    CriteriaDatabase.CriteriaConstants.Description.AudioOnlyVideoOnly,
                    CriteriaDatabase.CriteriaConstants.Solution.AudioOnlyVideoOnly,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.AudioOnlyVideoOnly)
            );
        }

        private static Criteria CaptionsPreRecorded()
        {
            return new Criteria(
                CriteriaDatabase.CriteriaConstants.ID.CaptionsPreRecorded,
                CriteriaDatabase.CriteriaConstants.Name.CaptionsPreRecorded,
                CriteriaDatabase.CriteriaConstants.Description.CaptionsPreRecorded,
                CriteriaDatabase.CriteriaConstants.Solution.CaptionsPreRecorded,
                CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.CaptionsPreRecorded)
            );
        }

        private static Criteria AudioDescription()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.AudioDescription,
                    CriteriaDatabase.CriteriaConstants.Name.AudioDescription,
                    CriteriaDatabase.CriteriaConstants.Description.AudioDescription,
                    CriteriaDatabase.CriteriaConstants.Solution.AudioDescription,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.AudioDescription)
            );
        }

        private static Criteria MeaningfulSequence()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.MeaningfulSequence,
                    CriteriaDatabase.CriteriaConstants.Name.MeaningfulSequence,
                    CriteriaDatabase.CriteriaConstants.Description.MeaningfulSequence,
                    CriteriaDatabase.CriteriaConstants.Solution.MeaningfulSequence,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.MeaningfulSequence)
            );
        }

        private static Criteria UseOfColor()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.UseOfColor,
                    CriteriaDatabase.CriteriaConstants.Name.UseOfColor,
                    CriteriaDatabase.CriteriaConstants.Description.UseOfColor,
                    CriteriaDatabase.CriteriaConstants.Solution.UseOfColor,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.UseOfColor)
            );
        }

        private static Criteria ContrastMinimum()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.ContrastMinimum,
                    CriteriaDatabase.CriteriaConstants.Name.ContrastMinimum,
                    CriteriaDatabase.CriteriaConstants.Description.ContrastMinimum,
                    CriteriaDatabase.CriteriaConstants.Solution.ContrastMinimum,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.ContrastMinimum)
            );
        }

        private static Criteria ResizeText()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.ResizeText,
                    CriteriaDatabase.CriteriaConstants.Name.ResizeText,
                    CriteriaDatabase.CriteriaConstants.Description.ResizeText,
                    CriteriaDatabase.CriteriaConstants.Solution.ResizeText,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.ResizeText)
            );
        }

        private static Criteria ImagesOfText()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.ImagesOfText,
                    CriteriaDatabase.CriteriaConstants.Name.ImagesOfText,
                    CriteriaDatabase.CriteriaConstants.Description.ImagesOfText,
                    CriteriaDatabase.CriteriaConstants.Solution.ImagesOfText,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.ImagesOfText)
            );
        }

        private static Criteria ContrastEnchanced()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.ContrastEnchanced,
                    CriteriaDatabase.CriteriaConstants.Name.ContrastEnchanced,
                    CriteriaDatabase.CriteriaConstants.Description.ContrastEnchanced,
                    CriteriaDatabase.CriteriaConstants.Solution.ContrastEnchanced,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.ContrastEnchanced)
            );
        }

        private static Criteria LowOrNoBackgroundAudio()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.LowOrNoBackgroundAudio,
                    CriteriaDatabase.CriteriaConstants.Name.LowOrNoBackgroundAudio,
                    CriteriaDatabase.CriteriaConstants.Description.LowOrNoBackgroundAudio,
                    CriteriaDatabase.CriteriaConstants.Solution.LowOrNoBackgroundAudio,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.CaptionsPreRecorded)
            );
        }

        private static Criteria VisualPresentation()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.VisualPresentation,
                    CriteriaDatabase.CriteriaConstants.Name.VisualPresentation,
                    CriteriaDatabase.CriteriaConstants.Description.VisualPresentation,
                    CriteriaDatabase.CriteriaConstants.Solution.VisualPresentation,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.VisualPresentation)
            );
        }

        private static Criteria ImageOfTextNoException()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.ImageOfTextNoException,
                    CriteriaDatabase.CriteriaConstants.Name.ImageOfTextNoException,
                    CriteriaDatabase.CriteriaConstants.Description.ImageOfTextNoException,
                    CriteriaDatabase.CriteriaConstants.Solution.ImageOfTextNoException,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.ImageOfTextNoException)
            );
        }

        private static Criteria KeyboardNoException()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.KeyboardNoException,
                    CriteriaDatabase.CriteriaConstants.Name.KeyboardNoException,
                    CriteriaDatabase.CriteriaConstants.Description.KeyboardNoException,
                    CriteriaDatabase.CriteriaConstants.Solution.KeyboardNoException,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.KeyboardNoException)
            );
        }

        private static Criteria PauseStopHide()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.PauseStopHide,
                    CriteriaDatabase.CriteriaConstants.Name.PauseStopHide,
                    CriteriaDatabase.CriteriaConstants.Description.PauseStopHide,
                    CriteriaDatabase.CriteriaConstants.Solution.PauseStopHide,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.PauseStopHide)
            );
        }

        private static Criteria NoTiming()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.NoTiming,
                    CriteriaDatabase.CriteriaConstants.Name.NoTiming,
                    CriteriaDatabase.CriteriaConstants.Description.NoTiming,
                    CriteriaDatabase.CriteriaConstants.Solution.NoTiming,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.NoTiming)
            );
        }

        private static Criteria ThreeFlashes()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.ThreeFlashes,
                    CriteriaDatabase.CriteriaConstants.Name.ThreeFlashes,
                    CriteriaDatabase.CriteriaConstants.Description.ThreeFlashes,
                    CriteriaDatabase.CriteriaConstants.Solution.ThreeFlashes,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.ThreeFlashes)
            );
        }

        private static Criteria PageTitled()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.PageTitled,
                    CriteriaDatabase.CriteriaConstants.Name.PageTitled,
                    CriteriaDatabase.CriteriaConstants.Description.PageTitled,
                    CriteriaDatabase.CriteriaConstants.Solution.PageTitled,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.PageTitled)
            );
        }

        private static Criteria LinkPurposeInContext()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.LinkPurposeInContext,
                    CriteriaDatabase.CriteriaConstants.Name.LinkPurposeInContext,
                    CriteriaDatabase.CriteriaConstants.Description.LinkPurposeInContext,
                    CriteriaDatabase.CriteriaConstants.Solution.LinkPurposeInContext,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.LinkPurposeInContext)
            );
        }

        private static Criteria HeadingsAndLabels()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.HeadingsAndLabels,
                    CriteriaDatabase.CriteriaConstants.Name.HeadingsAndLabels,
                    CriteriaDatabase.CriteriaConstants.Description.HeadingsAndLabels,
                    CriteriaDatabase.CriteriaConstants.Solution.HeadingsAndLabels,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.HeadingsAndLabels)
            );
        }

        private static Criteria LinkPurposeLinkOnly()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.LinkPurposeLinkOnly,
                    CriteriaDatabase.CriteriaConstants.Name.LinkPurposeLinkOnly,
                    CriteriaDatabase.CriteriaConstants.Description.LinkPurposeLinkOnly,
                    CriteriaDatabase.CriteriaConstants.Solution.LinkPurposeLinkOnly,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.LinkPurposeLinkOnly)
            );
        }

        private static Criteria SectionHeadings()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.SectionHeadings,
                    CriteriaDatabase.CriteriaConstants.Name.SectionHeadings,
                    CriteriaDatabase.CriteriaConstants.Description.SectionHeadings,
                    CriteriaDatabase.CriteriaConstants.Solution.SectionHeadings,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.SectionHeadings)
            );
        }

        private static Criteria LanguageOfPage()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.LanguageOfPage,
                    CriteriaDatabase.CriteriaConstants.Name.LanguageOfPage,
                    CriteriaDatabase.CriteriaConstants.Description.LanguageOfPage,
                    CriteriaDatabase.CriteriaConstants.Solution.LanguageOfPage,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.LanguageOfPage)
            );
        }

        private static Criteria LanguageOfParts()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.LanguageOfParts,
                    CriteriaDatabase.CriteriaConstants.Name.LanguageOfParts,
                    CriteriaDatabase.CriteriaConstants.Description.LanguageOfParts,
                    CriteriaDatabase.CriteriaConstants.Solution.LanguageOfParts,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.LanguageOfParts)
            );
        }

        private static Criteria UnusualWords()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.UnusualWords,
                    CriteriaDatabase.CriteriaConstants.Name.UnusualWords,
                    CriteriaDatabase.CriteriaConstants.Description.UnusualWords,
                    CriteriaDatabase.CriteriaConstants.Solution.UnusualWords,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.UnusualWords)
            );
        }

        private static Criteria Abbreviations()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.Abbreviations,
                    CriteriaDatabase.CriteriaConstants.Name.Abbreviations,
                    CriteriaDatabase.CriteriaConstants.Description.Abbreviations,
                    CriteriaDatabase.CriteriaConstants.Solution.Abbreviations,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.Abbreviations)
            );
        }

        private static Criteria ReadingLevel()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.ReadingLevel,
                    CriteriaDatabase.CriteriaConstants.Name.ReadingLevel,
                    CriteriaDatabase.CriteriaConstants.Description.ReadingLevel,
                    CriteriaDatabase.CriteriaConstants.Solution.ReadingLevel,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.ReadingLevel)
            );
        }

        private static Criteria Pronunciation()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.Pronunciation,
                    CriteriaDatabase.CriteriaConstants.Name.Pronunciation,
                    CriteriaDatabase.CriteriaConstants.Description.Pronunciation,
                    CriteriaDatabase.CriteriaConstants.Solution.Pronunciation,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.Pronunciation)
            );
        }

        private static Criteria ChangeOnRequest()
        {
            return new Criteria(
                    CriteriaDatabase.CriteriaConstants.ID.ChangeOnRequest,
                    CriteriaDatabase.CriteriaConstants.Name.ChangeOnRequest,
                    CriteriaDatabase.CriteriaConstants.Description.ChangeOnRequest,
                    CriteriaDatabase.CriteriaConstants.Solution.ChangeOnRequest,
                    CriteriaDatabase.getDefaultConformance(CriteriaDatabase.CriteriaConstants.ID.ChangeOnRequest)
            );
        }

    }
}
