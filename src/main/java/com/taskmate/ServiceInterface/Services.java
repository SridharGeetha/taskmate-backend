package com.taskmate.ServiceInterface;



public interface Services<T>{

    public T create(T data);

    public T get(Long id);

    public void delete(Long id);

    public T update(Long id,T user);

}