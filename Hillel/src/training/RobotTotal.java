package training;

/**
 * Created by ${Roman} on 17.10.2015.
 */

public class RobotTotal extends Robot {
    // ¬водим поле дл€хранени€ пройденной дистанции
    private double totalDistance = 0;

    //  онструктор тоже надо переопределить
    public RobotTotal(double x, double y) {
        super(x, y);
    }


    @Override
    public void forward(int distance) {
        super.forward(distance);
        totalDistance += distance;
        System.out.println("RobotTotal");
    }


    public double getTotalDistance() {
        return totalDistance;
    }
}

