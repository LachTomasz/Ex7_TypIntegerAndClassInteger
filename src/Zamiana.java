/*
* Program zamienia liczbę podaną w formacie dziesiętnym (args[1])
* na liczbę w systemie wskazanym w args[0]
* */
public class Zamiana {
    public static void main(String[] args) {
        try {
            int numbers = Integer.parseInt(args[1]);
            int radix = Integer.parseInt(args[0]);
            System.out.println(args[1]+"[10] = "
                    + Integer.toString(numbers, radix)
                    + "["+radix+"]");
        } catch (Exception e){
            System.out.println("Podane parametry nie są zgodne z formatem. " +
                    "Program zakończy działanie.");
        }
    }
}
