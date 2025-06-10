package easy;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Roman_to_Integer_0013 {
    public static void main(String [] args){
    Map<Character, Integer> romanMap = new HashMap<>();
    romanMap.put('I',1);
    romanMap.put('V',5);
    romanMap.put('X',10);
    romanMap.put('L',50);
    romanMap.put('C',100);
    romanMap.put('D',500);
    romanMap.put('M',1000);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a character: ");
    String s = scanner.nextLine().toUpperCase();
    scanner.close();
    System.out.println("You entered: " + s);

    int total = 0;
    for (int i = 0; i < s.length(); i++){
        int currentVal = romanMap.get(s.charAt(i));
        if(i+1 < s.length() && currentVal < romanMap.get(s.charAt(i+1))) {
                total -= currentVal;
            }else {
                total +=currentVal;
        }
    }
    System.out.println("The Interger value is: "+ total);
}
}