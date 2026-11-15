package module06;

public class exercise4_6 {
    public static void main(String[] args) {
        int side1 = 6;
        int side2 = 10;
        int side3 = 8;

        int longest;
        int base;
        int height;

        if (side1 > side2 && side1 > side3) {
            longest = side1;
            base = side2;
            height = side3;
        } else if (side2 > side1 && side2 > side3) {
            longest = side2;
            base = side1;
            height = side3;
        } else {
            longest = side3;
            base = side1;
            height = side2;
        }

        String pytriplet = (longest * longest == base * base + height * height) ? "these are a Pythagorean triplet" : "these are not a Pythagorean triplet";
        System.out.println(pytriplet);
    }
}
