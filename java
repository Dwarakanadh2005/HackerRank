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

11)https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true
--------
  import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        // Convert integer n to a string
        String s = Integer.toString(n);

        // Check if conversion was successful
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}

12)https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
--------
  import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();

        System.out.println(findDay(month, day, year));
    }

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        // Month is 0-based in Calendar, so subtract 1
        cal.set(year, month - 1, day);

        // Get the day of the week
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // Convert dayOfWeek (1=Sunday, 2=Monday...) to name
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        return days[dayOfWeek - 1]; // Calendar.DAY_OF_WEEK starts at 1
    }
}

13)https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
------
  import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Create currency formatters for different locales
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Print the formatted outputs
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}

14)https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
--------
  import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        
        // Reverse the string
        String reversed = new StringBuilder(s).reverse().toString();
        
        // Compare original and reversed
        if (s.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

15)https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
------
  import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        // Trim any leading/trailing whitespace
        s = s.trim();

        // Split the string into tokens by using all non-letter characters as delimiters
        String[] tokens = s.split("[^A-Za-z]+");

        // Handle the edge case of empty input
        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}

16)https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
--------
  import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();   // number of test cases
        scanner.nextLine();          // consume the newline

        for (int i = 0; i < n; i++) {
            String pattern = scanner.nextLine();

            try {
                Pattern.compile(pattern);  // try to compile the regex
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }

        scanner.close();
    }
}

17)https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true
-------
  class MyRegex {
    // Regular expression for a valid IP address
    String pattern = 
        "((25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})\\.){3}" +  // First 3 octets
        "(25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})";            // Last octet
}

18)https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true
--------
  import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        while (N-- > 0) {
            String line = sc.nextLine();

            // Regex: <(tagName)>content</\1>
            // - (.+?) is non-greedy to avoid nested issues
            Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
            Matcher matcher = pattern.matcher(line);

            boolean found = false;
            while (matcher.find()) {
                System.out.println(matcher.group(2)); // print the content
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }

        sc.close();
    }
}

19)https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
------
  import java.util.*;
import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        sc.close();

        // Sort the array using BigDecimal for numeric comparison
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                BigDecimal b1 = new BigDecimal(s1);
                BigDecimal b2 = new BigDecimal(s2);

                // Descending order
                return b2.compareTo(b1);
            }
        });

        // Print in original format
        for (String s : arr) {
            System.out.println(s);
        }
    }
}

20)https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
--------
  import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();          // Read the number as a string
        BigInteger bigInt = new BigInteger(n); // Convert to BigInteger

        // isProbablePrime(10) checks primality with certainty ~1 - 1/2^10
        if (bigInt.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        sc.close();
    }
}

