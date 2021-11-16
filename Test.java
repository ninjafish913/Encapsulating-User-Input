public class Test 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter an input: ");
        UserInput input = new UserInput();

        System.out.println("Your Input was " + input.getInput());

        System.out.println("\nPermutations:");
        input.displayPermutations();

        System.out.println("\nLowercase Only Permutations:");
        input.inputToLower();
        input.updatePermutations();
        input.displayPermutations();

        System.out.println("\nSorted Permutations:");
        input.sortPermutations();
        input.displayPermutations();

        System.out.println("\nTotal Permutations: " + input.permutationCount());
    }   
}
