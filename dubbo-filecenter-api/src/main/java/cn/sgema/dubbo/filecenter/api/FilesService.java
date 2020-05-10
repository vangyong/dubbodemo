package cn.sgema.dubbo.filecenter.api;

import java.util.List;

/**
 * Created by wy on 2017/4/13.
 */
public interface FilesService {
    List<String> getPermissions(Long id);
}
