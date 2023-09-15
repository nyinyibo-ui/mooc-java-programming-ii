/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.*;
public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;
    
    public UserInterface(TodoList todoList,Scanner scanner){
        this.todoList=todoList;
        this.scanner=scanner;
    }
    
    public void start(){
        while (true){
            System.out.println("Command: ");
            String command=scanner.nextLine();
            
            if (command.equals("stop")){
                break;
            }else if(command.equals("add")){
                this.add();
            }else if (command.equals("list")){
                this.list();
            }else if (command.equals("remove")){
                this.remove();
            }
            
        }
    }
    
    public void add(){
        System.out.println("To add");
        String task =scanner.nextLine();
        this.todoList.add(task);
    }
    
    public void list(){
        this.todoList.print();
    }
    
    public void remove(){
        System.out.println("Which one is removed?");
        String index=scanner.nextLine();
        this.todoList.remove(Integer.valueOf(index));
    }
    
    
}
