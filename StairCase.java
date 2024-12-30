 public static void staircase(int n) {
   // Write your code here
    for(int i=1;i<=n;i++){
        for(int j=n;i<j;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("#");
        }
        System.out.println();
    }

    } 
