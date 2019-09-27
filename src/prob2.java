import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class prob2 {
    public static void main(String[] args) {
        String s = "one one -one___two,,three,one @three*one?two";
        String str = s.replaceAll("[,#$.!|;:/<>+-0987654321&^%]"," ").replaceAll("[-]"," ").replaceAll("[_]"," ").replaceAll("[@]"," ").replaceAll("[*]"," ").replaceAll("[?]"," ");
        str = str.replaceAll("\\s+", " ");//replaceing all double triple spaces with single space
        String [] STR = str.split(" ");

        Map<String,Integer> map= new HashMap<>();
        for(int i=0;i<STR.length;i++)
        {
            Integer n = map.get(STR[i]);
            if(n==null)
                n=1;
            else
                n=n+1;

            map.put(STR[i],n);
        }
        Set<Map.Entry<String,Integer>> values = map.entrySet();
        System.out.print("{");
        for(Map.Entry<String,Integer> e:values)
        {
            System.out.print(e.getKey()+" : " + e.getValue() + " ");
        }
        System.out.print("}");
    }
}
