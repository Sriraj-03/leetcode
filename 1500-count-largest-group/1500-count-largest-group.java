class Solution {
    public int countLargestGroup(int n) {
        if(n<10)
        return n;
        Map<Integer,Integer> has=new HashMap<>();
        int maxsz=-1;
        for(int i=1;i<=n;i++){
            int sum=digitsum(i);
            has.put(sum,has.getOrDefault(sum,0)+1);
            maxsz=Math.max(maxsz,has.get(sum));
        }
        int c=0;
        for(Integer i: has.values()){
            if(i==maxsz)
            c++;
        }
        return c;
    }
        public int digitsum(int n){
        int c=0;
        while(n>0){
            int rem=n%10;
            c=c+rem;
            n=n/10;
        }
        return c;
    }
}

// <10-n
// >10{


    //   ArrayList<Integer> arr=new ArrayList<>();
    //   for(int i=1;i<=n;i++){
    //     arr.add(digitsum(i));
    //   }
    //  Collections.sort(arr);
    //  int len=arr.size();
    //  int[] freq=new int[len-1];
    //  for(Integer i:arr){
    //     freq[i]++;
    //  }
    //  Arrays.sort(freq);
    //  int great=0;
    //     for(int i=1;i<len;i++){
    //         if(freq[i])
    //     }
    // }
    // public int digitsum(int n){
    //     int c=0;
    //     while(n>0){
    //         int rem=n%10;
    //         c++;
    //         n=n/10;
    //     }
    //     return c;
    // }