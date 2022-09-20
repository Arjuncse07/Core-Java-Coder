package com.arjun.interface1;
public class InterfaceEx2 {                         //implements DemoInterface (optional)
public static void main(String[] args) {
	
	DemoInterface kk =new DemoInterface() {            //create object for interface(hahahhahhaha)
		                                               // anaonymous inested class
		@Override
		public void show() {	
		}

		@Override
		public void submit() {
					}
		
	};
	kk.show();
	kk.submit();
}
}
