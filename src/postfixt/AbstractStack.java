/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package postfixt;

/**
 *
 * @author Daniel Orozco <daniel.orozco>
 * @param <T>
 */
public abstract class AbstractStack<T> implements IStack<T> {

    /**
     *
     * @return
     */
    @Override
    public abstract T pop();    

    /**
     *
     * @param t
     */
    @Override
    public abstract void push(T t);

    /**
     *
     * @return
     */
    @Override
    public abstract boolean isEmpty();
}
