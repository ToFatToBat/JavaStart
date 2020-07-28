package JavaStart12.homework.statystykiFirmy;

import JavaStart12.zajecia.bazaProduktowWPliku.Product;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class App {
    static int lines = 0;

    public static void main(String[] args) {
        String fileName = "C:\\Users\\kpapi\\JavaStart\\JavaStart\\src\\JavaStart12\\homework\\statystykiFirmy\\employeeList.csv";
        Employee[] employees = new Employee[5];


        try (
                var filereader = new FileReader(fileName);
                var reader = new BufferedReader(filereader);
        ) {
            String nextLine = null;
            while ((nextLine = reader.readLine()) != null) {
                String[] oneLineData = nextLine.split(";");
                employees[lines] = new Employee();
                employees[lines].setName(oneLineData[0]);
                employees[lines].setLastName(oneLineData[1]);
                employees[lines].setPesel(String.valueOf(oneLineData[2]));
                employees[lines].setSection(Section.valueOf(oneLineData[3].toUpperCase()));
                employees[lines].setSalary(Integer.parseInt(oneLineData[4], 10));
                lines++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println(employees[0].toString());
        System.out.println(meanSalary(employees));
        System.out.println(highestSalary(employees));
        System.out.println(lowestSalary(employees));
        System.out.println(employeesNoInSection(employees, Section.IT));
        System.out.println(employeesNoInSection(employees, Section.SUPPORT));


    }

    public static int meanSalary(Employee[] employees) {
        int salarySumAllEmployees = 0;
        for (Employee e : employees) {
            salarySumAllEmployees += e.getSalary();
        }
        int meanSalary = salarySumAllEmployees / lines;
        return meanSalary;
    }

    public static int highestSalary(Employee[] employees) {
        int max = employees[0].getSalary();
        for (Employee e : employees) {
            if (e.getSalary() > max) {
                max = e.getSalary();
            }
            return max;
        }
        return max;
    }

    public static int lowestSalary(Employee[] employees) {
        int min = employees[0].getSalary();
        for (Employee e : employees) {
            if (e.getSalary() < min) {
                min = e.getSalary();
            }
            return min;
        }
        return min;
    }

    public static int employeesNoInSection(Employee[] employees, Section section) {
        int employeesCount = 0;
        for (Employee e : employees) {
            if (e.getSection() == section) {
                employeesCount++;
            }
        }
        return employeesCount;
    }


}

