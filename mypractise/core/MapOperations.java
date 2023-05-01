package mypractise.core;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
public static Map createMap(){
    Map<Integer, String> map= new HashMap<>();
    map.put(11,"kenya");
    map.put(13,"uganda");
    map.put(9,"myanmar");
    map.put(5,"polad");
    map.put(3,"netherlands");
    return map;
}

//count Pairs For given Sum
public static int countPairsForSum(int arr[], int sum) {
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < arr.length; i++) {
        if (map.containsKey(sum - arr[i]))
            count += map.get(sum - arr[i]);
        if (map.containsKey(arr[i]))
            map.put(arr[i], map.get(arr[i]) + 1);
        else
            map.put(arr[i], 1);
    }
    return count;
}
}