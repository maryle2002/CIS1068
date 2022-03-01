// Mary Le
// Section 005
// February 1
// Assignment 3. Draw a Pretty Picture
//
// The program includes the use of static method and the nested "for" loop to draw a something creative. The output of this program is a house. The first part is the rooftop and the second part is the body of the house.
//
public class AsciiArt {
 static final int SIZE = 30;
 public static void main(String[] args){
  roof();
  line_();
  body();
  line_();
 }

 //Draw the rooftop
 public static void roof() {

  //The top line of the roof
  for (int space = 1; space<=SIZE*2; space++) {
   System.out.print(" ");
  }
  for (int a = 1; a<=3+SIZE*8; a++) {
   System.out.print("_");
  }
  System.out.print("\n");

  //The body of the roof
  for (int line = 1; line <= SIZE; line++) {
   for (int space = 1; space <= (line * -2 + (2*SIZE)); space++) {
    System.out.print(" ");
    }
   System.out.print(")");
   for (int v = 1; v <= (line + (2*SIZE)); v++) {
    System.out.print("V");
    for (int space = 1; space <=1; space++) {
     System.out.print("v v");
    }
    }
   System.out.println("V(");
  }
 } 

 //Draw the body of the house
 public static void line_() {
  for (int tilde = 1; tilde <=2+SIZE*6; tilde++) {
   System.out.print ("= ");
  }
  System.out.print ("\n");
 }

 public static void body() {
  for (int line = 1; line <=2+SIZE*3/2; line++ ) {
   for (int i = 1; i<= 3/2+SIZE*6; i++) {
    System.out.print (".");
    for (int c = 1; c<= 1; c++) {
     System.out.print ("o");
    }
   }
   System.out.println ();
  }
 }  
}