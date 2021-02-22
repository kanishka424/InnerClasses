




import java.awt.*;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();

            }
        }
    }
}







//public class Main {
//    public static void main(String[] args) {
//        Gearbox mclaren=new Gearbox(6);
//        mclaren.oparateClutch(true);
//        mclaren.changeGear(1);
//        mclaren.oparateClutch(false);
//        System.out.println(mclaren.wheelSpeed(1000));
//        mclaren.changeGear(2);
//        System.out.println(mclaren.wheelSpeed(3000));
//        mclaren.oparateClutch(true);
//        mclaren.changeGear(3);
//        mclaren.oparateClutch(false);
//        System.out.println(mclaren.wheelSpeed(6000));
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////        Gearbox.Gear first=mclaren.new Gear(1,12.3);//how to create an inner class instance but for this the inner class must be public(usually it's private)
////       // Gearbox.Gear first=Gearbox.Gear(1,12.3);//this won't work because for a non-static inner class we need an instance
////        System.out.println(first.driveSpeed(1000));
//
//    }
//}
