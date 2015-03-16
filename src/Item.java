
public class Item {

	private String name = "";
	private boolean isEquipped = false;
	private boolean isArmor = false;
	private boolean isWeapon = false;
	
	//Constructor #1
	public Item(int num){
		if(num == 0){
		int r = ((int)(1+Math.random()*6));
		if(r%2==0){
			this.isArmor = true;
			int a = ((int)(1+Math.random()*6));
				switch(a){
				case 1: this.name = "Dagger";
					break;
				case 2: this.name = "Short sword";
					break;
				case 3: this.name = "Long sword";
					break;
				case 4: this.name = "Axe";
					break;
				case 5: this.name = "Hammer";
					break;
				case 6: this.name = "Staff";
					break;
				default: this.name = "Dagger";
					break;
				}
		}
		else{
			this.isWeapon = true;
			int a = ((int)(1+Math.random()*6));
			switch(a){
			case 1: this.name = "Robes";
				break;
			case 2: this.name = "Padded";
				break;
			case 3: this.name = "Leather";
				break;
			case 4: this.name = "Studded leather";
				break;
			case 5: this.name = "Chainmail";
				break;
			case 6: this.name = "Scalemail";
				break;
			default: this.name = "Robes";
				break;
			}
		}
		}//end constructor case
		else if(num == 1){
			
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEquipped() {
		return isEquipped;
	}

	public void setEquipped(boolean isEquipped) {
		this.isEquipped = isEquipped;
	}

	public boolean isArmor() {
		return isArmor;
	}

	public void setArmor(boolean isArmor) {
		this.isArmor = isArmor;
	}

	public boolean isWeapon() {
		return isWeapon;
	}

	public void setWeapon(boolean isWeapon) {
		this.isWeapon = isWeapon;
	}
	
}
