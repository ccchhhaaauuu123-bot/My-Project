import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class JAVA_5B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> lines = new ArrayList<>();
        String line;
        int maxLen = 0;
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            lines.add(line);
            if (line.length() > maxLen) {
                maxLen = line.length();
            }
            
        }   
        printBorder(maxLen + 2);
        boolean extraSpace = false;
        for (String L : lines){
            int totalSpace = maxLen - L.length();
            int rightSpace = totalSpace / 2;
            int leftSpace = totalSpace / 2;
            
            if (totalSpace % 2 != 0) {   
                if (extraSpace){
                    leftSpace += 1;
                } 
                else {
                    rightSpace += 1;
                }
                extraSpace = !extraSpace;
            }
            System.out.print("*");
            printBlank(leftSpace);
            System.out.print(L);
            printBlank(rightSpace);
            System.out.println("*");

        }
    }
    public static void printBorder(int n ){
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printBlank(int n ){
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
        }
    }
    
}
