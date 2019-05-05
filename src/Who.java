public class Who {
    // Disadvantage: Very verbose!
    public static String likesIt(String... names) {
        int length = names.length;
        StringBuilder result = new StringBuilder();
        switch (length) {
            case 0:
                result
                        .append("no one likes this");
                break;
            case 1:
                result
                        .append(names[0])
                        .append(" likes this");
                break;
            case 2:
                result
                        .append(names[0])
                        .append(" and ")
                        .append(names[1])
                        .append(" like this");
                break;
            case 3:
                result
                        .append(names[0])
                        .append(", ")
                        .append(names[1])
                        .append(" and ")
                        .append(names[2])
                        .append(" like this");
                break;
            default:
                result
                        .append(names[0])
                        .append(", ")
                        .append(names[1])
                        .append(" and ")
                        .append(length - 2)
                        .append(" others like this");
                break;
        }
        return result.toString();
    }

    // Better approach, less verbose
    public static String likesItAlternative(String... names) {
        int length = names.length;
        int temp = length - 2;
        if (length == 0) return "no one likes this";
        if (length == 1) return names[0] + " likes this";
        if (length == 2) return names[0] + " and " + names[1] + " like this";
        if (length == 3) return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        else return names[0] + ", " + names[1] + " and " + temp + " others like this";
    }
}
