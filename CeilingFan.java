import java.util.Scanner;
/*
*
* Developed by Jacob Thomas
*
* */
public class launchFan {

    /*
    Upon execution, initially start with:
    - Speed     - [0] (Off)
    - Rotation  - [Clockwise]
    */
    public static void main(String []args) {

        System.out.println("Starting speed at: [0]\rStarting direction: [clockwise] \r\n");

        runFan();
    }

    public static void runFan() {

        int speed = 0;
        String returnDirection;
        String directionTest;
        String speedTest;
        boolean direction = true;
        //Used to retrieve input from user
        Scanner mySpeed = new Scanner(System.in);
        Scanner myDirection = new Scanner(System.in);

        while (true) {
            //Get speed user input, modify based off results
            System.out.println("\r\n\r\nModify Speed? - [Y] for Yes or [N] for No, or [Q] to quit:");
            speedTest = mySpeed.nextLine();
            if(speedTest.toUpperCase().equals("Y")) {
                if(speed == 3) {
                    speed = 0;
                } else
                    speed++;
            } else if(speedTest.toUpperCase().equals("Q")) {
                break;
            }

            //Get direction user input, toggle boolean if Y
            System.out.println("Switch Direction? - [Y] for Yes or [N] for No:");
            directionTest = myDirection.nextLine();
            if(directionTest.toUpperCase().equals("Y")) {
                direction = !direction;
            }

            if(direction)
                returnDirection = "[clockwise]";
            else
                returnDirection = "[counter-clockwise]";

            System.out.println("\r\nCurrent Speed: " + speed + "\nCurrent Direction: " + returnDirection + "\r\n");
        }
    }
}