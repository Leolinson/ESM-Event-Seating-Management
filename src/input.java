import java.util.Scanner;

public class input 
{
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

    }
}
