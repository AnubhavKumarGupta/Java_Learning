abstract class Shape {
	
    public abstract void calculateArea();
    public abstract void display();
    
}

class Rectangle extends Shape{
   
   int length;
   int width;
   int area;
   
   public Rectangle(int length,int width) {
       this.length = length;
       this.width = width;
   }
   
   @Override
   public void calculateArea() {
       area = length*width;
   }
   
   @Override
   public void display() {
       System.out.println("The area of Rectangle is " + area);
   }
}

class Triangle extends Shape {
   
   int base;
   int height;
   double area;
   
   public Triangle(int base,int height) {
       this.base = base;
       this.height = height;
   }
   
   @Override
   public void calculateArea() {
       area = 0.5 * base * height;
   }
   
   @Override
   public void display() {
       System.out.println("The area of Triangle is " + area);
   }
}

