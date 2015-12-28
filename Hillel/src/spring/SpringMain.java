package spring;

import com.sun.glass.ui.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.applet.AppletContext;

/**
 * Created by RMysholovka on 28.12.2015.
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


        DamselRescuingKnight knight = context.getBean(DamselRescuingKnight.class);

        knight.embarkQuest();
    }
}
