package database;

import datatype.accessibility.ConformanceLevel;
import datatype.accessibility.Criteria;

public class CriteriaDatabase {

    public static class CriteriaConstants {

        /*
         *  Not used for display in the results.
         *
         *
         */

        public static class ID
        {
            public static final String NonTextContent = "Non-text Content";
            public static final String AudioOnlyVideoOnly = "Time-based Media";
            public static final String CaptionsPreRecorded = "Captions (Prerecorded)";
            public static final String AudioDescription = "Audio Description";
            public static final String MeaningfulSequence = "Meaningful Sequence";
            public static final String UseOfColor = "Use of Color";
            public static final String ContrastMinimum = "Contrast (Minimum)";
            public static final String ResizeText = "Resize text";
            public static final String ImagesOfText = "Images of Text";
            public static final String ContrastEnchanced = "Contrast (Enhanced)";
            public static final String LowOrNoBackgroundAudio = "Low or No Background Audio";

            public static final String Reflow = "Reflow";
            public static final String NontextContrast = "Non-text Contrast";
            public static final String TextSpacing = "Text Spacing";

            public static final String VisualPresentation = "Visual Presentation";
            public static final String ImageOfTextNoException = "Images of Text (No Exception)";
            public static final String KeyboardNoException = "Keyboard (No Exception)";
            public static final String PauseStopHide = "Pause, Stop, Hide";
            public static final String NoTiming = "No Timing";
            public static final String AnimationFromInteraction = "Animation from Interaction";
            public static final String ThreeFlashes = "Three Flashes";
            public static final String PageTitled = "Page Titled";
            public static final String LinkPurposeInContext = "Link Purpose (In Context)";
            public static final String HeadingsAndLabels = "Headings and Labels";
            public static final String LinkPurposeLinkOnly = "Link Purpose (Link Only)";
            public static final String SectionHeadings = "Section Headings";
            public static final String LanguageOfPage = "Language of Page";
            public static final String LanguageOfParts ="Language of Parts";
            public static final String UnusualWords = "Unusual Words";
            public static final String Abbreviations = "Abbreviations";
            public static final String ReadingLevel = "Reading Level";
            public static final String Pronunciation = "Pronunciation";
            public static final String ChangeOnRequest = "Change on Request";
        }

        public static class Name
        {
            public static final String NonTextContent = "Conteúdo Não Textual";
            public static final String AudioOnlyVideoOnly = "Apenas Áudio e apenas Vídeo (Pré-gravado)";
            public static final String CaptionsPreRecorded = "Legendas (Pré-gravadas)";
            public static final String AudioDescription = "Audiodescrição (Pré-gravada)";
            public static final String MeaningfulSequence = "Sequência com Significado";
            public static final String UseOfColor = "Utilização de Cores";
            public static final String ContrastMinimum = "Contraste (Mínimo)";
            public static final String ResizeText = "Redimensionar texto";
            public static final String ImagesOfText = "Imagens de Texto";
            public static final String ContrastEnchanced = "Contraste (Melhorado)";
            public static final String LowOrNoBackgroundAudio = "Áudio de fundo baixo ou sem áudio de fundo";
            public static final String Reflow = "TO DO";
            public static final String NontextContrast = "TO DO";
            public static final String TextSpacing = "TO DO";
            public static final String VisualPresentation = "Apresentação Visual";
            public static final String ImageOfTextNoException = "Imagens de Texto (Sem Exceção)";
            public static final String KeyboardNoException = "Teclado (Sem Exceção)";
            public static final String PauseStopHide = "Colocar em Pausa, Parar, Ocultar";
            public static final String NoTiming = "Sem Temporização";
            public static final String AnimationFromInteraction = "TO DO";
            public static final String ThreeFlashes = "Três Flashes";
            public static final String PageTitled = "Documento com Título";
            public static final String LinkPurposeInContext = "Finalidade do Link (Em Contexto)";
            public static final String HeadingsAndLabels = "Cabeçalhos e Rótulos";
            public static final String LinkPurposeLinkOnly = "Finalidade do Link (Apenas o Link)";
            public static final String SectionHeadings = "Cabeçalhos da sessão";
            public static final String LanguageOfPage = "Idioma do documento";
            public static final String LanguageOfParts ="Idioma das Partes";
            public static final String UnusualWords = "Palavras Incomuns";
            public static final String Abbreviations = "Abreviaturas";
            public static final String ReadingLevel = "Nível de Leitura";
            public static final String Pronunciation= "Pronúncia";
            public static final String ChangeOnRequest = "Alteração mediante solicitação";
        }

