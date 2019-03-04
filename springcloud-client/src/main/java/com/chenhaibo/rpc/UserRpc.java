package com.chenhaibo.rpc;

import com.chenhaibo.util.HttpUtil;
import org.springframework.stereotype.Service;

/**
 * @Auther: chenhaibo
 * @Date: 2018/11/18 15:15
 * @Description:
 */
@Service
public class UserRpc {

    public String getUserIdByName(String name) {
        try {
            return HttpUtil.httpGet("http://10.33.108.63:1214/user/user?name=" + name);
        } catch (Exception e) {
            System.out.println("#UserRpc.getUserIdByName# json结果处理失败");
        }
        return null;
    }
}