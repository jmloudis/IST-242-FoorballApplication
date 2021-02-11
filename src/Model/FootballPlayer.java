/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jordan
 */
public class FootballPlayer extends Person implements TableMember //TableMember is an interface
{

    private int number;
    private String position;

    public FootballPlayer(int number, String position, String name, Height height, int weight, String hometown, String highschool)
    {
        super(name, height, weight, hometown, highschool);// calls the constructor of the super class sending the info needed there
        this.number = number;
        this.position = position;
    }

    public FootballPlayer()
    {
        super(); // I am expecting that the Person class has a public Person() constructor
        number = 0;
        position = "";
    }

    @Override
    public String toString()
    {
        return super.toString() + " " + "FootballPlayer{" + "number=" + number + ", position=" + position + '}';
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    @Override
    public String getAttribute(int n)
    {
        if (n == 0)
        {
            return number + " ";
        }

        if (n == 1)
        {
            return super.getName() + " ";
        }

        if (n == 2)
        {
            return position + " ";
        }

        if (n == 3)
        {
            return super.getHeight() + " ";

        }

        if (n == 4)
        {
            return super.getWeight() + " ";

        }

        if (n == 5)
        {
            return super.getHometown() + " ";
        }

        if (n == 6)
        {
            return super.getHighSchool() + " ";

        } else;
        return null;

    }

    @Override
    public ArrayList<String> getAttributes()
    {

        ArrayList Value = new ArrayList<String>();

        Value.add(getAttribute(0));
        Value.add(getAttribute(1));
        Value.add(getAttribute(2));
        Value.add(getAttribute(3));
        Value.add(getAttribute(4));
        Value.add(getAttribute(5));
        Value.add(getAttribute(6));

        //for (int i = 0; i < 1; i++)
        //{
        //    System.out.println(Value);
        //}
        return Value;

    }

    @Override
    public String getAttributeName(int n)
    {
        if (n == 0)
        {
            return "Number" + " ";
        }

        if (n == 1)
        {
            return "Name" + " ";
        }

        if (n == 2)
        {
            return "Position" + " ";
        }

        if (n == 3)
        {
            return "Height" + " ";
        }

        if (n == 4)
        {
            return "Weight" + " ";
        }

        if (n == 5)
        {
            return "Hometown" + " ";
        }

        if (n == 6)
        {
            return "HighSchool" + " ";
        } else;
        return null;

    }

    @Override
    public ArrayList<String> getAttributeNames()
    {
        ArrayList Name = new ArrayList<String>();

        Name.add(getAttributeName(0));
        Name.add(getAttributeName(1));
        Name.add(getAttributeName(2));
        Name.add(getAttributeName(3));
        Name.add(getAttributeName(4));
        Name.add(getAttributeName(5));
        Name.add(getAttributeName(6));

        //for (int i = 0; i < 1; i++)
        //{
        //     System.out.println(Name.size());
        //}
        return Name;

    }

}
