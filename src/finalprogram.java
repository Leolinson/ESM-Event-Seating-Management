import java.util.Scanner;

public class finalprogram {
    
    public static void main(String[] args)
    {
            Scanner scanner = new Scanner(System.in);

//First we take the input from the user using scanner like the number of groups and the size of each group//

            System.out.print("Enter the number of groups: ");
            int numgroups = scanner.nextInt();

//We declare new array to store the size of groups with the limit of the array set to the number of groups which the user inputs//
            int[] groupsize=new int[numgroups];
//We use the for loop to let the user input the size of the groups and store this value to the array declaired//
            for (int i = 0; i < numgroups; i++)
            {
                System.out.print("Enter the size of the groups "+(i+1)+ ":");
                groupsize[i] = scanner.nextInt();
            }

            
//At last we print out all the information we recived for example the number of groups and the sizes of the groups, we print this using the for loop function//
            System.out.println("The number of groups and size of the groups");

            for(int i = 0; i < numgroups; i++)
            {
                System.out.println("Group  "+(i+1)+":  "  +groupsize[i]+ " Peoples");
            }

            scanner.close();


// variables for tablesneeded and avilables tables are defined
            int tablesneeded=0;
//this array is to keep track of the number of available seats at each table
            int[] availabletables=new int[groupsize.length];
        
//the first for loop is constructed to repeat and loop through each group
            for (int i=0; i<groupsize.length; i++)
                {
                    int groupsizes = groupsize[i];
                    boolean assigned = false;
                    
// the secound for loop tries to assign the groups to an existing table
                    for (int j=0; j<tablesneeded; j++)
                    {
                        if(availabletables[j]+groupsizes<=8)
                        {
                            availabletables[j] += groupsizes;
                            assigned=true;
                            break;
                        }
                    }
        
// If there is no space in the existing tables a new Table is created and the group is assinged to this table
                        if(!assigned)
                        {
                            availabletables[tablesneeded]=groupsizes;
                            tablesneeded++;
                        }
        
        
                }
// The total number of tables needed is calculated and is printed out
                System.out.println("\n                                    TABLES NEEDED: " + tablesneeded);
                 

// Display seating arrangement
System.out.println("\nSeating Arrangement per Table:");
for (int i = 0; i < tablesneeded; i++)
{
    System.out.println("\n\nTable " + (i + 1) + ":");
    int remainingseats = 8;
    
    for (int j = 0; j < groupsize.length; j++)
    {
        int groupSize = groupsize[j];
        
        if (groupSize <= remainingseats)
        {
            System.out.println("  Group " + (j + 1) + ": " + groupSize + " guests");
            remainingseats -= groupSize;
            groupsize[j] = 0;
        }
    }
    
    System.out.println("  Empty Seats: " + remainingseats);
}

                
            
        
        
        
                return;
        }
}
