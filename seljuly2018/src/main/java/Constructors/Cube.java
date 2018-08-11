package Constructors;

public class Cube { 
	int length;
	int breadth;
	int height;
	public int getVolume() {
		return(length*breadth*height);
	}
// two constructors are used so constructor overloading happens
Cube(int l,int b,int h){
	length=l;
	breadth=b;
	height=h;
}
 Cube(){// default constructors
	length=1;
	breadth=2;
	height=3;
}
}
