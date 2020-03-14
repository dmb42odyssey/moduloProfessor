package datatype.accessibility.check;

import java.util.ArrayList;
import java.util.List;

public class CheckAgent
{
    private List<ICriteriaCheck> ICriteriaCheckList;

    public CheckAgent()
    {
        ICriteriaCheckList = new ArrayList();
    }

    public void placeCheck(ICriteriaCheck ICriteriaCheck)
    {
        ICriteriaCheckList.add(ICriteriaCheck);
        ICriteriaCheckList.get(0).check();
        ICriteriaCheckList.remove(0);
    }
}
