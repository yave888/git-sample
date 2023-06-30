public class Main{
    public static void main(String[] args){
        System.out.println("三角形の面積:" + calcTriangleArea(10.0,5.0));
        System.out.println("円の面積:" + calcCircleArea(5.0));
    }
    public static double calcTriangleArea(double bottom, double height){
        return bottom * height / 2;
    }
    public static double calcCircleArea(double radius){
        return Math.PI * radius * radius;
    }
}