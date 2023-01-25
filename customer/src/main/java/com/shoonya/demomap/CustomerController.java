package com.shoonya.demomap;

import com.shoonya.demomap.pojo.CabDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("client")
public class CustomerController {

    @GetMapping("/calculate-cost")
    public List<CabDetails> testing(@RequestParam long distance, @RequestParam long duration){
        CabDetails cab1 = CabDetails.builder()
                .cabId("cab-1")
                .fare(distance*duration)
                .vehicleType("3-wheeler")
                .build();
        CabDetails cab2 = CabDetails.builder()
                .cabId("cab-2")
                .fare(distance*duration + 10)
                .vehicleType("4-wheeler")
                .build();
        return List.of(cab1,cab2);
    }

    @PostMapping("/confirm-ride")
    public void confirmRide(){
    }

}
