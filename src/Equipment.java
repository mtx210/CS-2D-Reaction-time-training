public class Equipment {
	
	Weapon active_slot;
	Weapon slot1;
	Weapon slot2;
	Weapon slot3;
	
	public Equipment(int team){
		
		switch(team) {
			case 1:
				slot1=new WeaponM4();
				slot2=new WeaponUsp();
				slot3=new WeaponBayonet();
				active_slot=slot1;
				break;
			case 2:
				slot1=new WeaponAkm();
				slot2=new WeaponGlock();
				slot3=new WeaponMachete();
				active_slot=slot1;
				break;
		}	
	}
	
	public void change_weapon(){
											/* to bym chcial lepiej rozwiazac */
		if(active_slot==slot1)
			active_slot=slot2;
		else
			if(active_slot==slot2)
				active_slot=slot3;
			else
				if(active_slot==slot3)
					active_slot=slot1;
	}
}