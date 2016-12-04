/*import java.util.ArrayList;

public class DirReduction {
    public static String[] dirReduc(String[] directions) {
        int north = 0;
        int south = 0;
        int east = 0;
        int west = 0;
        ArrayList<String> simplifiedDirections = new ArrayList<>();
        String[] finalDirections;

        for (int i = 0; i < directions.length; i++) {
            if (direction.contains("NORTH")) {
                north++;
            } else if (direction.contains("SOUTH")) {
                south++;
            } else if (direction.contains("EAST")) {
                east++;
            } else if (direction.contains("WEST")) {
                west++;
            }
        }

        if (north == 1 && west == 1 && east == 1 && south == 1) {
            finalDirections = directions;
        }else {
            if (north >= south) {
                north -= south;
                for (int i = 0; i < north; i++) {
                    simplifiedDirections.add("NORTH");
                }
            } else {
                south -= north;
                for (int i = 0; i < south; i++) {
                    simplifiedDirections.add("SOUTH");
                }
            }

            if (west >= east) {
                west -= east;
                for (int i = 0; i < west; i++) {
                    simplifiedDirections.add("WEST");
                }
            } else {
                east -= west;
                for (int i = 0; i < east; i++) {
                    simplifiedDirections.add("EAST");
                }
            }
            finalDirections = new String[simplifiedDirections.size()];
            simplifiedDirections.toArray(finalDirections);
        }
            return finalDirections;
    }

}*/