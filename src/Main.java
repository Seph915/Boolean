public class Main {
    public static void main(String[] args) {

        boolean resultA = 2 <= 2 && !true;
        System.out.println("[A] Result: " + resultA);


        boolean resultB = !false && 3 > 2;
        System.out.println("[B] Result: " + resultB);


        boolean t = false;
        boolean f = true;
        boolean resultC = !(t || f);
        System.out.println("[C] Result: " + resultC);


        boolean resultD = 6 > 6 ^ !(true && true);
        System.out.println("[D] Result: " + resultD);
    }
}