        public static class Description
        {
            public static final String NonTextContent = "Todo o conteúdo não textual que é exibido ao usuário tem " +
                    "uma alternativa textual que serve a um propósito equivalente";
            public static final String AudioOnlyVideoOnly = "Para as mídias de apenas áudio pré-gravados e mídias de vídeo (sem áudio)" +
                    " pré-gravados as regras seguintes são verdadeiras";
            public static final String CaptionsPreRecorded = "São fornecidas legendas para todo conteúdo de áudio pré-gravado em mídia sincronizada";
            public static final String AudioDescription = "É fornecida audiodescrição para todo o conteúdo de vídeo pré-gravado existente em mídia sincronizada";
            public static final String MeaningfulSequence = "Quando a sequência na qual o conteúdo é apresentado afeta o seu significado, uma sequência de leitura correta pode ser determinada por meio de código de programação";
            public static final String UseOfColor = "A cor não é utilizada como o único meio visual de transmitir informações, indicar uma ação, pedir uma resposta ou distinguir um elemento visual. ";
            public static final String ContrastMinimum = "A apresentação visual de texto e imagens de texto tem uma relação de contraste de, no mínimo, 4.5:1";
            public static final String ResizeText = "Exceto para legendas e imagens de texto, o texto pode ser redimensionado sem tecnologia assistiva até 200 por cento sem perder conteúdo ou funcionalidade.";
            public static final String ImagesOfText = "Se as tecnologias que estiverem sendo utilizadas puderem proporcionar a apresentação visual, é utilizado texto para transmitir informações em vez de imagens de texto";
            public static final String ContrastEnchanced = "A apresentação visual do texto e imagens de texto tem uma relação de contraste de, no mínimo, 7:1";
            public static final String LowOrNoBackgroundAudio = "Para conteúdo composto por apenas áudio | pré-gravado que (1) contenha essencialmente fala em primeiro plano, (2) não seja um CAPTCHA de áudio ou logotipo de áudio, e (3) não seja vocalização com o objetivo de ser, essencialmente, expressão musical, tal como cantar ou fazer batidas, no mínimo, uma das seguintes afirmações é verdadeira: (Nível AAA)\n" +
                    "\n" +
                    "    Sem Fundo: O áudio não contém sons de fundo.\n" +
                    "\n" +
                    "    Desligar: Os sons de fundo podem ser desligados.\n" +
                    "\n" +
                    "    20 dB mais baixo que a voz principal, no minimo.";
            public static final String Reflow = "TO DO";
            public static final String NontextContrast = "TO DO";
            public static final String TextSpacing = "TO DO";
            public static final String VisualPresentation = "Para a apresentação visual de blocos de texto, um mecanismo está disponível para se obter o seguinte: (Nível AAA)\n" +
                    "\n" +
                    "    As cores do primeiro plano e do plano de fundo podem ser selecionadas pelo usuário.\n" +
                    "\n" +
                    "    A largura não tem mais do que 80 caracteres ou glifos (40 se CJK).\n" +
                    "\n" +
                    "    O texto não é justificado (alinhado a ambas as margens esquerda e direita).\n" +
                    "\n" +
                    "    O espaçamento entre linhas (principal) tem, no mínimo, um espaço e meio nos parágrafos, e o espaçamento entre parágrafos é, no mínimo, 1,5 vezes maior do que o espaçamento entre linhas.\n" +
                    "\n" +
                    "    O texto pode ser redimensionado sem tecnologia assistiva até 200 por cento, de um modo que o usuário não necessite rolar horizontalmente para ler uma linha de texto em uma janela em tela cheia.\n";
            public static final String ImageOfTextNoException = "As imagens de texto só são utilizadas por questões meramente decorativas ou quando uma determinada apresentação de texto é essencial para a informação que está sendo transmitida.";
            public static final String KeyboardNoException = "Toda a funcionalidade do conteúdo é operável através de uma interface de teclado sem requerer temporizações específicas para digitação individual.";
            public static final String PauseStopHide = "Para informações em movimento, em modo intermitente, em deslocamento ou em atualização automática, todas as seguintes afirmações são verdadeiras: (Nível A)\n" +
                    "\n" +
                    "    Em movimento, em modo intermitente, em deslocamento: Para quaisquer informações em movimento, em modo intermitente ou em deslocamento, que (1) sejam iniciadas automaticamente, (2) durem mais de cinco segundos, e (3) sejam apresentadas em paralelo com outro conteúdo, existe um mecanismo para o usuário colocar em pausa, parar, ou ocultar as mesmas, a menos que o movimento, o modo intermitente ou o deslocamento façam parte de uma atividade, na qual sejam essenciais; e\n" +
                    "\n" +
                    "    Em atualização automática: Para quaisquer informações em atualização automática, que (1) sejam iniciadas automaticamente e (2) sejam apresentadas em paralelo com outro conteúdo, existe um mecanismo para o usuário colocar em pausa, parar ou ocultar as mesmas, ou controlar a frequência da atualização, a menos que a atualização automática faça parte de uma atividade, onde é essencial.\n";
            public static final String NoTiming = "A temporização não é uma parte essencial do evento ou da atividade apresentada pelo conteúdo, exceto para mídia sincronizada não interativa e eventos em tempo real.";
            public static final String AnimationFromInteraction = "TO DO";
            public static final String ThreeFlashes = "As páginas web não incluem qualquer conteúdo que pisca mais de três vezes no período de um segundo.";
            public static final String PageTitled = "O documento deve possuir um título que descreva um tópico ou sua finalidade. Critério baseado na diretriz <u>2.4.2. Página com Título [Nível A]</u> da <a href=\"https://www.w3.org/Translations/WCAG20-pt-PT/WCAG20-pt-PT-20141024/\">WCAG</a>.";
            public static final String LinkPurposeInContext = "A finalidade de cada link pode ser determinada a partir do link sozinho ou a partir do texto do link em conjunto com seu respectivo contexto do link determinado por meio de código de programação, exceto quando a finalidade do link for ambígua para os usuários em geral";
            public static final String HeadingsAndLabels = "Os cabeçalhos e os rótulos descrevem o tópico ou a finalidade.";
            public static final String LinkPurposeLinkOnly = "Um mecanismo está disponível para permitir que a finalidade de cada link seja identificada a partir apenas do texto do link, exceto quando a sua finalidade for ambígua para os usuários em geral. ";
            public static final String SectionHeadings = "Os cabeçalhos da seção são utilizados para organizar o conteúdo.";
            public static final String LanguageOfPage = "O idioma humano geral deve estar definido no documento. Critério baseado na diretriz <u>3.1.1. Idioma da Página [Nível A]</u> da <a href=\"https://www.w3.org/Translations/WCAG20-pt-PT/WCAG20-pt-PT-20141024/\">WCAG</a>.";
            public static final String LanguageOfParts ="O idioma de cada passagem ou frase no conteúdo pode ser determinado por meio de código de programação, exceto para nomes próprios, termos técnicos, palavras de idioma indeterminado e palavras ou frases que se tornaram parte do vernáculo do texto que as envolve.";
            public static final String UnusualWords = "Um mecanismo para identificar definições específicas de palavras ou expressões utilizadas de uma forma restrita e incomum está disponível, incluindo expressões idiomáticas e jargões.";
            public static final String Abbreviations = "Está disponível um mecanismo para identificar a forma expandida ou o significado das abreviaturas.";
            public static final String ReadingLevel = "Quando o texto exigir uma capacidade de leitura mais avançada do que o nível de educação secundário inferior (equivalente no Brasil aos últimos anos do ensino fundamental), após a remoção dos nomes próprios e títulos adequados, um conteúdo suplementar, ou uma versão que não exija uma capacidade de leitura mais avançada do que o nível de educação secundário inferior (equivalente no Brasil aos últimos anos do ensino fundamental) está disponível.";
            public static final String Pronunciation = "Um mecanismo está disponível para identificar a pronúncia específica de palavras, onde o significado das mesmas, no contexto, é ambíguo se a pronúncia não for conhecida.";
            public static final String ChangeOnRequest = "As alterações de contexto são iniciadas apenas a pedido do usuário, ou um mecanismo para desativar essas alterações está disponível. ";
        }

