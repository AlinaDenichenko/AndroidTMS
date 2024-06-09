import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UniqueValue {
    public static Map<String, Boolean> uniqueValue(ArrayList<String> keys) {
        Map<String, Boolean> map = new HashMap<>();
        String key;

        while (!keys.isEmpty()) {
            key = keys.remove(0);
            if (!map.containsKey(key)) {
                if (keys.contains(key)) {
                    map.put(key, true);
                } else {
                    map.put(key, false);
                }
            }
        }

        return map;
    }
}
