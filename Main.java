package swing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("pls enter player num: ");
        if (s.nextInt() == 1) {
            Gm2 game2 = new Gm2("Single Player");
            game2.run();
        } else {
            Gm1 game1 = new Gm1("Multi Player");
            game1.run();
        }
    }
}