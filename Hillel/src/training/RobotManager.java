package training;


/**
 * Created by ${Roman} on 17.10.2015.
 */


    public class RobotManager
    {
        public static void main(String[] args) {
            // ������ ���������� ������������ - ������ �� �����-������
            // ����� ��������� �����-�������
            Robot robot = new RobotTotal(0, 0);
            System.out.println(robot.getClass().getName());

            robot.forward(20);
            robot.setCourse(90);
            robot.forward(20);
           // robot.setCourse(90);
            //robot.forward(50);
            // ���������� ����������
            robot.printCoordinates();
            // ���������� ����� ��������� ��� �� ���������
            // ���������� ������ ������
            //System.out.println(robot.getTotalDistance());
        }
    }

