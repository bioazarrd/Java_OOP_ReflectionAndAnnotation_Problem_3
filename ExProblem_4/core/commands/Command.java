package D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.core.commands;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.interfaces.Executable;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.interfaces.Repository;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.interfaces.UnitFactory;

public abstract class Command implements Executable {


    private String[] data;
    private UnitFactory factory;
    private Repository repository;

    public Command(String[] data, UnitFactory factory, Repository repository) {
        this.data = data;
        this.factory = factory;
        this.repository = repository;
    }

    public String[] getData() {
        return data;
    }

    public UnitFactory getFactory() {
        return factory;
    }

    public Repository getRepository() {
        return repository;
    }
}
