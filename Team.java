import java.util.*;
public class Team {
    private int teamId;
    private ArrayList<Employee> members = new ArrayList<Employee>();
    private String name;

    public int getTeamId() {
        return teamId;
    }
    public Employee[] getEmployees() {
        return (Employee[]) members.toArray();
    }
    public String getName() {
        return name;
    }
    public void setTeamId(int x) {
        teamId = x;
    }
    public void setEmployees(Employee[] ppl) {
        members.clear();
        members.addAll(List.of(ppl));
    }
    public void addEmployee(Employee e) {
        members.add(e);
        e.setId(members.size()-1);
    }

}
