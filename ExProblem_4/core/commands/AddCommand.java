package D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.core.commands;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.interfaces.Repository;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.interfaces.Unit;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.interfaces.UnitFactory;

public class AddCommand extends Command {



    public AddCommand(String[] data, UnitFactory factory, Repository repository) {
        super(data, factory, repository);
    }

    public String execute() {
        String unitType = getData()[1];;
        Unit unitToAdd = this.getFactory().createUnit(unitType);
        this.getRepository().addUnit(unitToAdd);
        return unitType + " added!";
    }
}
