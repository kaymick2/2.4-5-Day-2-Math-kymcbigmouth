class Main {
  public static void main(String[] args) {
    double a = 3;
    double b = 4;
    double c = pymethod(a, b);
    double A = method_area(a, b);
    double P = perimeter(a, b, c);

    System.out.println("\n***************************************\n");

    System.out.println("Consider a right triangle with one angle defined as 90°.");

    System.out.println("If a = " + a + " and b = " + b + ",");

    System.out.print("the length of the hypotenuse is_______,");

    System.out.print("\nthe area is_______, ");

    System.out.println("and the perimeter is_______.\n");

    System.out.println("***************************************\n");

    System.out.println("SOLUTION:\n");

    System.out.print("the length of the hypotenuse is " + c + ", ");

    System.out.print("\nthe area is " + A + ", ");

    System.out.println("and the perimeter is " + P + ".");

    System.out.println("This means that angle a is " + angle(a, b));

    System.out.println("and angle b is " + angle(b, a));

    System.out.println("meaning that angle c is 90° because all triangles must add to 180°.\n");

    System.out.println("***************************************\n");

    a = 5;
    b = 12;
    c = pymethod(a, b);
    A = method_area(a, b);
    P = perimeter(a, b, c);
    c = pymethod(a, b);

    System.out.println("Now consider another right triangle with one angle also defined as 90° but with different a & b values.");

    System.out.println("If a = " + a + " and b = " + b + ",");

    System.out.print("the length of the hypotenuse is_______,");

    System.out.print("\nthe area is_______, ");

    System.out.println("and the perimeter is_______.\n");

    System.out.println("***************************************\n");

    System.out.println("SOLUTION:\n");

    System.out.print("the length of the hypotenuse is " + c + ", ");

    System.out.print("\nthe area is " + A + ", ");

    System.out.println("and the perimeter is " + P + ".");

    System.out.println("This means that angle a is " + angle(a, b));

    System.out.println("and angle b is " + angle(b, a));

    System.out.println("meaning that angle c is 90° because all triangles must add to 180°.");
  }

  public static double angle(double any, double any2) {
    //the variables (double any, double any2) don't really mean anything, they're just what the contents of the method use. I didn't realise that you could call the method from main with any parameters, as in any variables that have already been defined/created/initialised/whatever the term is.
    double k = Math.atan2(any, any2);
    k = k * (180 / Math.PI);
    return k;
  }

  public static double pymethod(double a, double b) {
    double c = Math.pow(a, 2) + Math.pow(b, 2);
    c = Math.sqrt(c);
    return c;
  }

  public static double method_area(double a, double b) {
    double A = (a * b) / 2;
    return A;
  }

  public static double perimeter(double a, double b, double c) {
    double P = (a + b + c);
    return P;
  }
}