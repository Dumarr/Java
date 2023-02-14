import java.time.LocalDate;
import java.time.Month;
import java.time.Period;


public class Main {
    public static void main(String[] args) {
       LocalDate fechaActual= LocalDate.now();
       LocalDate Birthday=LocalDate.of(2002, Month.FEBRUARY,8);

        Period periodo = Period.between(Birthday, fechaActual);
        System.out.println("su edad es: "+periodo.getYears());

    }
}