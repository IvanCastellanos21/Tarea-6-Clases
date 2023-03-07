import java.awt.*;

public class MainTarea {
    public static void main(String[] args) {
        Monitor mon = new Monitor(27.4, "Samsung", "SM10", "LED", 6500.0);
        System.out.println(mon);

        Persona per = new Persona(20, "Jose", 1.76, 56.0, "M");
        System.out.println(per);

        Automovil auto = new Automovil("BMW", "BMW-I", "No se" , Color.RED);
        System.out.println(auto);

        Pelota pel = new Pelota ("Volleyball", "Wilson", 33.5);
        System.out.println(pel);
    }
}