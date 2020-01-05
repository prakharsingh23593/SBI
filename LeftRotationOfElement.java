package com.nt.nit;

import java.util.Arrays;

public class LeftRotationOfElement {
	private static void leftRotation(int[] array,int n) {
		System.out.println("input array before rotation");
		System.out.println(Arrays.toString(array));
		int temp;
		for(int i=0; i<n; i++) {
			temp=array[0];
			for(int j=0;j<array.length-1;j++) {
				array[j]=array[j+1];
			}
			array[array.length-1]=temp;
			}
		System.out.println("Input array Left Rotation by "+n+"Position:");
	System.out.println(Arrays.toString(array));
	}
	public static void main(String[] args) {
	
	leftRotation(new int[] {1,2,3,4,5,6},3)	;
	}
	
}
