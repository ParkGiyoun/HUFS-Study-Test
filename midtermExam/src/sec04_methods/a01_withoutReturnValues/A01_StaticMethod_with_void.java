package sec04_methods.a01_withoutReturnValues;
/*
 * You shoud NOT create static method for
 * 		An individual println statement.
 * 		Only blank lines.(Put blank printlns in main)
 * 		Unrelated or weakly related statements.
 * 			(Consider splitting them into two smaller methods)
 */
public class A01_StaticMethod_with_void {
	public static void main(String[] args) {
		System.out.println("Dear Customer: ");
		name();
		System.out.println();
		System.out.println("Welcome to Ulsan");
		System.out.println("Enjoy your trip");
		name();
	}

	public static void name() {
		System.out.print("Mr. Park,");
		System.out.print("From Korea\n");
	}
}