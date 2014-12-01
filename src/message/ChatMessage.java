/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import java.io.Serializable;

/**
 * This class can be used as serializable object between the client and server
 * in chat application
 * 
 * @author Kyo Komu
 * @version 0.0.1
 */
public class ChatMessage implements Serializable {
    private String userName;
    private String chatMessage;
    private String messageColor;
    private boolean privateMessage;
    private String privateName;
    private boolean nameUpdate;
    private boolean userListUpdate;

    public boolean isUserListUpdate() {
        return userListUpdate;
    }

    public void setUserListUpdate(boolean userListUpdate) {
        this.userListUpdate = userListUpdate;
    }
    
    public boolean isNameUpdate() {
        return nameUpdate;
    }

    public void setNameUpdate(boolean nameUpdate) {
        this.nameUpdate = nameUpdate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getChatMessage() {
        return chatMessage;
    }

    public void setChatMessage(String chatMessage) {
        this.chatMessage = chatMessage;
    }

    public String getMessageColor() {
        return messageColor;
    }

    public void setMessageColor(String messageColor) {
        this.messageColor = messageColor;
    }

    public boolean isPrivateMessage() {
        return privateMessage;
    }

    public void setPrivateMessage(boolean privateMessage) {
        this.privateMessage = privateMessage;
    }

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }
    
    
}
