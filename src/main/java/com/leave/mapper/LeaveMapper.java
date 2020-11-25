package com.leave.mapper;

import com.leave.model.Leave;

import java.util.List;

public interface LeaveMapper {
    List<Leave> queryAll(int uid);
    int checkNote(int id);
}
