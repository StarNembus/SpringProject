package org.larisa.polozova;

import org.springframework.stereotype.Component;

// id компонента бина
public class RandBMusic implements Music {
    @Override
    public String getSong() {
        return "Jay-Z";
    }
}
