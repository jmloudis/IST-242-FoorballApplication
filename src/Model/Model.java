package Model;

import java.util.ArrayList;

public class Model
{

    private FootballPlayerData fpData;

    public Model()
    {
        fpData = new FootballPlayerData();
    }

    public FootballPlayerData getFpData()
    {
        return fpData;
    }

    public void setFpData(FootballPlayerData fpd)
    {
        this.fpData = fpd;
    }

    //==============================Lesson===============================
    //public ArrayList<String> names()
    //{
    //    ArrayList<String> n = new ArrayList<String>();
    //    for (int i = 0 ; i < fpData.getFirstLineToDisplay(); i++)
    //    {
    //        n.add(fpData.);
    //        
    //    }
    //    return n;
    //}
}
