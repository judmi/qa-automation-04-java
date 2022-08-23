package hw_6;

public class Main {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        while (fighter1.health > 0 && fighter2.health > 0) {
            if (firstAttacker.equals(fighter1.name)) {
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health > 0) {
                    fighter1.health = fighter1.health - fighter2.damagePerAttack;
                }
            } else {
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health > 0) {
                    fighter2.health = fighter2.health - fighter1.damagePerAttack;
                }
            }

        }
        if (fighter1.health <= 0) {
            return fighter2.name;
        } else {
            return fighter1.name;
        }
    }

    public static void main(String[] args) {

        Fighter lew = new Fighter("Lew", 10, 2);
        Fighter harry = new Fighter("Harry", 5, 4);
        System.out.println(declareWinner(lew, harry, "Lew"));



//        Salary sum = new Salary();
//
//
//        Employee worker1 = new Employee("Ivanov", 18, 'M', 120);
//        Employee worker2 = new Employee("Volkova", 22, 'F', 250);
//
//        Employee[] workers = new Employee[]{worker1, worker2};
//
//        System.out.println(worker1.isSameName(worker2));
//        System.out.println(worker1.isSameName(worker1));
//        System.out.println(sum.getSum(workers));

    }




}
