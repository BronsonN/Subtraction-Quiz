import java.util.Scanner;

public class SubtractionQuiz {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    //generates 2 random numbers
    int number1 = (int) (Math.random() * 10);
    int number2 = (int) (Math.random() * 10);

    if(number1 < number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    System.out.print("What is " + number1 + "-" + number2 + "? ");
    int answer = keyboard.nextInt();

    if(number1 - number2 == answer) {
      System.out.println("You are correct!");
    }
    else {
      System.out.println("Your answer is wrong.\n" + number1 + "-" + number2 + " should be " + (number1-number2));
    }
  }

}
