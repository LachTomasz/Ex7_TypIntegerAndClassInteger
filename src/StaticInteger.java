public class StaticInteger {
    public static void main(String[] args) {
        System.out.println("Wybrane stałe i metody statyczne klasy Integer\n");
        System.out.println("Minimalna liczba klasy Integer: " + Integer.MIN_VALUE);
        System.out.println("Maksymalna liczba klasy Integer: " + Integer.MAX_VALUE);
        System.out.println("Wielkość liczby wyrażona w bitach: " + Integer.SIZE);
        int a = 179;
        System.out.println("a= " + a);
        System.out.println("Reprezentacja liczby w łańcuchu jako binarnej: " + Integer.toBinaryString(a));
        System.out.println("Reprezentacja liczby w łańcuchu  jako ósemkowej: " + Integer.toOctalString(a));
        System.out.println("Reprezentacja liczby w łańcuchu jako szesnastkowej: " + Integer.toHexString(a));
        System.out.println("Reprezentacja liczby w łańcuchu jako dziesiętnej: " + Integer.toString(a));
        System.out.println("Reprezentacja liczby w łańcuchu w zalerzności od parametru \"RADIX\", tu w formacie czwórkowym: " + Integer.toString(a, 4));
        int b = Integer.parseInt("-177");
        System.out.println("b = " + b);
        int c = Integer.parseInt("1000" , 8);
        System.out.println("c = " + c);
        System.out.println("Funkcja zwracająca informacje czy liczba jest dodatnia (1), ujemna (-1) czy wynosi zero (0): " + Integer.signum(a));
        System.out.println("Funkcja zwracająca informacje czy liczba jest dodatnia (1), ujemna (-1) czy wynosi zero (0): " + Integer.signum(b));
        System.out.println("Funkcja zwracająca informacje czy liczba jest dodatnia (1), ujemna (-1) czy wynosi zero (0): " + Integer.signum(0));
    }
}
