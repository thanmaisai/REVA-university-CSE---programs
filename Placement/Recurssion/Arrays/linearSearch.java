package Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int arr[]={1,66,2,4,66,79};
        int key =  66;
        System.out.println(findFirstIndex(arr,key,0));
        System.out.println(FindLastIndex(arr,key,arr.length-1));
    }

    // search for a first occurance
    static int findFirstIndex(int [] arr, int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i; //1
        }
        return findFirstIndex(arr, key, i+1);
    }

    // search for a last occurance
    static int FindLastIndex(int [] arr, int key,int i){
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i; //4
        }
        return FindLastIndex(arr, key, i-1);
    }
}
