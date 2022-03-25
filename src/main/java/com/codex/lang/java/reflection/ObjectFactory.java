package com.codex.lang.java.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ObjectFactory {
	private static String cName = ObjectFactory.class.getName() + " :: ";
	public static void main(String[] args) {

		System.out.println(cName+"Calling Object Repo");
		try {
			callFactoryForObject("cashin");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void callFactoryForObject(String transtype)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {

		String bizFuctions = Configs.getStringProperties("dlm.plugin.req." + transtype);
		BizRequest aRequest = new BizRequest("1001", "cashin", "9887000110", "9560547321", "10000000");

		if (bizFuctions == null) {
			System.out.println(cName + "No plugin found. Rolling back the trans");
			return;
		}
		String plugin = bizFuctions;

		System.out.println(cName + "Processing request with " + plugin);
		Class<?> bizClass = Class.forName(plugin);
//		Object bizObj = bizClass.newInstance();

		Method[] declaredMethods = bizClass.getDeclaredMethods();
		for (Method method : declaredMethods) {
			try {
				System.out.println(cName + "Method  :: " + method);
				String methodName = method.getName();

				if (methodName.equalsIgnoreCase("processTransaction")) {
					System.out.println(cName + "Invoking method name " + methodName);
					// Declare the method as accessible.
					method.setAccessible(true);
					System.out.println(cName + "Updating Accessiblity of method " + methodName);					
					// invoking the method of action class
					Object returnValue = method.invoke(transtype , aRequest );
					System.out.println(cName + "Method name" + returnValue);
					break;
				}

			} catch (InvocationTargetException ex) {
				System.out.println("InvocationTargetException ! Cause:: "+ ex.getCause());
				ex.printStackTrace();
				System.out.println(cName + "An InvocationTargetException was caught!"+ ex);
				return;
			} catch (Exception ex) {
				ex.printStackTrace();
				System.err.println("Unhandled Exception ! Cause:: " + ex.getCause());
				System.err.println(cName + "Unhandled Exception::" + ex);
				return;
			}
		}

	}

}
