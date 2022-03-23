//Sumber: https://www.geeksforgeeks.org/stack-set-2-infix-to-postfix/ 

import java.util.Stack;

public class Prefix {
	// menetapkan nilai/bobot dari operator
	public int Prec(char ch){
		switch (ch)
		{
		case '+':
		case '-':
			return 1;
	
		case '*':
		case '/':
			return 2;
	
		case '^':
			return 3;
		}
		return -1;
	}
	
	public String infixToPostfix(String exp){
		// inisialisasi result untuk menyimpan ouput
		String result = "";
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i<exp.length(); i++)
		{
			char c = exp.charAt(i);
			
			// jika char merupakan huruf/angka maka akan langsung disimpan di result
			if (Character.isLetterOrDigit(c))
				result += c;
			
			// jika ( maka disimpan di stack
			else if (c == '(')
				stack.push(c);
			
			// jika ')', program akan mencari '(' di stack, lalu mengeluarkannya.
			else if (c == ')')
			{
				while (!stack.isEmpty() &&
						stack.peek() != '(')
					result += stack.pop();
				
					stack.pop();
			}
			// saat operator ditemukan dan stack memiliki isi maka program perbandingan bobot nilai akan berjalan
			else
			{
				while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){ // , -
					result += stack.pop();
			}
				stack.push(c);
			}
	
		}
	
		// mengembalikan isi stack ke result untuk nantinya dicetak
		while (!stack.isEmpty()){
			if(stack.peek() == '(')
				return "Operasi tidak tepat!";
			result += stack.pop();
		}
		return result;
	}
}
