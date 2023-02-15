package com.feishu.robot.feishu_robot;

import lombok.Data;

@Data
public class HttpBody {
    private String msg_type = "text";
    private Message content;

}
