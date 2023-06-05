


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
