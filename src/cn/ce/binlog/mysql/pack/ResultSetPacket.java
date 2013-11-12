package cn.ce.binlog.mysql.pack;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class ResultSetPacket {

	private SocketAddress sourceAddress;
	private List<FieldPacket> fieldDescriptors = new ArrayList<FieldPacket>();
	private List<String> fieldValues = new ArrayList<String>();

	public void setFieldDescriptors(List<FieldPacket> fieldDescriptors) {
		this.fieldDescriptors = fieldDescriptors;
	}

	public List<FieldPacket> getFieldDescriptors() {
		return fieldDescriptors;
	}

	public void setFieldValues(List<String> fieldValues) {
		this.fieldValues = fieldValues;
	}

	public List<String> getFieldValues() {
		return fieldValues;
	}

	public void setSourceAddress(SocketAddress sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	public SocketAddress getSourceAddress() {
		return sourceAddress;
	}

	@Override
	public String toString() {
		String s = ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
		return s;
	}

}
