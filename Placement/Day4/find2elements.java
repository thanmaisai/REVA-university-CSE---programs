class find2elements{
    public static void main(String[] args) {
        int sum = 0;
        int target = 13;
        int [] arr = {2,7,11,15};
        for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length-1;j++){
            sum = arr[i]+arr[j];
            if(sum == target){
                System.out.println("["+i+","+j+"]");
            }
           }
        }
    }
}