package com.codingshuttle.project.uber.uberApp.repositories;

import com.codingshuttle.project.uber.uberApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Riderepository extends JpaRepository<Ride,Long> {
}
