package studio7;

public class Rectangle {

	int length = 0;
	int width = 0;

	public Rectangle(int i, int j) {
		length = i;
		width = j;
	}

	public int area(){
		return length*width;
	}

	public int perimeter () {
		return (2*length)+(2*width);
	}

	public boolean isSquare() {
		if (length == width){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isSmaller(Rectangle r){
		if(this.area()<r.area()) {
			return true;
		}
		else {
			return false;
		}
	}
}

