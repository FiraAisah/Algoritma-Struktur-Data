public class Array {
    public static void main(String[] args) {
        int[] bilangan = new int[5];
        bilangan[0] = 10;
        bilangan[1] = 20;
        bilangan[2] = 30;
        bilangan[3] = 40;
        bilangan[4] = 50;
        for (int i = 0; i < bilangan.length; i++){
            System.out.println("Bilangan ke-" + bilangan[i]);
        }
    }
}
