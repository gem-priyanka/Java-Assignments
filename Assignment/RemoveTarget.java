// Given an array of integers and a target value,
//  write a Java program to remove all instances of that target value from the array in-place. 
//  Input: array = { 1, 5, 2, 3, 1, 6, 2, 3, 9 }, key = 3 Output: [1, 5, 2, 1, 6, 2, 9]



public class RemoveTarget {


    public static void removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0; i<nums.length-count; i++){
            if(nums[i]==val){
                count++;
                for(int j=i; j<nums.length-1; j++){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                i--;
            }
        }
        
        for(int k=0; k<nums.length-count; k++){
            System.out.print(nums[k]+" ");
        }
    }


    public static void main(String[] args) {
int [] array = { 1, 5, 2, 3, 1, 6, 2, 3, 9 };
int val =3;
 removeElement(array , val);
        
    }
}
