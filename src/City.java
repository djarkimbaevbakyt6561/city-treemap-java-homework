import java.math.BigDecimal;

public class City {
    int code;
    String name;
    BigDecimal budget;

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", budget=" + budget +
                '}';
    }

    public City() {
    }

    public City(int code, String name, BigDecimal budget) {
        this.code = code;
        this.name = name;
        this.budget = budget;
    }
}
