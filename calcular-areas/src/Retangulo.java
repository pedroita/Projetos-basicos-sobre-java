
public class Retangulo implements FiguraGenerica {
	public float area;
	@Override
	public float calcularAreas(float base, float altura) {
		area = (base*altura);
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
		return "Retangulo [area=" + area + ", getArea()=" + getArea() + "]";
	}
	
}
