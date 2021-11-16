import java.util.ArrayList;

public class Permutations 
{
    public static ArrayList<String> permute(String input)
    {
        ArrayList<String> permutations = new ArrayList<String>();
        if (input.length() == 1)
        {
            permutations.add(input);
        } else {
            for (int j = 0; j < input.length(); j++)
            {
                char letter = input.charAt(j);
                String remaining = input.substring(0,j) + input.substring(j+1);
                for (String perm : permute(remaining))
                {
                    permutations.add(letter + perm);
                }
            }
        }
        return permutations;
    }
}
