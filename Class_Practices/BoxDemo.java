class Box
{
	private int l,b,h;
	
	public Box(int x)
	{
		l =x; b = x; h = x;
	}
	
	public Box (int l,int b, int h)
	{
		this.l = l; this.b = b; this.h = h;
	}
	
	public Box (Box p)
	{
		this(p.l,p.b,p.h);
		//this(l,b,h);
		//this(this.l,this.b,this.h);
	}
	
	public int volume()
	{
		return l*b*h;
	}
}

public class BoxDemo
{
	public static void main(String [] args)
	{
		Box b1 = new Box(5);
		Box b2 = new Box(3,5,4);
		Box b3 = new Box(b2);
		System.out.println(b1.volume());
		System.out.println(b2.volume());
		System.out.println(b3.volume());
	}
}