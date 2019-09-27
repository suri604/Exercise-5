import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class keva {
    public static void main(String[] args) {
        String [] s= {"a","b","c","d","a","c","c"};
        Map <String, Integer> map = new HashMap<>();
        for(int i=0;i<s.length;i++)
        {
            Integer n =map.get(s[i]);
            if(n==null)
            {
                n=1;
            }
            else
                n=n+1;

            map.put(s[i],n);
        }
        Set<Map.Entry<String,Integer>> values = map.entrySet();
        Map<String,Boolean> FIN = new HashMap<>();
        Boolean b=false;
        for(Map.Entry<String,Integer> e:values)
        {

            if(e.getValue()>=2)
            {
                 b=true;
            }
            else
               b=false;
            FIN.put(e.getKey(),b);
        }
        Set<Map.Entry<String,Boolean>> value= FIN.entrySet();
        System.out.print("{");
        for(Map.Entry<String,Boolean> x:value)
        {
            System.out.print(x.getKey()+":"+x.getValue()+" ");
        }
        System.out.println("}");
    }
}
