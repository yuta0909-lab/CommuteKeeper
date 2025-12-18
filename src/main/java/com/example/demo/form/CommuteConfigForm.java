package com.example.demo.form;

import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

public class CommuteConfigForm {

    private String userName;
    private String userPhoneNumber;
    private String leaderPhoneNumber;

    // 記録・状態管理
    private int loginStreakDays = 1;
    private boolean hasDeparted = false;

    // 時間設定
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime targetArrivalTime;

    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime departureTime;

    // ★★★ これが抜けているためエラーになっています ★★★
    private Integer notificationMinutesBefore;
    // ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★

    // --- Getter / Setter ---
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getUserPhoneNumber() { return userPhoneNumber; }
    public void setUserPhoneNumber(String userPhoneNumber) { this.userPhoneNumber = userPhoneNumber; }

    public String getLeaderPhoneNumber() { return leaderPhoneNumber; }
    public void setLeaderPhoneNumber(String leaderPhoneNumber) { this.leaderPhoneNumber = leaderPhoneNumber; }

    public int getLoginStreakDays() { return loginStreakDays; }
    public void setLoginStreakDays(int loginStreakDays) { this.loginStreakDays = loginStreakDays; }

    public boolean isHasDeparted() { return hasDeparted; }
    public void setHasDeparted(boolean hasDeparted) { this.hasDeparted = hasDeparted; }

    public LocalTime getTargetArrivalTime() { return targetArrivalTime; }
    public void setTargetArrivalTime(LocalTime targetArrivalTime) { this.targetArrivalTime = targetArrivalTime; }

    public LocalTime getDepartureTime() { return departureTime; }
    public void setDepartureTime(LocalTime departureTime) { this.departureTime = departureTime; }

    // ★★★ 以下のGetterとSetterが必要です ★★★
    public Integer getNotificationMinutesBefore() { return notificationMinutesBefore; }
    public void setNotificationMinutesBefore(Integer notificationMinutesBefore) { this.notificationMinutesBefore = notificationMinutesBefore; }
}