package D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.core.commands;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.interfaces.Repository;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.interfaces.UnitFactory;

public class ReportCommand extends Command {


    public ReportCommand(String[] data, UnitFactory factory, Repository repository) {
        super(data, factory, repository);
    }




    @Override
    public String execute() {
        return this.getRepository().getStatistics();
    }
}
