import java.util.*;
class Area{
int l, b;
 Scanner sc=new Scanner(System.in);
Area(){
}
Area(int length, int breadth){
b=breadth;
l=length;
}
void setl(){
l=sc.nextInt();
}
void setb(){
b=sc.nextInt();
}
void returnArea(){
System.out.println(l*b);
}
}
class AreaT{
public static void main(String args[]){
 Area a=new Area(0,0);
System.out.print("Enter the length:");
a.setl();
System.out.print("Enter the Breadth:");
a.setb();
System.out.print("Area of rectangle:");
a.returnArea();
System.out.println("23DCS018 Tirth Dalal ");
}
}

