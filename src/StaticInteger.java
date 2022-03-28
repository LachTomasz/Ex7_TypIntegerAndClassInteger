public class StaticInteger {
    public static void main(String[] args) {
        System.out.println("Wybrane stałe i metody statyczne klasy Integer\n");
        System.out.println("Minimalna liczba klasy Integer: " + Integer.MIN_VALUE);
        System.out.println("Maksymalna liczba klasy Integer: " + Integer.MAX_VALUE);
        System.out.println("Wielkość liczby wyrażona w bitach: " + Integer.SIZE);
        int a = 179;
        System.out.println("a= " + a);
        System.out.println("Zamiana liczby na łańcuch binarny: " + Integer.toBinaryString(a));
        System.out.println("Zamiana liczby na łańcuch  ósemkowy: " + Integer.toOctalString(a));
        System.out.println("Zamiana liczby na łańcuch szesnastkowy: " + Integer.toHexString(a));
        System.out.println("...: " + Integer.toString(a));
        System.out.println("...: " + Integer.toString(a, 4));
        int b = Integer.parseInt("-177");
        System.out.println("b = " + b);
        int c = Integer.parseInt("1000" , 8);
        System.out.println("c = " + c);
        System.out.println("...: " + Integer.signum(a));
        System.out.println("...: " + Integer.signum(b));
        System.out.println("...: " + Integer.signum(0));
    }
}
