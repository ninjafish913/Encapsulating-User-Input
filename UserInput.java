import java.util.*;

public class UserInput 
{
    private String input;
    public String getInput() { return input; }

    private ArrayList<String> permutations;
    public ArrayList<String> permutations() { return permutations; }

    public UserInput()
    {
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        scan.close();

        permutations = Permutations.permute(input);
    }

    public void inputToLower()
    {
        input = input.toLowerCase();
    }

    public void updatePermutations()
    {
        permutations = Permutations.permute(input);
    }

    public void sortPermutations()
    {
        MergeSort.mergeSort(permutations);
    }

    public void displayPermutations()
    {
        for (String i : permutations)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int permutationCount()
    {
        return permutations.size();
    }
}
