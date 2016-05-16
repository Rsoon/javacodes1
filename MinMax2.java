class MinMax2 {
public static void main(String [] args) {
int nums[] = { 99, -10, 100101, 18, -99, 5628, -9, 287, 463, 49}; 
int min, max; 

min = max = nums[0]; 
for(int i = 1; i < 10; i ++) {
if(nums[i] < min) min = nums[i];
if(nums[i] > max) max = nums[i];
}
System.out.println("min and max: " + min + " " + max) ; 
	}
}


//This is the alternative way of writing a simple form of MinMax 

