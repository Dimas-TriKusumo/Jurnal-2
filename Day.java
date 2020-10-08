class Date{
private int month; // 1-12
private int day; // 1-31 based on month
private int year; // any year

private static final int[] daysPerMonth = // days in each month
    { 0,31,28,31,30,31,30,31,31,30,31,30,31 };

//constructor: call checkMonth to confirm proper value for month
//call checkDay to confirm proper value for day
public Date( int theDay, int theMonth, int theYear )
{
    month = checkMonth( theMonth );//validate moth
    year = theYear; // could validate year
    day = checkDay( theDay ); //validate day

    System.out.printf(
        "Date object constructor for date %s\n", this );
}// end Date constructor

//method to return day
public int getDay()
{
    return day;
}// end method getDay

// method to return month
public int getMonth()
{
    return month;
}//end method getMonth

//method to get year
public int getYear()
{
    return year;
}//end method getYear

//utility method to confirm proper month value
private int checkMonth( int testMonth )
{
    if ( testMonth > 0 && testMonth <= 12 ) //validate month
        return testMonth;
    else // month is invalid
        throw new IllegalArgumentException(" month must be 1-12" );
}// end method check month

// utilty method to confirm proper day value based on month and year
private int checkDay( int testDay )
{
    // check if day in range for month
    if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
        return testDay;

    if ( month == 2 && testDay == 29 && ( year % 400 == 0 ||
        ( year % 4 == 0 && year % 100 != 0 ) ) )
        return testDay;

    throw new IllegalArgumentException(
        "day out of range for the specified month and year" );
}// end method check day

public String toString()
{ 
    return String.format( "%d-%d-%d", day, month, year );
}// end method toString

public void setDate ( int d, int m, int y )
{
    setDay( d );
    setMonth( m );
    setYear( y );

}

public void setDay( int d )
{
    // check if day in range for month
    if ( d > 0 && d <= daysPerMonth[ month ] )
        day = d;

    if ( month == 2 && d == 29 && ( year % 400 == 0 ||
        ( year % 4 == 0 && year % 100 != 0 ) ) )
        day = d;

    throw new IllegalArgumentException(
        "day out of range for the specified month and year" );

}

public void setMonth( int m )
{
    if ( m> 0 && m <= 12 ) //validate month
        month = m;
    else // month is invalid
        throw new IllegalArgumentException(" month must be 1-12" );
}

public void setYear( int y )
{
    year = y;
}

public String toString2()
{
    return String.format( "%2d - %2d - %4d ", getDay(), getMonth(), getYear() );
}

public void nextDay()
{
    getDay();
    day = day++;
    return day;

    //if( d = daysPerMonth[ month ] )
      //  return day = 1 && month++;

    //else if( m = 2 && d = 28 )
       // return day++ && m= 2;

    //else if( m = 12 && d = 31 )
       // return m = 1 && d = 1 ;

}
}