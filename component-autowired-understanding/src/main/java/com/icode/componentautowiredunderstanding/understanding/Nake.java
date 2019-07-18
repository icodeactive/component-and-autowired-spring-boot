package com.icode.componentautowiredunderstanding.understanding;

import org.springframework.stereotype.Component;

@Component("nake")
//@Primary
public class Nake implements Outfit {
    @Override
    public void wear() {
        System.out.println("Đang không mặc gì");
    }
}
