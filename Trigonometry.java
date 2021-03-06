
public class Point {
	 private int ab;
	 private int ord;
	 public Point() {
	 	ab = 0;
	 	ord = 0;
	 	}
	  public Point(int ab) {
	 		this.ab = ab;
	 		this.ord = ab;
	 }
	 
	 public	Point(int ab, int ord) {
	 		this.ab = ab;
	 		this.ord = ord;
	 	}
	 
	 	public Point symertie() {
	 
	 		return new Point(-ab, ord);
	 
	 	}
	 
	public String toString() {
	 		return "(" + ab + ", " + ord + ")";
	 	}
	 
	 	public void setAbs(int ab) {
	 		this.ab = ab;
	 	}
	 
	 	public void setOrd(int ord) {
	 		this.ord = ord;
	 	}
	 
	 	public float getAb() {
	 		return ab;
	 	}
	
	 	public float getOrd() {
	 		return ord;
	 }}
   //
   
public class Sagment {

	public Point A = new Point();
	public Point B = new Point();

	public Sagment(Point A, Point B) {
		this.A = A;
		this.B = B;

	}
	public Sagment(Point B) {

		this(new Point(), B);
	}

	public double distance(Point A, Point B) {

		return Math.sqrt(
				(Math.pow((B.getAb() - A.getAb()), 2) + Math.pow((B.getOrd() - A.getOrd()), 2)));
	}

	public Sagment symetrie(Point A, Point B) {

		return new Sagment((A.symertie()), (B.symertie()));
	}
	public String toString() {
		return "" + A.toString() + "" + B.toString() + "";
	}

}
//
public class Circle {
 
 	private float radius;
 	public Point center = new Point();
 
 	public Circle(Point center, float radius) {
 
 		this.center = center;
 		this.radius = radius;
 
 	}
 
 	public Circle(float radius) {
 
 		this(new Point(), radius);
 	}
 
 	public float perimeter(float radius) {
 
 		return (float) (2 * radius * Math.PI);
 	}
 
 	public Circle symetrie(Point centre) {
 
 		return new Circle(center.symertie(), radius);
 	}
 	public String toString() {
 		return " rayon=" + radius + ", center=" + center.toString() + "";
 	}
 
 	public float getRadius() {
 		return radius;
 	}
 
 	public void setRadius(float radius) {
 		this.radius = radius;
 	}
 
 }
//

public class MainTest {
	public static void main(String[] args) {
	System.out.println("Create 3 points in the space");
	Point A = new Point();
	Point B = new Point(5, 5);
	Point C = new Point(3, 8);
	System.out.println("the point A my coodinates are: A " + A.toString());
	System.out.println("the point B my coodinates are : B " + B.toString());
	System.out.println("the point C my coodinates : C " + C.toString());
	System.out.println("\n ");
	System.out.println("the image of A est : A-1:" + A.symertie().toString());
	System.out.println("the image of B est : B-1:" + B.symertie().toString());
	System.out.println("the image of C est : A-1:" + C.symertie().toString());
	//end of ex1
	System.out.println("\n ");
	System.out.println("===================");
	System.out.println("Create two sagments in the space \n");
	Sagment AB = new Sagment(A, B);
	Sagment BC = new Sagment(B, C);
	System.out.println("the sagment AB =" + AB.distance(A, B));
	System.out.println("the sagment BC =" + BC.distance(B, C));
	System.out.println("Create image of sagment  BC with respect to the axe of coodonates \n");
	System.out.println("the image of BC is CB" + BC.symetrie(B, C).toString());
	// end of ex2
	System.out.println("\n ");
	System.out.println("================");
	System.out.println("create two different circles in the space \n ");
	Circle c1 = new Circle(4);
	Circle c2 = new Circle(B, 3);
	System.out.println("the circle c1  : " + c1.toString() + "perimeter=" + (c1.getRadius())
	+ " its image  c1 " + c1.symetrie(c1.center).toString());
	System.out.println("the circle c2  : " + c2.toString() + "perimeter=" + c2.perimeter(c2.getRadius())			
	+ " its image  c2 " + c2.symetrie(c2.center).toString());
	}}
