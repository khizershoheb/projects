package cuboid;

public class cuboid {
private int cuboidid;
private int length, width, height;
private static int idgenerator=1;
public cuboid( int length, int width, int height) {
	this.cuboidid = idgenerator++;
	this.length = length;
	this.width = width;
	this.height = height;
}
public int getCuboidid() {
	return cuboidid;
}
public void setCuboidid(int cuboidid) {
	this.cuboidid = cuboidid;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public static int getIdgenerator() {
	return idgenerator;
}
public static void setIdgenerator(int idgenerator) {
	cuboid.idgenerator = idgenerator;
}
public int getSurfacearea() {
	 int surfacearea=2*(length*width+width*height+height*length);
	return surfacearea;
}
public int getVolume() {
	int volume=(length*width*height);
	return volume;
}
public double getVolume(double radius) {
	double sphere=(length*width*height)-(4*Math.pow(radius, 3)*Math.PI/3);
	return sphere;
}
}
