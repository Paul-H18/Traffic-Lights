package de.bkukr.student.paul;

public class TrafficLight {

    public enum state {
        OFF, YELLOW, GREEN, RED, BLINKING
    }

    public state currentState;
    int id;
    public int time = 2;
    TrafficLight previous;


    public String r;

    public TrafficLight(int ID) {
        currentState = state.BLINKING;
        id = ID;
    }

    public TrafficLight(int ID, TrafficLight prev) {
        currentState = state.BLINKING;
        id = ID;
        previous = prev;
    }


    private void setRed() {
        currentState = state.RED;
    }

    private void setYellow() {
        currentState = state.YELLOW;
    }

    private void setGreen() {
        currentState = state.GREEN;
    }

    private void setBlinking() {
        currentState = state.BLINKING;
    }

    private void turnOff() {
        currentState = state.OFF;
    }

    public void printState() {
        System.out.println("The Traffic Light's glowing: " + currentState);
    }

    public String getState() {

        switch (currentState) {
            case GREEN:
                r = "The Traffic Light's glowing Green!";
                break;
            case YELLOW:
                r = "The Traffic Light's glowing Yellow!";
                break;
            case RED:
                r = "The Traffic Light's glowing Red!";
                break;
            case BLINKING:
                r = "The Traffic Light's blinking!";
                break;
            case OFF:
                r = "The Traffic Light isn't glowing!";
                break;
        }
        return r;
    }

    public int getID() {
        return id;
    }

    public void setID(int x) {
        id = x;
    }


    public void shiftRed(int x) {
        setGreen();
        printState();
        try{
            Thread.sleep(x*3000);
        } catch (InterruptedException e){}
        setYellow();
        printState();
        try{
            Thread.sleep(x*1000);
        } catch (InterruptedException e){}
        setRed();
        printState();
    }

    public void shiftGreen(int x) {
        setRed();
        printState();
        try{
            Thread.sleep(x*3000);
        } catch (InterruptedException e){}
        setYellow();
        printState();
        try{
            Thread.sleep(x*1000);
        } catch (InterruptedException e){}
        setGreen();
        printState();
    }

    public boolean prevGreen() {
        if(previous.currentState == state.GREEN){
            return true;
        } else {
            return false;
        }
    }

    public boolean prevRed() {
        if(previous.currentState == state.RED){
            return true;
        } else {
            return false;
        }
    }

    public void equalWithPrev() {
        switch (previous.currentState){
            case RED:
                setRed();
            case YELLOW:
                setYellow();
            case GREEN:
                setGreen();
            case BLINKING:
                setBlinking();
            case OFF:
                turnOff();
        }
    }



}



