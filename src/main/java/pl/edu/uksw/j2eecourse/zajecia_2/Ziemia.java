package pl.edu.uksw.j2eecourse.zajecia_2;

import org.springframework.stereotype.Component;

@Component
public class Ziemia implements Planeta {

    public void przedstawSie() {
        System.out.println("Powitanie z Ziemi");
    }

}
