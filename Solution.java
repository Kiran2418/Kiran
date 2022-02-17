
	import java.util.Scanner;

	public class Solution {
	    public static void main(String args[] ) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        College college[] = new College[n];
	        for(int i=0; i< college.length;i++){
	            int id = sc.nextInt();
	            sc.nextLine();
	            String name = sc.nextLine();
	            int contactNo = sc.nextInt();
	            sc.nextLine();
	            String address = sc.nextLine();
	            sc.nextLine();
	            int pincode = sc.nextInt();
	            college[i] = new College(id, name, contactNo, address, pincode); 
	        }
	       
	        String searchAddress = sc.nextLine();
	        sc.close();
	        sc.nextLine();
	        College i1 = findCollegeWithMaximumPincode(college);
	        College i2 = searchCollegeByAddress(college, searchAddress);
	         
	         if(i1==null){
	             System.out.println("No College found with mention attribute.");
	         }
	             else{
	                 System.out.println("id-"+i1.getId());
	                 System.out.println("name-"+i1.getName());
	                 System.out.println("contactNo-"+i1.getContactNo());
	                 System.out.println("address-"+i1.getAddress());
	                 System.out.println("pincode-"+i1.getPincode());
	             }
	             if(i2==null){
	             System.out.println("No College found with mention attribute.");
	             }
	             else{
	                 System.out.println("id-"+i2.getId());
	                 System.out.println("name-"+i2.getName());
	                 System.out.println("contactNo-"+i2.getContactNo());
	                 System.out.println("address-"+i2.getAddress());
	                 System.out.println("pincode-"+i2.getPincode());
	             }
	         }
	         
	         public static College findCollegeWithMaximumPincode(College i[]){
	             int max = Integer.MIN_VALUE;
	             for(College college: i){
	                 if(college.getPincode() > max){
	                     max = college.getPincode();
	                     
	                 }
	             }
	             for(College college: i){
	                 if(college.getPincode() == max)
	                 {
	                     return college;
	                 }
	             }
	         return null;
	         }
	         public static  College searchCollegeByAddress(College i[], String address){
	             for(College college: i){
	                 if(college.getAddress() == address){
	                     return college;
	                 }
	             } 
	              return null;
	              }
	         }
	         

	class College{
	    private int id, contactNo, pincode;
	    private String name, address;
	    public College(int id, String name, int contactNo, String address, int pincode){
	        this.id = id;
	        this.name = name;
	        this.contactNo = contactNo;
	        this.address = address;
	        this.pincode = pincode;
	    }
	    public int getId(){
	        return id;
	    }
	    public String getName(){
	        return name;
	    }
	    public int getContactNo(){
	        return contactNo;
	    }
	    public String getAddress(){
	        return address;
	    }
	    public int getPincode(){
	        return pincode;
	    }
	}



