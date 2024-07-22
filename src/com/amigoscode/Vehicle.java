package com.amigoscode;

public interface Vehicle {
//    constants
double PURCHASE_RATE = 0.5;
//    abstract methods
void move(int amount);
void applyBreaks(int amount);
int getCurrentSpeed();
//     default methods
   default double milesToKm(){
      return  getCurrentSpeed() * 1.69;
   }

//   static methods

}
