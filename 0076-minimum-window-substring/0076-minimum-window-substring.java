class Solution {
    public String minWindow(String s, String t) {
        if (s.length()<t.length())
            return "";
        
        Map<Character,Integer>cc=new HashMap<>();
        for(char ch:t.toCharArray())
            cc.put(ch, cc.getOrDefault(ch,0)+1);

        int maxl=t.length();
        int[] minwin={0,Integer.MAX_VALUE};
        int sti=0;
        for (int endi=0;endi<s.length();endi++){
            char ch=s.charAt(endi);
            if (cc.containsKey(ch)&&cc.get(ch)>0){
                maxl--;
            }
            cc.put(ch,cc.getOrDefault(ch,0)-1);

            if (maxl==0){
                while (true){
                    char cst = s.charAt(sti);
                    if (cc.containsKey(cst)&&cc.get(cst)==0){
                        break;
                    }
                    cc.put(cst,cc.getOrDefault(cst,0)+1);
                    sti++;
                }
                if (endi-sti < minwin[1]-minwin[0]){
                    minwin[0]=sti;
                    minwin[1]=endi;
                }
                cc.put(s.charAt(sti),cc.getOrDefault(s.charAt(sti),0)+1);
                maxl++;
                sti++;
            }
        }

        return minwin[1] >= s.length() ? "" : s.substring(minwin[0],minwin[1]+1);        
    }
}


//  if(s.length()<t.length())
//        return "";
//        char[] cc=new char[128];
//        for( char c: t.toCharArray()){
//             cc[c]++;
//        }
//         int req=t.length();
//         int l=0,r=0,minl=Integer.MAX_VALUE;
//         int[] res={0,0};
//         while(r<s.length()){
//             if(cc[s.charAt(r)]>0)
//             req--;
//             cc[s.charAt(r)]--;
//             r++;
           
//             while(req==0){
//                 if(minl>r-l){
//                     minl=r-l;
//                     res[0]=l;
//                     res[1]=r;
//                 }
//                 System.out.println(res[0]+" "+res[1]);
//             cc[s.charAt(l)]++;
//             if(cc[s.charAt(l)]>0)
//             req++;
//             l++;
//             }
//              System.out.println(s.substring(res[0],res[1]));
//         }
//         return minl==Integer.MAX_VALUE?"":s.substring(res[0],res[1]);

