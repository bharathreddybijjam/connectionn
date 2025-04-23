package collection.list;
class vehicle{
	public static <t> void Array(t[] array) {
		for(t car: array) {
			System.out.println(car +" ");
		}
	}
}
public class genetic_method {
	public static void main(String[] args) {
		Integer[] j= new Integer[9];
		for(int i=0;i<9;i++) {
			j[i]=i;
		}
		vehicle.Array(j);
//		String [] s= {"hi","its","bmw"};
//		vehicle.Array(i);
//		vehicle.Array(s);
	}
}
