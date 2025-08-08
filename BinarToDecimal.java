// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        
        int num=0;
        int x=0;
        
        for(int i=b.length()-1; i>=0; i--){
            
          
            
            num+=Integer.valueOf(b.charAt(i)+"")*Math.pow(2,x);
            
            
            x++;
            
            
        }
        
        return num;
    }
}
