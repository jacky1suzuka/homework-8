public class Main {
    public static void main(String[] args) {

        // Задание 1
        int [] box = new int [3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;

        double [] box2 = {1.57, 7.654, 9.986};

        int [] box3 = {4, 3, 7, 13, 44, 23, 1232, 123};

        // Задание 2
        for (int i = 0; i < box.length; i++) {
            if (i == box.length - 1) {
                System.out.print(box[i]);
            }else{
                System.out.print(box[i] + ",");
            }
        }

        System.out.println("");

        for (int i = 0; i < box2.length; i++) {
            if (i == box2.length - 1) {
                System.out.print(box2[i]);
            }else{
                System.out.print(box2[i] + ",");
            }

        }

        System.out.println("");

        for (int i = 0; i < box3.length; i++) {
            if (i == box3.length - 1) {
                System.out.print(box3[i]);
            }else{
                System.out.print(box3[i] + ",");
            }
        }

        System.out.println("");

        // Задание 3
        for (int i = box.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.print(box[i]);
            }else{
                System.out.print(box[i] + ",");
            }
        }

        System.out.println("");

        for (int i = box2.length - 1; i >= 0; i--){
            if (i > 0){
                System.out.print(box2[i] + ",");
            }else{
                System.out.print(box2[i]);
            }
        }

        System.out.println("");

        for (int i = box3.length - 1; i >= 0; i--){
            if (i > 0) {
                System.out.print(box3[i] + ",");
            }else{
                System.out.print(box3[i]);
            }
        }

        System.out.println("");

        // Задание 4
        for (int i = 0; i < box.length; i++) {
            if (box[i] % 2 != 0){
                box[i] = box[i] + 1;
            }
            System.out.println(box[i]);
        }



    }
}