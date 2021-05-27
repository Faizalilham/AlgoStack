package Stack;
public class TumpukanApp {
    public static void main(String[] args) {
        Tumpukan tumpukan = new Tumpukan(5);
        tumpukan.push(50);
        tumpukan.tampil();
        System.out.println(" ");
        tumpukan.push(100);
        tumpukan.tampil();
        System.out.println(" ");
        tumpukan.pop();
        tumpukan.tampil();
        System.out.println(" ");
        tumpukan.push(60);
        tumpukan.tampil();
        System.out.println(" ");
        tumpukan.push(80);
        tumpukan.tampil();
        System.out.println(" ");
        tumpukan.pop();
        tumpukan.tampil();
        System.out.println(" ");
        System.out.println("Nilai Top nya = "+tumpukan.peek());
        System.out.println(" ");
        System.out.println(" Hai Faizal ");
       
    }
}
