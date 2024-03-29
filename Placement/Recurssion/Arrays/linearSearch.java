package Arrays;

import java.util.ArrayList;
import java.util.List;

public class linearSearch {
    public static void main(String[] args) {
        int arr[]={1,66,2,4,66,79};
        int key =  66;
        System.out.println(findFirstIndex(arr,key,0));
        System.out.println(FindLastIndex(arr,key,arr.length-1));
        FindAllIndex(arr,key,0);
        System.out.println(list);
        ArrayList<Integer> newList= new ArrayList<>();
        System.out.println(FindAllIndexhere(arr,key,0,newList));
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

     // search for a all the occurance's of a key
    static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllIndex(int [] arr, int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            list.add(i); 
        }
        FindAllIndex(arr, key, i+1);
    }


    // another approach to return a list directly and print it
    static ArrayList FindAllIndexhere(int [] arr, int key,int i,ArrayList<Integer> newList){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==key){
            newList.add(i); 
        }
        return FindAllIndexhere(arr, key, i+1,newList);
    }
}
