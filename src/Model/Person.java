package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jordan
 */
public class Person
{

    private String name;
    private Height height;
    private int weight;
    private String hometown;
    private String highschool;

    public Person(String name, Height height, int weight, String hometown, String highschool)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
        this.highschool = highschool;
    }

    public Person()
    {
        this.name = "";
        this.height = new Height();
        this.weight = 0;
        this.hometown = "";
        this.highschool = "";
    }

    @Override
    public String toString()
    {
        return "Person{" + "name=" + name + ", height=" + height + ", weight=" + weight + ", hometown=" + hometown + ", highschool=" + highschool + '}';
        //name.toString()
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Height getHeight()
    {
        return height;
    }

    public void setHeight(Height height)
    {
        this.height = height;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public String getHometown()
    {
        return hometown;
    }

    public void setHometown(String hometown)
    {
        this.hometown = hometown;
    }

    public String getHighSchool()
    {
        return highschool;
    }

    public void setHighSchool(String highschool)
    {
        this.highschool = highschool;
    }

}
