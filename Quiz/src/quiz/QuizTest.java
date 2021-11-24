
package quiz;

import java.util.Scanner;
public class QuizTest
{
    public static void main(String [] args)
    {
        Quiz myQuiz = new Quiz("CLI201 INTRODUCTION TO ANATOMY", "Salihu Timothy");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input your name please: ");
        String name = input.nextLine();
        myQuiz.setStudentName(name);
        
        myQuiz.displayMessage();
        myQuiz.question1();
        myQuiz.question2();
        myQuiz.question3();
        myQuiz.question4();
        myQuiz.question5();
        myQuiz.question6();
        myQuiz.question7();
        myQuiz.question8();
        myQuiz.question9();
        myQuiz.question10();
        myQuiz.displayReport();
        
        
    }
}


