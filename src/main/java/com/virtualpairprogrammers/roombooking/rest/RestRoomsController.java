package com.virtualpairprogrammers.roombooking.rest;

import com.virtualpairprogrammers.roombooking.data.RoomRepository;
import com.virtualpairprogrammers.roombooking.entities.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RestRoomsController {

    @Autowired
    private RoomRepository roomRepository;

    @GetMapping
    public List<Room> getAllRooms() throws InterruptedException {
    Thread.sleep(3000);
    return roomRepository.findAll();
       /* response.setStatus(402);
        return null;*/
    }

    @GetMapping("/{id}")
    public Room getRoom(@PathVariable("id") Long id) {
        return roomRepository.findById(id).get();
    }

    @PostMapping()
    public Room newRoom(@RequestBody Room room) {
        return roomRepository.save(room);
    }

    @PutMapping
    public Room updateRoom(@RequestBody Room updatedRoom) {
        Room originalRoom = roomRepository.findById(updatedRoom.getId()).get();
        originalRoom.setName(updatedRoom.getName());
        originalRoom.setLocation(updatedRoom.getLocation());
        originalRoom.setCapacities(updatedRoom.getCapacities());
        return roomRepository.save(originalRoom);
    }
}
