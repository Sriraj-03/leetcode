class Solution {
    public String countAndSay(int n) {
        if(n==1)
        return "1";

        List<Character> cs=new ArrayList<>();
        cs.add('1');
        for(int i=2;i<=n;i++){
            List<Character> ns=new ArrayList<>();
            int c=1;
            for(int j=1;j<cs.size();j++){
                if(cs.get(j)==cs.get(j-1))
                c++;
                else{
                    ns.add((char)(c+'0'));
                    ns.add(cs.get(j-1));
                    c=1;
                }

            }
            ns.add((char)(c+'0'));
            ns.add(cs.get(cs.size()-1));
            cs=ns;
        }
        StringBuilder res=new StringBuilder();
        for(char c:cs){
            res.append(c);
        }
        return res.toString();
    }
}