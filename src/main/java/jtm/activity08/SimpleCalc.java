package jtm.activity08;

// TODO implement basic mathematical operations with int numbers in range
// of [-10..+10] (including)
// Note that:
// 1. input range is checked using assertions (so if they are disabled, inputs can be any int)
// 2. outputs are always checked and exception is thrown if it is outside proper range

public class SimpleCalc {

	static final int low = -10;
	static final int high = 10;

	// TODO specify that method can throw SimpleCalcException
	public static int add(int a, int b) throws SimpleCalcException {
		validateInput(a, b);
		return validateOutput(a, b, "+");
	}

	// TODO specify that method can throw SimpleCalcException
	public static int subtract(int a, int b)  throws SimpleCalcException {
		validateInput(a, b);
		return validateOutput(a, b, "-");
	}

	// TODO specify that method can throw SimpleCalcException
	public static int multiply(int a, int b) throws SimpleCalcException {
		validateInput(a, b);
		return validateOutput(a, b, "*");
	}

	// TODO specify that method can throw SimpleCalcException
	public static int divide(int a, int b) throws SimpleCalcException {
		// TODO implement divide operation
		validateInput(a, b);
		return validateOutput(a, b, "/");
	}

	// TODO: 1 specify that method can throw SimpleCalcException
	// TODO: 2 Validate that inputs are in range of -10..+10 using assertions
	// Use following messages for assertion description if values are not in
	// range:
	// "input value a: A is below -10"
	// "input value a: A is above 10"
	// "input value b: B is below -10"
	// "input value b: B is above 10"
	// "input value a: A is below -10 and b: B is below -10"
	// "input value a: A is above 10 and b: B is below -10"
	// "input value a: a is below -10 and b: B is above 10"
	// "input value a: a is above 10 and b: B is above 10"
	//
	// where: A and B are actual values of a and b.
	//
	// hint:
	// note that assert allows only simple boolean expression
	// (i.e. without &, |, () and similar constructs).
	// therefore for more complicated checks use following approach:
	// if (long && complicated || statement)
	// assert false: "message if statement not fulfilled";

	// TODO: 3 Catch assertion errors and wrap them in SimpleCalcExceptions with
	// message "Assertion error" and caught assertion error as a cause.
	private static void validateInput(int a, int b) throws SimpleCalcException {
		try {
			if (a < low && b < low)
				assert false: "input value a: " + a + " is below "+low+" and b: " + b + " is below "+low;
			if (a > high && b < low)
				assert false: "input value a: " + a + " is above "+high+" and b: " + b + " is below "+low;
			if (a < low && b > high)
				assert false: "input value a: " + a + " is below "+low+" and b: " + b + " is above "+high;
			if (a > high && b > high)
				assert false: "input value a: " + a + " is above "+high+" and b: " + b + " is above "+high;

			if (a < low)
				assert false : "input value a: " + a + " is below "+low;
			if (a > high)
				assert false : "input value a: " + a + " is above "+high;
			if (b < low)
				assert false : "input value b: " + b + " is below "+low;
			if (b > high)
				assert false : "input value b: " + b + " is above "+high;
		} catch (AssertionError e) {
			throw new SimpleCalcException("Assertion error", e);
		}
	}

	// TODO use this method to check that result of operation is also in
	// range of -10..+10.
	// If result is not in range:
	// throw SimpleCalcException with message:
	// "output value a oper b = result is above 10"
	// "output value a oper b = result is below -10"
	// where oper is +, -, *, /
	// Else:
	// return result
	// Hint:
	// If division by zero is performed, catch original exception and create
	// new SimpleCalcException with message "division by zero" and add
	// original division exception as a cause for it.


	private static int validateOutput(int a, int b, String operation) throws SimpleCalcException {
		int res = 0;
		try {
			switch (operation) {
				case "+":
					res = a + b;
					break;
				case "-":
					res = a - b;
					break;
				case "*":
					res = a * b;
					break;
				case "/":
					res = a / b;
					break;
			}
		} catch (Exception e) {
			throw new SimpleCalcException("division by zero", e);
		}

		if (res < low) {
			throw new SimpleCalcException("output value " + a + " " + operation + " " + b + " = " + res + " is below "+low);
		}
		if (res > high) {
			throw new SimpleCalcException("output value " + a + " " + operation + " " + b + " = " + res + " is above "+high);
		}
		return res;
	}
}
