package com.gl.q1;

/*	Q1. Write a program of Balancing Brackets,use a suitable data structure to print whether the string entered is a
//		Balanced Brackets or unbalanced String	*/

import java.util.Deque;
import java.util.ArrayDeque;
public class BalancedBrackets {
		//	The checking of the brackets, if they are balanced or not, starts at this point. 
	public static boolean areBracketsBalanced(String expression)	{
		Deque<Character> stack=new ArrayDeque<Character>();
	for(int i=0;i< expression.length();i++)		{
			char x=expression.charAt(i);
	if(x=='('|| x=='['|| x=='{')	{
		stack.push(x);
		continue;	}
	if(stack.isEmpty())
			return false;
		char check;
		switch(x)		
{
		case ')':
			check=stack.pop();
	if(check=='{'|| check=='[')
		return false;
		break;
		case '}':
			check=stack.pop();
	if(check=='('||check=='[')
		return false;
		break;
		case ']':
			check=stack.pop();
	if(check=='('||check=='{')
		return false;
		break;
}
}
//		The check of whether the stack is empty or not is done at this point. 
	return (stack.isEmpty());
}
}