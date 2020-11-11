package D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.core.Engine;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.core.factories.UnitFactoryImpl;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.data.UnitRepository;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.interfaces.Repository;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.interfaces.Runnable;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_4.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }



}
