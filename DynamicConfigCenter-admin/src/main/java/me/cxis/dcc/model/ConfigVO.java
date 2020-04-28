package me.cxis.dcc.model;

import java.io.Serializable;

public class ConfigVO implements Serializable {

    private static final long serialVersionUID = 980055193373837391L;

    private Long groupId;

    private Long envId;

    private Integer type;

    private String key;

    private String desc;

    private String value;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ConfigVO{" +
            "groupId=" + groupId +
            ", envId=" + envId +
            ", type=" + type +
            ", key='" + key + '\'' +
            ", desc='" + desc + '\'' +
            ", value='" + value + '\'' +
            '}';
    }
}