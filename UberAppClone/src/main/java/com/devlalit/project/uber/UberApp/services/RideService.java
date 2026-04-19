package com.devlalit.project.uber.UberApp.services;

import com.devlalit.project.uber.UberApp.dto.RideRequestDto;
import com.devlalit.project.uber.UberApp.entities.Driver;
import com.devlalit.project.uber.UberApp.entities.Ride;
import com.devlalit.project.uber.UberApp.entities.RideRequest;
import com.devlalit.project.uber.UberApp.entities.Rider;
import com.devlalit.project.uber.UberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequest rideRequest, Driver driver);

    Ride updateRideStatus(Ride ride, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Rider rider, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Driver driver, PageRequest pageRequest);
}

