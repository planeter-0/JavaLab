package t2.lab6;

/**
 * @author Planeter
 * @description: TODO
 * @date 2021/5/23 15:10
 * @status dev
 */
class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom Daly", "Teacher", 30000, 1001);
        Employee e2 = new Employee("Mary Murphy", "Developer", 45000, 1002);
        Employee e3 = new Employee();
        //2
        System.out.println("Employee 2 is called " + e2.getName() +
                " They are a Developer\nTheir salary is " + e2.getSalary() +
                "\nTheir Employee ID number is " + e2.getEmployeeID());
        //3
        e3.setName("Michael Higgins");
        e3.setJobTitle("President");
        e3.setSalary((float) 1000.0);
        //4
        e1.showEmp();
        e2.showEmp();
        e3.showEmp();
        //5
        System.out.println(e1.toString());
    }
}

public class Employee {
    private String name;
    private String jobTitle;
    private float salary;
    private int employeeID;
    private static int lastEmployeeID = 1000;

    public Employee() {
        employeeID = lastEmployeeID + 1;
        lastEmployeeID++;
    }

    public Employee(String name, String jobTitle, float salary, int employeeID) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;
        lastEmployeeID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        if (salary < 19000) {
            System.out.println("Entered salary of " + salary + " is too low. Salary set at minimum wage of €19000");
            this.salary = 19000;
        } else {
            this.salary = salary;
        }
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void showEmp() {
        System.out.println("EMPLOYEE RECORD" + '\n' +
                "NAME: " + name +
                " JOB TITLE: " + jobTitle + '\n' +
                "CURRENT SALARY: " + salary + '\n' +
                "EMPLOYEE ID: " + employeeID);
    }

    @Override
    public String toString() {
        return "NAME: " + name +
                " JOB TITLE: " + jobTitle + '\n' +
                "CURRENT SALARY: " + salary + '\n' +
                "EMPLOYEE ID: " + employeeID;
    }
}
