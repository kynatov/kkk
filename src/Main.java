public class Main {
    public static void main(String[] args) {
        BOSS boss = new BOSS();
        boss.setBossProtection("beat");
        boss.setBossDamage(70);
        boss.setBossHealth(500);
        System.out.println("BossHealth" + " " + boss.getBossHealth() + " " + "BossDamage" + boss.getBossDamage() + " " +
                "BossProtection" + " " + boss.getBossProtection());
    }

    }