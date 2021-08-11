import java.time.LocalDate;  

public class BdaySecs {  
  public static void main(String[] args) {  
 LocalDate today = LocalDate.now();
LocalDate birthday = LocalDate.of(1998, 5, 8);
Period period = Period.between(birthday, today);

System.out.println(period.getDays());
System.out.println(period.getMonths());
System.out.println(period.getYears());
}
}