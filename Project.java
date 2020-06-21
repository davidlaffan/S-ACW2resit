import java.lang.*;
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
    LinkedQueue teamMembers = new LinkedQueue();
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
    
    public void testing(){
        addMember(new TeamMember(5, "repairs", "Joe"));
    }

    //methods for;

    public String details(){
        String o = "";
        o = o + "Name: " + title + "\r\n";
        o = o + "Start date: " + start + "\r\n";//start date
        if (!end.equals(null)){// if end != null
        }
        else{
            // if end != null
            o = o + "End date: " + end + "\r\n";//end date
        }
        //if there are no team members
        o = o + "Team members: " + "\r\n" + teamMembers.toString();//employees
        return o;
    }// Display the details for a specific project 

    public void removeMember(String name){
        //search for team member's name
    }// Remove a particular employee from a specified project

    public int compareTo(Project c){
        int o = this.title.compareTo(c.title);//compare strings
        return o;
    }//comparator method

    public void addMember(TeamMember i){
        System.out.println(teamMembers.toString());
        teamMembers.enqueue(i);
    }
}

