package com.nttdata.bootcamp.taller3ansanlop;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Main {

	public static void main(String[] args) {
		Observable<String> observable= Observable.create(emitter->{
			
			emitter.onNext("firts text ");
			
			emitter.onComplete();
		});

		
	
		observable.subscribe(new Observer<String>() {

			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("on subscribe send by oberserver 1");
				
			}

			@Override
			public void onNext(String t) {
				System.out.println(t+"on next send by oberserver 1");
				
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Error "+e.getMessage()+" send by observer 1");
				
			}

			@Override
			public void onComplete() {
				System.out.println("Completed oberserver 1");
				
			}
			
		});
		
		observable.subscribe(new Observer<String>() {

			@Override
			public void onSubscribe(Disposable d) {
				//d.dispose();
				System.out.println("on subscribe send by oberserver 2");
				
			}

			@Override
			public void onNext(String t) {
				System.out.println(t+"send by oberserver 2");
				
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Error "+e.getMessage()+" send by observer 2");
			}

			@Override
			public void onComplete() {
				System.out.println("Completed oberserver 2");
				
			}
			
		});
		
		

	}
	}
