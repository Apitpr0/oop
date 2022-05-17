public class StringMethodQ3{

	public static void main(String[] args)
	{
		String str1 = "I like to eat Apple.";
		String str2 = "An Apple a day keeps the doctor away.";

		System.out.println(str1.concat(str2));
		System.out.println(str1.replace("I","You"));
		System.out.println(str2.replace("Apple","Durian"));
		System.out.println(str1.length());
		System.out.println(str2.length());
	    System.out.println(str1.indexOf("Apple"));
	    System.out.println(str2.indexOf("Apple"));
	}
}
