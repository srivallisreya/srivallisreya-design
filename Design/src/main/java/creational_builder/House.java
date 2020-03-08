package creational_builder;

public class House {
	  final int doors;
	  boolean Garage;
	  boolean swimming_pool;
	  boolean Fancy_statues;
	  boolean Garden;
	 
	  public House(int doors) {
		 this.doors=doors;
		 
	 }
	 public House Garage(boolean Garage) {
		 this.Garage=Garage;
		 return this;
	 }
	 public House swimming_pool(boolean swimming_pool) {
		 this.swimming_pool=swimming_pool;
		 return this;
	 }
	 public House Fancy_statues(boolean Fancy_statues) {
		 this.Fancy_statues=Fancy_statues;
		 return this;
	 }
	 public House Garden(boolean Garden) {
		 this.Garden=Garden;
		 return this;
	 }
	 
	 
		 
	 }
	


