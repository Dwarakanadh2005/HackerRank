 1)https://www.hackerrank.com/challenges/hello-world-c/problem?isFullScreen=true
 ------
   #include <stdio.h>

int main() {
    char s[1000];

    // Read the input string (including spaces)
    fgets(s, sizeof(s), stdin);

    // Print the required output
    printf("Hello, World!\n");
    printf("%s", s);

    return 0;
}

2)https://www.hackerrank.com/challenges/playing-with-characters/problem?isFullScreen=true
------
  #include <stdio.h>

int main() {
    char ch;
    char s[100];
    char sen[100];

    // Read a single character
    scanf("%c", &ch);

    // Read a string (stops at space)
    scanf("%s", s);

    // Consume the leftover newline
    scanf("\n");

    // Read a full sentence
    scanf("%[^\n]%*c", sen);

    // Print output
    printf("%c\n", ch);
    printf("%s\n", s);
    printf("%s\n", sen);

    return 0;
}


3)https://www.hackerrank.com/challenges/sum-numbers-c/problem?isFullScreen=true
-------
  #include <stdio.h>

int main() {
    int a, b;
    float x, y;

    // Read integers
    scanf("%d %d", &a, &b);

    // Read floats
    scanf("%f %f", &x, &y);

    // Print sum and difference of integers
    printf("%d %d\n", a + b, a - b);

    // Print sum and difference of floats (1 decimal place)
    printf("%.1f %.1f\n", x + y, x - y);

    return 0;
}

4)https://www.hackerrank.com/challenges/functions-in-c/problem?isFullScreen=true
--------
 #include <stdio.h>

int max_of_four(int a, int b, int c, int d) {
    int max = a;

    if (b > max)
        max = b;
    if (c > max)
        max = c;
    if (d > max)
        max = d;

    return max;
}

int main() {
    int a, b, c, d;

    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);
    scanf("%d", &d);

    int result = max_of_four(a, b, c, d);
    printf("%d", result);

    return 0;
}

5)https://www.hackerrank.com/challenges/pointer-in-c/problem?isFullScreen=true
-------
 #include <stdio.h>

void update(int *a, int *b) {
    int sum = *a + *b;
    int diff = *a - *b;

    if (diff < 0) {
        diff = -diff;
    }

    *a = sum;
    *b = diff;
}

int main() {
    int a, b;

    scanf("%d", &a);
    scanf("%d", &b);

    update(&a, &b);

    printf("%d\n%d", a, b);

    return 0;
}

6)https://www.hackerrank.com/challenges/conditional-statements-in-c/problem?isFullScreen=true
-------
 #include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    if (n == 1) {
        printf("one\n");
    } else if (n == 2) {
        printf("two\n");
    } else if (n == 3) {
        printf("three\n");
    } else if (n == 4) {
        printf("four\n");
    } else if (n == 5) {
        printf("five\n");
    } else if (n == 6) {
        printf("six\n");
    } else if (n == 7) {
        printf("seven\n");
    } else if (n == 8) {
        printf("eight\n");
    } else if (n == 9) {
        printf("nine\n");
    } else {
        printf("Greater than 9\n");
    }

    return 0;
}

7)https://www.hackerrank.com/challenges/for-loop-in-c/problem?isFullScreen=true
------
 #include <stdio.h>

int main() {
    int n, m;
    scanf("%d", &n);
    scanf("%d", &m);

    for (int i = n; i <= m; i++) {
        if (i >= 1 && i <= 9) {
            if (i == 1) printf("one\n");
            else if (i == 2) printf("two\n");
            else if (i == 3) printf("three\n");
            else if (i == 4) printf("four\n");
            else if (i == 5) printf("five\n");
            else if (i == 6) printf("six\n");
            else if (i == 7) printf("seven\n");
            else if (i == 8) printf("eight\n");
            else if (i == 9) printf("nine\n");
        } else {
            if (i % 2 == 0)
                printf("even\n");
            else
                printf("odd\n");
        }
    }

    return 0;
}

8)https://www.hackerrank.com/challenges/sum-of-digits-of-a-five-digit-number/problem?isFullScreen=true
--------
 #include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int sum = 0;
    while (n > 0) {
        sum += n % 10;  // get last digit
        n /= 10;        // remove last digit
    }

    printf("%d", sum);
    return 0;
}

9)https://www.hackerrank.com/challenges/bitwise-operators-in-c/problem?isFullScreen=true
--------
 #include <stdio.h>

int main() {
    int n, k;
    scanf("%d %d", &n, &k);

    int max_and = 0, max_or = 0, max_xor = 0;

    for (int a = 1; a <= n; a++) {
        for (int b = a + 1; b <= n; b++) {
            int and_val = a & b;
            int or_val = a | b;
            int xor_val = a ^ b;

            if (and_val < k && and_val > max_and) max_and = and_val;
            if (or_val < k && or_val > max_or) max_or = or_val;
            if (xor_val < k && xor_val > max_xor) max_xor = xor_val;
        }
    }

    printf("%d\n%d\n%d\n", max_and, max_or, max_xor);

    return 0;
}

10)https://www.hackerrank.com/challenges/printing-pattern-2/problem?isFullScreen=true
------
 #include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int size = 2 * n - 1;

    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            // Find the minimum distance from edges
            int top = i;
            int left = j;
            int bottom = size - 1 - i;
            int right = size - 1 - j;

            int min_dist = top;
            if (left < min_dist) min_dist = left;
            if (bottom < min_dist) min_dist = bottom;
            if (right < min_dist) min_dist = right;

            printf("%d", n - min_dist);

            if (j != size - 1) printf(" "); // space between numbers
        }
        printf("\n");
    }

    return 0;
}


