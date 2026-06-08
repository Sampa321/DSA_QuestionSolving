package HomePractice.GeeksForGeeks.Recursion.Medium;
/*
Consider a special family of Engineers and Doctors with following rules :

Everybody has two children.
First child of an Engineer is an Engineer and second child is a Doctor.
First child of an Doctor is Doctor and second child is an Engineer.
All generations of Doctors and Engineers start with Engineer.
The first few levels of the family tree are shown below :
Given level and position (pos) of a person in above ancestor tree, find profession of the person.
Examples:
Input: level = 4, pos = 2
Output: Doctor
Explaination: It is shown in the tree given in question.
Input: level = 3, pos = 4
Output: Engineer
Explaination: Already given in the tree in question.
 */
public class FindingProfession {
    public static void main(String[] args) {
        int level = 4;
        int pos = 2;
        System.out.println(profession(level, pos));
    }
    public static String profession(int level, int pos) {
        // code here
        int flips = Integer.bitCount(pos-1); //pos = 2,binary = (pos-1)= 1, bit =1
        // pos = 4, binary = (pos-1) = 3 = 11, bit = 2
        return (flips % 2 == 0)?"Engineer" : "Doctor";
    }
}
