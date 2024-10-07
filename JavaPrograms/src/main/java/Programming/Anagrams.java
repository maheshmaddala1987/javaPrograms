package Programming;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "welcome";
	        char temp = 0;

	        char arr[] = str.toCharArray();
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i+1; j < arr.length; j++) {
	                if (arr[j] > arr[i]) {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	        
	        
	        String str1 = "comewel";
	        char tempp =0;
	        char arr1[]=str1.toCharArray();
	        for(int i =0;i<arr1.length;i++) {
	        	for(int j=i+1;j<arr1.length;j++) {
	        		if(arr1[j]>arr1[i]) {
	        			tempp = arr1[i];
	        			arr1[i] = arr1[j];
	        			arr1[j]=tempp;
	        		}
	        	}
	        }
	        
	        if(Arrays.equals(arr, arr1)) {
	        	System.out.println("anagrams");
	        }else {
	        	System.out.println("not");
	        }

	}

}
