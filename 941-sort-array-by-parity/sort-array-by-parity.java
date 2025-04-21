class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int s=0;
        int e=0;
        while(e< nums.length){
            if(nums[e] % 2 ==0){
                swap(nums,s,e);
                s++;
                e++;
            }else{
                e++;
            }
        }
        return nums;

        
    }
    public void swap(int[] nums,int first, int second){
        int temp= nums[first];
        nums[first]=nums[second];
        nums[second]= temp;
    }
}