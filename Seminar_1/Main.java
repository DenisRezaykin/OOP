import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Female mother = new Female(new GregorianCalendar(1977, 2, 19).getTime(), "Елена", "Владимировна", "Елина");
        Male father = new Male(new GregorianCalendar(1977, 3, 22).getTime(), "Иван", "Викторович", "Елин");
        Male son = new Male(new GregorianCalendar(2000, 4, 29).getTime(), "Артём", "Иванович", "Елин");
        Female daughter = new Female(new GregorianCalendar(2012, 6, 4).getTime(), "Арина", "Ивановна", "Елина");
        mother.addChild(son);
        father.addChild(son);
        mother.addChild(daughter);
        father.addChild(daughter);
        son.addRelative(daughter, RelationEnum.SISTER);
        daughter.addRelative(son, RelationEnum.BROTHER);
        System.out.println(mother.getChildren());
        System.out.println(daughter.getParents());
        System.out.println(son.getRelatives(RelationEnum.SISTER));
    }
}
