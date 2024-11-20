package tut.parkingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tut.parkingapi.model.ParkingSpace;

public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, Long> {
}
