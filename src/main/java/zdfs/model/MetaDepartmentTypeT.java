package zdfs.model;

public class MetaDepartmentTypeT {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meta_department_type_t.id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meta_department_type_t.name
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meta_department_type_t.delflag
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    private Boolean delflag=false;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meta_department_type_t.id
     *
     * @return the value of meta_department_type_t.id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meta_department_type_t.id
     *
     * @param id the value for meta_department_type_t.id
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meta_department_type_t.name
     *
     * @return the value of meta_department_type_t.name
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meta_department_type_t.name
     *
     * @param name the value for meta_department_type_t.name
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meta_department_type_t.delflag
     *
     * @return the value of meta_department_type_t.delflag
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public Boolean getDelflag() {
        return delflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meta_department_type_t.delflag
     *
     * @param delflag the value for meta_department_type_t.delflag
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    public void setDelflag(Boolean delflag) {
        this.delflag = delflag;
    }

	public MetaDepartmentTypeT(String name) {
		super();
		this.name = name;
	}

	public MetaDepartmentTypeT() {
		super();
	}
	
	
}