package com.leave.controller;

import com.leave.model.Leave;
import com.leave.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/leave")
public class LeaveController {

    @Autowired
    private LeaveService leaveService;

    @PostMapping(value = "/queryUser")
    public @ResponseBody
    List<Leave> queryAll(@RequestBody int uid) {

        return leaveService.queryAll(uid);

    }
}
