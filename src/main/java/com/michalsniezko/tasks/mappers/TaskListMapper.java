package com.michalsniezko.tasks.mappers;

import com.michalsniezko.tasks.domain.dto.TaskListDto;
import com.michalsniezko.tasks.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}
