public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        Employee employee1 = new Employee("Дементьев Руслан Васильевич", 1, 26700);
        employeeBook.addEmployee(employee1);

        Employee employee2 = new Employee("Захарова Кристина Анатольевна", 3, 31400);
        employeeBook.addEmployee(employee2);

        Employee employee3 = new Employee("Сидоров Семён Александрович", 2, 38900);
        employeeBook.addEmployee(employee3);

        Employee employee4 = new Employee("Васнецов Артём Сергеевич", 1, 34600);
        employeeBook.addEmployee(employee4);

        Employee employee5 = new Employee("Кутузова Анна Сергеевна", 3, 24700);
        employeeBook.addEmployee(employee5);

        Employee employee6 = new Employee("Кузьмина Екатерина Вячеславовна", 2, 32200);
        employeeBook.addEmployee(employee6);

        Employee employee7 = new Employee("Петров Алексей Леонидович", 4, 25900);
        employeeBook.addEmployee(employee7);

        Employee employee8 = new Employee("Замараева Лидия Владимировна", 5, 25300);
        employeeBook.addEmployee(employee8);

        Employee employee9 = new Employee("Семаков Андрей Анатольевич", 4, 325000);
        employeeBook.addEmployee(employee9);

        Employee employee10 = new Employee("Краснопёрова Татьяна Викторовна", 5, 23600);
        employeeBook.addEmployee(employee10);

        System.out.println("Базовая сложность");

        employeeBook.printAllEmployees();

        employeeBook.printMonthlySalaryOfAllEmployees();

        employeeBook.printMinimumWageEmployee();

        employeeBook.printMaximumWageEmployee();

        employeeBook.printMiddleMonthlySalaryOfAllEmployees();

        employeeBook.getFullNameOfAllEmployee();

        System.out.println("Повышенная сложность");

        employeeBook.indexSalary(5);
        employeeBook.printAllEmployees();

        employeeBook.printEmployeeWithMinimumSalary(3);

        employeeBook.printEmployeeWithMaximumSalary(3);

        employeeBook.printSumOfPayrollCostsByDepartment(3);

        employeeBook.printAverageSalaryAtDepartment(3);

        employeeBook.indexSalaryOfAllEmployeeAtDepartment(3, 7);

        employeeBook.printAllEmployeesAtDepartment(3);

        employeeBook.employeesWithASalaryLessThanNumber(30000);

        employeeBook.employeesWithASalaryMoreThanNumber(30000);

        System.out.println("Очень сложно");

        employeeBook.removeEmployee(7);

        employeeBook.addEmployee(new Employee("Нестеров Алексей Павлович", 4, 26700));

        employeeBook.changeEmployeeSalary("Кутузова Анна Сергеевна", 26500);

        employeeBook.changeEmployeeDepartment("Васнецов Артём Сергеевич", 2);

        employeeBook.getFullNameOfEmployeesInEachDepartment();
    }
}