        public static class Solution
        {
            public static final String NonTextContent = "";
            public static final String AudioOnlyVideoOnly = "";
            public static final String CaptionsPreRecorded = "";
            public static final String AudioDescription = "";
            public static final String MeaningfulSequence = "";
            public static final String UseOfColor = "";
            public static final String ContrastMinimum = "";
            public static final String ResizeText = "";
            public static final String ImagesOfText = "";
            public static final String ContrastEnchanced = "";
            public static final String LowOrNoBackgroundAudio = "";
            public static final String Reflow = "TO DO";
            public static final String NontextContrast = "TO DO";
            public static final String TextSpacing = "TO DO";
            public static final String VisualPresentation = "";
            public static final String ImageOfTextNoException = "";
            public static final String KeyboardNoException = "";
            public static final String PauseStopHide = "";
            public static final String NoTiming = "";
            public static final String AnimationFromInteraction = "TO DO";
            public static final String ThreeFlashes = "";
            public static final String PageTitled = "<p> Certifique-se que o campo \"Title\" foi preenchido. </p>";
            public static final String LinkPurposeInContext = "";
            public static final String HeadingsAndLabels = "";
            public static final String LinkPurposeLinkOnly = "";
            public static final String SectionHeadings = "";
            public static final String LanguageOfPage = "<p> Certifique-se que o campo \"Lang\" foi preenchido. </p>";
            public static final String LanguageOfParts ="";
            public static final String UnusualWords = "";
            public static final String Abbreviations = "";
            public static final String ReadingLevel = "";
            public static final String Pronunciation= "";
            public static final String ChangeOnRequest = "";
        }
    }

