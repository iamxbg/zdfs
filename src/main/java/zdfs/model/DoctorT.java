package zdfs.model;

import java.util.Date;

public class DoctorT {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_t.id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_t.name
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_t.pwd
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private String pwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_t.mail
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private String mail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_t.tel
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_t.photo
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private String photo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_t.birthday
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_t.hospital_id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Integer hospital_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_t.department_id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Integer department_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_t.doctor_type_id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Integer doctor_type_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_t.good_at
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private String good_at;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_t.online_state
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Boolean online_state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_t.has_video
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Boolean has_video;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_t.create_time
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Date create_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_t.delflag
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Boolean delflag=false;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_t.id
     *
     * @return the value of doctor_t.id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_t.id
     *
     * @param id the value for doctor_t.id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_t.name
     *
     * @return the value of doctor_t.name
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_t.name
     *
     * @param name the value for doctor_t.name
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_t.pwd
     *
     * @return the value of doctor_t.pwd
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_t.pwd
     *
     * @param pwd the value for doctor_t.pwd
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_t.mail
     *
     * @return the value of doctor_t.mail
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public String getMail() {
        return mail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_t.mail
     *
     * @param mail the value for doctor_t.mail
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_t.tel
     *
     * @return the value of doctor_t.tel
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_t.tel
     *
     * @param tel the value for doctor_t.tel
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_t.photo
     *
     * @return the value of doctor_t.photo
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_t.photo
     *
     * @param photo the value for doctor_t.photo
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_t.birthday
     *
     * @return the value of doctor_t.birthday
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_t.birthday
     *
     * @param birthday the value for doctor_t.birthday
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_t.hospital_id
     *
     * @return the value of doctor_t.hospital_id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Integer getHospital_id() {
        return hospital_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_t.hospital_id
     *
     * @param hospital_id the value for doctor_t.hospital_id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setHospital_id(Integer hospital_id) {
        this.hospital_id = hospital_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_t.department_id
     *
     * @return the value of doctor_t.department_id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Integer getDepartment_id() {
        return department_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_t.department_id
     *
     * @param department_id the value for doctor_t.department_id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_t.doctor_type_id
     *
     * @return the value of doctor_t.doctor_type_id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Integer getDoctor_type_id() {
        return doctor_type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_t.doctor_type_id
     *
     * @param doctor_type_id the value for doctor_t.doctor_type_id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setDoctor_type_id(Integer doctor_type_id) {
        this.doctor_type_id = doctor_type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_t.good_at
     *
     * @return the value of doctor_t.good_at
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public String getGood_at() {
        return good_at;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_t.good_at
     *
     * @param good_at the value for doctor_t.good_at
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setGood_at(String good_at) {
        this.good_at = good_at;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_t.online_state
     *
     * @return the value of doctor_t.online_state
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Boolean getOnline_state() {
        return online_state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_t.online_state
     *
     * @param online_state the value for doctor_t.online_state
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setOnline_state(Boolean online_state) {
        this.online_state = online_state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_t.has_video
     *
     * @return the value of doctor_t.has_video
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Boolean getHas_video() {
        return has_video;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_t.has_video
     *
     * @param has_video the value for doctor_t.has_video
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setHas_video(Boolean has_video) {
        this.has_video = has_video;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_t.create_time
     *
     * @return the value of doctor_t.create_time
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_t.create_time
     *
     * @param create_time the value for doctor_t.create_time
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_t.delflag
     *
     * @return the value of doctor_t.delflag
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Boolean getDelflag() {
        return delflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_t.delflag
     *
     * @param delflag the value for doctor_t.delflag
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setDelflag(Boolean delflag) {
        this.delflag = delflag;
    }

	public DoctorT(String name, String pwd, String mail, String tel, String photo, Date birthday, Integer hospital_id,
			Integer department_id, Integer doctor_type_id, String good_at, Boolean online_state, Boolean has_video) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.mail = mail;
		this.tel = tel;
		this.photo = photo;
		this.birthday = birthday;
		this.hospital_id = hospital_id;
		this.department_id = department_id;
		this.doctor_type_id = doctor_type_id;
		this.good_at = good_at;
		this.online_state = online_state;
		this.has_video = has_video;
	}

	public DoctorT() {
		super();
	}
}