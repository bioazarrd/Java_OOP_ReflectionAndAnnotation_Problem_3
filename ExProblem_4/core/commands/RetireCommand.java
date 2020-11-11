package D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.core.commands;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.interfaces.Repository;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.interfaces.UnitFactory;

public class RetireCommand extends Command {


    public RetireCommand(String[] data, UnitFactory factory, Repository repository) {
        super(data, factory, repository);
    }



    @Override
    public String execute() {
        String unitType = getData()[1];
        try {
            this.getRepository().removeUnit(unitType);
            return unitType + " retired!";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }


}
