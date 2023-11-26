import java.util.*;

public class Main {
    public static void main(String[] args) {
        Console console1 = new Console("Nintendo Switch", 2017);
        Console console2 = new Console("Playstation 1", 1994);
        Console console3 = new Console("Xbox 360", 2005);

        HashMap<String, Console> Consoles = new HashMap<>();

        Consoles.put("Nintendo", console1);
        Consoles.put("Sony", console2);
        Consoles.put("Xbox", console3);

        List<Console> values = new ArrayList<>(Consoles.values());
        values.sort(Comparator.comparing(Console::getYear));

        System.out.println(values);


    }
}