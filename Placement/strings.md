


## string palandrome
```
Scanner sc= new Scanner(System.in);
String str = sc.nextLine();
str = str.toUpperCase();
StringBuffer sb=new StringBuffer(str);
sb.reverse();
if(str.equals(sb.toString())){
    System.out.print("Palandrome");
}else{
    System.out.print(" Not Palandrome");
}
```

## shift the character by the key
```
        String str="abcz";
        int key = 4;
        for(int i=0;i<str.length();i++){
            int ch = str.charAt(i) + key;
            while(ch > 'z'){
                ch-=26;
            }
           System.out.print((char)ch);
        }
```
