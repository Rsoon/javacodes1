double fuelneeded(int miles) {
	return (double) miles / mpg; 
}

class Vehicle {
int passengers; 
int fuelcap; 
int mpg; 
//Return the range
int range() {
return mpg*fuelcap; 
}

//compute fuel needed for a given distance. 
double fuelneeded(int miles) {
return (double) miles / mpg; 
} 
} 

class CompFuel {
public static void main(String args[]) {
Vehicle minivan = new Vehicle(); 
Vehicle sportscar = new Vehicle(); 
double gallons; 
int dist = 252; 

//assign values to fields in minivan 
minivan.passengers = 7; 
minivan.fuelcap = 16; 
minivan.mpg = 21; 

//assign values to fields in sportscar
sportscar.passengers = 2; 
sportscar. fuelcap = 14; 
sportscar.mpg = 12;

gallons == minivaan.fuelneeded(dist); 
System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel"); 
gallons = sportscar.fuelneedded(dis); 
System.out.println("To go " + dist + " miles sportscar needs " + gallons + "  gallons of fuel. "); 
}
}
 
