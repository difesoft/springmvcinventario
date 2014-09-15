package com.difesoft.spring.service;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PriceIncrease {

	protected static final Logger logger = LoggerFactory.getLogger(PriceIncrease.class);

    @Min(0)
    @Max(50)
    private int percentage;

    public void setPercentage(int i) {
        percentage = i;
        logger.info("Percentage set to " + i);
    }

    public int getPercentage() {
        return percentage;
    }
}
