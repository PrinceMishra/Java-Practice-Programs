// import java.util.Collection;
import java.util.HashSet;
// import java.util.Iterator;
import java.util.Set;

public class AllSet {

    public static void main(String[] args) {

        Set<Integer> st = new HashSet<>();

        st.add(45);
        st.add(89);
        st.add(78);

        System.out.println(st);

        System.out.println(st.contains(45));

        st.remove(78);

        System.out.println(st);

        System.out.println(st.size());

        HashSet<String> words = new HashSet<>();
        words.add("Hello Prince,");
        words.add("How are you.");

        System.out.println(words);

        System.out.println(words.contains("Hello Prince,"));

        words.remove("Hello Prince,");
        System.out.println(words);

        
    }

}
