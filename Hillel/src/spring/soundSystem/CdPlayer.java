package spring.soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by User on 11.01.2016.
 */

@Component("sony")
@Scope("prototype")
public class CdPlayer {

    @Autowired(required = false)
    private CD disc;

  /*  @Autowired
    public CdPlayer(CD disc) {
        this.disc = disc;
    }*/

    public void play(){
        disc.play();
    }
}
