/**
 * 
 */
package com.tangcong.deal.support.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class TreeNode extends HashMap<String, Object> implements Serializable{
	private static final long serialVersionUID = 258297653182861546L;
	private String id;
	private String name;
	private String code;
	private List<TreeNode> children;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		this.put("name", name);
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
		this.put("code", code);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
		this.put("id",id);
	}
	
	public List<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(List<TreeNode> children) {
		this.children = children;
		this.put("children", children);
	}
	public void addChild(TreeNode child) {
		if(this.children==null) {
			this.setChildren(new LinkedList<>());
		}
		this.children.add(child);
	}
	
	
	
}
