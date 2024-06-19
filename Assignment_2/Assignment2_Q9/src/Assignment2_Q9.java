
public class Assignment2_Q9 {
	
	public static void main(String[] args) {
		
		String postfix = "100 200 + 2 / 5 * 7 +";
		
		int ans = postfixtoinfix(postfix);
		

		System.out.println("Answer after postfix Evaluation - " + ans);

		String prefix = "+ 12 * 5 10";
		
		ans = prefixtoinfix(prefix);

		System.out.println("Expression after prefix Evaluation - " + ans);
			
		
	}
	
	
	
	public static int calculate(int operand1, String operator, int operand2) {
		switch(operator) {
		case "+": return operand1 + operand2;
		case "-": return operand1 - operand2;
		case "*": return operand1 * operand2;
		case "/": return operand1 / operand2;
		case "%": return operand1 % operand2;
		case "^": return (int) Math.pow(operand1, operand2);
		}
		return 0;
	}

	public static int postfixtoinfix(String expression) {
		String arr[] = expression.split(" ");
		Stack s = new Stack(arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/")) {
				int operand2 = s.pop();
				int operand1 = s.pop();
				int operation = calculate(operand1, arr[i], operand2);
				s.push(operation);
			}
//			else if(Integer.parseInt(arr[i]) >= 10 && Integer.parseInt(arr[i]) <= 99) {
			else {
				s.push(Integer.parseInt(arr[i]));
			}
	
		}
		if(!(s.isEmpty())) {			
			return s.pop();
		}
		return 0;
		
	}



	public static int prefixtoinfix(String expression) {
		String arr[] = expression.split(" ");
		Stack s = new Stack(arr.length);
		
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/")) {
				String operator = arr[i];
				int operand1 = s.pop();
				int operand2 = s.pop();
				int operation = calculate(operand1, operator, operand2);
				s.push(operation);
			}
//			else if(Integer.parseInt(arr[i]) >= 10 && Integer.parseInt(arr[i]) <= 99) {
			else {
				s.push(Integer.parseInt(arr[i]));
			}
	
		}
		if(!(s.isEmpty())) {			
			return s.pop();
		}
		return 0;
		
	}

}
