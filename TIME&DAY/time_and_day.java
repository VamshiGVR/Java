class time_and_day
{
   public static void main(String a[])
    {
        for (int i=1; i<=5; i++)
        {
            String day = null;
            switch(i)
            {
                case 1 -> day ="MON";
                case 2 -> day ="TUES";
                case 3 -> day ="WEDNES";
                case 4 -> day ="THUR";
                case 5 -> day ="FRI";
            }
            System.out.println(day+"DAY");
            for(int j=1; j<9; j++)
            {
                int time = j+8; 
                if (time >=12)
                {
                    if(time>12)
                        System.out.println(time-12+"pm" + " - " + (time-11) +"pm");
                    if(time == 12)
                        System.out.println(time+"pm"+ " - " + (time-11) +"pm");
                }
                if(time <12)
                    if(time>=11)
                        System.out.println(time+"am" + " - " + (time+1) +"pm");
                    else
                        System.out.println(time+"am" + " - " + (time+1) +"am");
            }
        }
    }   
}
        