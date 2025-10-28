public class MarsWeightCalc {
    public static void main(String[] args) {
        float earthWeight=60.0f;
        float marsWeight=earthWeight*0.38f;

        double marsWeightDouble=marsWeight;
        int marsWeightInt =(int)marsWeightDouble;
        char marsWeightChar=(char)marsWeightInt;

        System.out.println("Earth Weight: " + earthWeight);
        System.out.println("Mars Weight (float): " + marsWeight);
        System.out.println("Mars Weight (double): " + marsWeightDouble);
        System.out.println("Mars Weight (int): " + marsWeightInt);
        System.out.println("Mars Weight (char): " + marsWeightChar);
    }
}
