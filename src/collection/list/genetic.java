package collection.list;

/*
import java.util.ArrayList;  //example.............
import java.util.List;

class employee{
	int id;
	String name;
	int number;
	
}
class student{
	List<employee> ls=new ArrayList<employee>();
}
*/
class product<t> {
	private t brand;

//	public t pack(t brand) {
	public void pack(t brand) {
		this.brand = brand;
//		return brand;
	}

	public t unpack() {
		return brand;
	}
}

class bag extends product {
	/*
	 * @Override public String toString() { return "bag [unpack()=" + unpack() +
	 * ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
	 * + super.toString() + "]"; }
	 */
	public String toString() {
		return "meera";
	}
}

class perfumes extends product {
	public String toString() {
		return "park avenue";
	}
}

public class genetic {
	public static void main(String[] args) {
		product<bag> p = new product();
		product<perfumes> q = new product();
		q.pack(new perfumes());
		p.pack(new bag());
		System.out.println(p.unpack());
		System.out.println(q.unpack());
//		System.err.println(p.pack(new bag()));
//		System.err.println(q.pack(new perfumes()));
	}
}
/*
 * class products<t>{
 *  private t Brand;
 *   public void pack(t Brand) {
 * this.Brand=Brand; 
 * }
 *  public String unpack() {
 *   return Brand;
 * 
 * } } 
 * class bag extends products{
 *  public String toString(){
 *   return "skybag"; 
 *   }
 * } class perfume extends products{
 *  public String toString() {
 *   return "park avenue"; 
 * } } public class genetic { 
 * public static void main(String[] args) { 
 * bag b=new bag();
 *  products.pack(new bag());
 * System.out.println(b.unpack);
 * 
 * }
 * 
 * }
 */
