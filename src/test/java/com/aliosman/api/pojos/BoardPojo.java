package com.aliosman.api.pojos;

public class BoardPojo {
    private String id;
    private String name;
    private String desc;
    private Object descData;
    private Boolean closed;
    private String idOrganization;
    private Object idEnterprise;
    private Boolean pinned;
    private String url;
    private String shortUrl;
    private Prefs prefs;
    private LabelNames labelNames;
    private Limits limits;

    /**
     * No args constructor for use in serialization
     *
     */
    public BoardPojo() {
    }

    /**
     *
     * @param descData
     * @param pinned
     * @param labelNames
     * @param shortUrl
     * @param url
     * @param prefs
     * @param idEnterprise
     * @param name
     * @param idOrganization
     * @param closed
     * @param id
     * @param limits
     * @param desc
     */
    public BoardPojo(String id, String name, String desc, Object descData, Boolean closed, String idOrganization, Object idEnterprise, Boolean pinned, String url, String shortUrl, Prefs prefs, LabelNames labelNames, Limits limits) {
        super();
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.descData = descData;
        this.closed = closed;
        this.idOrganization = idOrganization;
        this.idEnterprise = idEnterprise;
        this.pinned = pinned;
        this.url = url;
        this.shortUrl = shortUrl;
        this.prefs = prefs;
        this.labelNames = labelNames;
        this.limits = limits;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getDescData() {
        return descData;
    }

    public void setDescData(Object descData) {
        this.descData = descData;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public String getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(String idOrganization) {
        this.idOrganization = idOrganization;
    }

    public Object getIdEnterprise() {
        return idEnterprise;
    }

    public void setIdEnterprise(Object idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public Boolean getPinned() {
        return pinned;
    }

    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public Prefs getPrefs() {
        return prefs;
    }

    public void setPrefs(Prefs prefs) {
        this.prefs = prefs;
    }

    public LabelNames getLabelNames() {
        return labelNames;
    }

    public void setLabelNames(LabelNames labelNames) {
        this.labelNames = labelNames;
    }

    public Limits getLimits() {
        return limits;
    }

    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    @Override
    public String toString() {
        return "BoardPojo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", descData=" + descData +
                ", closed=" + closed +
                ", idOrganization='" + idOrganization + '\'' +
                ", idEnterprise=" + idEnterprise +
                ", pinned=" + pinned +
                ", url='" + url + '\'' +
                ", shortUrl='" + shortUrl + '\'' +
                ", prefs=" + prefs +
                ", labelNames=" + labelNames +
                ", limits=" + limits +
                '}';
    }
}
