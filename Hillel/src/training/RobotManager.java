package training;


/**
 * Created by ${Roman} on 17.10.2015.
 */


    public class RobotManager
    {
        public static void main(String[] args) {
            // Первое проявление полиморфизма - ссылке на класс-предок
            // можно присвоить класс-потомок
            Robot robot = new RobotTotal(0, 0);
            System.out.println(robot.getClass().getName());

            robot.forward(20);
            robot.setCourse(90);
            robot.forward(20);
           // robot.setCourse(90);
            //robot.forward(50);
            // Напечатать координаты
            robot.printCoordinates();
            // Напечатать общую дистанцию уже не получится
            // компилятор выдает ошибку
            //System.out.println(robot.getTotalDistance());
        }
    }

