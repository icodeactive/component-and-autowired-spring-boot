package com.icode.componentautowiredunderstanding.understanding;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Girl {

    Outfit outfit;

    public Girl(@Qualifier("nake") Outfit outfit) {
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}
