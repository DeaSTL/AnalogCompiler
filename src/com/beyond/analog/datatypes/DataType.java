package com.beyond.analog.datatypes;

public abstract class DataType {
	public String data_type = null;
	public String data_value = null;
	public int block_index;
	public int block_start;
	public int block_end;
	public String getData_type() {
		return data_type;
	}
	public String getData_value() {
		return data_value;
	}
	public int getBlock_index() {
		return block_index;
	}
	public int getBlock_start() {
		return block_start;
	}
	public int getBlock_end() {
		return block_end;
	}
	public void setData_type(String data_type) {
		this.data_type = data_type;
	}
	public void setData_value(String data_value) {
		this.data_value = data_value;
	}
	public void setBlock_index(int block_index) {
		this.block_index = block_index;
	}
	public void setBlock_start(int block_start) {
		this.block_start = block_start;
	}
	public void setBlock_end(int block_end) {
		this.block_end = block_end;
	}
	
	
}
