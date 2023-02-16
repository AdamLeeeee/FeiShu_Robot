package com.feishu.robot.feishu_robot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class ScheduledShell {
    @Autowired
    ObjectMapper objectMapper;

    public ScheduledShell() {
    }

    @Scheduled(cron = "0 36 12 ? * MON-FRI")
    public void scheduledTask() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
