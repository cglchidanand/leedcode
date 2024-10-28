public class CustomAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("123"));     // Output: 123
        System.out.println(myAtoi("-123"));    // Output: -123
        System.out.println(myAtoi("1a23"));    // Output: -1
        System.out.println(myAtoi("+456"));    // Output: 456
        System.out.println(myAtoi("abc"));     // Output: -1
    }

    public static int myAtoi(String str) {
        if (str == null || str.isEmpty()) {
            return -1; // Invalid entry for empty string
        }

        int sign = 1;
        int result = 0;
        int i = 0;
        
        // Check for sign at the beginning
        if (str.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }

        // Process each character
        for (; i < str.length(); i++) {
            char c = str.charAt(i);
            
            // If the character is not a digit, return -1 (invalid entry)
            if (c < '0' || c > '9') {
                return -1;
            }

            // Calculate the integer value
            result = result * 10 + (c - '0');
        }

        return result * sign;
    }
}
