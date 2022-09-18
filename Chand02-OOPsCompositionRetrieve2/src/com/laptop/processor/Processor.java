package com.laptop.processor;

public class Processor {

	private String brand;
	private String series;
	private int  generation;
	private int  cores;
	private int threads;
	private String frequency;
	private String miniFrequency;
	private String maxFrequency;
	private String cacheMemory;
	
	public Processor() {
		this.brand = "iCore";
		this.series = "46IMB";
		this.generation = 5;
		this.cores = 2;
		this.threads = 8;
		this.frequency = "2.5Ghz";
		this.miniFrequency = "2.5Ghz";
		this.maxFrequency = "3.1Ghz";
		this.cacheMemory = "HexDecimal";
	}
	public Processor(String brand, String series, int generation, int cores, int threads, String frequency,
			String miniFrequency, String maxFrequency, String cacheMemory) {
		//super();
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.frequency = frequency;
		this.miniFrequency = miniFrequency;
		this.maxFrequency = maxFrequency;
		this.cacheMemory = cacheMemory;
	}
	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
				+ ", threads=" + threads + ", frequency=" + frequency + ", miniFrequency=" + miniFrequency
				+ ", maxFrequency=" + maxFrequency + ", cacheMemory=" + cacheMemory + "]";
	}
	public String getBrand() {
		return brand;
	}
	public String getSeries() {
		return series;
	}
	public int getGeneration() {
		return generation;
	}
	public int getCores() {
		return cores;
	}
	public int getThreads() {
		return threads;
	}
	public String getFrequency() {
		return frequency;
	}
	public String getMiniFrequency() {
		return miniFrequency;
	}
	public String getMaxFrequency() {
		return maxFrequency;
	}
	public String getCacheMemory() {
		return cacheMemory;
	}
	
}
