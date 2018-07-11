package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	public static void main (String args[]) {
		hello("world");
		hello("user");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4,6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

		Point p = new Point(1, 3, 2, 4);
		System.out.println("Расстояние между точками p1 с координатами " + p.a + " " + p.b +
				" и p2 с координатами " + p.c + " " + p.d + " = " + p.distance());
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

}