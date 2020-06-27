
/**
 * Write a description of class TeamMember here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TeamMember implements Comparable<TeamMember>
{
    // instance variables - replace the example below with your own
    String name;// Name e.g. Joe Bloggs 

    int employeeNumber;// Employee Number e.g. 999999 

    String department;// Division e.g. Web Development 

    /**
     * Constructor for objects of class TeamMember
     */
    public TeamMember(int id, String d, String n)
    {
        this.employeeNumber = id;
        this.department = d;
        this.name = n;
    }
    
    public int compareTo(TeamMember comparator){
        int o = 0;
        return o;
    }

    public String toString(){
        String o = "Name: " + name + "\r\n";
        o = o + "Department: " + department + "\r\n";
        o = o + "ID number: " + String.valueOf(employeeNumber) ;
        return o;
    }
}
