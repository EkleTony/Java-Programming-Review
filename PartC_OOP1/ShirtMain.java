
public class ShirtMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Shirt s = new Shirt();
		s.setColor("White");
		s.setSize("XL");
		s.putOn();
		
		
		System.out.println("Color "+s.color);
		System.out.println(s.size);
		
		// static 
		
		Friend friend1 = new Friend("Sponegbob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Squidward");
		Friend friend4 = new Friend("Squidward");

		
		Friend.displayFriends();
		

	}
 
}
