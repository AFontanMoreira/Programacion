public class Main {

    public static void main(String[] args) {
        System.out.println("Morcego------------");
        Morcego objMorcego = new Morcego();
        objMorcego.podoCamiñar();
        objMorcego.podoVolar();
        System.out.println("Tigre------------");
        Tigre objTigre = new Tigre();
        objTigre.podoNadar();
        objTigre.podoCamiñar();
        objTigre.amosar();
    }
}
