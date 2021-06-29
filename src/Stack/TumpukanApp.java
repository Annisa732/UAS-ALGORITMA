package Stack;

public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan=new Tumpukan (10);
        tumpukan.push(10);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(30);
        tumpukan.baca();
        System.out.println();
        long nilai1 = tumpukan.pop();
        System.out.println("nilai teratas = " +nilai1);
        System.out.println("Nama saya adalah Annisa Nadia Nur Afifah");
        System.out.println("nilai yang dihapus = " +nilai1);
        tumpukan.baca();
        tumpukan.push(40);
        tumpukan.baca();
        System.out.println();
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println();
    }
}
