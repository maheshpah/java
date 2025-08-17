package basic.map;
import com.google.gson.Gson;
import java.util.*;


public class JsonWithHashMap {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Object> map = new HashMap<>();

        // Adding data (like JSON key-value)
        map.put("id", 101);
        map.put("name", "John Doe");
        map.put("isEmployee", true);
        map.put("salary", 50000);

        // Nested JSON (HashMap inside HashMap)
        Map<String, String> address = new HashMap<>();
        address.put("city", "New York");
        address.put("zip", "10001");
        map.put("address", address);

        // Convert HashMap to JSON string using Gson
        Gson gson = new Gson();
        String json = gson.toJson(map);

        // Print JSON
        System.out.println(json);
    }
}
