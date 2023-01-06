import java.util.Date;

public class Female extends FamilyHuman {

    public Female(Date birthDate, String firstName, String middleName, String lastName) {
        super(birthDate, GenderEnum.FEMALE, firstName, middleName, lastName);
    }

    @Override
    public void addChild(FamilyHuman child) {
        this.children.add(child);
        child.mother = this;
    }
}