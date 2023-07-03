public class countZeorInNum {
    public static void main(String[] args) {
        System.out.println(countZero(140030089,0));
    }

    // my approach - take last digit and put in string and add next ele to string as 2nd digit
    static int countZero(int n,int count){

        if(n==0) return count;
        
        if(n%10==0) countZero(n/10,count++); // if 0 found inc count and pass
        return countZero(n/10,count); // if 0 not found just pass count
    }
}
