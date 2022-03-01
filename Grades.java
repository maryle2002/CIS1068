// Mary Le
// Section 005
// February 9
// Assignment 4. Grades
//
// The program includes the use scanner to input the number and respectively calculate the course grade.
//
import java.util.Scanner;
public class Grades {
  public static void main (String[] args) {
   System.out.println("This program accepts your homework and two exam scores as input and computes your grade in the course.");

  // Create scanner
   Scanner number = new Scanner(System.in);

     //Prompting input Homework weight
     System.out.print ("Homework weight: ");
     int hw_weight = number.nextInt();

     //Prompting input of Exam weight
        //Exam 1 weight
        System.out.print ("Exam 1 weight: ");
        int exam1_weight = number.nextInt();
        //Exam 2 weight
        int exam2_weight = 100 - (exam1_weight) - (hw_weight);

    System.out.println("Using weights of "+hw_weight+" "+exam1_weight+" "+exam2_weight);


  //Homework
  System.out.println ("Homework: ");

  //Input the number of assignments
  System.out.print ("Number of assignments: ");
  int assign = number.nextInt();

  //Average homework grade  
  System.out.print ("Average Homework grade: ");
  double avg_hw_grade =  number.nextDouble();

  //Input the number of late days used
  System.out.print("Number of late days used: ");
  int late_day = number.nextInt();

  //Input the number of labs attended
  System.out.print("Labs attended: ");
  int lab = number.nextInt();

     //Calculate Homework
     int max_hw_pts = 10*assign + 4*assign; 

     double hw_total_pts = homework(avg_hw_grade, lab, late_day, assign, max_hw_pts); 

     System.out.printf("Total points = %.2f / %d %n", hw_total_pts, max_hw_pts);
		
		   double hw_weighted = hw_weight * hw_total_pts / max_hw_pts;
		
		   System.out.printf("Weighted score = %.2f %n", hw_weighted);


  //Exam 1
  System.out.println("Exam 1: ");
  
  //Input the score
  System.out.print("Score: ");
  double score1 = number.nextDouble();

  //Input the curve
  System.out.print("Curve: ");
  final double curve1 = number.nextDouble();

  double[] totalscore1 = exam1(score1, curve1, exam1_weight);
  
  System.out.printf("Total points = %.2f / 100 %n", totalscore1[0]);
		
		System.out.printf("Weighted score = %.2f %n", totalscore1[1]); 
  

  //Exam 2
  System.out.println("Exam 2: ");

  //Input the score
  System.out.print("Score: ");
  double score2 = number.nextDouble();

  //Input the curve
  System.out.print("Curve: ");
  double curve2 = number.nextDouble();

  double[] totalscore2= exam2(score2, curve2, exam2_weight);
		

  System.out.printf("Total points = %.2f / 100 %n", totalscore2[0]);
		
		System.out.printf("Weighted score = %.2f %n", totalscore2[1]);



  //Calculate the course grade
  double coursegrade = hw_weight + totalscore1[1] + totalscore2[1];

  System.out.printf("nCourse grade = %.2f",coursegrade);

 number.close();
 }
 

  

 //Homework
 public static double homework(double avg_hw_grade, int lab, int late_day, int assign, int max_hw_pts) {
     double hw_total_pts = assign*avg_hw_grade + 4*lab;
     
     if (avg_hw_grade <= 0) {
			    avg_hw_grade = 0;
     } 
     else if (avg_hw_grade > 10) {
			    avg_hw_grade = 10;
		   }

     if (lab <= 0) {
			    lab = 0;
		   } 
     else if (lab > assign) {
			    lab = assign;
		   }

     if (late_day > assign / 2) {
			    hw_total_pts *= 0.9;  
		   } 
     else if (late_day == 0) {
			    hw_total_pts += 5;
			    
       if (hw_total_pts > max_hw_pts) {
				     hw_total_pts = max_hw_pts;
			      }
		   }
     return hw_total_pts;
 }

 //Exam 1
 private static double[] exam1(double score1, double curve1, int exam1_weight) {
  double exam1_curved = score1+curve1;

  if (score1 <= 0) {
			 score1 = 0;
		} 
  else if (score1 > 100) {
			 score1 = 100;
		}
		
		if (exam1_curved > 100) {
			 exam1_curved = 100;
		} 
  else if (exam1_curved <= 0) {
			 exam1_curved = 0;
		}
		
		double weighted1 = exam1_weight * exam1_curved / 100;
		
		double [] totalscore1 = new double[]{exam1_curved, weighted1};

  return totalscore1;
 }

 //Exam 2
 private static double[] exam2(double score2, double curve2, int exam2_weight) {
  double exam2_curved = score2 + curve2;
  if (score2 <= 0) {
			 score2 = 0;
		} 
  else if (score2 > 100) {
			 score2 = 100;
		}

		if (exam2_curved > 100) {
			 exam2_curved = 100;
		} 
  else if (exam2_curved <= 0) {
			 exam2_curved = 0;
		}
		
		double weighted2 = exam2_weight * exam2_curved / 100;
		
		double [] totalscore2 = new double[]{exam2_curved, weighted2};

  return totalscore2;

 }
}