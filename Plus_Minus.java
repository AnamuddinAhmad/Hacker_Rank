// Write your code here
        int positive = 0;
        int negative =0;
        int zero=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0){
                positive+=1;
            }else if(arr.get(i)<0){
                negative+=1;
            }else{
                zero+=1;
            }
        }
        
        System.out.println((float) positive/arr.size());
        System.out.println((float)negative/arr.size());
        System.out.println((float)zero/arr.size());
    }

}
