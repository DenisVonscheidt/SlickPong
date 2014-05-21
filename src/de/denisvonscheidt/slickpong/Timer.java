package de.denisvonscheidt.slickpong;

final class Timer {
	private int finalTime;
	private int currentTime;
	private boolean timeOver;
	
	Timer(int timeInMillies) {
		this.timeOver = false;
		this.finalTime = timeInMillies;
		this.currentTime = 0;
	}
	
	void addTime( int timeInMillis) {
		this.currentTime = this.currentTime + timeInMillis;
		if (this.currentTime >= finalTime) {
			timeOver = true;
		}
	}
	
	boolean isTimeOver() {
		return this.timeOver;
	}
	
	void reset() {
		this.timeOver = false;
		this.currentTime = 0;
	}

}
