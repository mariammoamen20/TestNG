package org.example;

/**
 * Hello world!
 *
 */
public class Name
{
   public static String  checkName(String name){
       if(name.contains("@") || name.contains(".") || name.isEmpty() || Character.isWhitespace(name.charAt(0)) || name.contains("123")){
           return "Please enter valid name";
       }
       else {
           return name;
       }
   }
}
