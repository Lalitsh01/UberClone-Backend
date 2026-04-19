package com.devlalit.project.uber.UberApp.services;

import com.devlalit.project.uber.UberApp.entities.RideRequest;

public interface RideRequestService {
    RideRequest findRideRequestById(Long rideRequestId);
    void update(RideRequest rideRequest);

}
