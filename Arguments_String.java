package parameters_String;

public class Arguments_String {
	
	public int reg_no() {
		return 202301;
			}
	public int dep_no() {
		return 5;
	}
	public String pat_name() {
		return "Kumar";
	}
	public void Dep_Name(String s) {
		System.out.println("visiting Dep_Name:"+s);
		//return "ortho";

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Reg.no:"+reg_no);
		//System.out.println("Reg_no:"+as.reg_no()+as.dep_no());-- string declare for methods addition
		//int reg_no=as.reg_no()+as.dep_no();--for int declare after addition
		//System.out.println(reg_no);
		//System.out.println(dep);
		Hospital_name hn=new Hospital_name();
		System.out.println(hn.Hos_name());
		Arguments_String as=new Arguments_String();
		int reg_no=as.reg_no(); 
		System.out.println("Reg.No:"+reg_no);
		String room=new String("Room_No:");//string instance
		String pn="Patients_Name:";//string literal
		System.out.println(pn+as.pat_name());
		as.Dep_Name("ortho");
		//String Dep_Name=as.Dep_Name(String);
		System.out.println(room+as.dep_no()+"_"+hn.floor("Ist Floor"));

	}
	
}
