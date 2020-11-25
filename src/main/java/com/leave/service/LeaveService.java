package com.leave.service;

import com.leave.model.Leave;

import java.util.List;

public interface LeaveService {
    List<Leave> queryAll(int uid);
    int checkNote(int id);
}
