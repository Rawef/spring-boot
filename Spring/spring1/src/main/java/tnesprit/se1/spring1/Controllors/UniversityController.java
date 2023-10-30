package tnesprit.se1.spring1.Controllors;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tnesprit.se1.spring1.Entities.Reservation;
import tnesprit.se1.spring1.Entities.Universit;
import tnesprit.se1.spring1.Services.IUniverstService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/university")
public class UniversitController {
    IUniverstService iUniverstService;

    @GetMapping("/allUniversity")
    public List<Universit> getUniversit() {
        List<Universit> listUniversit = iUniverstService.retrieveAllUniversits();
        return listUniversit;
    }

    @GetMapping("/University/{id}")
    public Universit retrieveUniversit(@PathVariable("id") Long id) {
        return iUniverstService.retrieveUniversit(id);
    }

    @PostMapping("/addUniversité")
    public Universit addUniversit(@RequestBody Universit u) {
        Universit universit = iUniverstService.addUniversit(u);
        return universit;
    }

    @DeleteMapping("/RemoveUniversity/{id}")
    public void removeUniversit(@PathVariable("id") Long id) {
        iUniverstService.removeUniversit(id);
    }

    @PutMapping("/UpdateUniversity")
    public Universit updateUniversit(@RequestBody Universit f) {
        Universit universit= iUniverstService.updateUniversit(f);
        return universit;
    }
}
