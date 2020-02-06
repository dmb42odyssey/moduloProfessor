package database;

import datatype.guidance.AbstractCriteria;
import datatype.guidance.concreteCriteria.WCAG.principle1.*;
import datatype.guidance.concreteCriteria.WCAG.principle2.*;
import datatype.guidance.concreteCriteria.WCAG.principle3.*;
import datatype.guidance.concreteCriteria.WCAG.principle4.*;

public class CriteriaSetup {

    public static AbstractCriteria CriteriaInitialization(String criteria)
    {
        switch(criteria)
        {
            case CriteriaConstants.NonTextContent: return new NonTextContext();
            case CriteriaConstants.AudioOnlyVideoOnly: return new AudioOnlyVideoOnly();
            case CriteriaConstants.CaptionsPreRecorded: return new CaptionsPrerecorded();
            case CriteriaConstants.AudioDescriptionMediaAlternative: return new AudioDescriptionOrMediaAlternative();
            case CriteriaConstants.CaptionsLive: return new CaptionsLive();
            case CriteriaConstants.AudioDescription: return new AudioDescription();
            case CriteriaConstants.SignLanguage: return new SignLanguage();
            case CriteriaConstants.ExtendedAudioDescription: return new ExtendedAudioDescription();
            case CriteriaConstants.MediaAlternative: return new MediaAlternative();
            case CriteriaConstants.AudioOnlyLive: return new AudioOnlyLive();
            case CriteriaConstants.InfoRelationship: return new InfoRelationship();
            case CriteriaConstants.MeaningfulSequence: return new MeaningfulSequence();
            case CriteriaConstants.SensoryCharacteristics: return new SensoryCharacteristics();
            case CriteriaConstants.UseOfColor: return new UseOfColor();
            case CriteriaConstants.AudioControl: return new AudioControl();
            case CriteriaConstants.ContrastMinimum: return new ContrastMinimum();
            case CriteriaConstants.ResizeText: return new ResizeText ();
            case CriteriaConstants.ImagesOfText: return new ImagesOfText();
            case CriteriaConstants.ContrastEnchanced: return new ContrastEnchanced();
            case CriteriaConstants.LowOrNoBackgroundAudio: return new LowOrNoBackgroundAudio();
            case CriteriaConstants.VisualPresentation: return new VisualPresentation();
            case CriteriaConstants.ImageOfTextNoException: return new ImageOfTextNoException();
            case CriteriaConstants.Keyboard: return new Keyboard();
            case CriteriaConstants.NoKeyboardTrap: return new NoKeyboardTrap();
            case CriteriaConstants.KeyboardNoException: return new KeyboardNoException();
            case CriteriaConstants.TimingAdjustable: return new TimingAdjustable();
            case CriteriaConstants.PauseStopHide: return new PauseStopHide();
            case CriteriaConstants.NoTiming: return new NoTiming();
            case CriteriaConstants.Interruptions: return new Interruptions();
            case CriteriaConstants.ReAuthenticating: return new ReAuthenticating();
            case CriteriaConstants.ThreeFlashesOrBelowThreshold: return new ThreeFlashesOrBelowThreshold();
            case CriteriaConstants.ThreeFlashes: return new ThreeFlashes();
            case CriteriaConstants.BypassBlocks: return new BypassBlocks();
            case CriteriaConstants.PageTitled: return new PageTitled();
            case CriteriaConstants.FocusOrder: return new FocusOrder();
            case CriteriaConstants.LinkPurposeInContext: return new LinkPurposeInContext();
            case CriteriaConstants.MultipleWays: return new MultipleWays();
            case CriteriaConstants.HeadingsAndLabels: return new HeadingsAndLabels();
            case CriteriaConstants.FocusVisible: return new FocusVisible();
            case CriteriaConstants.Location: return new Location();
            case CriteriaConstants.LinkPurposeLinkOnly: return new LinkPurposeLinkOnly();
            case CriteriaConstants.SectionHeadings: return new SectionHeadings();
            case CriteriaConstants.LanguageOfPage: return new LanguageOfPage();
            case CriteriaConstants.LanguageOfParts: return new LanguageOfParts();
            case CriteriaConstants.UnusualWords: return new UnusualWords();
            case CriteriaConstants.Abbreviations: return new Abbreviations();
            case CriteriaConstants.ReadingLevel: return new ReadingLevel();
            case CriteriaConstants.Pronunciation: return new Pronunciation();
            case CriteriaConstants.OnFocus: return new OnFocus();
            case CriteriaConstants.OnInput: return new OnInput();
            case CriteriaConstants.ConsistentNavigation: return new ConsistentNavigation();
            case CriteriaConstants.ConsistentIdentification: return new ConsistentIdentification();
            case CriteriaConstants.ChangeOnRequest: return new ChangeOnRequest();
            case CriteriaConstants.ErrorIdentification: return new ErrorIdentification();
            case CriteriaConstants.LabelsOrInstructions: return new LabelsOrInstructions();
            case CriteriaConstants.ErrorSuggestion: return new ErrorSuggestion();
            case CriteriaConstants.ErrorPrevention: return new ErrorPrevention();
            case CriteriaConstants.Help: return new Help();
            case CriteriaConstants.ErrorPreventionAll: return new ErrorPreventionAll();
            case CriteriaConstants.Parsing: return new Parsing();
            case CriteriaConstants.NameRoleValue: return new NameRoleValue();

        }
        return null;
    }


