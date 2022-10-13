import java.util.Scanner;
//===========================================Begin
public class DurbanStreetMaintenance {
    //-----------------------------------Constants
    private static final Scanner keyboard = new Scanner(System.in);
//-----------------------------------Begin main method

    public static void main(String[] args) {
        //------------create variables

        int[] houseNumber;
        int numberOfHouses;
        int indexHouseNumber;

        int[][] houseAges;
        int numOfPersonPerHouse;
        int ageOfPersonPerHouse = 0;
        int numOfHousesWPeople;
        int indexHousePersons;
        int indexHouseAges = 0;
        int sumOfHouse;
        int sumOfStreet;

        //-----------Request data input from user

            //--------------Get House Numbers
        System.out.print("How many houses in the street?   : ");
        numberOfHouses = keyboard.nextInt();
        houseNumber = new int[numberOfHouses];

        System.out.println();

        for(indexHouseNumber = 0; indexHouseNumber < houseNumber.length; indexHouseNumber++) {
            System.out.print("What is the next house number?  : ");
            houseNumber[indexHouseNumber] = keyboard.nextInt();
        }

        System.out.println();


        //------------Get Number of People in each house
        numOfHousesWPeople = numberOfHouses;

        houseAges = new int[numOfHousesWPeople][];
        for (indexHousePersons = 0; indexHousePersons < houseAges.length; indexHousePersons++) {
            System.out.print("How many people live in number " + houseNumber[indexHousePersons] + " : ");
            numOfPersonPerHouse = keyboard.nextInt();

            houseAges[indexHousePersons] = new int[numOfPersonPerHouse];
            for (indexHouseAges = 0; indexHouseAges < houseAges[indexHousePersons].length; indexHouseAges++) {
                    System.out.print("What is the age of person " + (indexHouseAges + 1) + "      : ");
                    houseAges[indexHousePersons][indexHouseAges] = keyboard.nextInt();
            }
            System.out.println();
        }

        //----------Move to computation methods
        sumOfEachHouse(houseAges, houseNumber);

        System.out.println();
        totalSumOfStreet(houseAges, houseNumber);


    }
    //-----------------------------------Computational method to determine sum of houses
    public static void sumOfEachHouse(int[][] houseAges, int[] houseNumber) {

        int houseAgesSum = 0;
        int houseIndex;
        int sumIndex;

        for (houseIndex = 0; houseIndex < houseAges.length; houseIndex++ ) {
            houseAgesSum = 0;
            for (sumIndex = 0; sumIndex < houseAges[houseIndex].length; sumIndex++) {
                houseAgesSum = houseAgesSum + houseAges[houseIndex][sumIndex];
            }
            System.out.println("House " + (houseNumber[houseIndex]) + " has a total age of " + houseAgesSum);
        }
        return;
    }
    //-----------------------------------Computational method to determine total sum
    public static void totalSumOfStreet(int[][] houseAges, int[] houseNumber) {

        int houseIndex;
        int sumIndex;
        int totalSum = 0;

        for (houseIndex = 0; houseIndex < houseAges.length; houseIndex++ ) {
            for (sumIndex = 0; sumIndex < houseAges[houseIndex].length; sumIndex++) {
                totalSum = totalSum + houseAges[houseIndex][sumIndex];
            }

        }
        System.out.println("The street has a total age of " + totalSum);
        return;
    }
}
