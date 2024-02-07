import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("red");
        arrayList.add("blue");
        arrayList.add("green");
        arrayList.add("yellow");

        // Convert ArrayList to array
        String[] array = arrayList.toArray(new String[0]);

        // Print the array
        System.out.println("Array: " + Arrays.toString(array));
    }
}

