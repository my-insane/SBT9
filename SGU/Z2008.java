import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Z2008 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int max = 0;
        int loadedC = 0;
        int loadedW = 0;
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sb.readLine());
        count = Integer.parseInt(st.nextToken());
        max = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(sb.readLine());
        for (int s = 0; s < count; s++) {
            int now = Integer.parseInt(st.nextToken());

            if (loadedW + now <= max) {
                loadedC++;
                loadedW += now;

            }
        }
        System.out.println(loadedC + " " + loadedW);

    }
}