import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> symbols = new HashMap<>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);

        char[] characters = s.toCharArray();
        int total = 0;
        int previous = 0;

        for(char c : characters){
            int current = symbols.get(c);

            if (previous < current) {
                total -= previous;
                current = current - previous;
            }

            previous = symbols.get(c);
            total += current;

        }
        return total;
    }
}
