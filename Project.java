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
    LinkedQueue teamMembers = new LinkedQueue(); //change to stack??
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

    public String toString(){
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
        o = o + "Team members: " + "\r\n";//employees
        if (teamMembers.toString().equals("queue is empty")){
             o = o + "None assigned";//none assigned
        }
        else{
            o = o + teamMembers.toString();//show team members
        }
        return o;
    }// Display the details for a specific project 

    public void removeMember(String name){
        LinkedQueue temp = new LinkedQueue();//new queue
        try{
            Object current = teamMembers.dequeue();
            boolean found = false;
            while (current != null){
                if (((TeamMember)current).name.equals(name)){//if found, delete member, restore everything else
                    found = true;//stop while loop, search for team member's name
                    break;//enqueue the temp list back
                }//linear search
                temp.enqueue(current);
                current = teamMembers.dequeue();
            }
            //linear search 
            //if an exception is catched, it means that its the end of the queue anyway

            //if found, delete member, restore everything else
        }
        catch (Exception e){
            try{
                boolean allPlacedBack=false;
                while (allPlacedBack == false){
                    teamMembers.enqueue(temp.dequeue());
                }
                //will run until the exception is catched, meaning the queue is empty
            }
            catch(Exception f){
                //means the queue is done
            }
        }
    }// Remove a particular employee from a specified project

    public int compareTo(Project c){
        int o = this.title.compareTo(c.title);//compare strings
        return o;
    }//comparator method

    public void addMember(TeamMember i){
        teamMembers.enqueue(i);
    }
}

