import java.util.ArrayList;

public class MergeSort {
    public static void mergeSort(ArrayList<String> input) 
    {
        if (input.size() <= 1)
        {
            return;
        }
    
        int length1 = input.size() / 2; 
        int length2 = input.size() - length1; 

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();  
        
        for (int i = 0; i < length1; i++) 
        {
            list1.add(input.get(i));
        }
        
        for (int i = 0; i < length2; i++) 
        {
            list2.add(input.get(i+length1));
        }   

        mergeSort(list1); 
        mergeSort(list2); 
        
        int front1 = 0, front2 = 0, inputPosition = 0;
        while (front1 < length1 && front2 < length2)
        {
            if (list1.get(front1).compareTo(list2.get(front2)) < 0) 
            {
                input.set(inputPosition, list1.get(front1));
                front1++;
            } else {
                input.set(inputPosition, list2.get(front2));
                front2++;
            }
            inputPosition++;
        }
        
        if (front1 < length1)
        {
            for (int i = front1; i < length1; i++) 
            {
                input.set(inputPosition, list1.get(i));
                inputPosition++;        
            }
        } else if (front2 < length2) {
            for (int i = front2; i < length2; i++)
            {
                input.set(inputPosition, list2.get(i));
                inputPosition++;
            } 
        }

        return;
      }
}
