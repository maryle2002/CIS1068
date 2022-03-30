public class FractionMain {
    public static void main(String[] args) {
        Fraction number1 = new Fraction(5,25);
        Fraction number2 = new Fraction (1,5);
        Fraction number3 = new Fraction (4,15);
        System.out.println("Fraction 1: " + number1);
        System.out.println("Fraction 2: " + number2);
        System.out.println("Compare Fraction 1 & 2: " + number1.equals(number2));
        number1.setNum(3);
        number1.setDenom(5);
        System.out.println("Fraction 1': " + number1);
        System.out.println("Fraction 3: " + number3);
        System.out.println("Fraction 1' + 3 = " + number1.add(number3));
    }
}

