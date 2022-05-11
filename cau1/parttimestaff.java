package cau1;

import java.util.Scanner;

public class parttimestaff {
	public class parttimeStaff extends staff {

		private String Name;
		private int Salary, Bonus;

		public void getBonus() {
			Bonus = 0;

		}

		void setStaff() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ten nhan vien: ");
			Name = sc.nextLine();
			System.out.println("Nhap luong cho nhan vien: ");
			Salary = sc.nextInt();
		}

		void getStaff() {
			System.out.println("Ho va ten: " + Name + "\nLuong cung:" + Salary + "\nThuong them: " + Bonus
					+ "\nTong luong: " + (Salary + Bonus));
		}
	}

	public void setstaff() {
		// TODO Auto-generated method stub
		
	}

	public void getBonus() {
		// TODO Auto-generated method stub
		
	}
}
