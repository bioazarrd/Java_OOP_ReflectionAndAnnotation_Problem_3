package D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.core.commands;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.interfaces.Repository;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.interfaces.UnitFactory;

public class FightCommand extends Command {


    public FightCommand(String[] data, UnitFactory factory, Repository repository) {
        super(data, factory, repository);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
