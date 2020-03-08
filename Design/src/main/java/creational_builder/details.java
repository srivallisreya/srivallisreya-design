package creational_builder;

public class details {
	 final int doors;
	 final boolean Garage;
	 final boolean swimming_pool;
	 final boolean Fancy_statues;
	 final boolean Garden;
	 
	 public details(House s) {
		 this.doors=s.doors;
		 this.Garage=s.Garage;
		 this.swimming_pool=s.swimming_pool;
		 this.Fancy_statues=s.Fancy_statues;
		 this.Garden=s.Garden;
		 
	 }
	 
	 public int getDoors() {
		 return doors;
	 }
	 
	 public boolean getGarage() {
		 return Garage;
	 }
	 
	 public boolean getswimming_pool() {
		 return swimming_pool;
	 }
	 
	 public boolean getFancy_statues() {
		 return Fancy_statues;
	 }
	 
	 public boolean getGarden() {
		 return Garden;
	 }
	 /*@Override
	 public String toString() {
		 String s="House Details:\n"+"Garage : "+getGarage()+"\n"+"Swimming pool : "+this.swimming_pool+"\n"+"Fancy Statues : "+this.Fancy_statues+"\n"+"Garden : "+this.Garden;
		 return s;
	 }*/
	 
	 public void  display() {
		 System.out.println("House details");
		 System.out.println("Doors         :"+getDoors());
		 System.out.println("Garage        : "+getGarage());
		 System.out.println("swimming_pool : "+getswimming_pool());
		 System.out.println("Fancy_statues : "+getFancy_statues());
		 System.out.println("Garden        : "+getGarden());
	 }
	
	

}
