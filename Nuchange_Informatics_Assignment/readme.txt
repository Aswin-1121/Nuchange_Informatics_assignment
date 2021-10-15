AIM:
 Develop a program in Java(urldatabase) that can be run in the command line as per given requirements
below. 
Requirements 
1. To start the program: run java urldatabase. Further, the program will wait for the user to enter the
following commands.
2. The command storeurl shall take a URL as a parameter and save that into a table with a unique
short key and a count(usage count) initialized to 0.
a. Use local variables instead of a database to store the data.
b. Use any appropriate logic to generate the unique short key.
2. The command get shall take a URL as a parameter and return the unique short key after
incrementing the usage count.
3. The command count shall take a URL as a parameter and should return the latest usage count.
4. The command list should return all urls and counts. The return value is in JSON.
5. The command exit should terminate the program



STEPS USED

create 2 classes called 'command.java' and 'w1.java'.

COMMAND.JAVA

1. Import all the necessary java packages from the java library.
2. Create a class called 'command'.
3.I am using a do-while loop for this purpose,first of all we get a command from the user the command must be of:
	1. To start the program: run java urldatabase.
		 Commands:
		a. storeurl google.com
		b. get google.com
		c. count google.com
		d. list
		e. To exit the program enter exit
4.create an arraylist named 'list' to store the commands.
5.split the command using space and the command is stored in the arraylist.
6.when we give the command 'storeurl domainname', the domain name we typed will be stored in the arraylist.
7.when we type the command 'get domainname', it will give a unique key to the domain that we get using command and the count is incremented(here it checks with the domain that we get and also in the arraylist,unique ).
8.when we type the command 'count domainname', it will check for how many occurences/ how many times that the domainname is entered into the list.
9.when we type the command 'list',it will display the list  domainname,count,uniquekey using jsonarray.
10. when we type the command 'exit',it exits from the loop.


W1.JAVA

In this class,all the values that we get from the arraylist are storedit is intialiized using a constructor.
