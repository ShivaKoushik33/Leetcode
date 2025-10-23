class Solution {
    public String calculate(String s){
        StringBuilder ans=new StringBuilder();
        
        for(int i=0;i<s.length()-1;i++){
            int d1=s.charAt(i)-'0';
            int d2=s.charAt(i+1)-'0';
            int temp=(d1+d2)%10;
            ans.append(temp);
        }
        System.out.println(ans);
        return ans.toString();

    }

    public boolean hasSameDigits(String s) {
        
        while(s.length()>2){
            s=calculate(s);
        }
        

        return s.charAt(0)==s.charAt(1);
    }
}