import java.util.ArrayList;

public class TheOffice {
    private static ArrayList<Integer> chairs;

    public static Object meeting(Room[] rooms, int chairsNeeded) {
        // Fast-fail
        if(chairsNeeded == 0) {
            return "Game On";
        }

        chairs = new ArrayList<>();

        boolean hasFreeChairs = calculateFreeChairs(rooms, chairsNeeded);
        return hasFreeChairs ? getFreeChairs() : "Not enough!";
    }

    private static int[] getFreeChairs() {
        return chairs.stream().mapToInt(integer -> integer).toArray();
    }

    private static boolean calculateFreeChairs(Room[] rooms, int chairsNeeded) {
        for (Room room : rooms) {
            int occupants = room.occupants.length();
            int chairNum = room.chairs;

            if(occupants < chairNum) {
                int freeChairs = chairNum - occupants;
                if(chairsNeeded > freeChairs) {
                    chairsNeeded -= freeChairs;
                    chairs.add(freeChairs);
                } else {
                    chairs.add(chairsNeeded);
                    return true;
                }
            } else {
                chairs.add(0);
            }
        }
        return false;
    }

    private static class Room {
        private final String occupants;
        private final int chairs;

        private Room(String occupants, int chairs) {
            this.occupants = occupants;
            this.chairs = chairs;
        }
    }
}
