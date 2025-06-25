package com.michalsniezko.tasks.domain.dto;

import com.michalsniezko.tasks.domain.entities.TaskPriority;
import com.michalsniezko.tasks.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
