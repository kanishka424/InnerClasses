import java.util.ArrayList;
import java.util.List;

public class Gearbox {
    private List<Gear> gears;
    private int maxGear;
    private int currentGear;
    private boolean clutchIsin;

    public Gearbox(int maxGear) {
        this.maxGear = maxGear;
        this.gears=new ArrayList<Gear>();
        Gear neutral =new Gear(0,0.0);
        this.gears.add(neutral);

        for(int i=0;i<maxGear;i++){
            addGear(i,i*5.3);
        }
    }


    public void oparateClutch(boolean in){
        clutchIsin=in;


    }

    public void addGear(int number,double ratio){
        if(number<maxGear && number>0 ){
            System.out.println("Gear added");
           gears.add(new Gear(number,ratio));

        }
    }

    public void changeGear(int newGear){
        if (newGear<maxGear && newGear>=0 && this.clutchIsin){
            currentGear=newGear;
            System.out.println("the"+newGear+"is selected");
        }else {
            System.out.println("Grind");
            this.currentGear = 0;
        }

    }

public double wheelSpeed(int revs){
        if(clutchIsin){
            System.out.println("Scream!");
            return 0.0;
        }
        return revs*gears.get(currentGear).getRatio();
}



    private class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){

         return revs*(ratio);
        }

        public double getRatio(){
            return ratio;
        }
    }
}













//=====================================NOTE===============================
//1.instance of Gear(inner class) class  have access to all methods in Gerarbox ,eventhough it is marked as private
//2."this " inside innerclass refers to innerclass (Gear)
//3.If we have same varibale ,"gearNUmber", in both classes
//Gearbox.this.gearNumber -this is how to call Gearbox's gearNumber within a Gear intance since both classes have the varibale "gearNUmber'.
//otherwise this.gearNumber refers to Gear classes's variable
//4.the inner class(Gear) must be deaclaredd  private, only accessible to outer class(GearBox).No use otherwise(this is a best practice and realistic)
//e.g-Gearbox.Gear first=mclaren.new Gear(1,12.3);