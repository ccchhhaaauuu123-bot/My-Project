<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class JAVA_5A {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> participants = new HashSet<>();
        long totolTraffic = 0;
        String line;
        try{
            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                if (line.startsWith("+")) {
                    String participant = line.substring(1).trim();
                    participants.add(participant);
                } else if (line.startsWith("-")) {
                    String participant = line.substring(1).trim();
                    participants.remove(participant);
                } else {
                    int index = line.indexOf(":");
                    if (index != -1) {
                        String mess = line.substring(index+ 1);
                        totolTraffic += (long) mess.length() * participants.size();
                    }
                }
            
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.print(totolTraffic);
    }
=======
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class JAVA_5A {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> participants = new HashSet<>();
        long totolTraffic = 0;
        String line;
        try{
            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                if (line.startsWith("+")) {
                    String participant = line.substring(1).trim();
                    participants.add(participant);
                } else if (line.startsWith("-")) {
                    String participant = line.substring(1).trim();
                    participants.remove(participant);
                } else {
                    int index = line.indexOf(":");
                    if (index != -1) {
                        String mess = line.substring(index+ 1);
                        totolTraffic += (long) mess.length() * participants.size();
                    }
                }
            
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.print(totolTraffic);
    }
>>>>>>> a5d2e94d74fcff63c056435d6e495c3a6dda7999
}