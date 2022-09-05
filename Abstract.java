//Use of abstact class to find  
//the area of a sqaure
//the area of Right angled traingle
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
class Traingle extends Fig
{
    int tr_area , b1;
    Traingle(int a , int b)
    {
        super(a);
        b1 = b;
    }
    int Area()
    {
        tr_area = (int)(l1 * b1)/2;
        return tr_area;
    }
}
class Abstract
{
    public static void main(String args[])
    {
        Square obj = new Square(4);
        int p = obj.Area();
        System.out.println("The area of square is :"+p);
        Traingle ob = new Traingle(4,5);
        int q = ob.Area();
        System.out.println("The area of Traingle is :"+q);
    }
}