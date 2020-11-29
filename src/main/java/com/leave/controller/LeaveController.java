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

    @PostMapping(value = "/queryAll")
    public @ResponseBody
    List<Leave> queryAll(@RequestParam int uid) {
        return leaveService.queryAll(uid);
    }

    @GetMapping(value = "/checkLeave")
    public @ResponseBody
    int checkLeave(@RequestParam int id) {
        return leaveService.checkLeave(id);
    }

    @PostMapping(value = "/addLeave")
    public @ResponseBody
    int addLeave(@RequestBody Map<String,Object> map) {
        return leaveService.addLeave(map);
    }
}