    public static class CriteriaConstants {
        public static final String NonTextContent = "Non-text Content";
        public static final String AudioOnlyVideoOnly = "Time-based Media";
        public static final String CaptionsPreRecorded = "Captions (Prerecorded)";
        public static final String AudioDescriptionMediaAlternative = "Audio Description or Media Alternative";
        public static final String CaptionsLive = "Captions (Live)";
        public static final String AudioDescription = "Audio Description";
        public static final String SignLanguage = "Sign Language";
        public static final String ExtendedAudioDescription = "Extended Audio Description";
        public static final String MediaAlternative = "Media Alternative";
        public static final String AudioOnlyLive = "Audio-only (Live)";
        public static final String InfoRelationship = "Info and Relationships";
        public static final String MeaningfulSequence = "Meaningful Sequence";
        public static final String SensoryCharacteristics = "Sensory Characteristics";
        public static final String UseOfColor = "Use of Color";
        public static final String AudioControl = "Audio Control";
        public static final String ContrastMinimum = "Contrast (Minimum)";
        public static final String ResizeText = "Resize text";
        public static final String ImagesOfText = "Images of Text";
        public static final String ContrastEnchanced = "Contrast (Enhanced)";
        public static final String LowOrNoBackgroundAudio = "Low or No Background Audio";
        public static final String VisualPresentation = "Visual Presentation";
        public static final String ImageOfTextNoException = "Images of Text (No Exception)";
        public static final String Keyboard = "Keyboard";
        public static final String NoKeyboardTrap = "No Keyboard Trap";
        public static final String KeyboardNoException = "Keyboard (No Exception)";
        public static final String TimingAdjustable = "Timing Adjustable";
        public static final String PauseStopHide = "Pause, Stop, Hide";
        public static final String NoTiming = "No Timing";
        public static final String Interruptions = "Interruptions";
        public static final String ReAuthenticating = "Re-authenticating";
        public static final String ThreeFlashesOrBelowThreshold = "Three Flashes or Below Threshold";
        public static final String ThreeFlashes = "Three Flashes";
        public static final String BypassBlocks = "Bypass Blocks";
        public static final String PageTitled = "Page Titled";
        public static final String FocusOrder = "FocusOrder";
        public static final String LinkPurposeInContext = "Link Purpose (In Context)";
        public static final String MultipleWays = "Multiple Ways";
        public static final String HeadingsAndLabels = "Headings and Labels";
        public static final String FocusVisible = "Focus Visible";
        public static final String Location = "Location";
        public static final String LinkPurposeLinkOnly = "Link Purpose (Link Only)";
        public static final String SectionHeadings = "Section Headings";
        public static final String LanguageOfPage = "Language of Page";
        public static final String LanguageOfParts ="Language of Parts";
        public static final String UnusualWords = "Unusual Words";
        public static final String Abbreviations = "Abbreviations";
        public static final String ReadingLevel = "Reading Level";
        public static final String Pronunciation = "Pronunciation";
        public static final String OnFocus = "On Focus";
        public static final String OnInput = "On Input";
        public static final String ConsistentNavigation = "Consistent Navigation";
        public static final String ConsistentIdentification = "Consistent Identification";
        public static final String ChangeOnRequest = "Change on Request";
        public static final String ErrorIdentification = "Error Identification";
        public static final String LabelsOrInstructions = "Labels or Instructions";
        public static final String ErrorSuggestion = "Error Suggestion";
        public static final String ErrorPrevention = "Error Prevention (Legal, Financial, Data)";
        public static final String Help = "Help";
        public static final String ErrorPreventionAll = "Error Prevention (All)";
        public static final String Parsing = "Parsing";
        public static final String NameRoleValue = "Name, Role, Value";
        public static final String NonTextContentName = "Conteúdo Não Textual";
        public static final String AudioOnlyVideoOnlyName = "Apenas Áudio e apenas Vídeo (Pré-gravado)";
        public static final String CaptionsPreRecordedName = "Legendas (Pré-gravadas)";
        public static final String AudioDescriptionMediaAlternativeName = "Audiodescrição ou Mídia Alternativa (Pré-gravada)";
        public static final String CaptionsLiveName = "Legendas (Ao Vivo)";
        public static final String AudioDescriptionName = "Audiodescrição (Pré-gravada)";
        public static final String SignLanguageName = "Língua de sinais (Pré-gravada)";
        public static final String ExtendedAudioDescriptionName = "Audiodescrição Estendida (Pré-gravada)";
        public static final String MediaAlternativeName = "Mídia Alternativa (Pré-gravada)";
        public static final String AudioOnlyLiveName = "Apenas áudio (Ao vivo)";
        public static final String InfoRelationshipName = "Informações e Relações";
        public static final String MeaningfulSequenceName = "Sequência com Significado";
        public static final String SensoryCharacteristicsName = "Características Sensoriais";
        public static final String UseOfColorName = "Utilização de Cores";
        public static final String AudioControlName = "Controle de Áudio";
        public static final String ContrastMinimumName = "Contraste (Mínimo)";
        public static final String ResizeTextName = "Redimensionar texto";
        public static final String ImagesOfTextName = "Imagens de Texto";
        public static final String ContrastEnchancedName = "Contraste (Melhorado)";
        public static final String LowOrNoBackgroundAudioName = "Áudio de fundo baixo ou sem áudio de fundo";
        public static final String VisualPresentationName = "Apresentação Visual";
        public static final String ImageOfTextNoExceptionName = "Imagens de Texto (Sem Exceção)";
        public static final String KeyboardName = "Teclado";
        public static final String NoKeyboardTrapName = "Sem Bloqueio do Teclado";
        public static final String KeyboardNoExceptionName = "Teclado (Sem Exceção)";
        public static final String TimingAdjustableName = "Ajustável por Temporização";
        public static final String PauseStopHideName = "Colocar em Pausa, Parar, Ocultar";
        public static final String NoTimingName = "Sem Temporização";
        public static final String InterruptionsName = "Interrupções";
        public static final String ReAuthenticatingName = "Nova autenticação";
        public static final String ThreeFlashesOrBelowThresholdName = "Três Flashes ou Abaixo do Limite";
        public static final String ThreeFlashesName = "Três Flashes";
        public static final String BypassBlocksName = "Ignorar Blocos";
        public static final String PageTitledName = "Página com Título";
        public static final String FocusOrderName = "Ordem do Foco";
        public static final String LinkPurposeInContextName = "Finalidade do Link (Em Contexto)";
        public static final String MultipleWaysName = "Várias Formas";
        public static final String HeadingsAndLabelsName = "Cabeçalhos e Rótulos";
        public static final String FocusVisibleName = "Foco Visível";
        public static final String LocationName = "Localização";
        public static final String LinkPurposeLinkOnlyName = "Finalidade do Link (Apenas o Link)";
        public static final String SectionHeadingsName = "Cabeçalhos da sessão";
        public static final String LanguageOfPageName = "Idioma da Página";
        public static final String LanguageOfPartsName ="Idioma das Partes";
        public static final String UnusualWordsName = "Palavras Incomuns";
        public static final String AbbreviationsName = "Abreviaturas";
        public static final String ReadingLevelName = "Nível de Leitura";
        public static final String PronunciationName = "Pronúncia";
        public static final String OnFocusName = "Em Foco";
        public static final String OnInputName = "Em Entrada";
        public static final String ConsistentNavigationName = "Navegação Consistente";
        public static final String ConsistentIdentificationName = "Identificação Consistente";
        public static final String ChangeOnRequestName = "Alteração mediante solicitação";
        public static final String ErrorIdentificationName = "Identificação do Erro";
        public static final String LabelsOrInstructionsName = "Rótulos ou Instruções";
        public static final String ErrorSuggestionName = "Sugestão de Erro";
        public static final String ErrorPreventionName = "Prevenção de Erros (Legal, Financeiro, Dados)";
        public static final String HelpName = "Ajuda";
        public static final String ErrorPreventionAllName = "Prevenção de Erros (Todos)";
        public static final String ParsingName = "Análise";
        public static final String NameRoleValueName = "Nome, Função, Valor";

