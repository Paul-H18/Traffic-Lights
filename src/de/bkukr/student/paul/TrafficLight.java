package de.bkukr.student.paul;

public class TrafficLight {

    public enum state {
        OFF, YELLOW, GREEN, RED, BLINKING
    }

    public state currentState;
    int id, heir;
    public int time = 2;


    public String r;

    public TrafficLight(int x, int y) {
        currentState = state.BLINKING;
        id = x;
        heir = y;
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


    public int getHeir() {
        return heir;
    }

    public int getID() {
        return id;
    }

    public void setID(int x) {
        id = x;
    }

    public void setHeirByID(int x){
        heir = x;
    }

    public void shiftRed(int x){
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

    public void shiftGreen(int x){
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





}



