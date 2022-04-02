public class Zamiana {
    public static void main(String[] args) {
        try {
        int numbers = Integer.parseInt(args[1]);
        int radix = Integer.parseInt(args[0]);
            System.out.println(Integer.toString(numbers,radix));
        } catch (Exception e){
            System.out.println("Podane parametry nie są zgodne z formatem. " +
                    "Program zakończy działanie.");
        }
    }
}
