 public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int leftSum =0;
    int RightSum=0;
    
   for(int i=0;i<arr.size();i++){
    leftSum+=arr.get(i).get(i);
   }
    
    for(int i=0;i<arr.size();i++){
        RightSum+=arr.get(i).get(arr.size()-1-i);
    }
    
    return Math.abs(leftSum-RightSum);
    }
