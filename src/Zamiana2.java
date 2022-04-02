/*
Program zamienia liczbe podana (parametr wywołania drugi args[1])
w wskazanym formacie (args[0] zapis dziesiętny systemu liczbowego,
np szesnastkowy 16.
* */
public class Zamiana2 {
    public static void main(String[] args) {
        try {
            int radix = Integer.parseInt(args[0]);
            String numbers = args[1];
            System.out.println(numbers+"["+radix+"] = "+Integer.parseInt(numbers,radix)+"[10]");
        }catch (Exception e){
            System.out.println("Podaj parametry w poprawnym formacie!");
        }
    }
}
