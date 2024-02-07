import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        // Create an array
        String[] array = {"cat", "dog", "fox", "bear"};

        // Convert array to ArrayList
        List<String> arrayList = new ArrayList<>(Arrays.asList(array));

        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);
    }
}

