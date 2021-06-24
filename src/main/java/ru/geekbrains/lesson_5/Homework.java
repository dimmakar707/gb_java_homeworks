package ru.geekbrains.lesson_5;

public class Homework {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan Ivanovich", "System administrator", "vanya@supercompany.com", "89211234567", 50000, 25);
        employees[1] = new Employee("Petrov Petr Petrovich", "Driver", "petya@supercompany.com", "89211234568", 40000, 45);
        employees[2] = new Employee("Sidorov Sidor Sidorovich", "Programmer", "sidor@supercompany.com", "89211234569", 70000, 32);
        employees[3] = new Employee("Rubleva Maria Ivanovna", "Accountant", "maria@supercompany.com", "89211234570", 60000, 57);
        employees[4] = new Employee("Kuzin Igor Sergeevich", "Director", "igor@supercompany.com", "89211234571", 100000, 48);

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40) {
                employees[i].printInfo();
                System.out.println("\n");
            }
        }
    }
}
