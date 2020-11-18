package com.softserve;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("serial")
class EmployeeInfo implements Serializable {

    int id;
    String lastName;
    String firstName;
    String fathersName;
    String dateOfBirth;
    String position;
    String department;
    int roomNumber;
    long officeNumber;
    String email;
    float salary;
    String dateOfEmployment;
    String notes;

    public EmployeeInfo(int id, String lastName, String firstName, String fathersName, String dateOfBirth, String position, String department, int roomNumber, long officeNumber, String email, float salary, String dateOfEmployment, String notes) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.fathersName = fathersName;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
        this.department = department;
        this.roomNumber = roomNumber;
        this.officeNumber = officeNumber;
        this.email = email;
        this.salary = salary;
        this.dateOfEmployment = dateOfEmployment;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", roomNumber=" + roomNumber +
                ", officeNumber=" + officeNumber +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", dateOfEmployment=" + dateOfEmployment +
                ", notes='" + notes + '\'' +
                '}';
    }
}

public class EmpManagement {
    static void display(ArrayList<EmployeeInfo> all) {
        System.out.println("\n--------------Employee List---------------\n");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n",
                "ID", "LastName", "FirstName", "FathersName", "DateOfBirth", "Position", "Department", "RoomNumber",
                "OfficeNumber", "Email", "Salary", "DateOfEmployment", "Notes");
        for (EmployeeInfo e : all) {
            System.out.printf("%-5s%-20s%-10s%-15s%-10s%-5s%-20s%-10s%-15s%-10s%-5s%-20s%-10s",e.id,e.lastName,e.firstName,e.fathersName,
                    e.dateOfBirth,e.position,e.department,e.roomNumber,e.officeNumber,
                    e.email,e.salary,e.dateOfEmployment,e.notes);
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int id;
        String lastName;
        String firstName;
        String fathersName;
        String dateOfBirth;
        String position;
        String department;
        int roomNumber;
        long officeNumber;
        String email;
        float salary;
        String dateOfEmployment;
        String notes;

        Scanner sc = new Scanner(System.in);
        ArrayList<EmployeeInfo> all = new ArrayList<>();
        File file = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

      try {
        file = new File("F:/Solution3/file.txt");
        if(file.exists()) {
        fileInputStream = new FileInputStream(file);
        objectInputStream = new ObjectInputStream(fileInputStream);
        all = (ArrayList<EmployeeInfo>)objectInputStream.readObject();
        }}
        catch(Exception e) {
        System.out.println(e);
        }
      do {
          System.out.println("\n********* Welcome to the Employee Management System! **********\n");
          System.out.println("1). Add Employee to the DataBase\n" +
                  "2). Search for Employee\n" +
                  "3). Edit Employee details\n" +
                  "4). Delete Employee Details\n" +
                  "5). Display all Employees working in this company\n" +
                  "6). EXIT\n");
          System.out.println("Enter your choice, please: ");
          int number = sc.nextInt();

      switch (number) {
          case 1:
              System.out.println("\nEnter, please, the following details to ADD list:\n");
              System.out.println("Enter ID :");
              id = sc.nextInt();
              System.out.println("Enter Last Name :");
              lastName = sc.next();
              System.out.println("Enter First Name :");
              firstName = sc.next();
              System.out.println("Enter Father's Name :");
              fathersName = sc.next();
              System.out.println("Enter Date of Birth :");
              dateOfBirth = sc.next();
              System.out.println("Enter Position :");
              position = sc.next();
              System.out.println("Enter Department :");
              department = sc.next();
              System.out.println("Enter Room Number :");
              roomNumber = sc.nextInt();
              System.out.println("Enter Office Number :");
              officeNumber = sc.nextLong();
              System.out.println("Enter Email :");
              email = sc.next();
              System.out.println("Enter Salary :");
              salary = sc.nextFloat();
              System.out.println("Enter Date Of Employment :");
              dateOfEmployment = sc.next();
              System.out.println("Enter Some Notes :");
              notes = sc.next();
              all.add(new EmployeeInfo(id, lastName, firstName, fathersName,
                      dateOfBirth, position, department, roomNumber, officeNumber,
                      email, salary, dateOfEmployment, notes));
              display(all);
              break;
          case 2: System.out.println("Enter the Employee ID to search :");
              id = sc.nextInt();
              int i = 0;
              for (EmployeeInfo e : all) {
                  if (id == e.id) {
                      System.out.println(e + "\n");
                      i++;
                  }
              }
              if (i == 0) {
                  System.out.println("\nEmployee's Details are not available, Please enter a valid ID please!");
              }
              break;
          case 3: System.out.println("\nEnter the Employee ID to EDIT the details");
              id = sc.nextInt();
              int j = 0;
              for (EmployeeInfo e : all) {
                  if (id == e.id) {
                      j++;
                      do {
                          int chislo1;
                          System.out.println("\nEdit Employee Details :\n" +
                                  "1). Employee ID\n" +
                                  "2). Last Name\n" +
                                  "3). First Name\n" +
                                  "4). Father's Name\n" +
                                  "5). Date Of Birth\n" +
                                  "6). Position\n" +
                                  "7). Department\n" +
                                  "8). Room Number\n" +
                                  "9). Office Number\n" +
                                  "10). Email\n" +
                                  "11). Salary\n" +
                                  "12). Date of Employment\n" +
                                  "13). Notes\n");
                          System.out.println("Enter your choice: ");
                          chislo1 = sc.nextInt();
                          switch (chislo1) {
                                  case 1: System.out.println("\nEnter new Employee ID: ");
                                      e.id = sc.nextInt();
                                      System.out.println(e + "\n");
                                      break;

                                  case 2: System.out.println("Enter New Last Name :");
                                      e.lastName = sc.next();
                                      System.out.println(e + "\n");
                                      break;

                                  case 3: System.out.println("Enter New First Name :");
                                      e.firstName = sc.next();
                                      System.out.println(e + "\n");
                                      break;

                                  case 4: System.out.println("Enter New Father's Name :");
                                      e.fathersName = sc.next();
                                      System.out.println(e + "\n");
                                      break;

                                  case 5: System.out.println("Enter New Date of Birth :");
                                      e.dateOfBirth = sc.next();
                                      System.out.println(e + "\n");
                                      break;

                                  case 6: System.out.println("Enter New Position :");
                                      e.position = sc.next();
                                      System.out.println(e + "\n");
                                      break;

                                  case 7: System.out.println("Enter New Department :");
                                      e.department = sc.next();
                                      System.out.println(e + "\n");
                                      break;
                                  case 8: System.out.println("Enter New Office Number :");
                                      e.officeNumber = sc.nextLong();
                                      System.out.println(e + "\n");
                                      break;

                                  case 9: System.out.println("Enter New Room Number :");
                                      e.roomNumber = sc.nextInt();
                                      System.out.println(e + "\n");
                                      break;

                                  case 10: System.out.println("Enter New Email :");
                                      e.email = sc.next();
                                      System.out.println(e + "\n");
                                      break;

                                  case 11: System.out.println("Enter New Salary :");
                                      e.salary = sc.nextFloat();
                                      System.out.println(e + "\n");
                                      break;

                                  case 12: System.out.println("Enter New Date Of Employment :");
                                      e.dateOfEmployment = sc.next();
                                      System.out.println(e + "\n");
                                      break;

                                  case 13: System.out.println("Enter New Some Notes :");
                                      e.notes = sc.next();
                                      System.out.println(e + "\n");
                                      break;

                                  case 14: j++;
                                      break;
                                  default: System.out.println("\nEnter a correct choice from the List please:");
                                      break;
                              }
                          }
                          while(j == 1);
                      } }
                  if (j == 0) {
                      System.out.println("\nEmployee Details are not available. Please enter a valid ID!");
                  }
                  break;

          case 4: System.out.println("\nEnter Employee ID to DELETE from the Database :");
              id = sc.nextInt();
              int k = 0;
              try {
                  for (EmployeeInfo e : all) {
                      if (id == e.id) {
                          all.remove(e);
                          display(all);
                          k++;
                      }
                  }
                  if (k == 0) {
                      System.out.println("\nEmployee Details are not available, Please enter a correct ID!");
                  }
              }
              catch(Exception ex) {
                  System.out.println(ex);
              }
              break;
          case 5: try {
              assert objectInputStream != null;
              all = (ArrayList<EmployeeInfo>)objectInputStream.readObject();
          } catch (Exception e2) {
              System.out.println(e2);
          }
              display(all);
              break;
          case 6: try {
              assert file != null;
              fileOutputStream = new FileOutputStream(file);
              objectOutputStream = new ObjectOutputStream(fileOutputStream);
              objectOutputStream.writeObject(all);
          } catch (Exception e1) {
              e1.printStackTrace();
          } finally{
              try {
                  assert fileInputStream != null;
                  fileInputStream.close();
                  assert objectInputStream != null;
                  objectInputStream.close();
                  assert fileOutputStream != null;
                  fileOutputStream.close();
                  assert objectOutputStream != null;
                  objectOutputStream.close();
              } catch (Exception e1) {
                  e1.printStackTrace();
              }
          }
              System.out.println("\nYou have chosen EXIT !! Saving Files and closing the tool.");
              sc.close();
              System.exit(0);
              break;

          default : System.out.println("\nEnter a correct choice from the List :");
              break;
      }
      }
      while(true);
    }
}