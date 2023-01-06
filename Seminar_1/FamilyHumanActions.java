import java.util.List;

public interface FamilyHumanActions {
    FamilyHuman getPartner();

    List<FamilyHuman> getChildren();

    List<FamilyHuman> getParents();

    void addChild(FamilyHuman child);

    void addRelative(FamilyHuman relative, RelationEnum relationType);

    List<FamilyHuman> getRelatives(RelationEnum relationType);

    void getMarried(FamilyHuman partner);
}
