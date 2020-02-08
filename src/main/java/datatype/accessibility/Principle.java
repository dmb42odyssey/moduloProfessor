package datatype.accessibility;

import java.util.ArrayList;

public class Principle extends AbstractPrinciple {

    public Principle(String id, String name, String description)
    {
        super();
        super.setName(name);
        super.setDescription(description);
        guidelineList= new ArrayList<>();
    }

}
