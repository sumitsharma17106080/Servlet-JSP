package com.servlet;

public class Training {
	Integer trainingId;
	String trainingName;
	String trainingSdate;
	String trainingEdate;
	String trainingMode;
	String businiseUnit;
	String contactpersonId;
	public Integer getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public String getTrainingSdate() {
		return trainingSdate;
	}
	public void setTrainingSdate(String trainingSdate) {
		this.trainingSdate = trainingSdate;
	}
	public String getTrainingEdate() {
		return trainingEdate;
	}
	public void setTrainingEdate(String trainingEdate) {
		this.trainingEdate = trainingEdate;
	}
	public String getTrainingMode() {
		return trainingMode;
	}
	public void setTrainingMode(String trainingMode) {
		this.trainingMode = trainingMode;
	}
	public String getBusiniseUnit() {
		return businiseUnit;
	}
	public void setBusiniseUnit(String businiseUnit) {
		this.businiseUnit = businiseUnit;
	}
	public String getContactpersonId() {
		return contactpersonId;
	}
	public void setContactpersonId(String contactpersonId) {
		this.contactpersonId = contactpersonId;
	}
	public Training(Integer trainingId, String trainingName, String trainingSdate, String trainingEdate,
			String trainingMode, String businiseUnit, String contactpersonId) {
		super();
		this.trainingId = trainingId;
		this.trainingName = trainingName;
		this.trainingSdate = trainingSdate;
		this.trainingEdate = trainingEdate;
		this.trainingMode = trainingMode;
		this.businiseUnit = businiseUnit;
		this.contactpersonId = contactpersonId;
	}
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Training [trainingId=" + trainingId + ", trainingName=" + trainingName + ", trainingSdate="
				+ trainingSdate + ", trainingEdate=" + trainingEdate + ", trainingMode=" + trainingMode
				+ ", businiseUnit=" + businiseUnit + ", contactpersonId=" + contactpersonId + "]";
	}
	
	

}
