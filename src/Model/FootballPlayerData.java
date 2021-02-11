package Model;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class FootballPlayerData implements TableData, Displayable
{

    private ArrayList<TableMember> players;

    private int linesBeingDisplayed;
    private int firstLineToDisplay;
    private int lastLineToDisplay;

    private int lineToHighlight = 1;

    public FootballPlayerData()
    {
        players = new ArrayList<>();
        loadTable();

        this.setLinesBeingDisplayed(10); // fix FirstLine, LastLine & LinesBeingDisplayed(which has the full table right now)

        this.setFirstLineToDisplay(0);
        this.setLastLineToDisplay(50); // 123 but not supposed to do this.... cant find another way.

        //lineToHighlight = 1;
    }

    public void ReadPlayersFromXML()
    {
        try
        {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp != null)
            {
                try
                {
                    fp = (FootballPlayer) decoder.readObject();
                    players.add(fp);

                } catch (ArrayIndexOutOfBoundsException theend)
                {
                    //System.out.println("end of file");
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx)
        {
            xx.printStackTrace();
        }
    }

    @Override
    public void loadTable()
    {
        ReadPlayersFromXML();
    }

    @Override
    public ArrayList<TableMember> getTable()
    {

        return this.players;

    }

    @Override
    public ArrayList<String> getHeaders()
    {

        return players.get(0).getAttributeNames();

    }

    @Override
    public ArrayList<String> getLine(int line)
    {

        return players.get(line).getAttributes();

    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine)
    {
        ArrayList<ArrayList<String>> LinesList = new ArrayList();

        for (int i = firstLine; i < lastLine; i++)
        {
            LinesList.add(getLine(i));
        }

        return LinesList;
    }

    public ArrayList<TableMember> getPlayers()
    {
        return players;
    }

    public void setPlayers(ArrayList<TableMember> players)
    {
        this.players = players;

    }

    @Override
    public int getFirstLineToDisplay()
    {

        return this.firstLineToDisplay;

    }

    @Override
    public int getLineToHighlight()
    {
        return this.lineToHighlight;
    }

    @Override
    public int getLastLineToDisplay()
    {
        return this.lastLineToDisplay;
    }

    @Override
    public int getLinesBeingDisplayed()
    {
        //return setLinesBeingDisplayed = 1;
        return this.linesBeingDisplayed;
    }

    @Override
    public void setFirstLineToDisplay(int firstLine)
    {
        this.firstLineToDisplay = firstLine;

    }

    @Override
    public void setLineToHighlight(int highlightedLine)
    {
        this.lineToHighlight = highlightedLine;

    }

    @Override
    public void setLastLineToDisplay(int lastLine)
    {
        this.lastLineToDisplay = lastLine;

    }

    @Override
    public void setLinesBeingDisplayed(int numberOfLines)
    {

        this.linesBeingDisplayed = numberOfLines;

    }

}
