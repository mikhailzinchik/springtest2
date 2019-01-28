package com.epam.springtest2.model.impl;

/**
 * Created by student on 28.01.2019.
 */

import com.epam.springtest2.model.CatService;
import org.springframework.stereotype.Service;

@Service(value = "barsikCat")
public class BarsikCatImpl implements CatService {

    @Override
    public String getName() {
        return "Barsik";
    }
}
