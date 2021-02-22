public class Main {
    public static void main(String[] args) {
        Gearbox mclaren=new Gearbox(6);
        mclaren.oparateClutch(true);
        mclaren.changeGear(1);
        mclaren.oparateClutch(false);
        System.out.println(mclaren.wheelSpeed(1000));
        mclaren.changeGear(2);
        System.out.println(mclaren.wheelSpeed(3000));
        mclaren.oparateClutch(true);
        mclaren.changeGear(3);
        mclaren.oparateClutch(false);
        System.out.println(mclaren.wheelSpeed(6000));



















//        Gearbox.Gear first=mclaren.new Gear(1,12.3);//how to create an inner class instance but for this the inner class must be public(usually it's private)
//       // Gearbox.Gear first=Gearbox.Gear(1,12.3);//this won't work because for a non-static inner class we need an instance
//        System.out.println(first.driveSpeed(1000));

    }
}
