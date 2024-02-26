package travis_ci_tutorial_java;

public class SimpleCalculator {
	/*
	 * The following add method is utilized to add both the integers numbers and returns the results back to the calling functions.
	 */
	public int add(int a, int b){
		return a + b;
	}
	
	/*
	 * The following minus method is utilized to subtract both the integers numbers and returns the result back to the calling functions.
	 */
	public int minus(int a,int b){
		return a-b;
	}
	/*
	 * The following divide function is utilized to divide both the integers numbers and returns the results back the calling functions.
	 */
	public int divide(int a,int b)throws DivideByZeroException{
		if(b==0) {
			throw new DivideByZeroException();
		}
		return a/b;
	}
	/*
	 * The following multiply function is utilized to multiply both the integers numbers an returns the results back to the calling functions.
	 */
	public int multiply(int a,int b){
		return a*b;
	}
}
