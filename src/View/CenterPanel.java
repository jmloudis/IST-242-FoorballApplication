/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 *
 * @author fredfonseca
 */
public class CenterPanel extends JPanel
{

    private ArrayList<JButton> jbs;
    private ArrayList<JButton> jbb;
    private int lines;
    private int rows;

    public CenterPanel()
    {
        super();

        jbs = new ArrayList<JButton>();
        jbb = new ArrayList<JButton>();
        lines = 0;
        rows = 0;

    }

    public void CenterInitialSetup(int l, int r)
    {
        GridLayout gr = new GridLayout(11, 7);
        setLayout(gr);

        for (int j = 0; j < r; j++)
        {
            JButton b11 = new JButton();
            jbb.add(b11);
            add(b11);

        }

        for (int i = 0; i < l; i++)
        {

            JButton b1 = new JButton();
            b1.setFont(new Font("Courier", Font.PLAIN, 14));
            b1.setBackground(Color.lightGray);
            b1.setForeground(Color.BLACK);
            jbs.add(b1);//add the button to the array of buttons
            add(b1); //add the button to the screen

            JButton b2 = new JButton();
            b2.setFont(new Font("Courier", Font.PLAIN, 14));
            b2.setBackground(Color.lightGray);
            b2.setForeground(Color.BLACK);
            jbs.add(b2);
            add(b2);

            JButton b3 = new JButton();
            b3.setFont(new Font("Courier", Font.PLAIN, 14));
            b3.setBackground(Color.lightGray);
            b3.setForeground(Color.BLACK);
            jbs.add(b3);
            add(b3);

            JButton b4 = new JButton();
            b4.setFont(new Font("Courier", Font.PLAIN, 14));
            b4.setBackground(Color.lightGray);
            b4.setForeground(Color.BLACK);
            jbs.add(b4);
            add(b4);

            JButton b5 = new JButton();
            b5.setFont(new Font("Courier", Font.PLAIN, 14));
            b5.setBackground(Color.lightGray);
            b5.setForeground(Color.BLACK);
            jbs.add(b5);
            add(b5);

            JButton b6 = new JButton();
            b6.setFont(new Font("Courier", Font.PLAIN, 14));
            b6.setBackground(Color.lightGray);
            b6.setForeground(Color.BLACK);
            jbs.add(b6);
            add(b6);

            JButton b7 = new JButton();
            b7.setFont(new Font("Courier", Font.PLAIN, 14));
            b7.setBackground(Color.lightGray);
            b7.setForeground(Color.BLACK);
            jbs.add(b7);
            add(b7);

        }

        validate();
        repaint();

    }

    public void CenterUpdates(ArrayList<ArrayList<String>> j)
    {

        for (ArrayList<String> lines : j)
        {

            for (int i = 0; i < j.size(); i++)
            {

                for (int k = 0; k <= 6; k++)
                {

                    jbs.get((i * 7) + k).setText(j.get(i).get(k));

                }
            }

        }

    }

    public void displayBts(String s, int n)
    {
        jbs.get(n).setText(s);
    }

    public void displayBtb(String s, int n)
    {
        jbb.get(n).setText(s);
    }

    public ArrayList<JButton> getJbs()
    {
        return jbs;
    }

    public void setJbs(ArrayList<JButton> jbs)
    {
        this.jbs = jbs;
    }

    public int getLines()
    {
        return lines;
    }

    public void setLines(int lines)
    {
        this.lines = lines;
    }

    public int getRows()
    {
        return rows;
    }

    public void setRows(int rows)
    {
        this.rows = rows;
    }

    public ArrayList<JButton> getJbb()
    {
        return jbb;
    }

    public void setJbb(ArrayList<JButton> jbb)
    {
        this.jbb = jbb;
    }

    //@Override
    //public void mouseWheelMoved(MouseWheelEvent e)
    //{
    //}
}
