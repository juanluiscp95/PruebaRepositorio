package ejer09prop04;
/**
 * 
 * @author juanluis
 * @version 15/01/2019
 */
public class Bebe {
/**
 * 
 * @param i 
 */
    Bebe(int i) {
        this("Soy un bebe consentido");
        System.out.println("Hola, tengo " + i + " meses");
    }

    /**
     * 
     * @param s 
     */
    Bebe(String s) {
        System.out.println(s);
    }

    void berrea() {
        System.out.println("Buaaaaaaaa");//sonido que se hace cuando se llora
    }

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        new Bebe(8).berrea();
    }
}
