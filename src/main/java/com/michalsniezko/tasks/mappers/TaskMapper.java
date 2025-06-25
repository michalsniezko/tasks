package com.michalsniezko.tasks.mappers;

import com.michalsniezko.tasks.domain.dto.TaskDto;
import com.michalsniezko.tasks.domain.entities.Task;

public interface TaskMapper {
    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);
}
