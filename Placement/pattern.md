```
    0
   101
  21012
 3210123
432101234

for (int i = 0; i <= n; i++) {
            
            //space
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }

            //reverse num
            for(int j = i; j >= 0; j--){
                System.out.print(j);
            }

            // num
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
```
