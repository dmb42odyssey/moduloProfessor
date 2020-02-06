package datatype.guidance;

import datatype.Text;
import datatype.Image;

public interface IAbstractCriteria
{
    public boolean checkIsSufficient();
    public boolean checkIsSufficent(Text text);
    public boolean checkIsSufficent(Image image);
}
