package com.shoonya.demomap.pojo;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CabDetails {

    String cabId;
    long fare;
    // There could be two of them : 3 wheeler & 4 wheeler
    String vehicleType;
}
