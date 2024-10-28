public class BulbToggle {
    public static void main(String[] args) {
        int numberOfBulbs = 100;
        boolean[] bulbs = new boolean[numberOfBulbs + 1];  

         for (int i = 1; i <= numberOfBulbs; i++) {
            for (int j = i; j <= numberOfBulbs; j += i) {
                bulbs[j] = !bulbs[j]; 
            }
        }

         int count = 0;
        for (int i = 1; i <= numberOfBulbs; i++) {
            if (bulbs[i]) {
                count++;
            }
        }

        System.out.println("Number of bulbs that remain on: " + count);    }
}
