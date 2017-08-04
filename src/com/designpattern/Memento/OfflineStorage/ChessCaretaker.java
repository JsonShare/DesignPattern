package com.designpattern.Memento.OfflineStorage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 象棋备忘录管理者角色
 * @author Json<<json1990@foxmail.com>>
 */
public class ChessCaretaker{
    /**
     * 保存备忘录对象
     * @param memento 被保存的备忘录对象
     */
    public void saveMemento(ChessMemento memento){
       //写到文件中
       ObjectOutputStream out = null;
       try{
           out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("E:\\ChessMemento")));
           out.writeObject(memento);
       }catch(Exception err){
           err.printStackTrace();
       }finally{
           try {
              out.close();
           } catch (IOException e) {
              e.printStackTrace();
           }
       }
    }
    /**
     * 获取被保存的备忘录对象
     * @return 被保存的备忘录对象
     */
    public ChessMemento retrieveMemento(){
       ChessMemento memento = null;
       //从文件中获取备忘录数据
       ObjectInputStream in = null;
       try{
           in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("E:\\ChessMemento")));
           memento = (ChessMemento)in.readObject();
       }catch(Exception err){
           err.printStackTrace();
       }finally{
           try {
              in.close();
           } catch (IOException e) {
              e.printStackTrace();
           }
       }
       return memento;
    }
}
