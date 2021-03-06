package com.crystal.ovs.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.awt.*;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Builder
public class Car {
    private final Integer id;
    private final String brand;
    private final String model;
    private final String VIN;
    private final Integer manufacturingYear;
    private final CarType carType;
    private final int engineId;
    private final int transmissionId;
    private final TractionType tractionType;
    private final Integer numberOfDoors;
    private final Color color;
}
