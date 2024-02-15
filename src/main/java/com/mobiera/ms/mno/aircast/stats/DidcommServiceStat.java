package com.mobiera.ms.mno.aircast.stats;

import com.mobiera.ms.commons.stats.api.StatEnum;

public enum DidcommServiceStat implements StatEnum {

	DATE_TS(-1, "Date", true),
	
	ESTABLISHED_CONNECTION(1, "Established Connection", true),
	TERMINATED_CONNECTION(2, "Terminated Connection", true),
	
	SENT_MSG(30, "Sent Message", true),
	
	SENT_MSG_SPOOLED(31, "Sent Message Spooled", true),
	SENT_MSG_RECEIVED(32, "Sent Message Received", true),
	SENT_MSG_VIEWED(33, "Sent Message Viewed", true),
	SENT_MSG_BCAST(34, "Sent Message Broadcast", true),
	
	SENT_MSG_ERROR(35, "Sent Message Error", true),
	SENT_MSG_CREATED(36, "Sent Message Created", true),
	SENT_MSG_SUBMITTED(37, "Sent Message Submitted", true),
	SENT_MSG_DELETED(38, "Sent Message Deleted", true),
	
	
	SENT_MSG_VC(40, "Sent Broadcast", true),
	SENT_MSG_ID_PROOF_REQUEST(41, "Sent Presentation Request", true),
	SENT_MSG_TEXT(42, "Sent Text", true),
	SENT_MSG_WEB_LINK(43, "Sent Web Link", true),
	SENT_MSG_INVITATION(44, "Sent Invitation", true),
	SENT_MSG_CTX_MENU_UPDATE(45, "Sent Context Menu Update", true),
	SENT_MSG_MENU_DISPLAY(46, "Sent Select Menu", true),
	SENT_MSG_MEDIA(47, "Sent Media", true),
	SENT_MSG_OTHERS(48, "Sent Others", true),
	
	
	RECEIVED_MSG(70, "Received Message", true),
	RECEIVED_MSG_RECEIVED(71, "Received Message Received", true),
	RECEIVED_MSG_VIEWED(72, "Received Message Viewed", true),
	RECEIVED_MSG_SPOOLED(73, "Received Message Spooled", true),
	
	RECEIVED_MSG_ERROR(74, "Received Message Error", true),
	RECEIVED_MSG_CREATED(75, "Received Message Created", true),
	RECEIVED_MSG_SUBMITTED(76, "Received Message Submitted", true),
	RECEIVED_MSG_DELETED(77, "Received Message Deleted", true),
	
	RECEIVED_MSG_ID_PROOF_SUBMIT_CRED(81, "Received Proof Submit with Cred", true),
	RECEIVED_MSG_ID_PROOF_SUBMIT_NO_CRED(82, "Received Proof Submit no Cred", true),
	RECEIVED_MSG_TEXT(83, "Received Text", true),
	RECEIVED_MSG_WEB_LINK(84, "Received Web Link", true),
	RECEIVED_MSG_INVITATION(85, "Received Invitation", true),
	RECEIVED_MSG_CTX_MENU_SELECTION(86, "Received Context Menu Selection", true),
	RECEIVED_MSG_MENU_SELECT_ANSWER(87, "Received Menu Select Answer", true),
	RECEIVED_MSG_MEDIA(88, "Received Media", true),
	RECEIVED_MSG_OTHERS(89, "Received Others", true),
	
	
	
	
	;
	private Boolean showByDefault;
	
	private DidcommServiceStat(Integer index, String label, Boolean showByDefault){
		this.index = index;
		this.label = label;
		this.showByDefault = showByDefault;
	}

	public Boolean isShowByDefault() {
		return showByDefault;
	}
	private Integer index;

	public Integer getIndex(){
		return this.index;
	}
	
	public static DidcommServiceStat getEnum(Integer index){
		if (index == null)
	return null;
		
		switch(index){
			case -1: return DATE_TS;
			case 1: return ESTABLISHED_CONNECTION;
			case 2: return TERMINATED_CONNECTION;
			case 30: return SENT_MSG;
			case 31: return SENT_MSG_SPOOLED;
			case 32: return SENT_MSG_RECEIVED;
			case 33: return SENT_MSG_VIEWED;
			case 34: return SENT_MSG_BCAST;
			case 35: return SENT_MSG_ERROR;
			
			case 36: return SENT_MSG_CREATED;
			case 37: return SENT_MSG_SUBMITTED;
			case 38: return SENT_MSG_DELETED;
			
			
			case 40: return SENT_MSG_VC;
			case 41: return SENT_MSG_ID_PROOF_REQUEST;
			case 42: return SENT_MSG_TEXT;
			case 43: return SENT_MSG_WEB_LINK;
			case 44: return SENT_MSG_INVITATION;
			case 45: return SENT_MSG_CTX_MENU_UPDATE;
			case 46: return SENT_MSG_MENU_DISPLAY;
			case 47: return SENT_MSG_MEDIA;
			case 48: return SENT_MSG_OTHERS;
			
			case 70: return RECEIVED_MSG;
			case 71: return RECEIVED_MSG_RECEIVED;
			case 72: return RECEIVED_MSG_VIEWED;
			case 73: return RECEIVED_MSG_SPOOLED;
			
			case 74: return RECEIVED_MSG_ERROR;
			
			case 75: return RECEIVED_MSG_CREATED;
			case 76: return RECEIVED_MSG_SUBMITTED;
			case 77: return RECEIVED_MSG_DELETED;
			
			
			
			case 81: return RECEIVED_MSG_ID_PROOF_SUBMIT_CRED;
			case 82: return RECEIVED_MSG_ID_PROOF_SUBMIT_NO_CRED;
			case 83: return RECEIVED_MSG_TEXT;
			case 84: return RECEIVED_MSG_WEB_LINK;
			case 85: return RECEIVED_MSG_INVITATION;
			case 86: return RECEIVED_MSG_CTX_MENU_SELECTION;
			case 87: return RECEIVED_MSG_MENU_SELECT_ANSWER;
			case 88: return RECEIVED_MSG_MEDIA;
			case 89: return RECEIVED_MSG_OTHERS;
			
			default: return null;
		}
	}
	
	public String getValue() {
		return this.name();
	}
	private String label;
	public String getLabel() {
		return label;
	}
	
	private String description;
	public String getDescription() {
		return description;
	}
	
	public String getName() {
		return this.toString();
	}

	
}