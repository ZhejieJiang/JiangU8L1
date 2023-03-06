public class Main
{
    public static void main(String[]args)
    {
        String[][] seatingChart = {

                {"Abby", "Don", "George", "Kim"}
                {"Brian", "Eleanor", "Harry", "Lenny"}
                {"Cathy","Fred", "Jill", "Matt"}
        };

        seatingChart[1][2] = "Paul";

        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;

        String[] tempe = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = tempe;
    }
}
