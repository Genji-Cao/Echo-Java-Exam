```java

import java.util.Arrays;
import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) {
        int a[] = new int[20];
        int n;
        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        for (int i = 0; i < 20; i++) {
            a[i] = i;
        }
        for (int i = 0; i < 20; i++) {
            if (a[i] == n) {
                for (int j = i; j < 19; j++) {
                    a[j] = a[j + 1];
                }
                a[19] = 0;
            }
        }
        System.out.println(Arrays.toString(a));


    }
}

```

