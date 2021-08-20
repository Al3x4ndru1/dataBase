import java.util.Scanner;

class data{
	private int salary;
	private int ID;
	private int age;
	private String name;
	private String role;
	private boolean working;

	data(int ID, int salary, int age, String name, String role, boolean working){
this.ID=ID;
this.age=age;
this.salary=salary;
this.name=name;
this.role=role;
this.working=working;
	}

	public void show()
	{if(this.working==true)
		{
		System.out.println(this.ID + " , " + this.name + " , " + this.age + " , " + this.salary + " , " + this.role);
		}
		else{	System.out.println(this.name + ", with the ID: " + this.ID + ", do not work for us anymore."); }

	}

public void del(String ster)
{if(ster==this.name)
	{
		this.working=false;
	}
}

}

class dataBase{

	public static void main(String[] args)
	{
	
	 data[] arr= new data[100];

		int i;
		int n; int age; int salary;
		String name; String role;
		Scanner sc= new Scanner(System.in);
		boolean working;
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{System.out.println("input the name: ");
			name=sc.next();
			System.out.println("input the age: ");
			age=sc.nextInt();
			System.out.println("input the salary: ");
			salary=sc.nextInt();
			System.out.println("input the role: ");
			role=sc.next();
			
			working=true;

			arr[i]= new data(i, salary, age, name, role, working); 
		}
		String ster;
		String m;
		boolean thewhile=true;
		while(thewhile==true)
		{	System.out.println("what do you want yo do?");
		String sw = sc.next();
		switch(sw){
			case "show" :	for (data e : arr)	e.show();
							System.out.println("Do you want to do something else ?");
							m = sc.next();
							if (m == "no") {
								thewhile = false;
							}
							break;

			case "delete" : ster = sc.next();
							for (data e : arr)	e.del(ster); 
							System.out.println("Do you want to do something else ?");  m= sc.next();
							if(m=="no"){
								thewhile=false;
							}
							
							break;

		}

	}

	}

}