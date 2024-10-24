package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalCoordinates {
    public static void main(String[] args) {
        System.out.println(getFinalCoordinates("UUU"));           
        System.out.println(getFinalCoordinates("URRDDL"));        
        System.out.println(getFinalCoordinates("DOWN UP 2xRIGHT DOWN 3xLEFT")); 
    }

    public static String getFinalCoordinates(String directions) {
        int x = 0, y = 0;

        String[] moves = directions.split(" ");

        for (String move : moves) {
            move = move.toUpperCase(); 

            if (move.matches("\\d+x[UDRL]+")) {
                Pattern pattern = Pattern.compile("(\\d+)x([UDRL]+)");
                Matcher matcher = pattern.matcher(move);

                if (matcher.find()) {
                    int multiplier = Integer.parseInt(matcher.group(1));
                    String direction = matcher.group(2);
                    x = applyMovement(direction, multiplier, x, y)[0];
                    y = applyMovement(direction, multiplier, x, y)[1];
                }
            } else {
                for (char c : move.toCharArray()) {
                    switch (c) {
                        case 'U':
                            y++;
                            break;
                        case 'R':
                            x++;
                            break;
                        case 'D':
                            y--;
                            break;
                        case 'L':
                            x--;
                            break;
                        default:
                            System.out.println("Invalid move: " + c);
                            break;
                    }
                }
            }
        }

        return "(" + x + ", " + y + ")";
    }

    public static int[] applyMovement(String direction, int multiplier, int x, int y) {
        for (char c : direction.toCharArray()) {
            switch (c) {
                case 'U':
                    y += multiplier;
                    break;
                case 'R':
                    x += multiplier;
                    break;
                case 'D':
                    y -= multiplier;
                    break;
                case 'L':
                    x -= multiplier;
                    break;
            }
        }
        return new int[]{x, y};
    }
}
