import java.util.HashMap;

public class map3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);

        System.out.println("size of maps: "+map.size());
        System.out.println(map);

        if(map.containsKey("a")) {
           Integer a = map.get("a");
         System.out.println("value for key "+"\"a\"is:- "+a);
        }

        for (String key: map.keySet()) {
             System.out.println("key: "+key+ ", value: "+map.get(key));
            }
        for(Entry<String, Integer> entry : map.entrySet()) {
                System.out.println("key - " + entry.getKey() +", value: "+entry.getValue());
            }
    }
}
