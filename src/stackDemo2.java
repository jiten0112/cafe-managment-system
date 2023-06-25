/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jitendra
 */

//stack Using array list;
import java.util.*;
public class stackDemo2 {
     public static class Stack{
         static ArrayList<Integer>list=new ArrayList<>();
         public static boolean isEmpty(){
             return list.size()==0;
         }
         public static void push(int data){
                 list.add(data);
                 }
         public static int pop(){
             if(isEmpty()){
                 return -1;
                 }
             int top=list.get(list.size()-1);
             list.remove(list.size()-1);
             return top;
         }
         public static int peek(){
             if(isEmpty()){
                 return -1;
             }
             return list.get(list.size()-1);
         }

    
     }
     public static void main(String args[]){
         Stack s=new Stack();
         s.push(1);
         s.push(2);
         s.push(3);
         s.push(5);
         while(!s.isEmpty()){
             System.out.println(s.peek());
             s.pop();
         }
     }
}
    

