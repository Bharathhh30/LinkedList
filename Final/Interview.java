import java.util.Arrays;
import java.util.HashMap;

public class Interview {
    public static void main(String[] args) {
        
        // Q1
        // int[] arr =  {4, 8, 2, 9, 5};
        // int max = -1;

        // for(int i : arr){
        //     if (i>max){
        //         max = i;
        //     }
        // }
        
        // System.out.println(max);

        // Q2 & Q3
        // int[] arr = {1, 2, 3, 2,3,4,5,1};

        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i : arr){
        //     if(map.containsKey(i)){
        //         int a = map.get(i);
        //         map.put(i, ++a);
        //     }else{
        //         map.put(i, 1);
        //     }
        // }

        // System.out.println(map);
        // for(Integer key : map.keySet()){
        //     if(map.get(key)!=1){
        //         System.out.println(key + " not duplicate ");
        //     }
        // }

        // Q4
        // int[] arr = {4, 5, 1, 2, 0, 4, 5};
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i:arr){
        //     if(map.containsKey(i)){
        //         int a = map.get(i);
        //         map.put(i, ++a);
        //     }else{
        //         map.put(i, 1);
        //     }
        // }

        // for(Integer key : map.keySet()){
        //     if(map.get(key)==1){
        //         System.out.println(map.get(key));
        //         break;
        //     }
        // }

        // Q5
        // int[] arr = {1, 2, 3, 4};
        // int n = arr.length;
        // int l = 0;
        // int r = n-1;
        // for(int i=0;i<n/2;i++){
        //     int temp = arr[l];
        //     arr[l] = arr[r];
        //     arr[r] = temp;
            
        //     l+=1;
        //     r-=1;
        // }


        // System.out.println(Arrays.toString(arr));
        
        // Q6
        // int[] arr = {1, 2, 3,4, 5,7};
        
        // int n = arr.length;
        // n = arr[n-1];
        // int totalSum = n*(n+1) / 2;

        // int sum = 0;
        // for(int i : arr){
        //     sum+=i;
        // }

        // System.out.println(totalSum-sum);

        // Q7 two sum
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        // int left = 0;
        // int right = arr.length-1;

        // while(left<right){
        //     if(arr[left]+arr[right]==target){
        //         System.out.println(left+" "+right);
        //         break;
        //     }else if(arr[left]+arr[right]>target){
        //         right--;
        //     }else{
        //         left++;
        //     }
        
        // }

        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i=0;i<arr.length;i++){
        //     int complement =  target - arr[i];

        //     if (map.containsKey(complement)){
        //         System.out.println(map.get(complement) + " " + i);  // index of complement and current
        //         break;
        //     }

        //     map.put(arr[i], i);
        // }

        // Q8 - Longest Substring without repeating characters
        String s = "bbbbb" ; 

        HashMap<Character,Integer> map = new HashMap<>();
        
        int left = 0;
        
        int maxLen = 0;

        for(int right = 0;right<s.length();right++){
            char c = s.charAt(right);
            
            if(map.containsKey(c)){
                left = Math.max(left, map.get(c)+1);
            }

            map.put(c, right);
            maxLen = Math.max(maxLen, right-left+1);
        }
        System.out.println(maxLen);
    }
}
