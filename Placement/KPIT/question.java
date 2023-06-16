class question{
    public static void main(String[] args) {
     int num = 0021;
     System.out.println(num);
     StringBuilder sb = new StringBuilder(Integer.toString(num));
     for(int i=0;i<sb.length();i++){
         if(sb.charAt(i)=='0'){
             sb.setCharAt(i,'1');
         }
     }
     System.out.println(Integer.parseInt(sb.toString()));
    }
    
}