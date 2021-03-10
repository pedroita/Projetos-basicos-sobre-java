
public class Triangulo  implements FiguraGenerica{
	public float area;
	@Override
	public float calcularAreas(float base, float altura) {
		area= (base*altura)/2;
		return area;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Triangulo [area=" + area + ", getArea()=" + getArea() + "]";
	}
}
