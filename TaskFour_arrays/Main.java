/* or all exercises in Task 4, you are allowed to complete them with arrays of a fixed size. But do consider how the functions you write in 4.b, 4.c, 4.d,  4.e would work, if the array received as a parameter would not have a fixed length. 
4.a create arrays of the following type and assign it at least 3 different values: 
    - Integer array
    - String array
    - boolean array
4.b Write a function that takes in an array of strings as parameter and prints each string.
4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
4.d Write a function that receives an integer array as a parameter and returns the average value.	
4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.
*/ 

public class Main {

    public static void main(String[] args) {

        //Integer Array
        int[] numArray = new int[]{5, 2860, 15, 20, 100};
        int[] numArrayNewOne = new int[]{10, 40, 75, 20, 100, 1000, 55, 66, 33, 2, 78};

        //String Array
        String[] stringArray = new String[]{"My","name","is","not","that","important"};

        //Boolean Array
        boolean[] booArray = new boolean[]{true, false, true, false, true};

        strings(stringArray); 

        System.out.println("\n I am Numarray - my total sum is " + totalSum(numArray)); //prints sum of numArray
        System.out.println(" and my average value is " + averageValue(numArray)); //prints average value of numArray

        sortedArray(numArrayNewOne);
    }

    public static void strings(String[] myStringArray) { 
        for (int i = 0; i < myStringArray.length; i++) { //loops the array 
            System.out.print(" " + myStringArray[i]);    
        }
    }

    public static int totalSum(int[] allElements) {
        int theSum = 0; 

        for(int i = 0; i < allElements.length; i++) { //loops the array 
            theSum = theSum + allElements[i];  //adds sum of next array element in every loop
        }
        return theSum; //returns the total sum = 3000 
    }

    public static int averageValue(int[] value) {
        return totalSum(value) / value.length; //returns the average value = 600
    } 

    public static void sortedArray(int[] sorting) {    
        int temp = 0;    
 
        //print original array    
       System.out.println("This is my original array: ");    
       for (int i = 0; i <sorting.length; i++) {     
           System.out.print(sorting[i] + " ");    
        }    

        //Sort the array in ascending order using two for loops    
        for (int i = 0; i <sorting.length; i++) {     
          for (int j = i+1; j <sorting.length; j++) {     
              if(sorting[i] >sorting[j]) {      //swap elements if not in order
                 temp = sorting[i];    
                 sorting[i] = sorting[j];    
                 sorting[j] = temp;    
               }     
            }     
        }    
        //print sorted array    
        System.out.println("\nThis is my array sorted in ascending order: ");    
        for (int i = 0; i <sorting.length; i++) {     
            System.out.print(sorting[i] + " ");    
        }    
    }  

}