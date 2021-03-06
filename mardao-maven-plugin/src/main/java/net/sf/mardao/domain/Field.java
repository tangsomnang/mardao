package net.sf.mardao.domain;

import net.sf.mardao.plugin.ProcessDomainMojo;


/**
 * The domain object for fields in the class graph.
 * @author f94os
 *
 */
public class Field implements Comparable<Field> {
	private String columnName;
	private String name;
	private String type;
	private String mappedBy;
	/** for many-to-ones */
	private Entity entity;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
        
        public String getNameUpper() {
            return null != name ? name.toUpperCase() : null;
        }

        public String getNameFirst() {
            return ProcessDomainMojo.firstToUpper(name);
        }

        public String getNameLower() {
            return ProcessDomainMojo.firstToLower(name);
        }

	public void setType(String type) {
		this.type = type;
	}


	public String getType() {
		return type;
	}
	
	public String getSimpleType() {
		String returnValue = this.type;
		int beginIndex = type.lastIndexOf('.');
		if (-1 < beginIndex) {
			returnValue = type.substring(beginIndex+1);
		}
		return returnValue;
	}
	
	@Override
	public String toString() {
		return name;
	}


	@Override
	public int compareTo(Field other) {
		return toString().compareTo(other.toString());
	}


	public void setMappedBy(String mappedBy) {
		this.mappedBy = mappedBy;
	}


	public String getMappedBy() {
		return mappedBy;
	}


	public void setEntity(Entity entity) {
		this.entity = entity;
	}


	public Entity getEntity() {
		return entity;
	}


	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}


	public String getColumnName() {
		if (null == columnName) {
			return name;
		}
		return columnName;
	}
}
