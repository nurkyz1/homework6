public class Main {

    public static void main(String[] args) {
Boss boss = new Boss();
boss.setNameWeapon("sword");
boss.setTypeWeapon("steelArms");
boss.setHealth(1000);
boss.setDamage(50);
        System.out.println("Boss "+boss.getHealth()+" "+boss.getDamage()+" "+boss.getTypeWeapon()+" "+boss.getNameWeapon() );
    }
}
