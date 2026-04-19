package com.devlalit.project.uber.UberApp.strategies;

import com.devlalit.project.uber.UberApp.entities.Driver;
import com.devlalit.project.uber.UberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDrivers(RideRequest rideRequest);
}
