package JavaDSA.HashMaps;

import java.util.HashMap;
import java.util.Map;




public class JavaHashMap {
    public static void main(String[] args) {
        //the values can be an object also
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Yash");
        map.put(2, "Harsh");
        map.put(3, "Vansh");
        //maps can have only unique keys
        map.put(1, "Karan");//overwriting
        map.put(null,null);//valid
        System.out.println(map);
        System.out.println(map.containsKey(3));//return boolean - T-O(1)
        System.out.println(map.get(3));//returns value T- O(1)

    }
}
