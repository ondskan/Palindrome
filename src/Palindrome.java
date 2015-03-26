import java.util.Scanner;

/**
 * Created by Marcin on 2014-08-12.
 */
public class Palindrome {

    public static void main(String[] args) {

        System.out.println("********** Palindrome **********");
        System.out.println("choice '1' - check number; choice '2' - check string \n");

        Scanner in = new Scanner(System.in);
        int choice = in.nextLine().charAt(0);
        yourChoice(choice);
    }

    public static void yourChoice(int choice) {

        switch (choice) {
            case '1':
                checkAsNumberIsPalindrome();
                break;

            case '2':
                checkAsStringIsPalindrome();
                break;

            default:
                System.out.println("Wrong! Choice '1' or '2'");

        }
    }

        public static void checkAsNumberIsPalindrome(){

            System.out.println("Please enter a number: ");
            Scanner scanner = new Scanner(System.in);

            int num = scanner.nextInt();

            Palindrome nPalin = new Palindrome();
            int revNum = nPalin.reverse(num);

            if (num == revNum) {
                System.out.printf("\nThe number %d is a Palindrome ", num);
            } else {
                System.out.printf("\nThe number %d is not a Palindrome ", num);
            }
    }

        public static void checkAsStringIsPalindrome() {

            System.out.println("Please enter a string: ");
            Scanner scanner = new Scanner(System.in);

            String str = scanner.next();

            Palindrome sPalin = new Palindrome();
            String revStr = sPalin.reverse(str);

            if (str.equalsIgnoreCase(revStr)) {
                System.out.printf("\nThe string '%s' is a Palindrome ", str);
            } else {
                System.out.printf("\nThe string '%s' is not a Palindrome ", str);
            }
        }

    // Method to return the reverse of a number
    public int reverse(int num) {
        int revNum = 0;
        while (num > 0) {
            int rem = num % 10;
            revNum = (revNum * 10) + rem;
            num = num / 10;
        }
        return revNum;
    }

    // Method to return the reverse of a string
    public String reverse(String str) {
        StringBuilder revStr = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            revStr.append(str.charAt(i));
        }
        return revStr.toString();
    }

}