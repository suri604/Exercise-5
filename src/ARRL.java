import java.util.ArrayList;

public class ARRL {
    public static void main(String[] args) {
        ArrayList <String> arr = new ArrayList<>();
        arr.add("Apple");
        arr.add("Grape");
        arr.add("Melon");
        arr.add("Berry");
        arr.remove("Apple");
        arr.add(0,"Kiwi");

        System.out.println(arr.toString());
        arr.removeAll(arr);
        System.out.println(arr.toString());

    }
}
