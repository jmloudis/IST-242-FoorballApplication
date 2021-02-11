/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author fredfonseca
 */
public class InitialPanel extends JPanel
{

    private CenterPanel cp;
    //JButton b1,b2;

    public InitialPanel()
    {
        super();
        cp = new CenterPanel();
        //b1 = new JButton("Headers");
        //b2 = new JButton("Number");

        this.setLayout(new BorderLayout(20, 20));

        add(cp, BorderLayout.CENTER);

    }

    public CenterPanel getCp()
    {
        return cp;
    }

    public void setCp(CenterPanel cp)
    {
        this.cp = cp;
    }

}
