package database;

import datatype.guidance.AbstractPrinciple;
import datatype.guidance.Principle;

public class PrincipleSetup {

    public PrincipleSetup()
    {

    }

    public static class PrincipleConstants
    {
        public static final String Perceivable = "Perceivable";
        public static final String Operable = "Operable";
        public static final String Understandable = "Understandable";
        public static final String Robust = "Robust";

        public static final String PerceivableName = "Perceptível";
        public static final String OperableName = "Operável";
        public static final String UnderstandableName = "Compreensível";
        public static final String RobustName = "Robusto";

        public static final String PerceivableDescription = "As informações e os componentes da interface do usuário" +
                " devem ser apresentados em formas que possam ser percebidas pelo usuário.";
        public static final String OperableDescription = "Os componentes de interface de usuário e a navegação devem ser operáveis.";
        public static final String UnderstandableDescription = "A informação e a operação da interface de usuário devem ser compreensíveis";
        public static final String RobustDescription = "O conteúdo deve ser robusto o suficiente para poder " +
                "ser interpretado de forma confiável por uma ampla variedade " +
                "de agentes de usuário, incluindo tecnologias assistivas.";

    }

    // private SWITCH
    public static AbstractPrinciple selectPrincipleInitialization(String principleName)
    {
        String name = null;
        String description = null;

        switch (principleName)
        {
            case PrincipleConstants.Perceivable:
            {
                name = PrincipleConstants.PerceivableName;
                description = PrincipleConstants.PerceivableDescription;
                break;
            }
            case PrincipleConstants.Operable:
            {
                name = PrincipleConstants.OperableName;
                description = PrincipleConstants.OperableDescription;
                break;
                // TO DO
            }
            case PrincipleConstants.Understandable:
            {
                name = PrincipleConstants.UnderstandableName;
                description = PrincipleConstants.UnderstandableDescription;
                break;
            }
            case PrincipleConstants.Robust:
            {
                name = PrincipleConstants.RobustName;
                description = PrincipleConstants.RobustDescription;
                break;
                // TO DO
            }
        }
        return new Principle(principleName, name, description);
    }
}
