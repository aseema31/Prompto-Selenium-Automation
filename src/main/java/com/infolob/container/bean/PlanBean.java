package main.java.com.infolob.container.bean;

public class PlanBean {

	private String planName;
	private String planDescription;
	private String planAmount;
	private String planDiscount;
	private int recurring;
	private String recurringTerm;
	private int recurringTermUnit;
	private String gracePeriod;
	private int gracePeriodUnit;
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanDescription() {
		return planDescription;
	}
	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}
	public String getPlanAmount() {
		return planAmount;
	}
	public void setPlanAmount(String planAmount) {
		this.planAmount = planAmount;
	}
	public String getPlanDiscount() {
		return planDiscount;
	}
	public void setPlanDiscount(String planDiscount) {
		this.planDiscount = planDiscount;
	}
	public int getRecurring() {
		return recurring;
	}
	public void setRecurring(int recurring) {
		this.recurring = recurring;
	}
	public String getRecurringTerm() {
		return recurringTerm;
	}
	public void setRecurringTerm(String recurringTerm) {
		this.recurringTerm = recurringTerm;
	}
	public int getRecurringTermUnit() {
		return recurringTermUnit;
	}
	public void setRecurringTermUnit(int recurringTermUnit) {
		this.recurringTermUnit = recurringTermUnit;
	}
	public String getGracePeriod() {
		return gracePeriod;
	}
	public void setGracePeriod(String gracePeriod) {
		this.gracePeriod = gracePeriod;
	}
	public int getGracePeriodUnit() {
		return gracePeriodUnit;
	}
	public void setGracePeriodUnit(int gracePeriodUnit) {
		this.gracePeriodUnit = gracePeriodUnit;
	}
	
	public void print()
	{
		System.out.println("Bean name:: "+this.planName  );
		System.out.println("Bean  description:: "+this.planDescription  );
		System.out.println("Bean :: amount "+ this.planAmount );
		System.out.println("Bean :: discount "+this.planDiscount  );
		System.out.println("Bean :: recurring " +this.recurring );
		System.out.println("Bean :: recurring term "+ this.recurringTerm  );
		System.out.println("Bean :: recurring term unit " + this.recurringTermUnit );
		System.out.println("Bean :: grace period "+ this.gracePeriod  );
		System.out.println("Bean :: grace priod term "+this.gracePeriodUnit  );
	
	}
	
}
