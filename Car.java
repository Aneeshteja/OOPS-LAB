public class Car{
String model;
int year;

public Car(String model,int year){
this.model=model;
this.year=year;
}
public void displayInfo(){
System.out.println("Model:" + model + ",Year:" + year);
}
public static void main(String[] ags){
Car myCar=new Car("venue",2023);
myCar.displayInfo();
}
}