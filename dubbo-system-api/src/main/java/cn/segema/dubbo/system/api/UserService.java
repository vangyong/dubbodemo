package cn.segema.dubbo.system.api;

import java.util.List;

/**
 * 
 * @author wangyong
 *
 */
public interface UserService {
    List<String> getPermissions(Long id);
}
