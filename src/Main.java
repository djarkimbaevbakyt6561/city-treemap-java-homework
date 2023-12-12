import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City(123, "Karakol", new BigDecimal(400000000)));
        cities.add(new City(224, "Bishkek", new BigDecimal(1000000000)));
        cities.add(new City(998, "Osh", new BigDecimal(700000000)));
        cities.add(new City(432, "Jalal-Abad", new BigDecimal(800000000)));
        cities.add(new City(567, "Batken", new BigDecimal(20000000)));
        cities.add(new City(786, "Naryn", new BigDecimal(10000000)));
        cities.add(new City(349, "Talas", new BigDecimal(300000000)));

        Map<Integer, City> cityMap = new TreeMap<>(Collections.reverseOrder());
        for (City city : cities) {
            if (city.code % 2 == 0) {
                cityMap.put(city.code, city);
            }
        }

        for (Map.Entry<Integer, City> integerCityEntry : cityMap.entrySet()) {
            System.out.println(integerCityEntry.getKey() + ", " + integerCityEntry.getValue());
        }
    }
}
