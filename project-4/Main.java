import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Employees employeeList = new Employees();
        while (2 > 1) {
            print();
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    employeeList.addEmployee();
                    break;
                case 2:
                    employeeList.displayEmployee();
                    break;
                case 3:
                    employeeList.writeToFile();
                    break;
                case 4:
                    employeeList.ReadFromFile();
                    break;
                case 5:
                    return;

            }

        }
    }

    public static void print() {
        System.out.println("1. Add an employee");
        System.out.println("2. Display employee info");
        System.out.println("3. Write employee info to file");
        System.out.println("4. Read from file");
        System.out.println("5. Exit");
    }
}
