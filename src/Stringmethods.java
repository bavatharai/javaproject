
public class Stringmethods {
	public static void main(String []args) {
		//create a String variable course name
		String coursename="software testing";
		//print original course name with detailed additional values
		System.out.println("my course name is :"+coursename);
		//remove unwanted spaces
		String courseName="  software testing  ";
		courseName=courseName.trim();
		System.out.println("after trim:"+ coursename);
		//convert to uppercase
		System.out.println("uppercase:"+coursename.toUpperCase());
		//convert to lowercase
		System.out.println("lowercase:"+coursename.toLowerCase());
		//use contains find (testing)is present in coursename
		System.out.println("contains tesing:"+coursename.contains("testing"));
		//use compare with equal method
		String coursename2="software testing";
	    System.out.println("compare result:"+coursename.equals(coursename2));
	}
}
