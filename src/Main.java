public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        

        boss.setHealth(1000);
        boss.setDamage(50);
        Weapon weapon = new Weapon();
        weapon.setTypeWeapon("steelArms");
        weapon.setNameWeapon(" sword");
        System.out.println("Boss " + boss.getHealth() + " " + boss.getDamage() + " " + boss.getWeapon());
        System.out.println(" Boss " + boss.getHealth() + " " + boss.getDamage() + " "
                + weapon.getTypeWeapon() + " " + weapon.getNameWeapon());
        ;
    }
}
