

import java.util.ArrayList;
import java.util.Scanner;

public class VanessaArrayListTest {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Enter integers (enter 0 to stop): ");
        
        while (true) {
            if (input.hasNextInt()) {
                int value = input.nextInt();
                if (value == 0) {
                    break;
                }
                list.add(value);
            } else {
                input.next();
            }
        }
        
        
        Integer result = max(list);
        
        if (result == null) {
           System.out.println("The list is empty.");
        } else {
           System.out.println("The largest value in the list is : " + result);
        }
        
        input.close();
    }
    
    
    public static Integer max(ArrayList<Integer> list) {
        
        if (list == null || list.isEmpty()) {
            return null;
        }
        
        Integer largest = list.get(0);
        
        
        for (Integer num : list) {
            if (num > largest) {
                largest = num;
            }
        }
        
        return largest;
    }
}