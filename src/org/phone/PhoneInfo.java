package org.phone;

public class PhoneInfo {
public void phoneName() {
	System.out.println("Phone Name: Samsung");
}

public void phoneMieiNum() {
	System.out.println("Phone Model Number: 50210");
}

public void Camera() {
	System.out.println("Front and Back camera");
}
public void storage() {
	System.out.println("32 GB");
}

public void osName() {
	System.out.println("Latest Version");
}

public static void main(String[] args) {
	PhoneInfo pi = new PhoneInfo();
	pi.phoneName();
	pi.phoneMieiNum();
	pi.Camera();
	pi.storage();
	pi.osName();
}

}
