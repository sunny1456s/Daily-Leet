// Last updated: 7/3/2026, 11:29:01 PM
import java.util.*;

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder sb = new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0)) {
            sb.append("-");
        }
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

     
        sb.append(num / den);
        num %= den;

        if (num == 0) {
            return sb.toString(); 
        }

        sb.append(".");

        Map<Long, Integer> map = new HashMap<>();
        while (num != 0) {
            if (map.containsKey(num)) {
         
                int idx = map.get(num);
                sb.insert(idx, "(");
                sb.append(")");
                break;
            }
            map.put(num, sb.length());

            num *= 10;
            sb.append(num / den);
            num %= den;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.fractionToDecimal(1, 2));    
        System.out.println(sol.fractionToDecimal(2, 1));   
        System.out.println(sol.fractionToDecimal(4, 333));  
        System.out.println(sol.fractionToDecimal(1, 6));    
    }
}
