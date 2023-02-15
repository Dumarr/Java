import java.time.LocalDate;
import java.time.Month;
import java.time.Period;


public class Main {
    public static void main(String[] args) {
       LocalDate CurrentDay= LocalDate.now();
       LocalDate Birthday=LocalDate.of(2002, Month.JANUARY,8);

        Period periodo = Period.between (Birthday,CurrentDay);
        System.out.println("su edad es: "+periodo.getYears()+"Años "+periodo.getMonths()+"Meses "+periodo.getDays()+"Dias");

    }
}