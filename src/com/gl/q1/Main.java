package com.gl.q1;

import java.util.Stack;
import java.util.Scanner;


	public class Main {
	public static void main(String[] args) 
	{
				Scanner var=new Scanner(System.in);
			String expression;
				System.out.println("Input the expression to be checked here: ");
			expression=var.nextLine();
			//   The method is called here
			BalancedBrackets balancedbracket=new BalancedBrackets();
	boolean answer=balancedbracket.areBracketsBalanced(expression);
	if(answer)
			System.out.println("Voila! The brackets are balanced!: ");
		else
			System.out.println("Oops! The brackets are unfortunately not balanced: ");
	}
}