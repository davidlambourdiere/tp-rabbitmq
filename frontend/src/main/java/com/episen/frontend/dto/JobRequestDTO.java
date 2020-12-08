package com.episen.frontend.dto;

import com.episen.frontend.model.JobRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobRequestDTO {
    private String id;
    private String text;
    public JobRequest toJobRequest(){
        return JobRequest.builder()
                .id(id)
                .text(text)
                .build();
    }
}
