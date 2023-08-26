package com.Model;
public class Model_Student {

		private int roll_No;
		private String stude_Name;
		private String user_Name;
		private String pass;
		public Model_Student(int roll_No, String stude_Name, String user_Name, String pass) {
			super();
			this.roll_No = roll_No;
			this.stude_Name = stude_Name;
			this.user_Name = user_Name;
			this.pass = pass;
		}
		public int getRoll_No() {
			return roll_No;
		}
		public void setRoll_No(int roll_No) {
			this.roll_No = roll_No;
		}
		public String getStude_Name() {
			return stude_Name;
		}
		public void setStude_Name(String stude_Name) {
			this.stude_Name = stude_Name;
		}
		public String getUser_Name() {
			return user_Name;
		}
		public void setUser_Name(String user_Name) {
			this.user_Name = user_Name;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		
		
		
		
		
}
