package com.plant.smartwater.box.common.tool;

import java.text.ParseException;

public class Moneys {

    public static float centToYuan(long cent) throws ParseException {
        return (float) cent / 100;
    }

}
