public class Veelhoek {
    private String naam;
    private Punt[] punt;

    public Veelhoek(String naam){
        this.naam = naam;
        this.punt = new Punt[3];
        this.punt[0] = new Punt("A", 0,0);
        this.punt[1] = new Punt("B", 0,0);
        this.punt[2] = new Punt("C",0,0);
    }

    public Veelhoek(String naam, int aantalPunten) {
        this.naam = naam;
        char naaamVar = 'A';

        if(aantalPunten < 3){
            System.out.println("Moet minimaal 3 zijn!");
            this.punt = new Punt[3];

            for(int j = 0; j < 3 ; j++){
                this.punt[j] = new Punt(toString().valueOf(naaamVar),0,0);
                naaamVar++;
            }

        } else {
            this.punt = new Punt[aantalPunten];

            for(int j = 0; j < aantalPunten; j++){
                this.punt[j] = new Punt(toString().valueOf(naaamVar),0,0);
                naaamVar++;
            }
        }
    }

    public Punt[] getPunt() {
        return punt;
    }

    public void check(int aantal) {
        /*
            Tijdelijk functie om te checken of de juiste vars worden ingeladen.
         */
        for(int i = 0; i < aantal ; i++){
            punt[i].print(true);
        }
    }

    public void print(){
        System.out.print("de veelhoek " + this.naam + "heeft ");

        for(int i = 0; i < this.punt.length; i++){
            this.punt[i].print(false);
            System.out.print(" ");
        }
        System.out.println("punten");
    }

    public void setPunt(int index, Punt punt) {

        /*
            Ondanks dat het feit dat de punten een naam hebben schrijft de opdracht voor een
            index te gebruiken.
            In praktijk zou ik hiervoor de naam van de punten gebruiken
         */

        if(index < 0 || index > this.punt.length){
            System.out.println("Een onjuist index is meegegeven.");
        } else {
            this.punt[index] = punt;
        }
    }

    public void verschuif(int deltaX, int deltaY){
        for(int i = 0; i < this.punt.length ; i++){
            this.punt[i].setX(deltaX);
            this.punt[i].setY(deltaY);
        }
    }
}
