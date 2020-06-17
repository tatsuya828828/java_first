package java_practice;

public class Hello {
	public static void main(String[] args) {
		System.out.println("年齢を教えてください");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println(age+"歳なんですね");
	}
}
