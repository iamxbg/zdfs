package zdfs.tf02.model;

import java.util.Date;

public class TodayRemind {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column today_remind.id
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column today_remind.member_id
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    private String member_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column today_remind.product_name
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    private String product_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column today_remind.remind_content
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    private String remind_content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column today_remind.create_date
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    private Date create_date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column today_remind.delflag
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    private Boolean delflag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column today_remind.id
     *
     * @return the value of today_remind.id
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column today_remind.id
     *
     * @param id the value for today_remind.id
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column today_remind.member_id
     *
     * @return the value of today_remind.member_id
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    public String getMember_id() {
        return member_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column today_remind.member_id
     *
     * @param member_id the value for today_remind.member_id
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column today_remind.product_name
     *
     * @return the value of today_remind.product_name
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    public String getProduct_name() {
        return product_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column today_remind.product_name
     *
     * @param product_name the value for today_remind.product_name
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column today_remind.remind_content
     *
     * @return the value of today_remind.remind_content
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    public String getRemind_content() {
        return remind_content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column today_remind.remind_content
     *
     * @param remind_content the value for today_remind.remind_content
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    public void setRemind_content(String remind_content) {
        this.remind_content = remind_content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column today_remind.create_date
     *
     * @return the value of today_remind.create_date
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    public Date getCreate_date() {
        return create_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column today_remind.create_date
     *
     * @param create_date the value for today_remind.create_date
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column today_remind.delflag
     *
     * @return the value of today_remind.delflag
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    public Boolean getDelflag() {
        return delflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column today_remind.delflag
     *
     * @param delflag the value for today_remind.delflag
     *
     * @mbg.generated Fri Jul 21 03:08:55 CST 2017
     */
    public void setDelflag(Boolean delflag) {
        this.delflag = delflag;
    }
}