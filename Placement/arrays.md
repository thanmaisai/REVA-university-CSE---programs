
## powers of consecutive numbers
```
        int [] arr= {2,3,4,1,2,3};
        int sum = 1;
        for(int i=0;i<arr.length-1;i++){
            sum = sum + (int)Math.pow(arr[i],arr[i+1]);
        }
        System.out.print(sum);
```
