package project;

import static java.lang.Integer.valueOf;

public class HW_2 {
    public static void main(String[] args) {

        String[][] stringArray0 = new String[][] {
                {"0", "0", "0", "0"},
                {"0", "0", "0", "0"},
                {"0", "0", "0", "0"},
                {"0", "0", "0", "m"}
        };
        String[][] stringArray1 = new String[][] {
                {"1", "1", "1", "1"},
                {"1", "1", "w", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
        String[][] stringArray2 = new String[][] {
                {"2", "2", "2"},
                {"2", "2", "2", "2"},
                {"2", "2", "z", "2"},
                {"2", "2", "2", "2"}
        };
        String[][] stringArray3 = new String[][] {
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"}
        };

        try {
            System.out.println("The sum of the array elements is equal to " + transformAndSum(stringArray0));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("The sum of the array elements is equal to " + transformAndSum(stringArray1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("The sum of the array elements is equal to " + transformAndSum(stringArray2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("The sum of the array elements is equal to " + transformAndSum(stringArray3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
    }

    private static int transformAndSum (String[][] in) throws MyArraySizeException, MyArrayDataException {
        int arrDim = 4;
        int sum = 0;

        if (in.length != 4) {
            throw new MyArraySizeException(String.format("The dimension of the array must be %dх%d.", arrDim, arrDim));
        }

        for (int i = 0; i < in.length; i++) {
            if (in[i].length != 4) {
                throw new MyArraySizeException(String.format("The dimension of the array must be %dх%d.", arrDim, arrDim));
            }
        }

        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                try {
                    sum += valueOf(in[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("The position [%d][%d] of the source array is not an integer %s.", i, j, in[i][j]));
                }
            }
        }

        return sum;
    }
}
