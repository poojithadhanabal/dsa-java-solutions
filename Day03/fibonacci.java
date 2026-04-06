class Solution {
    public int fib(int n) {
        int ans=0;
        if(n==0 || n==1){
            ans= n;
        }
        if(n>1){
            ans= fib(n-1)+fib(n-2);
        }
        return ans;
    }
}