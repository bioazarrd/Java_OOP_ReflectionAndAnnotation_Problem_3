package D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.models.units;

public class Swordsman extends AbstractUnit {
    private static final int SWORDSMAN_HEALTH = 40;
    private static final int SWORDSMAN_DAMAGE = 13;

    public Swordsman() {
        super(SWORDSMAN_HEALTH, SWORDSMAN_DAMAGE);
    }
}
