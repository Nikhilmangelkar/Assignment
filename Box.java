class Box{
int height;
float width;
int breadth;

Box(int i,float j,int k){
height=i;
width=j;
breadth=k;
}
void getVolume(){
System.out.println("volume of the box is:"+ (height*width*breadth));
}
void getArea(){
float area=(2*height*breadth)+(2*breadth*width)+(2*height*width);
System.out.println("area of the box ix:"+ area);
}
public static void main(String arg[]){
Box b1=new Box(2,2.1f,2);
Box b2=new Box(3,2.5f,5);

b1.getVolume();
b1.getArea();
b2.getVolume();
b2.getArea();
}
}