package de.bkukr.student.paul;

public class Main {

    public static void main(String[] args) {

	    TrafficLight tl = new TrafficLight(45);
	    TrafficLight tl2 = new TrafficLight(46, tl);

        tl.printState();

        tl.shiftRed(1);

        System.out.println(tl2.prevGreen());


    }


}
