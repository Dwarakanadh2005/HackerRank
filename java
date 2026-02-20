1)https://www.hackerrank.com/challenges/welcome-to-java/problem?isFullScreen=true
------
  public class Solution {
    public static void main(String[] args) {
        // Print the two required lines
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}

2)https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
------
  import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integers until there is no more input
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println(num);
        }

        scanner.close();
    }
}

3)https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
------
  import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        if (n % 2 == 1) { // Odd number
            System.out.println("Weird");
        } else { // Even number
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}


4)https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
-----
  import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read integer
        int i = scanner.nextInt();
        
        // Read double
        double d = scanner.nextDouble();
        scanner.nextLine(); // Consume the leftover newline
        
        // Read string
        String s = scanner.nextLine();
        
        // Print the values in the required format
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scanner.close();
    }
}


5)https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
------
  import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s, x);
        }
        System.out.println("================================");

        sc.close();
    }
}

6)https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
------
  import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // Read the integer
        scanner.close();

        // Loop from 1 to 10 to print the first 10 multiples
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
    }
}

7)https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
------
  import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); // Number of queries
        
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

8)https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true
-----
  import java.util.Scanner;
import java.util.InputMismatchException;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong(); // Read number
                
                System.out.println(x + " can be fitted in:");
                
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
                    System.out.println("* long");
                
            } catch (InputMismatchException e) {
                // If the number is too large to fit in long
                String s = sc.next();
                System.out.println(s + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}

9)https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
-----
  import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;
        
        while (sc.hasNext()) {  // Keep reading until EOF
            String line = sc.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
        
        sc.close();
    }
}

10)https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
-------
  import java.util.Scanner;

public class Solution {
    static int B;
    static int H;
    static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}

