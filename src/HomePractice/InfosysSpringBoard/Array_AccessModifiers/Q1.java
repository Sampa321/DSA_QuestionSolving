package HomePractice.InfosysSpringBoard.Array_AccessModifiers;

public class Q1 {
    static void main() {
        int arrayOne[] = {6, 2, 3, 4, 5};
        int indexOne;
        for(indexOne = 0; indexOne < arrayOne.length; indexOne++)
        {
            if (arrayOne[indexOne] % 2 != 0)
            {
                indexOne++;
                break;
            }
            else {
                indexOne++;
                continue;
            }
        }
        System.out.println(indexOne);
    }
}
