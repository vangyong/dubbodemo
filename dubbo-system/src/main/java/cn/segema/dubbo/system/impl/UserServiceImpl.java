package cn.segema.dubbo.system.impl;

import java.util.ArrayList;
import java.util.List;

import cn.segema.dubbo.system.api.UserService;

public class UserServiceImpl implements UserService {
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
