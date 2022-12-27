public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Дементьев Руслан Васильевич", 1, 26700);
        employeeBook.addEmployee("Захарова Кристина Анатольевна", 3, 31400);
        employeeBook.addEmployee("Сидоров Семён Александрович", 2, 38900);
        employeeBook.addEmployee("Васнецов Артём Сергеевич", 1, 34600);
        employeeBook.addEmployee("Кутузова Анна Сергеевна", 3, 24700);
        employeeBook.addEmployee("Кузьмина Екатерина Вячеславовна", 2, 32200);
        employeeBook.addEmployee("Петров Алексей Леонидович", 4, 25900);
        employeeBook.addEmployee("Замараева Лидия Владимировна", 5, 25300);
        employeeBook.addEmployee("Семаков Андрей Анатольевич", 4, 32500);
        employeeBook.addEmployee("Краснопёрова Татьяна Викторовна", 5, 23600);

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

        employeeBook.addEmployee("Нестеров Алексей Павлович", 4, 26700);

        employeeBook.changeEmployeeSalary("Кутузова Анна Сергеевна", 26500);

        employeeBook.changeEmployeeDepartment("Васнецов Артём Сергеевич", 2);

        employeeBook.getFullNameOfEmployeesInEachDepartment();
    }
}