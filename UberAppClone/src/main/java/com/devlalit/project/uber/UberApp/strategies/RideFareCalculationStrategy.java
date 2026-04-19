package com.devlalit.project.uber.UberApp.strategies;

import com.devlalit.project.uber.UberApp.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER = 10.0;

    double calculateFare(RideRequest rideRequest);
}
