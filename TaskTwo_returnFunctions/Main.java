/* 2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean. 
2.b Write a function that receives to integers as parameters and returns the sum of them.
2.c Write a function that receives a string and returns it as uppercase. (Hint: ".toUpperCase()". Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )
2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )
*/


class Main {
  //values 
  public static boolean happy = true;  

  public static void main(String [] args) {
    String text = "this is uppercase";


     //2.a 
     if (iAmHappy()) {
       System.out.println("I clap my hands");
     } else {
       System.out.println("I don't clap my hands"); 
     }

     //2.b 
     System.out.println(sumOfTwo(5,10)); 

     //2.c
     System.out.println(stringUpp(text));

     text = stringUpp(text); //sets text to now be uppercase 
     
     //2.d
     if (firstLet(text)) {
        System.out.println("it prints out first letter as uppercase");
     } else {
        System.out.println("it does not work");
     }
  }


  public static boolean iAmHappy() {
    return happy; 
  }

  public static int sumOfTwo(int a, int b) {
    return(a+b); 
  }

  public static String stringUpp(String s) {
    return s.toUpperCase();
  }

  public static boolean firstLet(String u) {  
    if(Character.isUpperCase(u.charAt(0))) {
      return true;
    } else {
      return false; 
    }
  } 
}