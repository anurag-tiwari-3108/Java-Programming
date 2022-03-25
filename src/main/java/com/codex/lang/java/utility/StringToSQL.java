package com.codex.lang.java.utility;

public class StringToSQL {

	public static void main(String[] args) {
		 String query = "SELECT AB1.SALT AS PARENT_SALT, AB2.SALT AS CHILD_SALT"
                 +" FROM JOIN_AGENT_MAP JAM"
                 +" LEFT JOIN AGENT_BODY AB1 ON (AB1.ID = JAM.PARENT AND AB1.STATUS > 0)"
                 +" LEFT JOIN AGENT_BODY AB2 ON (AB2.ID = JAM.CHILD AND AB2.STATUS > 0)"
                 +" LEFT JOIN AGENT_REF AR1 ON (AR1.BODYID = AB1.ID AND AR1.REFERENCE = AB1.SALT AND AR1.DELETED = 0)"
                 +" LEFT JOIN AGENT_REF AR2 ON (AR2.BODYID = AB2.ID AND AR2.REFERENCE = AB2.SALT AND AR2.DELETED = 0)"
                 +" START WITH PARENT = (SELECT BODYID FROM AGENT_REF WHERE REFERENCE = '"
                 +"DELHI "+"' AND DELETED= '0')"
                 +" CONNECT BY PRIOR CHILD = PARENT";
 System.out.println("Query "+query);

	}
}
