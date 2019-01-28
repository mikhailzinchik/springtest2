package com.epam.springtest2.model.impl;

import com.epam.springtest2.model.CatService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by student on 28.01.2019.
 */
@Service
@Primary
public class MurzikCatImpl implements CatService {
    @Override
    public String getName() {
        return "Murzik";
    }
}
