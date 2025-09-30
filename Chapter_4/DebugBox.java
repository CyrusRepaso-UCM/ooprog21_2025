public class DebugBox
{
private int width;
private int length;
private int height;
public DebugBox()
{
length = 1;
width = 1;
height = 1;
}
public DebugBox(int width, int length, int height)
{
this.width = width;
this.length = length;
this.height = height;
}
public void showData()
{
System.out.println("Width: " + width + "\n" + "Length: " +
length + "\n" + "Height: " + height);
}
public double getVolume()
{
double vol = length * width * height;
System.out.println("Volume: " + vol);
return vol;
   }

 }