//Задачу понял лишь частично. Остальное додумал сам.

package task_2;

public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars(2.4, "Volvo", 2006, "Sweden", "Stockholm");
        Cars car2 = new Cars(4.6, "Tesla", 2022, "USA", "Long Beach");
        Cars car3 = new Cars(3.4, "Mercedes", 2010, "Germany", "Bremen");
        Cars car4 = new Cars(3.3, "BMW", 2010, "Germany", "Hamburg");

        Cars[] car = {car1, car2, car3, car4};
        StringBuilder query = new StringBuilder("SELECT * FROM cars WHERE");

        for (Cars cars : car) {

            query.setLength(24);

            query.append(" model = '").append(cars.getModel()).append("' AND");
            query.append(" price = ").append(cars.getPrice()).append(" AND");
            query.append(" year = ").append(cars.getYear()).append(" AND");
            query.append(" country = '").append(cars.getCountry()).append("' AND");
            query.append(" city = '").append(cars.getCity()).append("'");
            String finalQuery = query.toString();
            System.out.println(finalQuery);
        }
    }
}
