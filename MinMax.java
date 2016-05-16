class MinMax {
public static void main(String [] args) {
int nums[] = new int[10]; 
int min, max; 

nums[0] = 99; 
nums[1] = -10;
nums[2] = 100101; 
nums[3] = 18; 
nums[4] = -99; 
nums[5] = 5628; 
nums[6] = -9; 
nums[7] = 287; 
nums[8] = 463; 
nums[9] = 49; 

min = max = nums[0]; 
for(int i = 1; i < 10; i ++) {
if(nums[i] < min) min = nums[i];
if(nums[i] > max) max = nums[i];
}
System.out.println("min and max: " + min + " " + max) ; 
	}
}