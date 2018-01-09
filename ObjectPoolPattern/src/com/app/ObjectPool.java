package com.app;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {

	private long expirationTime;
	private Hashtable<T, Long> locked,unlocked;

	public ObjectPool(){
		expirationTime = 30000;
		locked = new Hashtable<T,Long>();
		unlocked = new Hashtable<T,Long>();
	}

	public abstract T create();
	public abstract boolean validate(T o);
	public abstract void expire(T o);

	public synchronized T checkOut(){
		long now = System.currentTimeMillis();
		System.out.println(now);
		T t;
		if(unlocked.size()>0){
			System.out.println("Entered in to unlocked Section");
			Enumeration<T> e = unlocked.keys();
			while(e.hasMoreElements()){
				t = e.nextElement();
				if((now-unlocked.get(t))>expirationTime){
					// object has expired
					unlocked.remove(t);
					expire(t);
					t = null;
				}else{
					if(validate(t)){
						unlocked.remove(t);
						locked.put(t, now);
						return t;
					}else{
						// object failed validation
						unlocked.remove(t);
						expire(t);
						t = null;
					}
				}
			}
		}
		// no objects available, create a new one
		System.out.println("Entered into locked Section");
		t = create();
		locked.put(t, now);
		return (t);
	}
	public synchronized void checkIn(T t) {
		locked.remove(t);
		unlocked.put(t, System.currentTimeMillis());
	}
}
