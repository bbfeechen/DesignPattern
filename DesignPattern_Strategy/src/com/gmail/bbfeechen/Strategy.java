package com.gmail.bbfeechen;

public interface Strategy {
	public abstract Hand nextHand();
	public abstract void study(boolean win);
}