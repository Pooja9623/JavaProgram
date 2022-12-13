package prog;
//setters-taking value from outside and storing
//getters-returning stored value
class CuboidSolidTest{
	private float length, breadth, height, mass;
	
	public void setLength (float l) {
		length = l;
	}
	
	public void setBreadth (float b) {
		breadth = b;
	}
	
	public void setHeight (float h) {
		height = h;
	}
	
	public void setMass (float m) {
		mass = m;
	}
	
	public float getLength() {
		return length;
	}
	
	public float getBreadth() {
		return breadth;
	}
	
	public float getHeight() {
		return height;
	}
	
	public float getMass() {
		return mass;
	}
	
	public float getVolume() {
		return length*breadth*height;
	}
	
	public float getSurfacearea() {
		return 2*(length*breadth + breadth*height + height*length);
	}
	
	public float getDensity() {
		return mass/getVolume();
	}
	
}



public class CuboidSolid {

	public static void main(String[] args) {
	
		CuboidSolidTest cs1 = new CuboidSolidTest();
		cs1.setLength(11.2f);
		cs1.setBreadth(22.5f);
		cs1.setHeight(28.7f);
		cs1.setMass(300);
		
		System.out.println("Length:"+cs1.getLength()+
				"\nBreadth:"+cs1.getBreadth()+"\nHeight:"+cs1.getHeight()+
				"\nMass:"+cs1.getMass()+"\nVolume:"+cs1.getVolume()+
				"\nSurface Area:"+cs1.getSurfacearea()+"\nDensity:"+cs1.getDensity());
		
		
	}

}
