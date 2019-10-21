import javax.swing.Icon;
import javax.swing.ImageIcon;

public class WeaponMachete implements Weapon{
	
	static public String weapon_name="Machete";
	static public String weapon_sound="vshhht";
	static public int weapon_damage=100;
	Icon weapon_icon = new ImageIcon("gameprocess_machete.jpg");
	
	public void use() {
		System.out.println(weapon_sound);
	}
	
	public void inspect() {
		System.out.println("=========Weapon stats=========");
		System.out.println("Name: ");
		System.out.println(weapon_name);
		System.out.println("Damage: ");
		System.out.println(weapon_damage);
		System.out.println("==============================");
	}
	
	public void reload() {
		
	}	
	
	public Icon getIcon() {
		return this.weapon_icon;
	}
	
	public int getCurrentAmmo() {
		return 1;
	}
	
	public int getMagCapacity() {
		return 1;
	}
}