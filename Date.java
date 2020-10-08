public class Day {


int index;

static String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};


public Day(String currentDay) 
{

    for(int i = 0; i < days.length; i++) 
    {

        if(currentDay.equals(days[i])) 
        {

            index = i;

            return;
        }

    }

    System.out.println("Days is invalid");

}

    public void printDay() 
{
    System.out.println("The Day is " + days[index]);

}


    public String returnDay() 
{
    return days[index]; 

}


    public String returnNextDay() 
{
    return days[(index + 1 )% days.length];

}


    public String returnPreviousDay() 
{

    if (days.length <= 1)

    return days[index + 6];


    else return days[(index - 1)%days.length];  
}


    public String whatDayIs(int i) 
{
    return days[(index + i)%days.length];

}


    public static void main(String[] args) 
{
    Day day = new Day("Mon");

    day.printDay();

    System.out.println("Return Day: " + day.returnDay());

    System.out.println("Next Day: " + day.returnNextDay());

    System.out.println("Previous Day: " + day.returnPreviousDay());

    System.out.println(day.whatDayIs(7));

}
}