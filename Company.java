import javax.swing.*;
/**
 * Write a description of class Company here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Company
{
    // instance variables - replace the example below with your own
    BinarySearchTree projects = new BinarySearchTree();//binary tree of projects
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
    public static void Company(String[] args)
    {

    }

    public void start(){
        Object[] choices = {"Add a new project", "Find and display a specific project", "Remove a specific project", "Display the details of all the projects currently being carried out by the company", "Add details of a new member of a specified project ", "Remove a particular employee from a specified project" ,"Exit" }; 
        int option = JOptionPane.showOptionDialog(null, "Please select what you would like to do", "Choose",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,choices,choices[2]);        
        if (option ==0){
            String projectName = JOptionPane.showInputDialog("Please enter the name of the project");
            String startDate = JOptionPane.showInputDialog("Please enter the date the project started");
            String endDate = JOptionPane.showInputDialog("Please enter the date the project ended (if it is currently ongoing, please leave this blank)");
            if (endDate.equals(null)){
                addDetails(projectName, startDate);//call without end date
            }
            else{
                addDetails(projectName, startDate, endDate);//call with end date
            }// add a new project,
            start();
        }
        else if (option == 1){
            String name = JOptionPane.showInputDialog("Please enter the name of the project you're searching for"); // input
            String result = showProjectInfo(name);// find and display a specific project, 
            JOptionPane.showMessageDialog(null, result);
            start();
        }
        else if (option == 2){
            String project = JOptionPane.showInputDialog("Please enter the name of the project you wish to remove"); 
            removeProject(project);// remove a specific project 
            start();
        }
        else if (option ==  3){
            String output = projects.toString();// display the details of all the projects currently being carried out by the company. 
            JOptionPane.showMessageDialog(null, output);
            start();
        }
        else if (option == 6){
            System.exit(0);
        }
        else if (option == 4){
            String project = JOptionPane.showInputDialog("Please enter the name of the project you wish to edit");
            Project o = new Project (project, "unknown");
            Comparable r = searchProjects(o); //r is for result
            if (r == null){
                JOptionPane.showMessageDialog(null, "Project not found");
            }
            else{
                String memberN = JOptionPane.showInputDialog("Please enter the name of the staff member you wish to add");//Add details of a new member of a specified project
                String memberDept = JOptionPane.showInputDialog("Please enter the department of the staff member you wish to add");
                int memberID = Integer.parseInt(JOptionPane.showInputDialog("Please enter the ID of the staff member you wish to add"));
                TeamMember add = new TeamMember(memberID, memberDept, memberN);
                ((Project)r).addMember(add);
            }
            start();
        }
        else if (option == 5){
            String project = JOptionPane.showInputDialog("Please enter the name of the project you wish to edit");
            Project o = new Project (project, "unknown");
            Comparable r = searchProjects(o); //r is for result
             if (r == null){
                JOptionPane.showMessageDialog(null, "Project not found");
            }
            else{
                String member = JOptionPane.showInputDialog("Please enter the name of the staff member you wish to remove");//Remove a particular employee from a specified project
                ((Project)r).removeMember(member);
            }
            start();
        }
        // remove a specific project 
        // display the details of all the projects currently being carried out by the company. 
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
        Project search = new Project(project, "unknown");
        try{
            Comparable result = searchProjects(search) ;//search by project
            TeamMember i = new TeamMember(id, dept, name);//new TeamMember(id, dept, name)
            ((Project)result).addMember(i);
            projects.insert(result);//replace 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannot find project");//error message, cannot find project
        }

    }// Add details of a new member of a specified project 

    public String showProjectInfo(String project){
        try{
            Comparable search = new Project(project, "unknown");
            Comparable result = projects.find(search);
            return result.toString();
        }
        catch(Exception e){
            return "Could not be found";//error message, project does not exist
        }

    }// Display the details for a specific project 
    public String showProjects(){
        return projects.toString();
    }// Display all the details for all the projects 
    public void removeTeamMember(String name, String project){
        Project input = new Project(project, "unknown");
        Comparable result = searchProjects(input);//search projects
        ((Project)result).removeMember(name);//execute project function to remove member
        try{
            projects.insert(result);//replace
        }
        catch(Exception e){
            //error
        }
    }// Remove a particular employee from a specified project 

    public void removeProject(String project){
        try{
            Project input = new Project(project, "unknown");
            projects.remove(input);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannot find project");//error, could not find project
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
