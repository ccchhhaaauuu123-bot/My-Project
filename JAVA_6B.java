import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JAVA_6B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String cStr = scanner.next();
        char presidentColor = cStr.charAt(0);
        char [][] grid = new char[n][m];
        for (int  i =0; i < n; i++){
            String line = scanner.next();
            grid[i] = line.toCharArray();

        }
        scanner.close();
        Set<Character> deputies = new HashSet<>();
        int [] dx = {-1, 1, 0, 0};
        int [] dy = {0, 0, -1, 1};
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (grid[i][j] == presidentColor){
                    for (int k = 0; k < 4; k++){
                        int ni = i + dx[k];
                        int nj = j + dy[k];
                        if (ni >= 0 && ni < n && nj >= 0 && nj < m){
                            char neighborColor = grid[ni][nj];
                            if (neighborColor != presidentColor && neighborColor != '.'){
                                deputies.add(neighborColor);
                            }
                        }
                    }
                }
            }
        }

        System.out.print(deputies.size());

    }
}
