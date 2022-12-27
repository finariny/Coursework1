public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private final int id;
    private static int counter = 1;


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName () {
        return fullName;
    }

    public int getDepartment () {
        return department;
    }

    public int getSalary () {
        return salary;
    }

    public int getId () {
        return id;
    }

    public void setDepartment (int department) {
        this.department = department;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    @Override
    public String toString () {
        return "Ф.И.О. - " + fullName + "; Отдел - " + department + "; Зарплата - " + salary + "; id - " + id;
    }

    @Override
    public boolean equals (Object otherEmployee) {
        if (this == otherEmployee) {
            return true;
        }
        if (otherEmployee == null || this.getClass() != otherEmployee.getClass()) {
            return false;
        }
        Employee employee = (Employee) otherEmployee;
        return id == employee.id;
    }

    @Override
    public int hashCode () {
        return java.util.Objects.hash(id);
    }
}