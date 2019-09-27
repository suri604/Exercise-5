import java.util.*;

public class Prob5 {
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();
        System.out.println("before performing the operation");
        Scanner sc = new Scanner (System.in);
        String A[] = new String[2];

            String a=sc.nextLine();
            String b =sc.nextLine();
            A =a.split(",");
            String[] B=b.split(",");
            map.put(A[0],A[1]);
            map.put(B[0],B[1]);

            String temp = A[1];
            String x=" ";
            map.put(A[0],x);
            map.put(B[0],temp);
        System.out.println(map.toString());






    }

}
