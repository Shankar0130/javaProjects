package com.company;

import java.util.ArrayList;

public class TodoApp {
   ArrayList<String> todolist = new ArrayList<>();
   
   public void addlist(String item){
      todolist.add(item);
   }
   public void removelist(String item){
      int list = todolist.indexOf(item);
      todolist.remove(list);
   }
   public void updatelist(int list, String item){
      todolist.set(list, item);
   }
   public void printlist(){
      for (int i=0; i<todolist.size(); i++){
         System.out.println("Item "  + (i+1) + " in your TODO List is: " + todolist.get(i));
      }
   }
   public String searchitem(String item){
      int index = todolist.indexOf(item);
      if (index == -1){
         return null;
      }else {
         return todolist.get(index);
      }
   }
   
}
