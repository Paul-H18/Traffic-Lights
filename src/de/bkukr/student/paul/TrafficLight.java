package de.bkukr.student.paul;

public class TrafficLight {

    public enum state {
        OFF, YELLOW, GREEN, RED, BLINKING
    }

    public state currentState;
    int id, heir;
    public String r;

    public TrafficLight(int x, int y) {
        currentState = state.BLINKING;
        id = x;
        heir = y;
    }




    public void setRed(){
        currentState = state.RED;
    }

    public void setYellow(){
        currentState = state.YELLOW;
    }

    public void setGreen(){
        currentState = state.GREEN;
    }

    public void printState(){
        System.out.println("The Traffic Light's glowing: " + currentState);
    }

    public String getState(){

        switch(currentState){
            case GREEN:
                r = "The Traffic Light's glowing Green!";
                break;
            case YELLOW:
                r = "The Traffic Light's glowing Yellow!";
        }
        return r;
    }


    public int getHeir(){
        return heir;
    }



    public int getId(){
      return id;
    }


}
