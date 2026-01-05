import java.util.Scanner;

public class Password_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the password:");
            String pwd = sc.nextLine();
            if (pwd.equalsIgnoreCase("exit")) {
                System.out.println("ended");
                break;
            }
            boolean hasLetter = false;
            boolean hasDigit = false;
            for (char ch : pwd.toCharArray()) {
                if (Character.isLetter(ch)) {
                    hasLetter = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
            }
            if (pwd.length() >= 8 && hasLetter && hasDigit) {
                System.out.println("strong");
            } else if (pwd.length() >= 6 && (hasDigit || hasLetter)) {
                System.out.println("medium");
            } else {
                System.out.println("weak");
            }
        }
        sc.close();
    }
}





