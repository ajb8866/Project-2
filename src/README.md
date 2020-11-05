##Project 2

##Summary

This project focuses on the creation of abstract classes and methods as well as inheritance; class construction, ArrayList, arrays, and dates, are all topics that are also touched upon, in doing so, several different classes, methods, and variables are created. The classes housing all of the methods and variables include: Driver, DateTimeAbstract, DateTimeInherit, MesoAbstract, MesoInherit, MesoStation, LetterAvg, PosAvg. I had several problems that I ran into over the course of the project, but the biggest one happened while I was turning it into zyLabs which I was getting because I had a package that was not the default one. 

##Driver

The driver is what allows all the other class methods and objects to be used without this class none of the necessary checks could be done. I created several different objects including a DateTimeInherit object, a PosAvg object, a MesoInherit object, and a LetterAvg object.

##DateTimeAbstract

DateTimeAbstract is a abstract class that contains an abstract method, daysOfAnyMonth(int monthOfYear, int theYear), that has two parameters. This method does not do any concrete calculations due to its abstract nature, but it does allow any child of DateTimeAbstract to create daysOfAnyMonth method. The parameters each respectively signify the month and year of the date you want to find the days of.

##DateTimeInherit
DateTimeInherit is a child class that inherits from the DateTimeAbstract class containing two methods: DateTimeInherit(), and daysOfAnyMonth(). This class calculates what day of the week it is for the first and last day; it imports the entirety of the time package allowing for the creation of time object as well as the use of time methods such as atEndOfMonth(), atDay(), and DayOfWeek.from(). 

DateTimeInherit() is a constructor method that overrides the default constructor with no values.

daysOfAnyMonth() is a method inherited from DateTimeAbstract that calculates what day lands on the first of the month as well as the last day of the month, and then prints it out in a specific format. This method calls the  atEndOfMonth(), atDay(), and DayOfWeek.from() method.

atEndOfMonth() is a method used on a year returning the last day of the month; for example LocalDate yearOne = LocalDate(2005,10), yearOne.atEndOfMonth() =
2008-10-31

atDay() is a method that returns the LocalDate with the day at a day taken in as a parameter.
LocalDate yearOne = LocalDate(2005,10), yearOne.atDay( 1 ) = 2008-10-1

DayOfWeek.from() is a method that returns a DayOfWeek object for a date passed as a parameter; for example, DayOfWeek weekOne = DayOfWeek.from(yearOne), yearone.DayOfWeek.from(yearOne) = MONDAY

##MesoAbstract

MesoAbstract is an abstract class that contains the abstract methods calAverage() and letterAverage() which return an int array and character respectively. These methods do not do any concrete calculation due to their abstract nature, but it does allow any child of MesoAbstract to create them. Neither method takes a parameter.

##MesoInherit

MesoInherit is a child class of MesoAbstract containing three methods: MesoInherit(), calAverage(), and letterAverage(). This class calculates the ascii letter average from all of the letters of a given station.This class also contains an instance variable called stID which holds the value of the given station ID after it has been assigned in the constructor.

MesoInherit() is a constructor method that assigns the value passed from its parameter, station, to stID.

calAverage() is an int array method that does the actually average letter calculation. Calculating the letter average also provides the ceiling letter average, the upper value the average, and the floor letter average, the lower value of the average; the average is decided from either the ceiling or floor averages. If the average has a decimal value of .75 or more then the average is set to the ceiling value otherwise it will be set to the floor. For example, CHIC has a letter average of 70, a ceiling average of 70, and a floor average of 69. From all three of these values, an int array called avgValueHolders is created, and then returned. It does this by using a for loop that has a variable called x acting as the index.

letterAvg() is a character method that returns the character representation of the letter average. For example, CHIC has a letter average of 70 which is the ascii character value of F. It calls upon calAverage()  to get this information.

##MesoStation

MesoStation is a method that contains two methods and one instance variable: MesoStation(), getStID(), and stID. This class fills in its instance variable with a given parameter called stID.

MesoStation() is a constructor method that takes the instance variable stID, and sets it to the parameter stID.

getStID() is a string getter method that returns the value of the stID instance variable.

##LetterAvg

LetterAvg is a class containing 4 methods and 3 instance variables: LetterAvg(), numberOfStationWithLetterAvg(), stationsWithLetter(), toString(), letterAvgOfStation, stIDHolder, and stIDLetterMatchHolde,r.This class the calculate the number of stations that have the same letter as given to the constructor, as well as the returns an string array holding the stations with the same the same letter. 

LetterAvg() is a constructor method that reads in a file, in this case called Mesonet.txt, and gets the stIDs from there by using the split() method to isolate the first column before putting into a string ArrayList called stIDHolder. It also sets the character variable letterAvgOfStation to the parameter letterAverage representing the letter we need to work with. 

numerOfStationsWithLetterAvg()  is an int method that returns how many stations inside stIDHolder have the same first letter as letterAvgOfStation. It does this by using a for loop with a local variable called x that acts as the index. A local variable called firstCharCounter keeps count of the total.

stationsWithLetter() is a string ArrayList method that returns all of the stations in stIDHolder that have the starting value of letterAvgOfStation, and then putting them in stIDLetterMatchHolder if it does have the same starting value. It does this by using a for loop with a local variable called x that acts as an index. 

toString() is a string method the returns stIDLetterMatchHolder in the form of ”These stations are: YYYY YYYX YYYZ YYXZ ". It does this through the use of a string local variable called holder that goes through all of stIDLetterMatchHolder values and puts them inside holder with a space. The for loop has a local variable called x that acts as the index.

##PosAvg

PosAvg is a class that holds four methods and three instance variables: PosAvg(), indexOfStation(), stationsNearIndexStation(), toString, stIDHolder, stID, and avgProximityHolder. This class calculates the place index of the station given in the file from stIDHolder, and the values surrounding the index, if the index is not at the beginning or end of the file.

PosAvg() a constructor method that reads in a file, in this case called Mesonet.txt, and gets the stIDs from there by using the split() method to isolate the first column before putting into a string ArrayList called stIDHolder. The instance variable stID is filled with the value in the parameter stID.

indexOfStation() is a int method that returns the index of the station given by the constructor starting from one using stIDHolde; every station in stIDHolder is compared and if the station does exist inside the ArrayList then the index of that station plus on is returned. For example, say that the file has a station “LXCO” at index 66 then this method would return 66. This is done using a for loop that uses the local variable x that acts as an index.

stationsNearIndexStation() is a string ArrayList method that returns all of of the values that are two places above or two places below the current index as long as the index is not in the first to place of stIDHolder or the last to places of stIDHolder. All of those stations are then put into the string ArrayList avgProximityHolder .If the stations are in one of those four places then nothing will be returned. This is done through the use of a for loop using the local variable x that acts as the index.

toString() is a string method that returns a string representation of the int returned by stationsNearIndexStation() in a specific format. For example, the if the index is 55, stations 56 = “LILN”, 57 = “LOLL”, 54 = “LPAL”, 53 = “LKCL”  then this is printed out; 
This index is average of  LILN and LOLL, LPALand LKCL, and so on. This is done using a local string variable called holder that takes all the values from avgProximityHolder and adds them together with the correct format.  







