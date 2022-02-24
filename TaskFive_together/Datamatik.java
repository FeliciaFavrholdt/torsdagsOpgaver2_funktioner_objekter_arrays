/* For this task you should reuse the Student class from Task 3. 
    Methods of reusing the class could be: 
    - copy the Students.java file and add it to a new folder called task5
    - copy the content of the Students class from Task 3 and create the class once more in this folder
    - Open the task 3 folder and continue working in this.
    Either method is fine - it is up to you. 
    
5.a Create a new class Datamatik or reuse the one you created earlier. Add an array of Students with 10 elements 
in it. This should be a class variable (static). From the main method, add 10 student instances to the array. 
Each student must have a unique reference.

5.b Create a function in Datamatik that takes in the array from 5.a as a parameter as well as an integer. 
The function should return the field "name" (the name of the student) and print it (the integer should be 
used as the index nuber of the student to be printed). Call this method with different parameters 
(only the integer - not the array) from the main() of Datamatik.

5.c Create a similar function to that of 5.b, but instead of receiving the array and an integer, 
it receives the array and a string. Loop through all elements in the array until you find the element with 
the name received as a parameter. Then return the index of that student. Call this method with different 
names from the main method of Datamatik
*/ 

public class Datamatik {

    public static void main(String [] args) {

    String nameStr = "My name is ";
    String ageStr = "\nMy age is ";
    String im = "\nI am a ";
    String work = "\nI am a ";

    //array of 10 students
    Student studentArray[] = new Student[10]; //5.a
    studentArray[0] = new Student("Felicia", 28, true, "CPH - DAT");
    studentArray[1] = new Student("Tobias", 27, true, "byggeleder");
    studentArray[2] = new Student("Charlotte", 10, false, "maler");
    studentArray[3] = new Student("Helena", 26, true, "studerende");
    studentArray[4] = new Student("Frederik", 23, true, "sælger");
    studentArray[5] = new Student("Martin", 19, false, "ex-kæreste");
    studentArray[6] = new Student("Jacqueline", 14, true, "ven");
    studentArray[7] = new Student("Mathias", 30, true, "designer");
    studentArray[8] = new Student("Anja", 30, false, "mor");
    studentArray[9] = new Student("Marie", 24, false, "veninde");

    //call methods below
    System.out.println(fetchAStudent(studentArray, 6)); //5.b 

    // 5.c
    System.out.print(findAStudent(studentArray, "Charlotte")); // place 2 in array
    System.out.print(findAStudent(studentArray, "Anja"));      // place 8 in array
    System.out.print(findAStudent(studentArray, "Frederik"));  // place 4 in array
   }


   public static String fetchAStudent(Student[] array, int stud) {
        return array[stud-1].getName(); //prints name from array - starts at -1 because array starts at 0
   }

    public static int findAStudent(Student[] arrays, String stringOne) {
        int foundIndex=404;
        for (int i = 0; i < arrays.length; i++) {
                if (arrays[i].name.equals(stringOne)) { //.equals to compare string with string 
                    foundIndex=i;
                }
            }
            return foundIndex;
        }
    }