import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Employees {
    String fileName = "info.txt";
    static Scanner sc = new Scanner(System.in);
    LinkedList<Employee> employees;
    public Employees(){
        employees = new LinkedList<>();
    }

    public void addEmployee(){
        System.out.println("Enter Name:");
        String name= sc.nextLine();
        System.out.println("Enter ID:");
        String id= sc.nextLine();
        employees.add(new Employee(name,id));
    }
    public void displayEmployee(){
        System.out.println(employees);
    }

    public void writeToFile(){
        try {
            System.out.println("Enter File Name: ");
            fileName = sc.nextLine();
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            Iterator<Employee> iterator = employees.iterator();

            while(iterator.hasNext()){
                Employee e = iterator.next();
                out.writeObject(e);
            }
            System.out.println("Written to File");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void ReadFromFile(){

        employees = new LinkedList<>();
        try {
            System.out.println("Enter File Name: ");
            fileName = sc.nextLine();
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);
          //  Iterator<Employee> iterator = employees.iterator();
        boolean read = true;

        while(read){

            Employee e=null;
            e = (Employee)(in.readObject());
            if(e==null)
                read = false;
            else
                employees.add(e);
        }
        }
        catch (IOException | ClassNotFoundException e){
           // System.out.println(e.getMessage());
        }
    }

}
