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

