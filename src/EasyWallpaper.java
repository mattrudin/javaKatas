public class EasyWallpaper {

    public static String wallpaper(double l, double w, double h) {
        double STANDARD_ROLL_LENGTH = 10;
        double STANDARD_ROLL_WIDTH = 0.52;
        double MARGIN = 0.15;
        String[] plainEnglish = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                "nineteen", "twenty"};

        if (l == 0.0 || w == 0.0 || h == 0.0)
            return plainEnglish[0];


        double rollArea = STANDARD_ROLL_LENGTH * STANDARD_ROLL_WIDTH;
        double roomAreaWithMargin = getRoomAreaWithMargin(l, w, h, MARGIN);
        int roundNumberOfRolls = getRoundNumberOfRolls(rollArea, roomAreaWithMargin);

        return plainEnglish[roundNumberOfRolls];
    }

    private static int getRoundNumberOfRolls(double rollArea, double roomAreaWithMargin) {
        return (int) Math.ceil(roomAreaWithMargin / rollArea);
    }

    private static double getRoomAreaWithMargin(double l, double w, double h, double MARGIN) {
        double roomArea = ((l + w) * h) * 2;
        return roomArea + (roomArea * MARGIN);
    }
}