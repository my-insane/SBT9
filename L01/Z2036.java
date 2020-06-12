import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Z2036 {
    public static void main(String[] args) throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sb.readLine());
        int lines = Integer.parseInt(st.nextToken());
        String[] verb = {"e", "y", "u", "i", "o", "a"};
        ArrayList<String> strangeWords;

        System.out.println(lines);
        for (int i = 0; i < lines; i++){

            st = new StringTokenizer(sb.readLine());
            System.out.println(st.nextToken());
        }

    }
}

