import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class setinter {
    public static void main(String[] args) {

        Set <String> s = new TreeSet<>();
        s.add("Harry");
        s.add("Olive");
        s.add("Alice");
        s.add("Bluto");
        s.add("Eugene");
        ArrayList<String> A = new ArrayList<>();
        for(String a: s)
        {
            System.out.print(a +" ");

            A.add(a);
        }
        System.out.println();
        System.out.println(A.toString());

    }
}
