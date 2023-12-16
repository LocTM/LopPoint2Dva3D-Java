public class Test2D {
    public static void main(String[] args) {
        Point3D point1 = new Point3D();
        System.out.println("Point 1: " + point1);

        Point3D point2 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point 2: " + point2);

        point1.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println("Point 1 setXYZ: " + point1);

        float[] numb = point2.getXYZ();
        System.out.println("Point 2(x, y, z): " + numb[0] + ", " + numb[1] + ", " + numb[2]);
    }
}
