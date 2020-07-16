 static int closestNumber(int a, int b, int x) {
        /*
         * Write your code here.
         */
         if(b==0){
             return 0;
         }
         if(a==1 && x==1){
             return 1;
         }
         int p = (int)(Math.pow(a,b));
         if(p<1){
             return 0;
         }
         else if(p%x==0){
             return p;
         }
         else{
             int ans = p/x;
             int ans1 = x*ans;
             int ans2 = x*(ans+1);
             if((p-ans1)>(ans2-p)){
                 return ans2;
             }
             else{
                 return ans1;
             }
         }
    }
