package com.devlalit.project.uber.UberApp.strategies.impl;

import com.devlalit.project.uber.UberApp.entities.Driver;
import com.devlalit.project.uber.UberApp.entities.RideRequest;
import com.devlalit.project.uber.UberApp.repositories.DriverRepository;
import com.devlalit.project.uber.UberApp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDrivers(RideRequest rideRequest) {
        return driverRepository.findTenNearbyTopRatedDrivers(rideRequest.getPickupLocation());
    }
}
