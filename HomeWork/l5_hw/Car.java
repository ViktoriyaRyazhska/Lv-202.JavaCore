/**
 * Created by Babajko on 09.10.2016.
 */
public class Car {
    private String type;
    private int yearProduction;
    private float engine;

    public void setType(String type) {
        this.type = type;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public void setEngine(float engine) {
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public float getEngine() {
        return engine;
    }

    public Car(String type, int yearProduction, float engine) {
        setType(type);
        setYearProduction(yearProduction);
        setEngine(engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearProduction=" + yearProduction +
                ", engine=" + engine +
                '}';
    }
}
