public class Punt {
    /*
        This represents a point within a matrix
        Its has a name (string) and two points (x,y)

        Methods besides setters and getters:

        print() method:
            This prints the name and x,y of the object. (format = "name(x,y)"

        verschuif(deltaX, deltaY) method:
            @param  int deltaX = current x pos + deltaX pos
                    int deltaY = current y pos + deltaY pos
            set
     */

    private String naam;
    private int x;
    private int y;

    public Punt(String naam, int x, int y){
        this.naam = naam;
        this.x = x;
        this.y = y;
    }

    public Punt(String naam){
        this.naam = naam;
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public void print(boolean println) {
        if(println){
            System.out.println(this.naam + "(" + this.x + ", " + this.y + ")");
        }else{
            System.out.print(this.naam + "(" + this.x + ", " + this.y + ")");
        }

    }


    public void verschuif(int deltaX, int deltaY){
        this.x = (this.x + deltaX);
        this.y = (this.y + deltaY);
    }

}

