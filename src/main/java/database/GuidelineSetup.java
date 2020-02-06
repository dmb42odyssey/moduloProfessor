package database;

import datatype.guidance.AbstractGuideline;
import datatype.guidance.AbstractPrinciple;
import datatype.guidance.Guideline;

import java.util.HashMap;
import java.util.Map;

public class GuidelineSetup {

    public Map<String, Integer> principleToGuidelineNumber = new HashMap<>();

    public GuidelineSetup()
    {
        principleToGuidelineNumber.put(PrincipleSetup.PrincipleConstants.Perceivable,4);
        principleToGuidelineNumber.put(PrincipleSetup.PrincipleConstants.Operable,4);
        principleToGuidelineNumber.put(PrincipleSetup.PrincipleConstants.Understandable, 3);
        principleToGuidelineNumber.put(PrincipleSetup.PrincipleConstants.Robust, 1);
    }

    public static class GuidelineConstants
    {
        public static final String TextAlternatives = "Text Alternatives";
        public static final String TimeBasedMedia = "Time-based Media";
        public static final String Adaptable = "Adaptable";
        public static final String Distinguishable = "Distinguishable";
        public static final String KeyboardAccessible = "Keyboard Accessible";
        public static final String EnoughTime = "Enough Time";
        public static final String Seizures = "Seizures";
        public static final String Navigable = "Navigable";
        public static final String Readable = "Readable";
        public static final String Predictable = "Predictable";
        public static final String InputAssistance = "Input Assistance";
        public static final String Compatible = "Compatível";
         // NAME
        public static final String TextAlternativesName = "Alternativas em Texto";
        public static final String TimeBasedMediaName = "Mídias com base em tempo";
        public static final String AdaptableName = "Adaptável";
        public static final String DistinguishableName = "Discernível";
        public static final String KeyboardAccessibleName = "Acessível por Teclado";
        public static final String EnoughTimeName = "Tempo Suficiente";
        public static final String SeizuresName = "Convulsões";
        public static final String NavigableName = "Navegável";
        public static final String ReadableName = "Legível";
        public static final String PredictableName = "Previsível";
        public static final String InputAssistanceName = "Assistência de Entrada";
        public static final String CompatibleName = "Compatible";
        // DESC
        public static final String TextAlternativesDescription = "Fornecer alternativas textuais para qualquer conteúdo não textual, " +
                 "para que possa ser transformado em outras formas de acordo com as necessidades " +
                 "dos usuários, tais como impressão com tamanho de fontes maiores, braille, fala," +
                " símbolos ou linguagem mais simples.";
        public static final String TimeBasedMediaDescription = "Fornecer alternativas para mídias baseadas em tempo.";
        public static final String AdaptableDescription = "Criar conteúdo que pode ser apresentado de diferentes maneiras " +
                 "(por exemplo um layout simplificado) sem perder informação ou estrutura.";
        public static final String DistinguishableDescription = "Facilitar a audição e a visualização de conteúdo aos usuários, " +
                 "incluindo a separação entre o primeiro plano e o plano de fundo.";
        public static final String KeyboardAccessibleDescription = "Fazer com que toda funcionalidade fique disponível a partir de um teclado.";
        public static final String EnoughTimeDescription = "Fornecer aos usuários tempo suficiente para ler e utilizar o conteúdo.";
        public static final String SeizuresDescription = "Seizures";
        public static final String NavigableDescription = "Fornecer maneiras de ajudar os usuários a navegar, " +
                "localizar conteúdos e determinar onde se encontram.";
        public static final String ReadableDescription = "Tornar o conteúdo do texto legível e compreensível.";
        public static final String PredictableDescription  = "Fazer com que as páginas web apareçam e funcionem de modo previsível.";
        public static final String InputAssistanceDescription = "Ajudar os usuários a evitar e corrigir erros.";
        public static final String CompatibleDescription = "Maximizar a compatibilidade entre os atuais " +
                "e futuros agentes de usuário, incluindo tecnologias assistivas.";
    }

    // private SWITCH
    public static AbstractGuideline GuidelineInitialization(String principleName, String guidelineName)
    {
        switch (principleName)
        {
            case PrincipleSetup.PrincipleConstants.Perceivable:
            {
                return selectPerceivableGuideline(guidelineName);
            }
            case PrincipleSetup.PrincipleConstants.Operable:
            {
                return selectOperableGuideline(guidelineName);
            }
            case PrincipleSetup.PrincipleConstants.Understandable:
            {
                return selectUnderstandableGuideline(guidelineName);
            }
            case PrincipleSetup.PrincipleConstants.Robust:
            {
                return selectRobustGuideline(guidelineName);
            }
        }
        return null;
    }

    private static AbstractGuideline selectPerceivableGuideline(String guidelineName)
    {
        String name = null;
        String description = null;

        switch (guidelineName)
        {
            case GuidelineConstants.TextAlternatives:
             {
                name = GuidelineConstants.TextAlternativesName;
                description = GuidelineConstants.TextAlternativesDescription;
                break;
            }
            case GuidelineConstants.TimeBasedMedia:
            {
                name = GuidelineConstants.TimeBasedMediaName;
                description = GuidelineConstants.TimeBasedMediaDescription;
                break;
            }
            case GuidelineConstants.Adaptable:
            {
                name = GuidelineConstants.AdaptableName;
                description = GuidelineConstants.AdaptableDescription;
                break;
            }
            case GuidelineConstants.Distinguishable:
            {
                name = GuidelineConstants.DistinguishableName;
                description = GuidelineConstants.DistinguishableDescription;
                break;
            }
        }
        return new Guideline(guidelineName, name, description);
    }

    private static AbstractGuideline selectOperableGuideline(String guidelineName)
    {
        String name = null;
        String description = null;

        switch(guidelineName)
        {
            case GuidelineConstants.KeyboardAccessible:
            {
                name = GuidelineConstants.KeyboardAccessibleName;
                description = GuidelineConstants.KeyboardAccessibleDescription;
                break;
            }
            case GuidelineConstants.EnoughTime:
            {
                name = GuidelineConstants.EnoughTimeName;
                description = GuidelineConstants.EnoughTimeDescription;
                break;
            }
            case GuidelineConstants.Seizures:
            {
                name = GuidelineConstants.SeizuresName;
                description = GuidelineConstants.SeizuresDescription;
                break;
            }
            case GuidelineConstants.Navigable:
            {
                name = GuidelineConstants.NavigableName;
                description = GuidelineConstants.NavigableDescription;
                break;
            }
        }
        return new Guideline(guidelineName, name, description);
    }

    private static AbstractGuideline selectUnderstandableGuideline(String guidelineName)
    {
        String name = null;
        String description = null;

        switch (guidelineName)
        {
            case GuidelineConstants.Readable:
            {
                name = GuidelineConstants.ReadableName;
                description = GuidelineConstants.ReadableDescription;
                break;
            }
            case GuidelineConstants.Predictable:
            {
                name = GuidelineConstants.PredictableName;
                description = GuidelineConstants.PredictableDescription;
                break;
            }
            case GuidelineConstants.InputAssistance:
            {
                name = GuidelineConstants.InputAssistanceName;
                description = GuidelineConstants.InputAssistanceDescription;
                break;
            }
        }
        return new Guideline(guidelineName, name, description);
    }

    private static AbstractGuideline selectRobustGuideline(String guidelineName)
    {
        String name = GuidelineConstants.CompatibleName;
        String description = GuidelineConstants.CompatibleDescription;
        return new Guideline(guidelineName, name, description);
    }
}
