public class Main {
    public static void main(String[] args) {
        int sum1 = add(3,8);
        int sum2 = addTwo(3,8,4,9);
        String fullMGreeting = morningGreeting("Toby Fox");
        String fullAGreeting = afternoonGreeting("Mac Miller");
        String tripleText = triple("oohbaby");
        double halfValue = half(8);
        int roundedPositive = roundPositiveValueToNearestInteger(8.5);
        int roundedNegative = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(fullMGreeting);
        System.out.println(fullAGreeting);
        System.out.println(tripleText);
        System.out.println(halfValue);
        System.out.println(roundedPositive);
        System.out.println(roundedNegative);
    }
    // 1. add
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    // 2. add
    public static int addTwo(int num1, int num2, int num3, int num4) {
        int sum1 = add(num1, num2);
        int sum2 = add(sum1, num3);
        int sum3 = add(sum2, num4);
            return(sum3);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name;
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name;
    }
    // 5. triple
    public static String triple(String text) {
        return text + text + text;
    }

    // 6. half
    public static double half(int num1) {
        return num1 / 2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double num1) {
        return (int)num1;
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double num1) {
        return (int)num1;
    }

}
