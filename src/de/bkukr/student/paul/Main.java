package de.bkukr.student.paul;

public class Main {

    public static void main(String[] args) {

	    TrafficLight tl = new TrafficLight(45);
	    TrafficLight tl2 = new TrafficLight(46, tl);

        tl.shiftRed(0);

        tl2.equalWithPrev();

        System.out.println("Status TL: " + tl.getState());
        System.out.println("Status TL2: " + tl2.getState());


    }


}
