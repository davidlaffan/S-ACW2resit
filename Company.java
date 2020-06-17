
/**
 * Write a description of class Company here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Company
{
    // instance variables - replace the example below with your own
    BinarySearchTree projects;//binary tree of projects
    //linked list of employees in the projects

    // Add details of a new project 

    // Add details of a new member of a specified project 

    // Display the details for a specific project 

    // Display all the details for all the projects 

    // Remove a particular employee from a specified project 

    // Remove a project from the system 

    /**
     * Constructor for objects of class Company
     */
    public Company()
    {

    }

    //functions;

    public void addDetails(String n, String start){
        try{
            Project in= new Project(n, start);
            projects.insert(in);
        }
        catch (Exception e){

        }
    }// Add details of a new project 

    public void addDetails(String n, String start, String end){
        try{
            Project in= new Project(n, start, end);
            projects.insert(in);
        }
        catch (Exception e){

        }
    }// Add details of a new project 

    public void newMember(String name,String dept, int id, String project){

        //search by project
        //new TeamMember(id, dept, name)
    }// Add details of a new member of a specified project 

    public void showProjectInfo(String project){

        
    }// Display the details for a specific project 

    public void showProjects(){

    }// Display all the details for all the projects 

    public void removeTeamMember(String name, String project){

    }// Remove a particular employee from a specified project 

    public void removeProject(String project){

    }// Remove a project from the system 

}
