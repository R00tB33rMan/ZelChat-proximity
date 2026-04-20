package com.shyamstudio.rai.zelChatProximity.data;

public class PlayerData {

  private boolean localMode;

  public PlayerData(boolean localMode) {
    this.localMode = localMode;
  }

  public boolean isLocalMode() {
    return localMode;
  }

  public void toggleMode() {
    this.localMode = !this.localMode;
  }
}