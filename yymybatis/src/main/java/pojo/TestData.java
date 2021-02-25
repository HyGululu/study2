package pojo;

import java.io.Serializable;
import java.util.Date;

public class TestData implements Serializable {
    private Long id;

    private Long caseId;

    private String caseName;

    private int status;

    private String ignoreData;

    private String premise;

    private String url;

    private String request;

    private String response;

    private String interfaceName;

    private String applicationName;

    private String serviceName;

    private String project;

    private String type;

    private String version;

    private String comments;

    private Date createTime;

    private Date updateTime;

    private int smoke;

    private static final long serialVersionUID = 1L;

    public TestData() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getIgnoreData() {
        return ignoreData;
    }

    public void setIgnoreData(String ignoreData) {
        this.ignoreData = ignoreData;
    }

    public String getPremise() {
        return premise;
    }

    public void setPremise(String premise) {
        this.premise = premise;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getSmoke() {
        return smoke;
    }

    public void setSmoke(int smoke) {
        this.smoke = smoke;
    }

    @Override
    public String toString() {
        return "TestData{" +
                "id=" + id +
                ", caseId=" + caseId +
                ", caseName='" + caseName + '\'' +
                ", status=" + status +
                ", ignoreData='" + ignoreData + '\'' +
                ", premise='" + premise + '\'' +
                ", url='" + url + '\'' +
                ", request='" + request + '\'' +
                ", response='" + response + '\'' +
                ", interfaceName='" + interfaceName + '\'' +
                ", applicationName='" + applicationName + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", project='" + project + '\'' +
                ", type='" + type + '\'' +
                ", version='" + version + '\'' +
                ", comments='" + comments + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", smoke=" + smoke +
                '}';
    }
}