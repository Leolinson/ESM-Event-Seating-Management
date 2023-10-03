public class calculator {
    public static void main(String[] args)

    {
//Enter the group sizes insde the {} curly braces to input the data
        int[] groupsize={8,2,6};

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
        System.out.println("tables needed: " + tablesneeded);
         


        return;

    

    }


}
