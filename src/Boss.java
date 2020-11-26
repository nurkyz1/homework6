public class Boss extends GameEntity {
    private Weapon typeWeapon;
    private String nameWeapon;

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    public Weapon getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(Weapon typeWeapon) {
        this.typeWeapon = typeWeapon;
    }
}
