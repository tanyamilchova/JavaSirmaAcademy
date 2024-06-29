package org.example;

public class Task3GenericScale<T extends Comparable<T>> {
    //Create a class Scale&lt;T extends Comparable&lt;T&gt;&gt; that holds two elements - left and
    //right. The scale should receive the elements through its single constructor:


    private T left;
    private T right;

    public Task3GenericScale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    protected T getHavier(){
        if(left.compareTo(right)>0){
            return left;
        }else {
            if(left.compareTo(right)<0){
                return right;
            }else {
                return null;
            }
        }
    }


    public static void main(String[] args) {
        Task3GenericScale<Integer> scale=new Task3GenericScale<>(5,10);
        Task3GenericScale<String> strScale=new Task3GenericScale<>("Bonny","Ammy");
        System.out.println(scale.getHavier());
        System.out.println(strScale.getHavier());
    }
}



