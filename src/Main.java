public class Main {

    public static void main(String[] args) {
        double height = 2.6;
        double width = 4.2;
        double length = 8.9;
        String numberOfRollsNeeded = EasyWallpaper.wallpaper(length,width,height);
        System.out.println(numberOfRollsNeeded);
    }
}
