public class FractionToDecimal {
    public static void main(String[] args) {
        System.out.println(fractionToDecimal(1, 2));     
        System.out.println(fractionToDecimal(1, -2));    
        System.out.println(fractionToDecimal(50, 22));   
    }

    public static String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0) return "Undefined";  

        StringBuilder result = new StringBuilder();

        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        result.append(num / den);
        num %= den;

        if (num == 0) {
            return result.toString();
        }

        result.append(".");

        HashMap<Long, Integer> remainderMap = new HashMap<>();
        
        while (num != 0) {
            if (remainderMap.containsKey(num)) {
                int start = remainderMap.get(num);
                result.insert(start, "(");
                result.append(")");
                break;
            }

            remainderMap.put(num, result.length());

            num *= 10;
            result.append(num / den);
            num %= den;
        }

        return result.toString();
    }
}
