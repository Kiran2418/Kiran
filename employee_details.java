package work;

		public class employee_details {  
			int id;  
			String name;  
			address address;  
			  
			public employee_details(int id, String name,address address) {  
			    this.id = id;  
			    this.name = name;  
			    this.address=address;  
			}  
			  
			void display(){  
			System.out.println(id+" "+name);  
			System.out.println(address.city+" "+address.state+" "+address.country);  
			}  
			  
			public static void main(String[] args) {  
			address address1=new address("gzb","UP","india");  
			address address2=new address("gno","UP","india");  
			  
			employee_details e=new employee_details(111,"varun",address1);  
			employee_details e2=new employee_details(112,"arun",address2);  
			      
			e.display();  
			e2.display();  
			      
			

	}

}
