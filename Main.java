public class Main {

    public static void main(String[] args) {
        Punt punt1 = new Punt("a", -2, 3);
        Punt punt2 = new Punt("b", 3, 3);
        Punt punt3 = new Punt("c", -2, 1);
        Punt aanpas = new Punt ("TMP", 12,12);

        punt1.verschuif(6, -8);

        Veelhoek veelhoek = new Veelhoek("Hello",5);
        veelhoek.check(veelhoek.getPunt().length);

        System.out.println();

        Veelhoek veelhoek1 = new Veelhoek("Hello", 2);
        veelhoek1.check(veelhoek1.getPunt().length);
        veelhoek1.print();

        veelhoek1.setPunt(1,punt3);
        veelhoek1.print();

        veelhoek1.setPunt(1,aanpas);
        veelhoek1.print();
    }
}