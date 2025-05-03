class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    cycleSort(nums);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]!= i+1){
                list.add(i+1);
            }
           
        }
        
        return list;
    }
    public void cycleSort(int nums[]){
        int i =0;
        while(i < nums.length){
            
            int correct = nums[i]-1;
            if(nums[i]!= nums[correct]){
                swap(nums,i,correct);

            }
            else{
                i++;
            }
        }
    }
     void swap(int[] arr, int in1,int in2){
        int temp = arr[in1];
        arr[in1] = arr[in2];
        arr[in2] = temp;
    }
}