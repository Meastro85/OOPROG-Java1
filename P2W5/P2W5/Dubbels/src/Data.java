import java.util.Arrays;
import java.util.List;

/**
 * Vincent Verboven
 * 12/12/2022
 */
public class Data {
    public static final String[] merken = {
            "BMW", "Audi", "VW", "Ford", "Opel",
            "Renault", "Peugeot", "Citroen", "Mercedes", "Fiat",
            "Ford", "BMW", "Alfa Romeo", "Volvo", "Chevrolet",
            "Nissan", "Mitsubishi", "Subaru", "Daihatsu", "Kia",
            "Honda", "Citroen", "Ford", "Opel", "Dacia",
            "Hyundai", "Jaguar", "Lancia", "Mazda", "BMW",
            "Porsche", "Ferrari", "Maserati", "Corvette", "Seat",
            "Rolls Royce", "Toyota", "Suzuki", "Hummer", "Bentley",
            "Land Rover", "Mini", "BMW"
    };

    public static List<String> getData() {
        return Arrays.asList(merken); // Let op! "fixed size"
    }
}
