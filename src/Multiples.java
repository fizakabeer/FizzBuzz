public class Multiples {
    public static void main(String[] args) {

        int i = 3;
        int total = 0;
        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += 1;
            }
            i++;
        }
        System.out.println(total);

    }
}
