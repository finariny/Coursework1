public class EmployeeBook {
    private final Employee[] employees;

    private static int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    // Базовая сложность
    // 8. Статические методы, которые взаимодействуют с массивом и предоставляют результат:
    // а. Список всех сотрудников со всеми имеющимися по ним данными:
    public void printAllEmployees () {
        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    // b. Сумма затрат на зарплаты в месяц:
    public int monthlySalaryOfAllEmployees () {
        int totalSum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSum += employee.getSalary();
            }
        }
        return totalSum;
    }

    public void printMonthlySalaryOfAllEmployees () {
        System.out.println("Сумма затрат на зарплаты в месяц: " + monthlySalaryOfAllEmployees());
    }

    // c. Сотрудник с минимальной зарплатой:
    public Employee minimumWageEmployee () {
        int minimumSum = Integer.MAX_VALUE;
        Employee employeeWithMinimumSum = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() <= minimumSum) {
                    minimumSum = employee.getSalary();
                    employeeWithMinimumSum = employee;
                }
            }
        }
        return employeeWithMinimumSum;
    }

    public void printMinimumWageEmployee () {
        System.out.println("Сотрудник с минимальной зарплатой:");
        System.out.println(minimumWageEmployee());
    }

    // d. Сотрудник с максимальной зарплатой:
    public Employee maximumWageEmployee () {
        int maximumSum = Integer.MIN_VALUE;
        Employee employeeWithMaximumSum = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() >= maximumSum) {
                    maximumSum = employee.getSalary();
                    employeeWithMaximumSum = employee;
                }
            }
        }
        return employeeWithMaximumSum;
    }

    public void printMaximumWageEmployee () {
        System.out.println("Сотрудник с максимальной зарплатой:");
        System.out.println(maximumWageEmployee());
    }

    // e. Среднее значение зарплат:
    public int middleMonthlySalaryOfAllEmployees () {
        int numberOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                numberOfEmployees++;
            }
        }
        return monthlySalaryOfAllEmployees() / numberOfEmployees;
    }

    public void printMiddleMonthlySalaryOfAllEmployees () {
        System.out.println("Среднее значение зарплат: " + middleMonthlySalaryOfAllEmployees());
    }

    // f. Ф.И.О. всех сотрудников:
    public void getFullNameOfAllEmployee () {
        System.out.println("Ф.И.О. всех сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("Ф.И.О. сотрудника: " + employee.getFullName());
            }
        }
    }

    // Повышенная сложность
    // Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %):
    public void indexSalary (int percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                int employeeSalary = employee.getSalary() + (employee.getSalary() * percent / 100);
                employee.setSalary(employeeSalary);
            }
        }
    }

    // 2. Получить в качестве параметра номер отдела (1–5) и найти:
    // a. Сотрудник с минимальной зарплатой:
    public Employee employeeWithMinimumSalary (int departmentNumber) {
        int minimumSalary = Integer.MAX_VALUE;
        Employee employee = employees[0];
        for (Employee currentEmployee : employees) {
            if (currentEmployee != null) {
                if (currentEmployee.getDepartment() == departmentNumber) {
                    if (currentEmployee.getSalary() <= minimumSalary) {
                        minimumSalary = currentEmployee.getSalary();
                        employee = currentEmployee;
                    }
                }
            }
        }
        return employee;
    }

    public void printEmployeeWithMinimumSalary (int departmentNumber) {
        Employee employee = employeeWithMinimumSalary(departmentNumber);
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + departmentNumber + ": " + employee);
    }

    // b. Сотрудник с максимальной зарплатой:
    public Employee employeeWithMaximumSalary (int departmentNumber) {
        int maximumSalary = Integer.MIN_VALUE;
        Employee employee = employees[0];
        for (Employee currentEmployee : employees) {
            if (currentEmployee != null) {
                if (currentEmployee.getDepartment() == departmentNumber) {
                    if (currentEmployee.getSalary() >= maximumSalary) {
                        maximumSalary = currentEmployee.getSalary();
                        employee = currentEmployee;
                    }
                }
            }
        }
        return employee;
    }

    public void printEmployeeWithMaximumSalary (int departmentNumber) {
        Employee employee = employeeWithMaximumSalary(departmentNumber);
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + departmentNumber + ": " + employee);
    }

    // c. Сумма затрат на зарплату по отделу:
    public int sumOfPayrollCostsByDepartment (int departmentNumber) {
        int sumOfPayroll = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == departmentNumber) {
                    sumOfPayroll += employee.getSalary();
                }
            }
        }
        return sumOfPayroll;
    }

    public void printSumOfPayrollCostsByDepartment (int departmentNumber) {
        System.out.println("Сумма затрат на зарплату по отделу " + departmentNumber + ": "
                + sumOfPayrollCostsByDepartment(departmentNumber));
    }

    // d. Средняя зарплата по отделу:
    public int averageSalaryAtDepartment (int departmentNumber) {
        int averageSalary = 0;
        int countOfEmployeeAtDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == departmentNumber) {
                    averageSalary += employee.getSalary();
                    countOfEmployeeAtDepartment++;
                }
            }
        }
        averageSalary /= countOfEmployeeAtDepartment;
        return averageSalary;
    }

    public void printAverageSalaryAtDepartment (int departmentNumber) {
        int averageSalary = averageSalaryAtDepartment(departmentNumber);
        System.out.println("Средняя зарплата по отделу " + departmentNumber + ": " + averageSalary);
    }

    // e. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра
    public void indexSalaryOfAllEmployeeAtDepartment (int departmentNumber, int percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == departmentNumber) {
                    employee.setSalary(employee.getSalary() + (employee.getSalary() * percent / 100));
                }
            }
        }
    }

    // f. Вывод в консоль всех сотрудников отдела (все данные, кроме отдела):
    public void printAllEmployeesAtDepartment (int departmentNumber) {
        System.out.println("Все сотрудники отдела " + departmentNumber + ":");
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == departmentNumber) {
                    System.out.println("Ф.И.О. - " + employee.getFullName()
                            + "; Зарплата - " + employee.getSalary() + "; id - " + employee.getId());
                }
            }
        }
    }

    // 3. Получить в качестве параметра число и найти:
    // a. Все сотрудники с зарплатой меньше числа:
    public void employeesWithASalaryLessThanNumber (int number) {
        System.out.println("Сотрудники с зарплатой меньше " + number + ":");
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < number) {
                    System.out.println("id - " + employee.getId() + "; Ф.И.О. - " + employee.getFullName()
                            + "; Зарплата - " + employee.getSalary());
                }
            }
        }
    }

    // b. Все сотрудники с зарплатой больше (или равно) числа:
    public void employeesWithASalaryMoreThanNumber (int number) {
        System.out.println("Сотрудники с зарплатой больше (или равно) " + number + ":");
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() >= number) {
                    System.out.println("id - " + employee.getId() + "; Ф.И.О. - " + employee.getFullName()
                            + "; Зарплата - " + employee.getSalary());
                }
            }
        }
    }

    // Очень сложно
    // 4. Добавить несколько новых методов:
    // а. Добавить нового сотрудника
    public void addEmployee (String fullName, int department, int salary) {
        if (department <= 0 || department > 5) {
            throw new IllegalArgumentException("Такого отдела нет");
        }
        if (size >= employees.length) {
            throw new IllegalArgumentException("Нельзя добавить нового сотрудника, закончилось место");
        }
        Employee newEmployee = new Employee(fullName, department, salary);
        employees[size++] = newEmployee;
    }

    // b. Удалить сотрудника
    public void removeEmployee (int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                System.out.println("Сотрудник " + employees[i].getFullName() + " (номер id - " + employees[i].getId()
                        + ") удалён");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }

    // 5. Изменить сотрудника:
    // а. Изменить зарплату
    public void changeEmployeeSalary (String fullName, int employeeSalary) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getFullName().equals(fullName)) {
                    employee.setSalary(employeeSalary);
                }
            }
        }
    }

    // b. Изменить отдел
    public void changeEmployeeDepartment (String fullName, int employeeDepartment) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getFullName().equals(fullName)) {
                    employee.setDepartment(employeeDepartment);
                }
            }
        }
    }

    // 6. Получить Ф.И.О. всех сотрудников по отделам
    public void getFullNameOfEmployeesInEachDepartment () {
        int departmentNumber = 1;
        while (departmentNumber <= 5) {
            System.out.println("Отдел " + departmentNumber + ":");
            for (Employee employee : employees) {
                if (employee != null) {
                    if (employee.getDepartment() == departmentNumber) {
                        System.out.println("Ф.И.О. - " + employee.getFullName() + "; Отдел - "
                                + employee.getDepartment());
                    }
                }
            }
            departmentNumber++;
        }
    }
}