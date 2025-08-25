package Java_Self_Study;

public class Control{
    public static void main(String[] args) {
        int number = 7;

    
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

       
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        int count = 1;
        System.out.println("\nCounting with while loop:");
        while (count <= 3) {
            System.out.println("Count = " + count);
            count++;
        }
    }
}