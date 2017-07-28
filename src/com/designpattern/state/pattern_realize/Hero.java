package com.designpattern.state.pattern_realize;

/**
 * 上下文：模拟英雄类
 * @author Json<<json1990@foxmail.com>>
 */
public class Hero {
	  /**
	   * 正常状态
	   */
	  public static final State NORMAL_STATE = new NormalState();
	  /**
	   * 加速状态
	   */
	  public static final State EXPEDITE_STATE = new ExpediteState();
	  /**
	   * 减速状态
	   */
	  public static final State DECELERATE_STATE = new DecelerateState();
	  /**
	   * 眩晕状态
	   */
	  public static final State DIZZINESS_STATE = new DizzinessState();
	  
	  //保存英雄当前状态，默认是正常状态
	  private State state = NORMAL_STATE;
	  
	  //英雄移动线程
	  private Thread moveThread;
	  
	  //设置状态
	  public void setState(State state) {
	      this.state = state;
	  }
	  
	  //开始移动
	  public void startMove() {
	      if (isMoving()) {
	          return;
	      }
	      final Hero hero = this;
	      moveThread = new Thread(new Runnable() {
	          public void run() {
	              while (!moveThread.isInterrupted()) {
	            	  state.move(hero);
	              }
	          }
	      });
	      System.out.println("英雄开始移动.");
	      moveThread.start();
	  }
	  
	  //停止移动
	  public void stopMove() {
	      if (isMoving()) 
	    	  moveThread.interrupt();
	      System.out.println("英雄停止移动.");
	  }
	  
	  //判断英雄是否在移动
	  private boolean isMoving(){
	      return moveThread != null && !moveThread.isInterrupted();
	  }
}
