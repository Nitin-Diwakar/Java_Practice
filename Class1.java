public class Class1{
    public static void main(String[] args){
        Pen cello = new Pen();

        //Pen1
        cello.name = "Cello";
        cello.color = "Red";
        cello.type = "Ball Pen";
        // Pen2
        Pen goldex = new Pen();
        goldex.name = "goldex";
        goldex.color = "blue";
        goldex.type = "Ball Pen";
//        cello.getInfo();

        cello.printColor();
        goldex.printColor();
    }
}

class Pen{
    String name;
    String color;
    String type; // ball pen or gel pen
    public void getInfo(){
        System.out.println("Great pen");
    }

    public void printColor(){
        System.out.println("We have " + this.name + " pen in " + this.color + " color.");
    }
}