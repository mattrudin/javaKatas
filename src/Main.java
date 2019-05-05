public class Main {

    public static void main(String[] args) {
        String result = Who.likesIt("John", "Alex", "Mark", "Max", "Stephen");
        System.out.println(result);
        String alternativeResult = Who.likesItAlternative("John", "Alex", "Mark", "Max", "Stephen");
        System.out.println(alternativeResult);
    }
}
