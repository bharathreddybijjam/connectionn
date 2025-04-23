/*
package collection.list;
class comparing {
	public static <a> boolean compare(a a1,a a2) {
		return a1.equals(a2);
		
	}
}
public class genetic_prog2 {
	public static void main(String[] args) {
		comparing c=new comparing();
		boolean b=c.compare(7, 7);
		System.out.println(b);
		System.out.println(c.compare("rahul", "car take"));
	}

}
*/


// registration of genetic
package collection.list;
class comparing{
	public static <a> boolean compare(a password,a confirm_password) {
		return password.equals(confirm_password);
	}
}
public class genetic_prog2{
	public static void main(String[] args) {
		comparing c=new comparing();
		System.out.println(c.compare("hfdsh", "hfdsh"));
	}
}