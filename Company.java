
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

    public void start(){
        addDetails("Project i", "19/06/99");
        addDetails("Project k", "19/06/99");
        addDetails("Project j", "19/06/99");
        addDetails("Project l", "19/06/99");
        showProjectInfo("Project i");
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
        Comparable search = new Project(project, "unknown");
        try{
             // Comparable result = searchProjects(search);//search by project
             // TeamMember i = new TeamMember(id, dept, name);//new TeamMember(id, dept, name)
            // result.addMember(i);
            //doesn't work
        }
        catch(Exception e){

        }

    }// Add details of a new member of a specified project 

    public String showProjectInfo(String project){
        try{
            Comparable search = new Project(project, "unknown");
            Comparable result = projects.find(search);
            return result.toString();
        }
        catch(Exception e){
            return "Does not work";
        }

    }// Display the details for a specific project 
    public String showProjects(){
        return projects.toString();
    }// Display all the details for all the projects 
    public void removeTeamMember(String name, String project){
        //search projects
        //execute project function to remove member
    }// Remove a particular employee from a specified project 
    public void removeProject(String project){
        try{
        Project input = new Project(project, "unknown");
        projects.remove(input);
    }
    catch(Exception e){
        
        }
    }
// Remove a project from the system 
private Comparable searchProjects(Project search){ // search function for projects
try{
Comparable result = projects.find(search);
return result;
}
catch(Exception e){
return null;
}
}

}
