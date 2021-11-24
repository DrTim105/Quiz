
package quiz;

import java.util.Scanner;
public class Quiz
{
    private String name;
    private String name1;
    private int pass = 0;
    private int fail = 0;
    private int answer;
    private String A,B,C,D,E;
    
    public Quiz(String courseName, String studentName)
    {
        name = courseName;
        name1 = studentName;
    }
    
    public void setCourseName(String courseName)
    {
        name = courseName;
    }
            
    public void setStudentName(String studentName)
    {
        name1 = studentName;
    }
    
    public String getCourseName()
            {
                return name;
            }
    
    public String getStudentName()
    {
        return name1;
    }
            
    public void displayMessage()
    {
        System.out.printf("Welcome to the Quiz for %s, %s\n\n  Use numbers (1-5 for A-E) to input the options and press 'Enter' after each question\n\n", getCourseName(), getStudentName());
    }
    
    Scanner input = new Scanner(System.in);
    public void question1()
    {
        System.out.println("1. All of the following statements concerning the femur are correct EXCEPT\n" +
"A.	It is the longest bone in the body.\n" +
"B.	It is the heaviest bone in the body.\n" +
"C.	Its length is approximately a quarter of the person’s height.\n" +
"D.	The distal end of the femur undergoes ossification just before birth.\n" +
"E.	Its average adult length is 36 inches. ");
        
        answer = input.nextInt();
        
        if (answer == 5)
        {
            System.out.println("correct");
            ++pass;
        }
        else 
        {
            System.out.println("wrong");
            ++fail;
        }
        
        System.out.println();
    }
        
    public void question2()
    {
        System.out.println("2. The adductor tubercle is located on which of the following bones?\n" +
"A.	Femur\n" +
"B.	Tibia\n" +
"C.	Fibula\n" +
"D.	Ischium\n" +
"E.	Ilium ");
        answer = input.nextInt();
        
        if (answer == 1)
        {
            System.out.println("correct");
            ++pass;
        }
        else 
        {
            System.out.println("wrong");
            ++fail;
        }
        
        System.out.println();
    }
        
    public void question3()
    {
        System.out.println("3. When it is said that an elderly person has a “broken hip”, the usual injury is  a fracture of which of the following structures?\n" +
"A.	Acetabulum\n" +
"B.	Neck of the femur\n" +
"C.	Pelvic rami\n" +
"D.	Ischial tuberosity\n" +
"E.	Ilium ");
        answer = input.nextInt();
        
        if (answer == 2)
        {
            System.out.println("correct");
            ++pass;
        }
        else 
        {
            System.out.println("wrong");
            ++fail;
        }
        
        System.out.println();
    }
        
    public void question4()
    {
        System.out.println("4. Which of the following bones is the most common site for a compound fracture?\n" +
"A.	Femur\n" +
"B.	Tibia\n" +
"C.	Fibula\n" +
"D.	Ilium\n" +
"E.	Ischium ");
        answer = input.nextInt();
        
        if (answer == 2)
        {
            System.out.println("correct");
            ++pass;
        }
        else 
        {
            System.out.println("wrong");
            ++fail;
        }
        
        System.out.println();
    }
        
    public void question5()
    {
        System.out.println("5. Which of the following bones is the largest and strongest bone of the foot?\n" +
"A.	Inlus \n" +
"B.	Calcaneus\n" +
"C.	Cuboid\n" +
"D.	Navicular\n" +
"E.	Lateral cuneiform ");
        answer = input.nextInt();
        
        if (answer == 2)
        {
            System.out.println("correct");
            ++pass;
        }
        else 
        {
            System.out.println("wrong");
            ++fail;
        }
        
        System.out.println();
    }
        
    public void question6()
    {
        System.out.println("6. The sustentaculum tali projects from the superior surface of which of the following bones?\n" +
"A.	Intermediate cuneiform\n" +
"B.	Talus\n" +
"C.	Cuboid\n" +
"D.	Navicular\n" +
"E.	Calcaneus ");
        answer = input.nextInt();
        
        if (answer == 5)
        {
            System.out.println("correct");
            ++pass;
        }
        else 
        {
            System.out.println("wrong");
            ++fail;
        }
        
        System.out.println();
    }
        
    public void question7()
    {
        System.out.println("7. Which of the following statements concerning the gracilis muscle is correct?\n" +
"A.	It passes through the lesser sciatic foramen\n" +
"B.	It crosses the knee joint \n" +
"C.	It lies deep to the pecticeus and adductor longus muscles\n" +
"D.	It is located in the anterior compartment of the thigh\n" +
"E.	It is a short, fan-shaped muscle ");
        answer = input.nextInt();
        
        if (answer == 2)
        {
            System.out.println("correct");
            ++pass;
        }
        else 
        {
            System.out.println("wrong");
            ++fail;
        }
        
        System.out.println();
        
        System.out.println("8. Which of the following muscles is located in the posterior aspect of the thigh?\n" +
"A.	Semitendinosus\n" +
"B.	Gluteus maximus\n" +
"C.	Piriformis\n" +
"D.	Internal obturator\n" +
"E.	Superior gemellus ");
        answer = input.nextInt();
        
        if (answer == 1)
        {
            System.out.println("correct");
            ++pass;
        }
        else 
        {
            System.out.println("wrong");
            ++fail;
        }
        
        System.out.println();
    }
        
    public void question8()
    {
        System.out.println("8. Which of the following muscles is located in the posterior aspect of the thigh?\n" +
"A.	Semitendinosus\n" +
"B.	Gluteus maximus\n" +
"C.	Piriformis\n" +
"D.	Internal obturator\n" +
"E.	Superior gemellus ");
        answer = input.nextInt();
        
        if (answer == 1)
        {
            System.out.println("correct");
            ++pass;
        }
        else 
        {
            System.out.println("wrong");
            ++fail;
        }
        
        System.out.println();
    }
        
    public void question9()
    {
        System.out.println("9. Which of the following pair of muscles are known as the tailor’s muscle and the kicking muscle respectively?\n" +
"A.	Sartorius and quadriceps femoris\n" +
"B.	Rectus femoris and adductor magnus\n" +
"C.	Sartorius and biceps femoris\n" +
"D.	Adductor magnus and Sartorius\n" +
"E.	Sartorius and rectus femoris ");
        answer = input.nextInt();
        
        if (answer == 5)
        {
            System.out.println("correct");
            ++pass;
        }
        else 
        {
            System.out.println("wrong");
            ++fail;
        }
        
        System.out.println();
    }
        
    public void question10()
    {
        System.out.println("10. What is the smallest bone in the body?\n" +
"A.	Ilium\n" +
"B.	Medial cuneiform\n" +
"C.	Ischium\n" +
"D.	Stirrup\n" +
"E.	Calcaneus ");
        answer = input.nextInt();
        
        if (answer == 4)
        {
            System.out.println("correct");
            ++pass;
        }
        else 
        {
            System.out.println("wrong");
            ++fail;
        }
        
        System.out.println();
    }
        
    private void scoreBoard(int pass)
    {
        switch (pass)
        {
            case 10:
                System.out.println("Ahan! Your're ready for this incourse oo");
                break;
                
            case 9:
                System.out.println("You dey alright");
                break;
                
            case 8:
                System.out.println("O ga oo. On this simple questions??");
                break;
                
            case 7:
                System.out.println("You try small");
                break;
                
            default:
                System.out.println("Are you sure you're a medical student sha??");
        }
    }
    public void displayReport()
    {
      
        System.out.printf("Your total score was %d/10\n", pass);
        scoreBoard(pass);
    }
    
}

