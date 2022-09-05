//Use of abstact class to find the area 
//of a sqaure
abstract class Fig
{
    int l1;
    Fig(int a)
    {
        l1 = a;
    }
    abstract int Area();
}
class Square extends Fig
{
    int sq_area;
    Square(int a)
    {
        super(a);
    }
    int Area()
    {
        sq_area = l1 * l1;
        return sq_area;
    }
}
class Abstract
{
    public static void main(String args[])
    {
        Square obj = new Square(4);
        int p = obj.Area();
        System.out.println("The area of square is :"+p);
    }
}