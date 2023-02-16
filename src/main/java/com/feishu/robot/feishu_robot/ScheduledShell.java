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

    @Scheduled(cron = "0 50 0 ? * MON-FRI")
    public void scheduledTask0() {
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

    @Scheduled(cron = "0 50 1 ? * MON-FRI")
    public void scheduledTask1() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到1!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 2 ? * MON-FRI")
    public void scheduledTask2() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到2!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 3 ? * MON-FRI")
    public void scheduledTask3() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到3!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 4 ? * MON-FRI")
    public void scheduledTask4() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到4!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 5 ? * MON-FRI")
    public void scheduledTask5() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到5!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 6 ? * MON-FRI")
    public void scheduledTask6() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到6!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 7 ? * MON-FRI")
    public void scheduledTask7() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到7!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 8 ? * MON-FRI")
    public void scheduledTask8() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到8!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 9 ? * MON-FRI")
    public void scheduledTask9() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到9!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 10 ? * MON-FRI")
    public void scheduledTask10() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到10!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 11 ? * MON-FRI")
    public void scheduledTask11() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到11!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 12 ? * MON-FRI")
    public void scheduledTask12() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到12!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 13 ? * MON-FRI")
    public void scheduledTask13() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到13!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 14 ? * MON-FRI")
    public void scheduledTask14() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到!14");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 15 ? * MON-FRI")
    public void scheduledTask15() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到15!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 16 ? * MON-FRI")
    public void scheduledTask16() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到16!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 17 ? * MON-FRI")
    public void scheduledTask17() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到17!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 18 ? * MON-FRI")
    public void scheduledTask18() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到18!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 19 ? * MON-FRI")
    public void scheduledTask19() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到19!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 20 ? * MON-FRI")
    public void scheduledTask20() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到20!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 21 ? * MON-FRI")
    public void scheduledTask21() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到21!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 22 ? * MON-FRI")
    public void scheduledTask22() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到22!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 23 ? * MON-FRI")
    public void scheduledTask23() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到23!");
        httpBody.setContent(message);
        httpBody.setMsg_type("text");
        try {
            HttpUtil.sendPost(objectMapper.writeValueAsString(httpBody));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 50 24 ? * MON-FRI")
    public void scheduledTask24() {
        HttpBody httpBody = new HttpBody();
        Message message = new Message();
        message.setText("午餐时间到24!");
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
