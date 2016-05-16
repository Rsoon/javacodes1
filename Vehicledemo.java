
class Vehicle {
	int passengers; 
	int fuelcap; 
	int mpg; 
}
/*A program that uses the Vehicle class. Call this file Vehicledemo.java */
//this is a Vehicledemo class

public class Vehicledemo {
public static void main(String args[]) { 
Vehicle minivan = new Vehicle(); 
int range; 

//assign values to fiels in minivan
minivan.passengers = 7; 
minivan.fuelcap = 16; 
minivan.mpg = 21; 
 
 //compute the range assuming a full tank of gas
 range = minivan.fuelcap * minivan.mpg; 
 System.out.println("Minivan can carry " + minivan.passengers + " with a ranfe of " + range); 
 } 
 }
 
 
 class Vehicle { 
int passengers; 
int fuelcap; 
int mpg; 

//display the range 
void range() {
System.out.println("Range is " + fuelcap * mpg); 
}
}



