class FibTab{
    int fib(int n){
        if(n<=1){
            return n;
        }
        int[] table=new int[n+1];
        table[0]=0;
        table[1]=1;
        for(int i=2;i<=n;i++){
            table[i]=table[i-1]+table[i-2];
        }
        return table[n];
    }
    public static void main(String ars[]){
        int n=10;
        System.out.println("fibonacci:"+fib(n));
    }

    
}