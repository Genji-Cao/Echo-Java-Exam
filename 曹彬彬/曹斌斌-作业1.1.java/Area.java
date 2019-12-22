import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        int r;
        double s;
        Scanner scan = new Scanner(System.in);
        r = scan.nextInt();
        s = r*r*Math.PI;
        System.out.println(String.format("%.2f",s));

    }
}
