import java.util.Scanner;   

public class App {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int len = input.length();
        boolean is7letters = input.length() == 7;
        System.out.println("Your name is: " + input + ", with a length of " + len + " letters ");
        if (is7letters) {
            System.out.println("I also have a 7 letter name! ");
        } else {
            System.out.println("My name is 7 letters");
        }
        System.out.println("What is your favorite sport?");
        String input2 = sc.nextLine();
        boolean isBasketball = input2.equals("Basketball");  
        System.out.println("Your favorite sport was: " + input2);
        if (isBasketball) {
            System.out.println("I love Basketball too!");
        } else {
            System.out.println("My favorite sport is Basketball personally");
        }
    }
}
