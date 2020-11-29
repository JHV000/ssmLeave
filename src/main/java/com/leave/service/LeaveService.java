package com.leave.service;

import com.leave.model.Leave;

import java.util.List;
import java.util.Map;

public interface LeaveService {
    List<Leave> queryAll(int uid);
    int addLeave(Map<String, Object> map);
    int checkLeave(int id);
}
