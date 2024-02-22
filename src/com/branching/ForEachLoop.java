package com.branching;

public class ForEachLoop {

	public static void main(String[] args) {
		//array declare->foreach loop->java version 5->
//		enhanced for loop ->iterate through collection or array element 
		int array[]= {10,20,30,40,50};
		
		
		for(int element:array) {
			System.out.println(element+" ");
		}
	}

}

//for loop->both the type of data single value or groupof values
//for each->it works only with collection or array
//
//for loop->we can use condition like if else break.
//foreach->you can not use with condition.
