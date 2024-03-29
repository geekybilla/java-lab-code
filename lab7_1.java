//1. Aim of the program - Write a Java program to generate an
//ArrayIndexOutofBoundsException and handle it using catch statement.
//Input: Enter the numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
//Output: Exception in thread “main” java.lang.ArrayIndexOutOfBoundsException:4

import java.util.*;

class lab7_1{
	public static void main(String[] args){
		try{ 
			int x[]={1,2,3,4};
			x[5]=5;
			}catch(ArrayIndexOutOfBoundsException e){
					System.out.println(e);
				}
		
		}
	}
