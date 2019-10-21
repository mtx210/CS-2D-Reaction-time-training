import javax.swing.Icon;

public interface Weapon {
	
	public void use();
	public void inspect();
	public void reload();
	public Icon getIcon();
	public int getCurrentAmmo();
	public int getMagCapacity();
	
}