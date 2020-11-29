package com.leave.mapper;

import com.leave.model.Leave;

import java.util.List;
import java.util.Map;

public interface LeaveMapper {
    List<Leave> queryAll(int uid);
    int checkLeave(int id);
    int addLeave(Map<String,Object> map);
}
