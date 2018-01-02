//this work is inspired by https://www.imooc.com/video/1628
import java.util.Scanner;
public class AverageGrade {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Please enter the amount of class");
        int classNum = in.nextInt();
        System.out.println ("Please enter the amount of students in each class");
        int studentNum = in.nextInt();
        double sum = 0 ;
        double classSum = 0 ;
        double avg = 0 ;
        double bigAvg = 0 ;
        for (int i = 1; i <= classNum; i++) {
            sum = 0 ;
            System.out.println ("Please enter " + i + "th class's grades");
            for (int a = 1; a <= studentNum; a++ ) {
                System.out.println("Please enter the " + a + "th student's grade");
                int grade = in.nextInt();
                sum = sum + grade;
                classSum = classSum + grade;
            }
            avg = sum / studentNum ;
            bigAvg = classSum / (studentNum * i) ;
            System.out.println ("The average grade of " + i + "th class is " + avg);
            System.out.println ("The average grade of all students so far is " + bigAvg);
        }
    }
}
