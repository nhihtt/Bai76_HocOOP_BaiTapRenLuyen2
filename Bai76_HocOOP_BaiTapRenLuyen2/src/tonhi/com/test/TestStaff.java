package tonhi.com.test;

import tonhi.com.model.Employee;
import tonhi.com.model.Executive;
import tonhi.com.model.Staff;

public class TestStaff {

	public static void main(String[] args) {
		Staff st= new Staff();
		Employee teo= new Employee();
		teo.setName("Nguyễn Văn Tèo");
		teo.setAddress("Quận 1");
		teo.setPhone("151");
		teo.setPayRate(0.12);
		teo.setSocialSecurityNumber("SEC156");
		st.addStaffMember(teo);
		Employee ty= new Employee();
		ty.setName("Trần Thị Tý");
		ty.setAddress("Quận 2");
		ty.setPhone("116");
		ty.setPayRate(0.11);
		ty.setSocialSecurityNumber("SEC985");
		st.addStaffMember(ty);
		Executive an=new Executive();
		an.setName("Hồ Văn An");
		an.setAddress("Quận 3");
		an.setPhone("789");
		an.setPayRate(0.19);
		an.setSocialSecurityNumber("SEC333");
		an.awardBonus(100);
		st.addStaffMember(an);
		st.payDay();
		
	}

}
