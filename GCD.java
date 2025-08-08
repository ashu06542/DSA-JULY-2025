class Solution {
    public static int gcd(int a, int b) {
       
       int min=Math.min(a,b);
       int max=Math.max(a,b);
        
        if(max%min<1) return min;
        
          return gcd(min,max%min);
    }
}
