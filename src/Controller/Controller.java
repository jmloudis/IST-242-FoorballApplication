package Controller;

import Model.Model;
import View.View;
import java.awt.Color;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JPanel;

public class Controller extends JPanel
{

    Model model;
    View view;

    public Controller(View v, Model m)
    {
        model = m;
        view = v;
        //view.getInfr().getIp().getCp().CenterInitialSetup(WIDTH, ERROR);
        addScrolling();

        //model.getFpData().getFirstLineToDisplay();
//=========used in L04A =====================================================
        view.CenterInitialSetup(model.getFpData().getLinesBeingDisplayed(), model.getFpData().getHeaders().size());

        view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),
                model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
    }

    private void addScrolling()
    {
        this.view.getInfr().getIp().getCp().addMouseWheelListener(
                new MouseWheelListener()
        {

            @Override
            public void mouseWheelMoved(MouseWheelEvent e)
            {
                //int units = e.getUnitsToScroll();
                int units = e.getWheelRotation();

                model.getFpData().setFirstLineToDisplay(units);
                //model.getFpData().setLastLineToDisplay(model.getFpData().getFirstLineToDisplay());

                //model.getFpData().setLastLineToDisplay(units);
                view.CenterUpdate(model.getFpData().getLines(units + model.getFpData().getFirstLineToDisplay(), model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
                //needs to add the current value of first line to the units

                System.out.println("units=" + units + "   " + "FirstLine =" + model.getFpData().getFirstLineToDisplay());
            }

        }
        );

    }

}
