package eclipse;
//			143
class  EncapsulationDemo{
 private String empName="John";
 private int empAge=30;

 String getEmpName(){
   return empName;
 }
 int getEmpAge(){
   return empAge;
 }
 void setEmpName(String name){
   empName=name;
 }
 void setEmpAge(int age){
   empAge=age;
 }

}


class Main {
 public static void main(String[] args) {

   EncapsulationDemo obj=new EncapsulationDemo();
   obj.setEmpName("Mario");
   obj.setEmpAge(32);
   System.out.println("Employee Name:" +obj.getEmpName());
    System.out.println("Employee Age:" +obj.getEmpAge());


 }
}