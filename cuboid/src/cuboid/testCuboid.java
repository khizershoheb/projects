package cuboid;

public abstract class testCuboid {

	public static void main(String[] args) {
		cuboid c1=new cuboid(4,5,6);
		cuboid c2=new cuboid(7,8,9);
		cuboid c3=new cuboid(6,7,10);
		System.out.println(c1.getLength()+" "+c1.getWidth()+" "+c1.getHeight()+" "+c1.getCuboidid());
	
		cuboid c4=new cuboid(6,7,10);
		c4.setLength(5);
		c4.setHeight(5);
		c4.setWidth(5);
		System.out.println(c4.getLength()+" "+c4.getWidth()+" "+c4.getHeight()+" "+c4.getCuboidid());
		
		cuboid.setIdgenerator(10);
		
		cuboid c5=new cuboid(6,7,10);
		
		System.out.println(c1.getIdgenerator());
		
		System.out.println(c5.getLength()+" "+c5.getWidth()+" "+c5.getHeight()+" "+c5.getCuboidid());
		c5.setCuboidid(100);
		System.out.println(c5.getLength()+" "+c5.getWidth()+" "+c5.getHeight()+" "+c5.getCuboidid());
		System.out.println(c3.getSurfacearea()+" "+c3.getVolume());
		System.out.println(c3.getVolume(3));
		
		System.out.println("-------------------------------------------");
		int k = testCuboid.findCuboidWithMaxVolume(c1, c2, c3);
		System.out.println(k);
	}
public static int findCuboidWithMaxVolume(cuboid c1,cuboid c2, cuboid c3) {
	if(c1.getVolume()>=c2.getVolume() && c1.getVolume()>=c3.getVolume())
		return c1.getCuboidid();
	
	else if(c2.getVolume()>=c3.getVolume()) {
		return c2.getCuboidid();
	}
	else {
		return c3.getCuboidid();
		}
}}
