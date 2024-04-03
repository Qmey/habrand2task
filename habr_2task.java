/*Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом, с учётом его веса.
Пример:
Дан массив [1, 2, 3], и массив весов [1, 2, 10].
В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем значение «3».*/
class habr_2task {
    private int[] extended_values; // значения

    public habr_2task(int[] values, int[] weights) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }

        extended_values = new int[sum];
        int cursor = 0;

        for(int i = 0; i < weights.length; i++){
            for(int j = 0; j < weights[i]; j++){
                extended_values[cursor++] = values[i];
            }
        }
    }

    public int getRandom() {
        int random = (int) (Math.random() * ( extended_values.length - 1));
        return extended_values[random];
    }

    public static void main(String[] args) {

        int[] values = {1, 2, 3};
        int[] weights = {2, 3, 1};

        habr_2task task = new habr_2task(values, weights);

        int randomValue = task.getRandom();
        System.out.println("Random: " + randomValue);
    }
}
