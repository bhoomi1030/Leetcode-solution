//use of monotonic range : this ques based on  BS on Answers
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int range[]=find_range(bloomDay);
        int start=range[0];
        int end=range[1];
        int ans=0;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(isPossible(mid,m,k,bloomDay)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;

            }
        }
        return ans;
        
    }
    public  boolean isPossible(int minDays,int m,int k,int[] bloomDay){
        int count =0;
        int total=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=minDays){
                count++;

            }else{
                count =0;

            }
            if(count==k){
                total++;
                count=0;
            }
            if(total>=m){
                return true;
            }

        }
        return false;

    }
    public  int[] find_range(int[] bloomDay){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int val : bloomDay){
           max= Math.max(max,val);
           min = Math.min(min,val);
        }
        return new int[]{min,max};
    }
}