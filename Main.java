import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to add(a), subtract(s), multiply(m), or divide(d)?");
        String answer = input.next();
        if(answer.equalsIgnoreCase("a"))
        {
            System.out.println("What two numbers would you like to add?");
            int temp1 = input.nextInt();
            int temp2 = input.nextInt();
            System.out.println(temp1+ " + "+temp2 + " = " + (temp1+temp2));
        }
        else if(answer.equalsIgnoreCase("s"))
        {
            System.out.println("What two numbers would you like to subtract?");
            int temp1 = input.nextInt();
            int temp2 = input.nextInt();
            System.out.println(temp1+ " - "+temp2 + " = " + (temp1-temp2));
        }
        else if(answer.equalsIgnoreCase("m"))
        {
            System.out.println("What two numbers would you like to multiply?");
            int temp1 = input.nextInt();
            int temp2 = input.nextInt();
            System.out.println(temp1+ " * "+temp2 + " = " + (temp1*temp2));
        }
        else if(answer.equalsIgnoreCase("d"))
        {
            System.out.println("What two numbers would you like to divide?");
            int temp1 = input.nextInt();
            int temp2 = input.nextInt();
            System.out.println(temp1+ " / "+temp2 + " = " + (float)(temp1/temp2));
        }

    }
}
