import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeMap;

class Z2056 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        TreeMap<String, Integer> fr = new TreeMap<>();
        int max = 1;

        while ((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str);


            while (st.hasMoreTokens()) {

                String word = st.nextToken().toLowerCase();
                if (fr.get(word) != null) {
                    if (fr.containsKey(word)) {
                        int key = fr.get(word) + 1;
                        fr.replace(word, key);
                        if (key > max) {
                            max = key;
                        }
                    }
                } else {
                    fr.put(word, 1);
                }

            }
        }

        Iterator<String> it = fr.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            if (fr.get(key) == max)
                System.out.println(key);
            ;
        }

    }


}
