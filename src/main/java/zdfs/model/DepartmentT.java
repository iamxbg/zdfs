package zdfs.model;

import java.util.Date;

public class DepartmentT {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_t.id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_t.code
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_t.name
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_t.description
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_t.address
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_t.dep_photo
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private String dep_photo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_t.department_type_id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Integer department_type_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_t.tel
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_t.create_time
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Date create_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_t.delflag
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Boolean delflag=false;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_t.hos_id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Integer hos_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_t.id
     *
     * @return the value of department_t.id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_t.id
     *
     * @param id the value for department_t.id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_t.code
     *
     * @return the value of department_t.code
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_t.code
     *
     * @param code the value for department_t.code
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_t.name
     *
     * @return the value of department_t.name
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_t.name
     *
     * @param name the value for department_t.name
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_t.description
     *
     * @return the value of department_t.description
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_t.description
     *
     * @param description the value for department_t.description
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_t.address
     *
     * @return the value of department_t.address
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_t.address
     *
     * @param address the value for department_t.address
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_t.dep_photo
     *
     * @return the value of department_t.dep_photo
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public String getDep_photo() {
        return dep_photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_t.dep_photo
     *
     * @param dep_photo the value for department_t.dep_photo
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setDep_photo(String dep_photo) {
        this.dep_photo = dep_photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_t.department_type_id
     *
     * @return the value of department_t.department_type_id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Integer getDepartment_type_id() {
        return department_type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_t.department_type_id
     *
     * @param department_type_id the value for department_t.department_type_id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setDepartment_type_id(Integer department_type_id) {
        this.department_type_id = department_type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_t.tel
     *
     * @return the value of department_t.tel
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_t.tel
     *
     * @param tel the value for department_t.tel
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_t.create_time
     *
     * @return the value of department_t.create_time
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_t.create_time
     *
     * @param create_time the value for department_t.create_time
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_t.delflag
     *
     * @return the value of department_t.delflag
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Boolean getDelflag() {
        return delflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_t.delflag
     *
     * @param delflag the value for department_t.delflag
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setDelflag(Boolean delflag) {
        this.delflag = delflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_t.hos_id
     *
     * @return the value of department_t.hos_id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Integer getHos_id() {
        return hos_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_t.hos_id
     *
     * @param hos_id the value for department_t.hos_id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setHos_id(Integer hos_id) {
        this.hos_id = hos_id;
    }
    
    
    

	public DepartmentT() {
		super();
	}

	public DepartmentT(String code, String name, String description, String address, String dep_photo,
			Integer department_type_id, String tel, Integer hos_id) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.address = address;
		this.dep_photo = dep_photo;
		this.department_type_id = department_type_id;
		this.tel = tel;
		this.hos_id = hos_id;
	}
    
    
}