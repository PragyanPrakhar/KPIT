// package Collections API.SampleProblemStatement;

// import CollectionsAPI.SampleProblemStatement.engine.Engine;

public abstract  class Vehicle {
    private String id;
    private String name;
    private Engine engine; // Has a Engine :-> Composition
    public Vehicle(String id, String name, Engine engine) {
        this.id = id;
        this.name = name;
        this.engine = engine;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }
   
    
}
