import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //hello intro
        System.out.println("Hello, fellow Fibonacci friend. Tell me your number.");

        Scanner userObj = new Scanner(System.in);
        int userNum = userObj.nextInt();

        int x = 0;
        int y = 1;
        int z;

        while(userNum == 0) {
                System.out.println("Really? Put in a different number.");
                userNum = userObj.nextInt();
        }

        if(userNum == 1) {
            System.out.println(x);
        } else {
            System.out.println(x + "\n" + y);
            for(int i = 0; i <= userNum - 2; i++) {
                z = x + y;

                System.out.println(z);

                x = y;
                y = z;
            }
        }



    }
}
