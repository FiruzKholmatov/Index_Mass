public class BmiService {
    public int calculate(int weight, int height) {

        int bmi = weight / ((height + height) / 100);


        if (bmi <= 16) {
            System.out.println("Значительный дефицит массы тела");
        }
        if (bmi >= 16 && bmi <= 19) {
            System.out.println("Дефицит массы тела");
        }
        if (bmi >= 19 && bmi <= 25) {
            System.out.println("Норма");
        }
        if (bmi >= 25 && bmi <= 30) {
            System.out.println("Лишний вес");
        }
        if (bmi >= 30 && bmi <= 35) {
            System.out.println("Ожирение первоой степени");
        }
        if (bmi >= 35 && bmi <= 40) {
            System.out.println("Ожирение второй степени");
        }
        if (bmi >= 40 && bmi <= 70) {
            System.out.println("Значительный дефицит массы тела");
        }
        return bmi;


    }
}
