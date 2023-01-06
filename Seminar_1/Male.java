import java.util.Date;

public class Male extends FamilyHuman {
    public Male(Date birthDate, String firstName, String middleName, String lastName) {
        super(birthDate, GenderEnum.MALE, firstName, middleName, lastName);
    }

    @Override
    public void addChild(FamilyHuman child) {
        this.children.add(child);
        child.father = this;
    }
}
