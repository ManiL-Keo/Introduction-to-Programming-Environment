public class Asterisks {
    public static void main(String[] args) {
        //rectangle
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 25; j++) {

                if (i == 0 || i == 5 || j == 0 || j == 24) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");

        //half diamond
        int n = 3; // Set the value of n to 3
        char ch = '*'; // Symbol to use

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println("\n");

        //triangle
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println("\n");

        //diamond
        // Upper half of the diamond
        for (int i = 1; i <= 3; i++) {
            // Print spaces
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = 3 - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println("\n");


        //right triangle
        for (int i = 1; i <= 5; i++) {
            // Print asterisks for each row
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
        System.out.println("\n");

        //sandglass
        for (int i = 0; i < 3; i++) {
            // Print spaces for the left side
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars for the upper half
            for (int k = 0; k < 2 * (3 - i) - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Lower half of the sandglass
        for (int i = 3 - 2; i >= 0; i--) {
            // Print spaces for the left side
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars for the lower half
            for (int k = 0; k < 2 * (3 - i) - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
        System.out.println("\n");

        //right triangle
        int i, j, row = 5;
        for (i=0; i<row; i++)
        {
            for (j=2*(row-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
