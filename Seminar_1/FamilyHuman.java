import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class FamilyHuman extends Human implements FamilyHumanActions {
    FamilyHuman mother;
    FamilyHuman father;
    FamilyHuman partner;
    List<FamilyHuman> children;
    Map<RelationEnum, List<FamilyHuman>> relatives;

    public FamilyHuman(Date birthDate, GenderEnum gender, String firstName, String middleName, String lastName) {
        super(birthDate, gender, firstName, middleName, lastName);
        this.mother = null;
        this.father = null;
        this.partner = null;
        this.children = new ArrayList<>();
        this.relatives = new HashMap<>();
    }

    @Override
    public void getMarried(FamilyHuman partner) {
        this.partner = partner;
    }

    @Override
    public FamilyHuman getPartner() {
        return this.partner;
    }

    @Override
    public List<FamilyHuman> getChildren() {
        return this.children;
    }

    @Override
    public List<FamilyHuman> getParents() {
        return Arrays.asList(this.mother, this.father);
    }

    @Override
    public void addRelative(FamilyHuman relative, RelationEnum relationType) {
        if (this.relatives.containsKey(relationType)) {
            this.relatives.get(relationType).add(relative);
        } else {
            this.relatives.put(relationType, Arrays.asList(relative));
        }
    }

    @Override
    public List<FamilyHuman> getRelatives(RelationEnum relationType) {
        return this.relatives.get(relationType);
    }
}
