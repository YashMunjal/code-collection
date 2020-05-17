/* ============================================================

    Create a class circle that remembers properties of circles and with methods such as:

    Circle(float r)	      constructs a new circle with the given radius as a real number
    area()	              returns the area occupied by the circle (upto 2 decimal places)
    circumference()	      returns the distance around the circle (upto 2 decimal places)
    getRadius()	          returns the radius as a real number (upto 1 decimal places)
    toString()	          returns a string representation such as "Circle{radius=2.5}"

=============================*/

class Circle
{
    float r;

public:
    Circle(float c)
    {
        r = c;
    }
    double area()
    {
        float m = 3.14159 * r * r;
        return m;
    }
    float circumference()
    {
        float m = 2 * 3.14159 * r;
        return m;
    }
    float getRadius()
    {
        return r;
    }
    string toString()
    {
        char ch[50];
        sprintf(ch, "Circle{radius=%.1f}", r);
        return ch;
    }
};