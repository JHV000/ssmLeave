package com.leave.service.impl;

import com.leave.mapper.LeaveMapper;
import com.leave.mapper.UserMapper;
import com.leave.model.Leave;
import com.leave.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class LeaveServiceImpl implements LeaveService {
    @Autowired
    private LeaveMapper leaveMapper;

    //登录

    @Override
    public List<Leave> queryAll(int uid) {
        return null;
    }

    @Override
    public int checkNote(int id) {
        return 0;
    }
}
