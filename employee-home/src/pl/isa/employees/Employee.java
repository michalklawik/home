package pl.isa.employees;

import java.util.Date;

public class Employee {

    public static final String companyName = "infoShare Academy";

    public static void main(String args[]) {

        String operatorName = "Michał";
        int employeesCounter = 14;
        int loggedEmployeeCounter = 6;

        System.out.println(operatorName + ", witaj w " + companyName + "!");
        System.out.println("Aktualna data: " + new Date());
        System.out.println("Aktualnie w " + companyName + " pracuje " + employeesCounter + " pracowników.\n");

        

    }
}
