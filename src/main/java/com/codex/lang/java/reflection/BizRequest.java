package com.codex.lang.java.reflection;

public class BizRequest {

	String txnid;
	String transtype;
	String debtor ;
	String creditor;
	String amount;
	public BizRequest(String txnid, String transtype, String debtor, String creditor, String amount ) {
		this.amount = amount;
		this.txnid = txnid;
		this.transtype = transtype;
		this.debtor = debtor;
		this.creditor = creditor;
	}
}
