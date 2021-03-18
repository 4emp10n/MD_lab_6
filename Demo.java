import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input amount and currency of money: ");
        String input = in.nextLine();

        String[] input_word = input.split(" ");
        float tmp = Float.parseFloat(input_word[0]);


        switch (input_word[1]){
            case "USD":
                USD dol = new USD();
                System.out.printf(input + " = " + dol.convert(tmp) + " UAH");
                break;
            case "EUR":
                Euro eu = new Euro();
                System.out.printf(input + " = " + eu.convert(tmp) + " UAH");
                break;
        }
        in.close();
    }
}