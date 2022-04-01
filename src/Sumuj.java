public class Sumuj {
    public static void main(String[] args) {
        int suma = 0;
        try {
            for (String a : args){
                suma += Integer.parseInt(a);
            }
            System.out.println("Suma podanych elementów wynosi: "+suma);
        } catch (Exception e){
            System.out.println("Nie można przekonwertować podanej wartości na typ Integer");
        }
    }
}
