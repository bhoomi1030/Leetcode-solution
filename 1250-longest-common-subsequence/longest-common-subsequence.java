class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m =text2.length();
        int dp[][] =new int[n+1][m+1];
        for(int i =0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return recur(n,m,text1,text2,dp);

        
    }
    int recur(int i ,int j ,String text1,String text2,int dp[][]){
        if(i==0||j==0){
            dp[0][0]=0;
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];

        }
        if(text1.charAt(i-1) == text2.charAt(j-1)){
           dp[i][j]=  1+ recur(i-1,j-1,text1,text2,dp);
           return dp[i][j];
        }
        else{
            int case1= recur(i-1,j,text1,text2,dp);
            int case2=  recur(i,j-1,text1,text2,dp);
            dp[i][j]= Math.max(case1,case2);
            return dp[i][j];

        }
    }
}