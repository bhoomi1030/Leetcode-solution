class Solution {
    public int[] findEvenNumbers(int[] digits) {
    List<Integer>  result = new ArrayList<>();
    int[] map = new int[10];

    for(int digit: digits){
        map[digit]++;
    }
    for(int i =1;i<=9;i++){
        if(map[i]==0) continue;
        map[i]--;
        for(int j =0;j<=9;j++){
            if(map[j]==0) continue;
        map[j]--;
            for(int k =0;k<=8;k+=2){
                if(map[k]==0) continue;
        map[k]--;

        int num=i*100+j*10+k;
        result.add(num);

        map[k]++;


            }
            map[j]++;
        }
        map[i]++;
    }
    int[] resultFinal = new int[result.size()];
    for(int i =0;i<result.size();i++){
        resultFinal[i]= result.get(i);
    }
    return resultFinal;
  
        
    }
}