public class calculator {
    public static void main(String[] args)

    {

        int[] groupsize={8,2,6};
        int tablesneeded=0;
        int[] availabletables=new int[groupsize.length];



        for (int i=0; i<groupsize.length; i++)
        {
            int groupsizes = groupsize[i];
            boolean assigned = false;

            for (int j=0; j<tablesneeded; j++)
            {
                if(availabletables[j]+groupsizes<=8)
                {
                    availabletables[j] += groupsizes;
                    assigned=true;
                    break;
                }
            }


            if(!assigned)
            {
                availabletables[tablesneeded]=groupsizes;
                tablesneeded++;
            }


        }
        System.out.println("tables needed: " + tablesneeded);
         


        return;

    

    }


}
