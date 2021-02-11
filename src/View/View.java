package View;

import java.util.ArrayList;
import javax.swing.JButton;
import static jdk.internal.org.jline.utils.Colors.s;

public class View
{

    private InitialFrame infr;

    public InitialFrame getInfr()
    {
        return infr;
    }

    public View()
    {
        infr = new InitialFrame();

    }

    public void DisplayCenterButton(String s, int position)
    {
        infr.getIp().getCp().displayBts(s, position);

    }

    public void DisplayCenterButtons(String s, int position)
    {
        infr.getIp().getCp().displayBtb(s, position);

    }

    //public void DisplayCenterButtons(ArrayList<String> arr , int position)
    //{
    //    infr.getIp().getCp().displayBts(arr, position);
    //}
    public void setInfr(InitialFrame infr)
    {
        this.infr = infr;
    }

    public void basicDisplay(String s)
    {
        System.out.println(s);
    }

    public void basicDisplay(ArrayList<String> arr)
    {
        for (String s : arr)
        {
            System.out.print(s);
        }
        System.out.println(" ");

    }

    public void CenterInitialSetup(int linesBeingDisplayed, int size)
    {
        this.infr.getIp().getCp().CenterInitialSetup(linesBeingDisplayed, size);

    }

    public void CenterUpdate(ArrayList<ArrayList<String>> lines, ArrayList<String> headers)
    {

        for (String s : headers)

        {

            this.DisplayCenterButtons(s, 6);

            this.DisplayCenterButtons(headers.get(0), 0);
            this.DisplayCenterButtons(headers.get(1), 1);
            this.DisplayCenterButtons(headers.get(2), 2);
            this.DisplayCenterButtons(headers.get(3), 3);
            this.DisplayCenterButtons(headers.get(4), 4);
            this.DisplayCenterButtons(headers.get(5), 5);

            //DisplayCenterButton(s, 0);
        }

        System.out.println(" ");

        this.infr.getIp().getCp().CenterUpdates(lines);

    }

}
