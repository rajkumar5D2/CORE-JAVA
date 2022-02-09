class Sample3
{
public static void main(String[] args)
{
byte b = 10;
short s =15;
char ch='a';
int i=20;

Example3 e = new Example3();
e.m1(b); 
e.m1(s);
 e.m1(ch); e.m1(1);
e.m1(10); e.m1(15); e.m1('a'); e.m1(20);
e.m1((byte)10); e.m1(15); e.m1('a'); e.m1(20);
}
}