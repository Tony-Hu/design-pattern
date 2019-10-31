public interface LinkEquipment {
  default String weapon() {
    return "No weapon equipped";
  }

  default String shield() {
    return "No shield equipped!";
  };
  String cloth();

  default int ammo() {
    return 0;
  }
}
