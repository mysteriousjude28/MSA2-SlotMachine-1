package sample;

import java.util.Random;

/**
 * Created by forestnewark on 3/10/17.
 */
public class SlotMachine {

    public int getWheelOne() {
        return wheelOne;
    }

    public int getWheelTwo() {
        return wheelTwo;
    }

    public int getWheelThree() {
        return wheelThree;
    }

    private int wheelOne;
    private int wheelTwo;
    private int wheelThree;

    private void setWheels(){
        Random random = new Random();
        wheelOne = random.nextInt(10) +1;
        wheelTwo = random.nextInt(10) +1;
        wheelThree = random.nextInt(10) +1;
    }

    public void play() {
        setWheels();
    }

    public boolean didPlayerWin(){
        if (wheelOne == wheelTwo && wheelTwo == wheelThree) {

            return true;
        }else {
            return false;
        }
     }

      public boolean didBonusHit(){
         if (wheelOne == 7 && wheelTwo == 7 && wheelThree == 7) {
             return true;
         }else {
             return false;
         }
     }

    public boolean didTwoMatch(){
        if(wheelOne == wheelTwo || wheelOne == wheelThree){
            return true;
        }else {
            return false;
        }
     }

     public boolean didPlayerLose(){
          if(wheelOne != wheelTwo && wheelTwo != wheelThree) {
              return true;
          }else {
              return false;
          }
     }

}





