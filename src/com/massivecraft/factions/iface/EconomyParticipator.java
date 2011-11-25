package com.massivecraft.factions.iface;

import com.iConomy.system.Account;

public interface EconomyParticipator extends RelationParticipator
{
	public Account getAccount();
	
	public void msg(String str, Object... args);
}