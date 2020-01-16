package com.company;
import java.util.Scanner;

public class Main {
public static Scanner sc = new Scanner(System.in) ;
 public static void main(String[] args) {

 int empno[] = {1,2,3,4,5};
 String empName[] = {"Ankit","Viku","Anku","Kaju","Sak"};
 String dep[] = {"R&D","PM","Manu","Acc","Eng"};
 char designationCode[] = {'e','c','k','r','m'};
 int basic[] = {20000,25000,10000,9000,6555};
 int hbra[] = {9000,7000,5000,4000,3333};
 int it[] = {100,200,300,400,500};
// String designation[] = {"engineer","consultanat","clerk","receptionist","manager"};
// int da[] = {2000,3200,4500,5000,3000};
 System.out.println("Enter employer ID");
 int id = sc.nextInt();
 int index1=-1;
 for (int i=0;i<5;i++) {
 if (id == empno[i])
 index1 = i;
 }
 System.out.println("EmpID\tEmpName\tDesignation\tDa\tSalary");
 System.out.print(empno[index1]+"\t");
 System.out.print(empName[index1]+"\t");
 int da=0;
 switch (designationCode[index1]){
 case 'e':
 System.out.print("engineer\t");
 da = 2000;
 System.out.print(da);
 break;
 case 'c':
 System.out.print("clerk\t");
 da = 2000;
 System.out.print(da);
 break;
 case 'k':
 System.out.print("consultant\t");
 da = 2000;
 System.out.println(da);
 break;
 case 'r':
 System.out.print("manager\t");
 da = 2000;
 System.out.print(da);
 break;
 case 'm':
 System.out.print("receptionist\t");
 da = 2000;
 System.out.print(da);
 break;
 }
 System.out.print('\t');
 System.out.print(basic[index1]+hbra[index1]+da-it[index1]);
 }
}
