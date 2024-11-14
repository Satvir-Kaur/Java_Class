package November5.throwkeyword;


public class VotingMain{

    public static void main(String[] args)
    { int age=17;
        try
        {
            if (age < 18)
            {
                throw new VotingException("Not Eligible to Vote");
            }
            else
            {
                System.out.println("Eligible to vote");
            }
        }
        catch(VotingException e)
        {
            System.out.println(e);
        }
        System.out.println("After Exception");
    }
}

