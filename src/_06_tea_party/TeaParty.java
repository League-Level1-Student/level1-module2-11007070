package _06_tea_party;

public class TeaParty {
   public String welcome(String name, boolean isWoman, boolean isKnighted) {
	   String namee = "";
	   if (isWoman == false && isKnighted == false) {
		   namee = "Mr.";
	   }
	   else if (isWoman == false && isKnighted == true) {
		   namee = "Sir";
	   }
	   else if (isWoman == true && isKnighted == false) {
		   namee = "Ms.";
	   }
	   else if (isWoman == true && isKnighted == true) {
		   namee = "Lady";
	   }
	   return ("Hello " + namee + " " + name);
   }
}
