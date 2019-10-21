import javax.swing.Icon;
import javax.swing.ImageIcon;

public class WeaponAkm implements Weapon{

	static public String weapon_name="7.62 AKM";
	static public String weapon_sound="POWPOWPOW";
	static public int weapon_damage=33;
	static public int weapon_mag_capacity=30;
	public int current_ammo=30;
	Icon weapon_icon = new ImageIcon("gameprocess_akm.jpg");
		
	public void use() {
		if(current_ammo>0) {
			System.out.println("xddd");
			current_ammo--;
			}
		else {
			
		}
	}
		
	public void inspect() {
		System.out.println("=========Weapon stats=========");
		System.out.println("Name: ");
		System.out.println(weapon_name);
		System.out.println("Ammo: ");
		System.out.print(current_ammo);
		System.out.print("/");
		System.out.println(weapon_mag_capacity);
		System.out.println("Damage: ");
		System.out.println(weapon_damage);
		System.out.println("==============================");
	}
	
	public void reload() {
		this.current_ammo=30;
	}
	
	public Icon getIcon() {
		return this.weapon_icon;
	}
	
	public int getCurrentAmmo() {
		return this.current_ammo;
	}
	
	public int getMagCapacity() {
		return weapon_mag_capacity;
	}
}