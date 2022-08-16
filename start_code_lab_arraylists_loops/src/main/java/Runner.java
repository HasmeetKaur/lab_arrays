import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
        System.out.println("Scottish Islands Answer 1: "+scottishIslands);
//        2. Add "Tiree" to the start of the list
        scottishIslands.addAll(0, Collections.singleton("Tiree"));
        System.out.println("Scottish Islands Answer 2: "+scottishIslands);
//        3. Add "Islay" after "Jura" and before "Mull"

//        4. Print out the index position of "Skye"
        System.out.println("Scottish Islands Answer 4: "+ scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
        System.out.println("Scottish Islands Answer 5: "+scottishIslands);
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(4 );
        System.out.println("Scottish Islands Answer 6: "+scottishIslands);
//        7. Print the number of islands in your arraylist
        int numberIslands = scottishIslands.size();
        System.out.println("Scottish Islands Answer 7: "+ numberIslands);
//        8. Sort the list alphabetically
        scottishIslands.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("Scottish Islands Answer 8: "+Arrays.toString(new List[]{scottishIslands}));
//        9. Print out all the islands using a for loop
        System.out.println("Scottish Islands Answer 9");
        for (String scottishIsland : scottishIslands) {
            System.out.println(scottishIsland);
        }
//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        int length = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Numbers Answer 1: " + number);
            }
        }
//        2. Print the difference between the largest and smallest value
        int min = Integer.MAX_VALUE,
                max = Integer.MIN_VALUE;
        Object number;
        for (int val: numbers) {
            if (val < min)
                min = val;
            if (val > max)
                max = val;
        }
        System.out.println("Numbers Ans 2: " + (max - min));
//        3. Print True if the list contains a 1 next to a 1 somewhere.
        String[] numberStringArray = new String[]{numbers.toString()};
        List<String> numbers = new ArrayList<>(Arrays.asList(numberStringArray));
        System.out.println(numberStringArray.contains("1, 1"));

//        4. Print the sum of the numbers,

//        5. Print the sum of the numbers...

//           ...except the number 13 is unlucky, so it does not count...

//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [7, 13, 2] would have sum of 9.

    }

}
