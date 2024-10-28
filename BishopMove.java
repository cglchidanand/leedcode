public class BishopMove {
    public static void main(String[] args) {
        System.out.println(bishopReachable(2, 3, 4, 5)); 
        System.out.println(bishopReachable(1, 1, 8, 8)); 
        System.out.println(bishopReachable(2, 3, 5, 7)); 
        System.out.println(bishopReachable(3, 2, 3, 2)); 
    }

    public static String bishopReachable(int bishopX, int bishopY, int pieceX, int pieceY) {
         if (Math.abs(bishopX - pieceX) == Math.abs(bishopY - pieceY)) {
             if (bishopX == pieceX && bishopY == pieceY) {
                return "YES, 0";
            }
            return "YES, 1";
        }
        
        return "NO"; 
    }
}

