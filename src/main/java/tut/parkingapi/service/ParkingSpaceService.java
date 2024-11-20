package tut.parkingapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tut.parkingapi.model.ParkingSpace;
import tut.parkingapi.repository.ParkingSpaceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ParkingSpaceService {
    @Autowired
    private ParkingSpaceRepository repository;

    public List<ParkingSpace> getAllSpaces() {
        return repository.findAll();
    }

    public Optional<ParkingSpace> getSpaceById(Long id) {
        return repository.findById(id);
    }

    public ParkingSpace addSpace(ParkingSpace space) {
        return repository.save(space);
    }

    public ParkingSpace updateSpace(Long id, ParkingSpace updatedSpace) {
        if (repository.existsById(id)) {
            updatedSpace.setId(id);
            return repository.save(updatedSpace);
        } else {
            throw new RuntimeException("Parking Space not found");
        }
    }

    public void deleteSpace(Long id) {
        repository.deleteById(id);
    }
}
