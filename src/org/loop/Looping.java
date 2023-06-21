package org.loop;

import java.util.Scanner;

public class Looping {
public static void main(String[] args) {
	// this is new commit
	/*for (int i = 0; i > -10; i--) 
		System.out.println(i);
	}*/
	
// even numbers
	
	/*for (int i = 0; i < 20; i++) {
		if (i%2==0) {
			System.out.println(i);
		}}*/

//odd numbers
	
	/*for (int i = 0; i < 20; i++) {
		if (i%2==1) {
			System.out.println(i);
		}}*/
	
// Check the prime numbers
	
	/*Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number to check whether it is a Prime");
	
	int number = sc.nextInt();
	int i=2;
		while (i<number) {
		
		if (number%i==0) {
			System.out.println("Given number is not Prime");
			i=i+1;
			break;
		} else { System.out.println("Given number is prime");
			break;
		}}
	}}*/

// Print first 20 Prime numbers
	int a = 10;
	int b= 20;
	int temp=a;
	a = b;
	b = temp;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println("new commit");

}}