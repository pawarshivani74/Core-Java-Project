package designpattern;


public class Rectangle extends ShapeCache {
		public Rectangle(){
		type = "Rectangle";
		}
		@Override
		public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
		}
		}
