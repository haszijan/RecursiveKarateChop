public class RecursiveKarateChop {

    public int recursiveKarate(int[] array, int lowestValue, int highestValue, int target) {

        if(lowestValue < highestValue) {
            int middleValue = lowestValue + (highestValue - lowestValue) / 2;
            if(target < array[middleValue]) {
                return recursiveKarate(array, lowestValue, middleValue, target);
            }
            else if(target > array[middleValue]) {
                return recursiveKarate(array,middleValue,highestValue,target);
            }
            else {
                return middleValue;
            }
        }
        return (highestValue - 1);
    }

   /* public static void main(String[] args) {
        int[] array1 = {4, 13, 67, 158, 369, 499, 942};
        int indexOfTarget = recursiveKarate(array1, 0, array1.length, 499);
        System.out.println("499 found at: " + indexOfTarget);
    } */
}
