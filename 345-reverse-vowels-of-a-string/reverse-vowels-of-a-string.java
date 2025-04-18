class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(!isVowels(arr[i])){
                i++;
                continue;
            }
            if(!isVowels(arr[j])){
                j--;
                continue;
            }
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;



        }
        return new String(arr);
        
    }
    public boolean isVowels(char c){
        return "AEIOUaeiou".indexOf(c)!=-1;
    }
}