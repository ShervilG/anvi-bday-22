package com.fun.bday.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Info {
    private String createdBy;
    private String createdFor;
    private String description;
}
