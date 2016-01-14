package spring;

import com.sun.glass.ui.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.medieval.DamselRescuingKnight;
import spring.medieval.DamselRescuingQuest;
import spring.medieval.Quest;
import spring.soundSystem.CdPlayer;

import java.applet.AppletContext;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by RMysholovka on 28.12.2015.
 */
public class SpringMain {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        DamselRescuingKnight knight = context.getBean(DamselRescuingKnight.class);

        Quest quest = (DamselRescuingQuest) context.getBean("quest");
        //quest = context.getBean(Quest.class);
        quest = context.getBean(DamselRescuingQuest.class);

        knight.embarkQuest();

        System.out.println(quest);

        CdPlayer player1 = (CdPlayer) context.getBean("sony");
        player1.play();

        CdPlayer player2 = (CdPlayer) context.getBean("sony");
        player2.play();

        if (player1 == player2) {
            System.out.println("bean player is singleton");
        } else {
            System.out.println("bean player is prototype");
        }

    }

    private static void reflectionExample(DamselRescuingKnight knight) throws IllegalAccessException, InvocationTargetException {
        Class clazz = knight.getClass();

        for (Method method : clazz.getMethods()) {
            for (Annotation annotation : method.getAnnotations()) {
                if (annotation.annotationType().equals(Deprecated.class)) {
                    method.invoke(knight);
                    System.out.println(method.getName());
                }
            }
        }
    }
}
