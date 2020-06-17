
/**
 * Write a description of class Project here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Project implements Comparable<Project>
{
    // instance variables - replace the example below with your own

    String title;// Project Title e.g. Web site creation 
    String start, end;// Expected start/end dates e.g. 01/01/20 – 31/05/20 
    LinkedQueue teamMembers;
    /**
     * Constructor for objects of class Project
     */
    public Project(String t, String s)//For if a user sets up a new project in progress
    {
        this.title = t;
        this.start = s;
    }

    public Project(String t, String s, String e){//For if a user knows the start and end date
        this.title = t;
        this.start = s;
        this.end = e;
    }

    //methods for;

    public String details(){
        String o = "";
        //start date
        //end date
        //employees
        return o;
    }// Display the details for a specific project 

    public void removeMember(String name){
    }// Remove a particular employee from a specified project

    public int compareTo(Project c){
        int o = 0;
        //compare strings
        return o;
    }//comparator method
}

