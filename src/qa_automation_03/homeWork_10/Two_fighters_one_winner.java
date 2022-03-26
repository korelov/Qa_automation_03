package qa_automation_03.homeWork_10;

//https://www.codewars.com/kata/two-fighters-one-winner/java
public class Two_fighters_one_winner {

    public static class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        while (fighter1.health > 0 && fighter2.health > 0) {
            fighter1.health -= fighter2.damagePerAttack;
            fighter2.health -= fighter1.damagePerAttack;
        }

        if (fighter1.health <= 0 && fighter2.health <= 0) {
            return firstAttacker;
        } else if (fighter1.health > fighter2.health) {
            return fighter1.name;
        } else {
            return fighter2.name;
        }
    }

    public static void main(String[] args) {

        System.out.println(declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
        System.out.println(declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));

    }
}
