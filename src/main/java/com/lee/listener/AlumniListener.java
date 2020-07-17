package com.lee.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.lee.domain.Alumni;
import com.lee.domain.User;
import com.lee.service.AlumniService;
import com.lee.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class AlumniListener extends AnalysisEventListener<Alumni> {

    private static final int BATCH_COUNT = 10;
    List<Alumni> alumniList = new ArrayList<>();
    List<User> userList = new ArrayList<>();

    private AlumniService alumniService;
    private UserService userService;

    public AlumniListener(AlumniService alumniService,UserService userService){
        this.alumniService = alumniService;
        this.userService = userService;
    }

    @Override
    public void invoke(Alumni alumni, AnalysisContext analysisContext) {
        alumniList.add(alumni);
        User user= new User();
        user.setUserUsername(alumni.getAlumniNumber());
        user.setUserPassword(alumni.getAlumniNumber());
        userList.add(user);
        if (alumniList.size() >= BATCH_COUNT){
            batchInsert();
            alumniList.clear();
            userList.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        batchInsert();
        alumniList.clear();
        userList.clear();
    }

    public void batchInsert() {
        alumniService.batchInsert(alumniList);
        userService.batchRegister(userList);
    }
}
