package tut.parkingapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tut.parkingapi.model.ParkingSpace;
import tut.parkingapi.service.ParkingSpaceService;

import java.util.List;

@RestController
@RequestMapping("/api/parking-spaces")
public class ParkingSpaceController {
    @Autowired
    private ParkingSpaceService service;

    @GetMapping
    public List<ParkingSpace> getAllSpaces() {
        return service.getAllSpaces();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParkingSpace> getSpaceById(@PathVariable Long id) {
        return service.getSpaceById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ParkingSpace addSpace(@RequestBody ParkingSpace space) {
        return service.addSpace(space);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ParkingSpace> updateSpace(@PathVariable Long id, @RequestBody ParkingSpace updatedSpace) {
        try {
            return ResponseEntity.ok(service.updateSpace(id, updatedSpace));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSpace(@PathVariable Long id) {
        service.deleteSpace(id);
        return ResponseEntity.noContent().build();
    }
}
