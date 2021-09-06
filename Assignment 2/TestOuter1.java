class TestOuter1
{
static int data=30;
static class Inner{
void msg()
{
System.out.println("data is:"+data);
}
}
public static void main(String args[])
{
TestOuter1.Inobj=new TestOuter1.Inner();

}
}