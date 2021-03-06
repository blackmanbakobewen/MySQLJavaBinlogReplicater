package cn.ce.binlog.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "logPos", "binfile", "when", "mysqlServerId",
		"eventTypeString", "binlogFileName", }, name = "EventVOType")
public class EventVO implements java.io.Serializable {
	private Long logPos;
	private String binfile;
	private Long when;
	private Long mysqlServerId;
	private String eventTypeString;
	private String binlogFileName;

	public long getLogPos() {
		return logPos;
	}

	public void setLogPos(long logPos) {
		this.logPos = logPos;
	}

	public long getWhen() {
		return when;
	}

	public void setWhen(long when) {
		this.when = when;
	}

	public long getMysqlServerId() {
		return mysqlServerId;
	}

	public void setMysqlServerId(long mysqlServerId) {
		this.mysqlServerId = mysqlServerId;
	}

	public String getEventTypeString() {
		return eventTypeString;
	}

	public void setEventTypeString(String eventTypeString) {
		this.eventTypeString = eventTypeString;
	}

	public String getBinlogFileName() {
		return binlogFileName;
	}

	public void setBinlogFileName(String binlogFileName) {
		this.binlogFileName = binlogFileName;
	}

	public String getBinfile() {
		return binfile;
	}

	public void setBinfile(String binfile) {
		this.binfile = binfile;
	}

	@Override
	public String toString() {
		String s = ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
		return s;
	}
}
