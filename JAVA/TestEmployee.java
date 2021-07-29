package com.ust.examples;
/*TestEmployee
 * 
 */
class Employee {
	int id;
	String name;
	float salary;
	void insert(int i,String n,float s) {
		id=i;
		name=n;
		salary=s;
			}
	void display(){System.out.println(id + "" + name + "" + salary);}
}

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();
		Employee e5=new Employee();
		
		
		e1.insert(101 , " Devika ",45000);
		e2.insert(102 , " Irin ",25000);
		e3.insert(103 , " Niya ",55000);
		e4.insert(104 , " Feba ",50000);
		e5.insert(105 , " Anjali ",35000);
		
		
		
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
		

	}

}
