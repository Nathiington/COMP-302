package Lab2;

import java.util.ArrayList;

public class Student
{
    private String name ="";
    private int age = 0;
    private ArrayList<String> modules;

    //Constructor which creates an empty ArrayList which we add to
    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.modules = new ArrayList<String>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

//for setModules you take in a String module as a parameter and it will add it to the modules(plural) ArrayList which contains the list of all modules done by that specific student
    public void setModules(String module)
    {
        this.modules.add(module);
    }
//the method getMethods will return the ArrayList as a whole for the student with all the modules that were added for the student
    public ArrayList<String> getModules()
    {
        return modules;
    }

    @Override
    public String toString()
    {
        return "Name= " + name + ", age= " + age + ", modules= " + modules;
    }
}
