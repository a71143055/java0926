class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30;

    public Monster(String s) {
        this.name = s;
        this.hp = maxHp;
    }

    public void attack(Monster m) {
        m.hp -= 10;
    }

    public static void battle(Monster a, Monster b) {
        while(a.hp > 0 && b.hp > 0) {
            Monster attacker = (Math.random() < 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;
            attacker.attack(defender);
            System.out.printf("[%s]의 공격 -> %s의 채력 : %d/30\n", attacker.name, defender.name, defender.hp);
        }
    }
}
