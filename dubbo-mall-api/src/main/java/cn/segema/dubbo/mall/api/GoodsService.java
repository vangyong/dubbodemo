package cn.segema.dubbo.mall.api;

import java.util.List;

/**
 * Created by wy on 2017/4/13.
 */
public interface GoodsService {
    List<String> getPermissions(Long id);
}
