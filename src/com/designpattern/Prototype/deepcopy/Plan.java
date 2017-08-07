package com.designpattern.Prototype.deepcopy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 计划
 * @author Json<<json1990@foxmail.com>>
 */
public class Plan implements Cloneable {
	//计划名称
	private String name;
	//任务级别
	private int level;
	//开始时间
	private Date startdate;
	//截止时间
	private Date enddate;
	//执行人员
	private List<String> executors = new ArrayList<String>();
	
	@Override
	public Plan clone(){
		try {
			Plan plan = (Plan) super.clone();
			//引用类型的属性，需要处理
			if(this.getExecutors() != null){
        		List<String> _executors = new ArrayList<String>();
        		for(String s : this.getExecutors()){
        			_executors.add(s);
        		}
        		plan.setExecutors(_executors);
        	}
            
            return plan;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public List<String> getExecutors() {
		return executors;
	}

	public void setExecutors(List<String> executors) {
		this.executors = executors;
	}

	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", level=" + level + ", startdate=" + startdate + ", enddate=" + enddate
				+ ", executors=" + executors + "]";
	}
	
}
