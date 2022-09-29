/*
Using the parse Method to Create a
Date-Time Object

LocalDate d = LocalDate.parse("2014-12-15");

LocalDateTime dt;
dt = LocalDateTime.parse("2014-12-15T15:45");

dt = LocalDateTime.parse("2014-12-15T15:45:13.5");

LocalDateTime dt;
try
{
dt = LocalDateTime.parse("2014-12-15T03:45PM");
}
catch (DateTimeParseException ex)
{
System.out.println(ex.toString());
}

 */


/*
Using the of Method to Create a
Date-Time Object

LocalDate date = LocalDate.of(2014,12,15);

System.out.println("December hath "
+ Month.DECEMBER.length(false) + " days.");
*/










package page543_UsingNow;

/**
 *
 * @author Hassan
 */
public class Chap4 {
    
}
