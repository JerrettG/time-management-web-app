package com.gonsalves.timely.controller.model;

import com.gonsalves.timely.service.model.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectResponse {
    private String userId;
    private String projectName;
    private String projectId;
    private String creationDate;
    private String totalTimeSpent;
    private Integer completionPercent;

}