    public static boolean isEnabled(Criteria criteria)
    {
        return criteria.getId().equals(CriteriaConstants.ID.PageTitled) ||
                criteria.getId().equals(CriteriaConstants.ID.LanguageOfPage);
    }

    public static ConformanceLevel getDefaultConformance(String criteriaID)
    {
        // AAA
        if(criteriaID == CriteriaConstants.ID.ContrastEnchanced ||
           criteriaID == CriteriaConstants.ID.LowOrNoBackgroundAudio ||
           criteriaID == CriteriaConstants.ID.VisualPresentation ||
           criteriaID == CriteriaConstants.ID.ImagesOfText ||
           criteriaID == CriteriaConstants.ID.KeyboardNoException ||
           criteriaID == CriteriaConstants.ID.NoTiming ||
           criteriaID == CriteriaConstants.ID.AnimationFromInteraction ||
           criteriaID == CriteriaConstants.ID.LinkPurposeLinkOnly ||
           criteriaID == CriteriaConstants.ID.SectionHeadings ||
           criteriaID == CriteriaConstants.ID.UnusualWords ||
           criteriaID == CriteriaConstants.ID.Abbreviations ||
           criteriaID == CriteriaConstants.ID.ReadingLevel ||
           criteriaID == CriteriaConstants.ID.Pronunciation ||
           criteriaID == CriteriaConstants.ID.ChangeOnRequest
        )
        {
            return ConformanceLevel.AAA;
        }

        // AA
        else if(criteriaID == CriteriaConstants.ID.AudioDescription ||
                criteriaID == CriteriaConstants.ID.ContrastMinimum ||
                criteriaID == CriteriaConstants.ID.ResizeText ||
                criteriaID == CriteriaConstants.ID.Reflow ||
                criteriaID == CriteriaConstants.ID.NontextContrast ||
                criteriaID == CriteriaConstants.ID.TextSpacing ||
                criteriaID == CriteriaConstants.ID.LanguageOfParts
        )
        {
            return ConformanceLevel.AA;
        }

        return ConformanceLevel.A;
    }
}
