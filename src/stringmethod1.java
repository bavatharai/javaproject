
public class stringmethod1 {
	public static void main(String []args) {
		String countryname="india";
		System.out.println("my country name is:"+countryname);
		String countryName="  india ";
		countryname=countryname.trim();
		System.out.println("after trim:"+countryname);
		System.out.println("uppercase:"+countryname.toUpperCase());
		System.out.println("lowercase:"+countryname.toLowerCase());
		System.out.println("contains try:"+countryname.contains("try"));
		String Countryname2="india";
		System.out.println("compare result:"+countryname.equals( Countryname2));
	}

}

