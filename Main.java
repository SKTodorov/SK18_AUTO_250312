import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 3 values for each angle of a triangle");
        Scanner scanValue = new Scanner(System.in);

        System.out.println("Enter value for angle \"a\" of the triangle ABC");
        int angleA = scanValue.nextInt();

        System.out.println("Enter value for angle \"b\" of the triangle ABC");
        int angleB = scanValue.nextInt();

        System.out.println("Enter value for angle \"c\" of the triangle ABC");
        int angleC = scanValue.nextInt();

        String obtuse = "it's a obtuse triangle";
        String acute = "it's a acute triangle";
        String rightAngle = "it's a right-angle triangle";


        int angleSum = angleA + angleB + angleC;
        int[] angles = {angleA, angleB, angleC};

        if (angleSum == 180 ){
        
            System.out.println("It's a triangle!");
            for (int angle : angles) {
                if (angle > 90) {
                    System.out.println(obtuse);
                    break;
                } else {
                    System.out.println(acute);
                }
            }


        }

    }
}