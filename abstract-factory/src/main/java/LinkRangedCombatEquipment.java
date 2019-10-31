import cloth.GreenSuit;
import weapon.Bow;

public class LinkRangedCombatEquipment implements LinkEquipment {
  @Override
  public String weapon() {
    return new Bow().getWeaponName();
  }

  @Override
  public String cloth() {
    return new GreenSuit().getClothName();
  }

  @Override
  public int ammo() {
    return 999;
  }
}
