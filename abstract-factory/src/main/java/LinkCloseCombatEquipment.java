import cloth.BlueSuit;
import shield.MasterShield;
import weapon.MasterSword;

public class LinkCloseCombatEquipment implements LinkEquipment {
  @Override
  public String weapon() {
    return new MasterSword().getWeaponName();
  }

  @Override
  public String shield() {
    return new MasterShield().getShieldName();
  }

  @Override
  public String cloth() {
    return new BlueSuit().getClothName();
  }
}
