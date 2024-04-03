/*Создайте класс, который описывает вектор (в трёхмерном пространстве).

У него должны быть:

конструктор с параметрами в виде списка координат x, y, z
метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
$\sqrt{x^2 + y^2 + z^2}$

метод, вычисляющий скалярное произведение:
$x_1x_2 + y_1y_2 + z_1z_2$

метод, вычисляющий векторное произведение с другим вектором:
$(y_1z_2 - z_1y_2, z_1x_2 - x_1z_2, x_1y_2 - y_1x_2)$

метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному произведению векторов, деленному на произведение модулей (длин) векторов:
$\frac{(a,b)}{|a| \cdot |b|}$

методы для суммы и разности:
$(x_1 + x_2, y_1 + y_2, z_1 + z_2)$

$(x_1 - x_2, y_1 - y_2, z_1 - z_2)$


статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.

Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый. То есть, нужно реализовать шаблон "Неизменяемый объект"
*/
public class habr_task9 {

    // теперь не три координаты, а массив координат
    private double values[];

    public habr_task9(double[] values) {
        this.values = values;
    }

    // Длина вектора. Корень из суммы квадратов
    public double length() {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i] * values[i];
        }
        return Math.sqrt(sum);
    }

    // метод, вычисляющий скалярное произведение
    public double scalarProduct(habr_task9 vector) {
        double res = 0;

        for (int i = 0; i < values.length; i++) {
            res += values[i] * vector.values[i];
        }
        return res;
    }

    // для многомерных не определено
    //    public double crossProduct(Vector vector) {
    //        
    //    }

    // Косинус между двумя векторами
    public double cos(habr_task9 vector) {
        return scalarProduct(vector) / (length() * vector.length());
    }

    public habr_task9 add(habr_task9 vector) {
        double[] another = new double[values.length];

        for (int i = 0; i < values.length; i++) {
            another[i] = values[i] + vector.values[i];
        }
        return new habr_task9(another);
    }

    public habr_task9 subtract(habr_task9 vector) {
        double[] another = new double[values.length];

        for (int i = 0; i < values.length; i++) {
            another[i] = values[i] - vector.values[i];
        }
        return new habr_task9(another);
    }

    // Вспомогательный метод
    private static double[] generateRandomArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static habr_task9[] generate(int n, int dimension) {
        habr_task9[] vectors = new habr_task9[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new habr_task9(generateRandomArray(dimension));
        }
        return vectors;
    }
}
