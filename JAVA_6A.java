import java.util.Arrays;
import java.util.Scanner;
public class JAVA_6A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] sticks = new int [4];
        for (int i = 0; i < 4; i++) {
            sticks[i] = sc.nextInt();
        }
        
        sc.close();

        boolean segmentFound = false;
        Arrays.sort(sticks);
        for (int i = 0; i < 2; i++) {
            int a = sticks[i];
            int b = sticks[i + 1];
            int c = sticks[i + 2];
            if (a + b > c) {
                System.out.println("TRIANGLE");
                break;
            } else if (a + b == c) {
                segmentFound = true;
            }
        }
            if (segmentFound){
                System.out.println("SEGMENT");
                
            } else {
                System.out.println("IMPOSSIBLE");
            }
        
    }
}
