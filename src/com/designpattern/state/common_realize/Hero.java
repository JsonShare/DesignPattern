package com.designpattern.state.common_realize;

/**
 * 模拟英雄类状态变化
 * @author Json<<json1990@foxmail.com>>
 */
public class Hero {
	  /**
	   * 正常状态
	   */
	  public static final int NORMAL_STATE = 1;
	  /**
	   * 加速状态
	   */
	  public static final int EXPEDITE_STATE = 2;
	  /**
	   * 减速状态
	   */
	  public static final int DECELERATE_STATE = 3;
	  /**
	   * 眩晕状态
	   */
	  public static final int DIZZINESS_STATE = 4;
	  
	  //保存英雄当前状态，默认是正常状态
	  private int state = NORMAL_STATE;
	  
	  //英雄移动线程
	  private Thread moveThread;
	  
	  //设置状态
	  public void setState(int state) {
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
	                  try {
	                      hero.move();
	                  } catch (InterruptedException e) {
	                      break;
	                  }
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
	  
	  //英雄类处理移动
	  private void move() throws InterruptedException{
	      if (state == EXPEDITE_STATE) {
	          System.out.println("加速状态，英雄加速移动");
	          //假设加速持续5秒
	          Thread.sleep(5000);
	          state = NORMAL_STATE;
	          System.out.println("加速状态结束，恢复正常状态");
	      }else if (state == DECELERATE_STATE) {
	          System.out.println("减速状态，英雄減速移动");
	          //假设减速持续2.5秒
	          Thread.sleep(2500);
	          state = NORMAL_STATE;
	          System.out.println("减速状态结束，恢复正常状态");
	      }else if (state == DIZZINESS_STATE) {
	          System.out.println("眩晕状态，英雄停止移动");
	          //假设眩晕持续1.5秒
	          Thread.sleep(1500);
	          state = NORMAL_STATE;
	          System.out.println("眩晕状态结束，恢复正常状态");
	      }else {
	          //正常跑动则不打印内容，会刷屏
	      }
	  }

}