        public static final String NonTextContentDescription = "Todo o conteúdo não textual que é exibido ao usuário tem " +
                "uma alternativa textual que serve a um propósito equivalente";
        public static final String AudioOnlyVideoOnlyDescription = "Para as mídias de apenas áudio pré-gravados e mídias de vídeo (sem áudio)" +
                " pré-gravados as regras seguintes são verdadeiras";
        public static final String CaptionsPreRecordedDescription = "São fornecidas legendas para todo conteúdo de áudio pré-gravado em mídia sincronizada";
        public static final String AudioDescriptionMediaAlternativeDescription = "Uma alternativa para mídia com base em tempo ou uma audiodescrição do conteúdo em vídeo" +
                " pré-gravado é fornecida para mídia sincronizada";
        public static final String CaptionsLiveDescription = "São fornecidas legendas para todo o conteúdo do áudio ao vivo existente em mídia sincronizada";
        public static final String AudioDescriptionDescription = "É fornecida audiodescrição para todo o conteúdo de vídeo pré-gravado existente em mídia sincronizada";
        public static final String SignLanguageDescription = "É fornecida interpretação em língua de sinais para todo o conteúdo de áudio pré-gravado existente em um conteúdo em mídia sincronizada.";
        public static final String ExtendedAudioDescriptionDescription = "Quando as pausas no áudio de primeiro plano forem insuficientes para permitir que as audiodescrições transmitam o sentido do vídeo, é fornecida uma audiodescrição estendida para todo o vídeo pré-gravado existente no conteúdo em mídia sincronizada.";
        public static final String MediaAlternativeDescription = " É fornecida uma alternativa para mídia com base em tempo para a todo o conteúdo existente em mídia sincronizada pré-gravada e para a todo o conteúdo multimídia composto por apenas vídeo pré-gravado.";
        public static final String AudioOnlyLiveDescription = " É fornecida uma alternativa para mídia com base em tempo que apresenta informações equivalentes para conteúdo apenas áudio ao vivo.";
        public static final String InfoRelationshipDescription = "As informações, a estrutura e os relacionamentos transmitidos através de apresentação podem ser determinados por meio de código de programação ou estão disponíveis no texto";
        public static final String MeaningfulSequenceDescription = "Quando a sequência na qual o conteúdo é apresentado afeta o seu significado, uma sequência de leitura correta pode ser determinada por meio de código de programação";
        public static final String SensoryCharacteristicsDescription = "SAs instruções fornecidas para compreender e utilizar o conteúdo não dependem somente das características sensoriais dos componentes, tais como forma, tamanho, localização visual, orientação ou som.";
        public static final String UseOfColorDescription = "A cor não é utilizada como o único meio visual de transmitir informações, indicar uma ação, pedir uma resposta ou distinguir um elemento visual. ";
        public static final String AudioControlDescription = "Se qualquer áudio em uma página web tocar automaticamente durante mais de 3 segundos, deve estar disponível um mecanismo para fazer uma pausa ou parar o áudio, ou um mecanismo para controlar o volume do áudio, independentemente do nível global de volume do sistema deve disponibilizar.";
        public static final String ContrastMinimumDescription = "A apresentação visual de texto e imagens de texto tem uma relação de contraste de, no mínimo, 4.5:1";
        public static final String ResizeTextDescription = "Exceto para legendas e imagens de texto, o texto pode ser redimensionado sem tecnologia assistiva até 200 por cento sem perder conteúdo ou funcionalidade.";
        public static final String ImagesOfTextDescription = "Se as tecnologias que estiverem sendo utilizadas puderem proporcionar a apresentação visual, é utilizado texto para transmitir informações em vez de imagens de texto";
        public static final String ContrastEnchancedDescription = "A apresentação visual do texto e imagens de texto tem uma relação de contraste de, no mínimo, 7:1";
        public static final String LowOrNoBackgroundAudioDescription = "Para conteúdo composto por apenas áudio | pré-gravado que (1) contenha essencialmente fala em primeiro plano, (2) não seja um CAPTCHA de áudio ou logotipo de áudio, e (3) não seja vocalização com o objetivo de ser, essencialmente, expressão musical, tal como cantar ou fazer batidas, no mínimo, uma das seguintes afirmações é verdadeira: (Nível AAA)\n" +
                "\n" +
                "    Sem Fundo: O áudio não contém sons de fundo.\n" +
                "\n" +
                "    Desligar: Os sons de fundo podem ser desligados.\n" +
                "\n" +
                "    20 dB mais baixo que a voz principal, no minimo.";
        // TO DO
        public static final String VisualPresentationDescription = "Para a apresentação visual de blocos de texto, um mecanismo está disponível para se obter o seguinte: (Nível AAA)\n" +
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
        public static final String ImageOfTextNoExceptionDescription = "As imagens de texto só são utilizadas por questões meramente decorativas ou quando uma determinada apresentação de texto é essencial para a informação que está sendo transmitida.";
        public static final String KeyboardDescription = "Toda a funcionalidade do conteúdo é operável através de uma interface de teclado sem requerer temporizações específicas para digitação individual, exceto quando a função subjacente requer entrada de dados que dependa da cadeia de movimento do usuário e não apenas dos pontos finais.";
        public static final String NoKeyboardTrapDescription = "Se o foco do teclado puder ser movido para um componente da página utilizando uma interface de teclado, então o foco pode ser retirado desse componente utilizando apenas uma interface de teclado e, se for necessário mais do que as setas do cursor ou tabulação ou outros métodos de saída normalmente utilizados, o usuário deve ser informado sobre o método para retirar o foco.";
        public static final String KeyboardNoExceptionDescription = "Toda a funcionalidade do conteúdo é operável através de uma interface de teclado sem requerer temporizações específicas para digitação individual.";
        public static final String TimingAdjustableDescription = "Para cada limite de tempo definido pelo conteúdo, no mínimo, uma das seguintes afirmações é verdadeira: (Nível A)\n" +
                "\n" +
                "    Desligar: O usuário pode desligar o limite de tempo antes de atingi-lo; ou\n" +
                "\n" +
                "    Ajustar: O usuário pode ajustar o limite de tempo antes de atingi-lo, num intervalo de, no mínimo, dez vezes mais do que a configuração padrão; ou\n" +
                "\n" +
                "    Prolongar: O usuário é avisado antes de o tempo expirar e tem, no mínimo, 20 segundos para prolongar o limite de tempo com uma simples ação (por exemplo, \"pressionar a barra de espaços\"), e o usuário pode prolongar o limite de tempo, no mínimo, dez vezes; ou\n" +
                "\n" +
                "    Exceção em Tempo Real: O limite de tempo é uma parte necessária de um evento em tempo real (por exemplo, um leilão), e não é possível nenhuma alternativa ao limite de tempo; ou\n" +
                "\n" +
                "    Exceção Essencial: O limite de tempo é essencial e prolongá-lo invalidaria a atividade; ou\n" +
                "\n" +
                "    Exceção de 20 Horas: O limite de tempo é superior a 20 horas.\n";
        public static final String PauseStopHideDescription = "Para informações em movimento, em modo intermitente, em deslocamento ou em atualização automática, todas as seguintes afirmações são verdadeiras: (Nível A)\n" +
                "\n" +
                "    Em movimento, em modo intermitente, em deslocamento: Para quaisquer informações em movimento, em modo intermitente ou em deslocamento, que (1) sejam iniciadas automaticamente, (2) durem mais de cinco segundos, e (3) sejam apresentadas em paralelo com outro conteúdo, existe um mecanismo para o usuário colocar em pausa, parar, ou ocultar as mesmas, a menos que o movimento, o modo intermitente ou o deslocamento façam parte de uma atividade, na qual sejam essenciais; e\n" +
                "\n" +
                "    Em atualização automática: Para quaisquer informações em atualização automática, que (1) sejam iniciadas automaticamente e (2) sejam apresentadas em paralelo com outro conteúdo, existe um mecanismo para o usuário colocar em pausa, parar ou ocultar as mesmas, ou controlar a frequência da atualização, a menos que a atualização automática faça parte de uma atividade, onde é essencial.\n";
        public static final String NoTimingDescription = "A temporização não é uma parte essencial do evento ou da atividade apresentada pelo conteúdo, exceto para mídia sincronizada não interativa e eventos em tempo real.";
        public static final String InterruptionsDescription = "As interrupções podem ser adiadas ou suprimidas pelo usuário, exceto interrupções que envolvam uma emergência.";
        public static final String ReAuthenticatingDescription = " Quando uma seção autenticada expira, o usuário pode continuar a atividade sem perder dados após a nova autenticação.";
        public static final String ThreeFlashesOrBelowThresholdDescription = "As páginas web não incluem nenhum conteúdo que pisque mais de três vezes no período de um segundo, ou o flash encontra-se abaixo dos limites de flash universal e flash vermelho. ";
        public static final String ThreeFlashesDescription = "As páginas web não incluem qualquer conteúdo que pisca mais de três vezes no período de um segundo.";
        public static final String BypassBlocksDescription = "Um mecanismo está disponível para ignorar blocos de conteúdo que são repetidos em várias páginas web";
        public static final String PageTitledDescription = "As páginas web têm títulos que descrevem o tópico ou a finalidade";
        public static final String FocusOrderDescription = "Se uma página web puder ser navegada de forma sequencial e as sequências de navegação afetarem o significado ou a operação, os componentes que podem ser focados recebem o foco em uma ordem que preserva o significado e a operabilidade.";
        public static final String LinkPurposeInContextDescription = "A finalidade de cada link pode ser determinada a partir do link sozinho ou a partir do texto do link em conjunto com seu respectivo contexto do link determinado por meio de código de programação, exceto quando a finalidade do link for ambígua para os usuários em geral";
        public static final String MultipleWaysDescription = "Está disponível mais de uma forma para localizar uma página web em um conjunto de páginas web, exceto quando a Página Web for o resultado, ou uma etapa, de um processo.";
        public static final String HeadingsAndLabelsDescription = "Os cabeçalhos e os rótulos descrevem o tópico ou a finalidade.";
        public static final String FocusVisibleDescription = "Qualquer interface de usuário operável por teclado dispõe de um modo de operação onde o indicador de foco do teclado está visível";
        public static final String LocationDescription = "Informação sobre a localização do usuário está disponível em um conjunto de páginas web";
        public static final String LinkPurposeLinkOnlyDescription = "Um mecanismo está disponível para permitir que a finalidade de cada link seja identificada a partir apenas do texto do link, exceto quando a sua finalidade for ambígua para os usuários em geral. ";
        public static final String SectionHeadingsDescription = "Os cabeçalhos da seção são utilizados para organizar o conteúdo.";
        public static final String LanguageOfPageDescription = "O idioma humano pré-definido de cada página web pode ser determinado por meio de código de programação.";
        public static final String LanguageOfPartsDescription ="O idioma de cada passagem ou frase no conteúdo pode ser determinado por meio de código de programação, exceto para nomes próprios, termos técnicos, palavras de idioma indeterminado e palavras ou frases que se tornaram parte do vernáculo do texto que as envolve.";
        public static final String UnusualWordsDescription = "Um mecanismo para identificar definições específicas de palavras ou expressões utilizadas de uma forma restrita e incomum está disponível, incluindo expressões idiomáticas e jargões.";
        public static final String AbbreviationsDescription = "Está disponível um mecanismo para identificar a forma expandida ou o significado das abreviaturas.";
        public static final String ReadingLevelDescription = "Quando o texto exigir uma capacidade de leitura mais avançada do que o nível de educação secundário inferior (equivalente no Brasil aos últimos anos do ensino fundamental), após a remoção dos nomes próprios e títulos adequados, um conteúdo suplementar, ou uma versão que não exija uma capacidade de leitura mais avançada do que o nível de educação secundário inferior (equivalente no Brasil aos últimos anos do ensino fundamental) está disponível.";
        public static final String PronunciationDescription = "Um mecanismo está disponível para identificar a pronúncia específica de palavras, onde o significado das mesmas, no contexto, é ambíguo se a pronúncia não for conhecida.";
        public static final String OnFocusDescription = "Quando qualquer componente recebe o foco, não inicia uma alteração de contexto.";
        public static final String OnInputDescription = "Alterar a definição de um componente de interface de usuário não provoca, automaticamente, uma alteração de contexto, a menos que o usuário tenha sido avisado sobre esse comportamento antes de utilizar o componente.";
        public static final String ConsistentNavigationDescription = "Os mecanismos de navegação que são repetidos em múltiplas páginas web dentro de um conjunto de páginas web ocorrem na mesma ordem relativa a cada vez que são repetidos, a menos que seja iniciada uma alteração pelo usuário.";
        public static final String ConsistentIdentificationDescription = "Os componentes que têm a mesma funcionalidade em um conjunto de páginas web são identificados de forma consistente.";
        public static final String ChangeOnRequestDescription = "As alterações de contexto são iniciadas apenas a pedido do usuário, ou um mecanismo para desativar essas alterações está disponível. ";
        public static final String ErrorIdentificationDescription = "Se um erro de entrada for automaticamente detectado, o item que apresenta erro é identificado e o erro é descrito para o usuário em texto.";
        public static final String LabelsOrInstructionsDescription = "Rótulos ou instruções são fornecidos quando o conteúdo exigir a entrada de dados por parte do usuário.";
        public static final String ErrorSuggestionDescription = "Se um erro de entrada for automaticamente detectado e forem conhecidas sugestões de correção, então as sugestões são fornecidas ao usuário, a menos que coloque em risco a segurança ou o propósito do conteúdo. ";
        public static final String ErrorPreventionDescription = "Para páginas web que façam com que ocorram responsabilidades jurídicas ou transações financeiras para o usuário, que modificam ou eliminam dados controláveis pelo usuário em sistemas de armazenamento de dados, ou que enviem respostas de teste do usuário, no mínimo, uma das seguintes afirmações é verdadeira: (Nível AA)\n" +
                "\n" +
                "    Reversível: Os envios de informações são reversíveis.\n" +
                "\n" +
                "    Verificado: Os dados introduzidos pelo usuário são verificados quanto à existência de erros de entrada e é oferecida ao usuário uma oportunidade de corrigi-los.\n" +
                "\n" +
                "    Confirmado: Um mecanismo está disponível para rever, confirmar e corrigir as informações antes de finalizar o envio.\n";
        public static final String HelpDescription = "Está disponível ajuda contextual.";
        public static final String ErrorPreventionAllDescription= "Para páginas web que exijam que o usuário envie informações, no mínimo, uma das seguintes afirmações é verdadeira: (Nível AAA)\n" +
                "\n" +
                "    Reversível: As submissões são reversíveis.\n" +
                "\n" +
                "    Verificado: Os dados introduzidos pelo usuário são verificados quanto à existência de erros de entrada e é oferecida ao usuário uma oportunidade de corrigi-los.\n" +
                "\n" +
                "    Confirmado: Um mecanismo está disponível para rever, confirmar e corrigir as informações antes de finalizar o envio.\n";
        public static final String ParsingDescription = "No conteúdo implementado utilizando linguagens de marcação, os elementos dispõem de tags completas de início e de fim, os elementos são aninhados de acordo com as respectivas especificações, os elementos não contêm atributos duplicados, e quaisquer IDs são exclusivos, exceto quando as especificações permitem estas características.";
        public static final String NameRoleValueDescription = "Para todos os componentes de interface de usuário (incluindo, mas não se limitando a: elementos de formulário, links e componentes gerados por scripts), o nome e a função podem ser determinados por meio de código de programação; os estados, as propriedades e os valores, que possam ser definidos pelo usuário, podem ser definidos por meio de código de programação; e a notificação sobre alterações destes itens está disponível para os agentes de usuário, incluindo as tecnologias assistivas.";
    }
}
