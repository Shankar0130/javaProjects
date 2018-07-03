package com.company;

import java.util.Scanner;

public class Main {
private static Scanner in = new Scanner(System.in);
private static TodoApp mytodolist = new TodoApp();
    public static void main(String[] args) {
       boolean exit = false;
       int command;
       options();
       do {
          System.out.println("please enter your command here: ");
          command = in.nextInt();
          switch (command){
             case 1 :
                options();
                break;
             case 2:
                maketodo();
                break;
             case 3 :
                removelist();
                break;
             case 4 :
                updatelist();
                break;
             case 5 :
              mytodolist.printlist();
                break;
             case 6 :
                searchitem();
                break;
             case 7:
                exit = true;
                break;
                default:
                   System.out.println("Please enter the listed numbers only!!!!");
          }
          
       }while(!exit);
      
    }
   public static void options(){
       System.out.println("Press 1 for the task menu,\n" +
          "Press 2 for Adding item,\n" +
          "Press 3 for removing item,\n" +
          "Press 4 for updating the item list,\n" +
          "Press 5 for printing the item list,\n" +
          "Press 6 for searching the item,\n" +
          "Press 7 for exit");
    }
    public static void maketodo(){
       System.out.println("Enter your item: ");
       in.nextLine();
      String item = in.nextLine();
       mytodolist.addlist(item);
    }
    public static void removelist(){
       System.out.println("please enter your item: ");
      in.nextLine();
       String item = in.nextLine();
       mytodolist.removelist(item);
    }
    public static void updatelist(){
       System.out.println("Please enter your item : ");
       in.nextLine();
       String item = in.nextLine();
       System.out.println("Please enter your item no. : ");
       int list = in.nextInt()-1;
       mytodolist.updatelist(list,item);
    }
    public static void searchitem(){
       System.out.println("Enter your item: ");
       in.nextLine();
       String item = in.nextLine();
       System.out.println(mytodolist.searchitem(item));
    }
}
