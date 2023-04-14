package exo2;

public class Circle {
	private double radius;
	private String color;

	public Circle() {
		this.radius = 1.0; // default value
		this.color = "blue"; // default value
	}

	public Circle(double radius) {
		this.radius = radius;
		this.color = "blue"; // default value
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
