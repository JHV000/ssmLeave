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

    @GetMapping(value = "/queryAll")
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

    @GetMapping(value = "/showAll")
    public @ResponseBody
    List<Leave> showAll(@RequestParam int index) {
        int page = (index-1)*6;
        return leaveService.showAll(page);
    }
}
