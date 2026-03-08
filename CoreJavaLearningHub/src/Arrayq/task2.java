package Arrayq;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task2 {

	public static void main(String[] args) {

		int [] are = {10,50,5,2,3,8,9,100};
		
		for(int i=0;i<are.length-1;i++) {
			for(int k =0; k<are.length-1;k++) {
				if(are[k]< are[k+1]) {
					int temp = are [k];
					are [k] = are [k+1];
					are [k+1] = temp;
					
				}
			}
		}
		for (int i = 0; i < are.length; i++) {
            System.out.print(are[i] + " ");
	}

}}