//Try to solve on paper the following boolean algebra operations:

        //[A]: 2 <= 2 && !true
        //[B]: !false && 3 > 2
        //[C]: considering that t=false and f=true: !(!t || f)
        //[D]: 6 > 6 ^ !(true && true)
        //Then compare your solutions with a Java program that tests the validity of your assumptions.



public class Main {
    public static void main(String[] args) {

        boolean A = 2 <= 2 && !true;
        boolean B = !false && 3 > 2;
        boolean t = false; boolean f = true;
        boolean C = !(!t || f);
        boolean D = 6 > 6 ^ !(true && true);

        System.out.println(B);
        System.out.println(A);
        System.out.println(C);
        System.out.println(D);

            }
        }

