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
	
	SENT_MSG_VC(40, "Sent Message Broadcast", true),
	SENT_MSG_PR(41, "Sent Message Presentation Request", true),
	SENT_MSG_TEXT(42, "Sent Message Presentation Request", true),
	SENT_MSG_WEB_LINK(43, "Sent Message Presentation Request", true),
	SENT_MSG_INVITATION(44, "Sent Message Presentation Request", true),
	SENT_MSG_ROOT_MENU(45, "Sent Message Presentation Request", true),
	SENT_MSG_SELECT_MENU(46, "Sent Message Presentation Request", true),
	SENT_MSG_MEDIA(47, "Sent Message Presentation Request", true),
	
	
	
	RECEIVED_MSG(70, "Received Message", true),
	
	RECEIVED_MSG_IP_CRED(71, "Sent Message Broadcast", true),
	RECEIVED_MSG_IP_NO_CRED(72, "Sent Message Broadcast", true),
	RECEIVED_MSG_TEXT(73, "Sent Message Presentation Request", true),
	RECEIVED_MSG_WEB_LINK(74, "Sent Message Presentation Request", true),
	RECEIVED_MSG_INVITATION(75, "Sent Message Presentation Request", true),
	RECEIVED_MSG_ROOT_MENU(76, "Sent Message Presentation Request", true),
	RECEIVED_MSG_SELECT_MENU(77, "Sent Message Presentation Request", true),
	RECEIVED_MSG_MEDIA(78, "Sent Message Presentation Request", true),
	
	
	
	
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
			case 31: return SENT_MSG_SPOOLED;
			case 32: return SENT_MSG_RECEIVED;
			case 33: return SENT_MSG_VIEWED;
			case 34: return SENT_MSG_BCAST;
			case 40: return SENT_MSG_VC;
			case 41: return SENT_MSG_PR;
			case 42: return SENT_MSG_TEXT;
			case 43: return SENT_MSG_WEB_LINK;
			case 44: return SENT_MSG_INVITATION;
			case 45: return SENT_MSG_ROOT_MENU;
			case 46: return SENT_MSG_SELECT_MENU;
			case 47: return SENT_MSG_MEDIA;
			case 70: return RECEIVED_MSG;
			case 71: return RECEIVED_MSG_IP_CRED;
			case 72: return RECEIVED_MSG_IP_NO_CRED;
			case 73: return RECEIVED_MSG_TEXT;
			case 74: return RECEIVED_MSG_WEB_LINK;
			case 75: return RECEIVED_MSG_INVITATION;
			case 76: return RECEIVED_MSG_ROOT_MENU;
			case 77: return RECEIVED_MSG_SELECT_MENU;
			case 78: return RECEIVED_MSG_MEDIA;
			
			
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