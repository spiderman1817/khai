import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean answer = false;
        int answ;
        System.out.println("Hello! My name is spider-man.\n" +
                "I was created in 12.12.2021.");
        System.out.println("Please, remind me your name.");
        String name = in.next();
        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = in.nextInt();
        int remainder5 = in.nextInt();
        int remainder7 = in.nextInt();
        int age = (remainder3*70+remainder5*21+remainder7*15)%105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = in.nextInt();
        for (int i = 0; i <= number; i++){
            System.out.println(i + " !");
        }
        do {
            System.out.println("2 + 2 = ?");
            System.out.println("1. 1");
            System.out.println("2. 2");
            System.out.println("3. 3");
            System.out.println("4. 4");
            answ = in.nextInt();
            if(answ == 4){
                answer = true;
            }
            else {
                System.out.println("Please, try again");
            }
        }while (answer == false);
        System.out.println("Great, you right!");
        System.out.println("Goodbye, have a nice day!");
    }
}
