public class minMax {
    public static void main(String[] args){
        int n = 200;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++){
            array[i] = Math.random();
        }

        double max = array[0];
        double min = array[0];
        double middle = 0;
        for (int i = 0; i < array.length; i++){
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            middle += array[i]/ array.length;
        }

        System.out.println("max " + max);
        System.out.println("min " + min);
        System.out.println("middle " + middle);
    }
}
