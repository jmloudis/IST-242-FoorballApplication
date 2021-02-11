/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class InitialFrame extends JFrame
{

    private InitialPanel ip;

    public InitialFrame()
    {
        super("IST 242");
        LayoutSetupMAC();

        ip = new InitialPanel();
        add(ip);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBackground(Color.GRAY);
        this.setSize(1000, 700);
        this.setVisible(true);
    }

    public InitialPanel getIp()
    {
        return ip;
    }

    public void setIp(InitialPanel ip)
    {
        this.ip = ip;
    }

    void LayoutSetupMAC()
    {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------           
    }
}
