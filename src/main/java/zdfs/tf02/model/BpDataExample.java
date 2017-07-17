package zdfs.tf02.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BpDataExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    public BpDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMember_idIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMember_idIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMember_idEqualTo(String value) {
            addCriterion("member_id =", value, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idNotEqualTo(String value) {
            addCriterion("member_id <>", value, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idGreaterThan(String value) {
            addCriterion("member_id >", value, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idGreaterThanOrEqualTo(String value) {
            addCriterion("member_id >=", value, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idLessThan(String value) {
            addCriterion("member_id <", value, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idLessThanOrEqualTo(String value) {
            addCriterion("member_id <=", value, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idLike(String value) {
            addCriterion("member_id like", value, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idNotLike(String value) {
            addCriterion("member_id not like", value, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idIn(List<String> values) {
            addCriterion("member_id in", values, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idNotIn(List<String> values) {
            addCriterion("member_id not in", values, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idBetween(String value1, String value2) {
            addCriterion("member_id between", value1, value2, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idNotBetween(String value1, String value2) {
            addCriterion("member_id not between", value1, value2, "member_id");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andMeatimeIsNull() {
            addCriterion("meatime is null");
            return (Criteria) this;
        }

        public Criteria andMeatimeIsNotNull() {
            addCriterion("meatime is not null");
            return (Criteria) this;
        }

        public Criteria andMeatimeEqualTo(Date value) {
            addCriterion("meatime =", value, "meatime");
            return (Criteria) this;
        }

        public Criteria andMeatimeNotEqualTo(Date value) {
            addCriterion("meatime <>", value, "meatime");
            return (Criteria) this;
        }

        public Criteria andMeatimeGreaterThan(Date value) {
            addCriterion("meatime >", value, "meatime");
            return (Criteria) this;
        }

        public Criteria andMeatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("meatime >=", value, "meatime");
            return (Criteria) this;
        }

        public Criteria andMeatimeLessThan(Date value) {
            addCriterion("meatime <", value, "meatime");
            return (Criteria) this;
        }

        public Criteria andMeatimeLessThanOrEqualTo(Date value) {
            addCriterion("meatime <=", value, "meatime");
            return (Criteria) this;
        }

        public Criteria andMeatimeIn(List<Date> values) {
            addCriterion("meatime in", values, "meatime");
            return (Criteria) this;
        }

        public Criteria andMeatimeNotIn(List<Date> values) {
            addCriterion("meatime not in", values, "meatime");
            return (Criteria) this;
        }

        public Criteria andMeatimeBetween(Date value1, Date value2) {
            addCriterion("meatime between", value1, value2, "meatime");
            return (Criteria) this;
        }

        public Criteria andMeatimeNotBetween(Date value1, Date value2) {
            addCriterion("meatime not between", value1, value2, "meatime");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateIsNull() {
            addCriterion("physicalstate is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateIsNotNull() {
            addCriterion("physicalstate is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateEqualTo(Integer value) {
            addCriterion("physicalstate =", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateNotEqualTo(Integer value) {
            addCriterion("physicalstate <>", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateGreaterThan(Integer value) {
            addCriterion("physicalstate >", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("physicalstate >=", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateLessThan(Integer value) {
            addCriterion("physicalstate <", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateLessThanOrEqualTo(Integer value) {
            addCriterion("physicalstate <=", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateIn(List<Integer> values) {
            addCriterion("physicalstate in", values, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateNotIn(List<Integer> values) {
            addCriterion("physicalstate not in", values, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateBetween(Integer value1, Integer value2) {
            addCriterion("physicalstate between", value1, value2, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateNotBetween(Integer value1, Integer value2) {
            addCriterion("physicalstate not between", value1, value2, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andBp_spIsNull() {
            addCriterion("bp_sp is null");
            return (Criteria) this;
        }

        public Criteria andBp_spIsNotNull() {
            addCriterion("bp_sp is not null");
            return (Criteria) this;
        }

        public Criteria andBp_spEqualTo(Integer value) {
            addCriterion("bp_sp =", value, "bp_sp");
            return (Criteria) this;
        }

        public Criteria andBp_spNotEqualTo(Integer value) {
            addCriterion("bp_sp <>", value, "bp_sp");
            return (Criteria) this;
        }

        public Criteria andBp_spGreaterThan(Integer value) {
            addCriterion("bp_sp >", value, "bp_sp");
            return (Criteria) this;
        }

        public Criteria andBp_spGreaterThanOrEqualTo(Integer value) {
            addCriterion("bp_sp >=", value, "bp_sp");
            return (Criteria) this;
        }

        public Criteria andBp_spLessThan(Integer value) {
            addCriterion("bp_sp <", value, "bp_sp");
            return (Criteria) this;
        }

        public Criteria andBp_spLessThanOrEqualTo(Integer value) {
            addCriterion("bp_sp <=", value, "bp_sp");
            return (Criteria) this;
        }

        public Criteria andBp_spIn(List<Integer> values) {
            addCriterion("bp_sp in", values, "bp_sp");
            return (Criteria) this;
        }

        public Criteria andBp_spNotIn(List<Integer> values) {
            addCriterion("bp_sp not in", values, "bp_sp");
            return (Criteria) this;
        }

        public Criteria andBp_spBetween(Integer value1, Integer value2) {
            addCriterion("bp_sp between", value1, value2, "bp_sp");
            return (Criteria) this;
        }

        public Criteria andBp_spNotBetween(Integer value1, Integer value2) {
            addCriterion("bp_sp not between", value1, value2, "bp_sp");
            return (Criteria) this;
        }

        public Criteria andBp_dpIsNull() {
            addCriterion("bp_dp is null");
            return (Criteria) this;
        }

        public Criteria andBp_dpIsNotNull() {
            addCriterion("bp_dp is not null");
            return (Criteria) this;
        }

        public Criteria andBp_dpEqualTo(Integer value) {
            addCriterion("bp_dp =", value, "bp_dp");
            return (Criteria) this;
        }

        public Criteria andBp_dpNotEqualTo(Integer value) {
            addCriterion("bp_dp <>", value, "bp_dp");
            return (Criteria) this;
        }

        public Criteria andBp_dpGreaterThan(Integer value) {
            addCriterion("bp_dp >", value, "bp_dp");
            return (Criteria) this;
        }

        public Criteria andBp_dpGreaterThanOrEqualTo(Integer value) {
            addCriterion("bp_dp >=", value, "bp_dp");
            return (Criteria) this;
        }

        public Criteria andBp_dpLessThan(Integer value) {
            addCriterion("bp_dp <", value, "bp_dp");
            return (Criteria) this;
        }

        public Criteria andBp_dpLessThanOrEqualTo(Integer value) {
            addCriterion("bp_dp <=", value, "bp_dp");
            return (Criteria) this;
        }

        public Criteria andBp_dpIn(List<Integer> values) {
            addCriterion("bp_dp in", values, "bp_dp");
            return (Criteria) this;
        }

        public Criteria andBp_dpNotIn(List<Integer> values) {
            addCriterion("bp_dp not in", values, "bp_dp");
            return (Criteria) this;
        }

        public Criteria andBp_dpBetween(Integer value1, Integer value2) {
            addCriterion("bp_dp between", value1, value2, "bp_dp");
            return (Criteria) this;
        }

        public Criteria andBp_dpNotBetween(Integer value1, Integer value2) {
            addCriterion("bp_dp not between", value1, value2, "bp_dp");
            return (Criteria) this;
        }

        public Criteria andBp_hrIsNull() {
            addCriterion("bp_hr is null");
            return (Criteria) this;
        }

        public Criteria andBp_hrIsNotNull() {
            addCriterion("bp_hr is not null");
            return (Criteria) this;
        }

        public Criteria andBp_hrEqualTo(Integer value) {
            addCriterion("bp_hr =", value, "bp_hr");
            return (Criteria) this;
        }

        public Criteria andBp_hrNotEqualTo(Integer value) {
            addCriterion("bp_hr <>", value, "bp_hr");
            return (Criteria) this;
        }

        public Criteria andBp_hrGreaterThan(Integer value) {
            addCriterion("bp_hr >", value, "bp_hr");
            return (Criteria) this;
        }

        public Criteria andBp_hrGreaterThanOrEqualTo(Integer value) {
            addCriterion("bp_hr >=", value, "bp_hr");
            return (Criteria) this;
        }

        public Criteria andBp_hrLessThan(Integer value) {
            addCriterion("bp_hr <", value, "bp_hr");
            return (Criteria) this;
        }

        public Criteria andBp_hrLessThanOrEqualTo(Integer value) {
            addCriterion("bp_hr <=", value, "bp_hr");
            return (Criteria) this;
        }

        public Criteria andBp_hrIn(List<Integer> values) {
            addCriterion("bp_hr in", values, "bp_hr");
            return (Criteria) this;
        }

        public Criteria andBp_hrNotIn(List<Integer> values) {
            addCriterion("bp_hr not in", values, "bp_hr");
            return (Criteria) this;
        }

        public Criteria andBp_hrBetween(Integer value1, Integer value2) {
            addCriterion("bp_hr between", value1, value2, "bp_hr");
            return (Criteria) this;
        }

        public Criteria andBp_hrNotBetween(Integer value1, Integer value2) {
            addCriterion("bp_hr not between", value1, value2, "bp_hr");
            return (Criteria) this;
        }

        public Criteria andHealthrecordIsNull() {
            addCriterion("healthrecord is null");
            return (Criteria) this;
        }

        public Criteria andHealthrecordIsNotNull() {
            addCriterion("healthrecord is not null");
            return (Criteria) this;
        }

        public Criteria andHealthrecordEqualTo(String value) {
            addCriterion("healthrecord =", value, "healthrecord");
            return (Criteria) this;
        }

        public Criteria andHealthrecordNotEqualTo(String value) {
            addCriterion("healthrecord <>", value, "healthrecord");
            return (Criteria) this;
        }

        public Criteria andHealthrecordGreaterThan(String value) {
            addCriterion("healthrecord >", value, "healthrecord");
            return (Criteria) this;
        }

        public Criteria andHealthrecordGreaterThanOrEqualTo(String value) {
            addCriterion("healthrecord >=", value, "healthrecord");
            return (Criteria) this;
        }

        public Criteria andHealthrecordLessThan(String value) {
            addCriterion("healthrecord <", value, "healthrecord");
            return (Criteria) this;
        }

        public Criteria andHealthrecordLessThanOrEqualTo(String value) {
            addCriterion("healthrecord <=", value, "healthrecord");
            return (Criteria) this;
        }

        public Criteria andHealthrecordLike(String value) {
            addCriterion("healthrecord like", value, "healthrecord");
            return (Criteria) this;
        }

        public Criteria andHealthrecordNotLike(String value) {
            addCriterion("healthrecord not like", value, "healthrecord");
            return (Criteria) this;
        }

        public Criteria andHealthrecordIn(List<String> values) {
            addCriterion("healthrecord in", values, "healthrecord");
            return (Criteria) this;
        }

        public Criteria andHealthrecordNotIn(List<String> values) {
            addCriterion("healthrecord not in", values, "healthrecord");
            return (Criteria) this;
        }

        public Criteria andHealthrecordBetween(String value1, String value2) {
            addCriterion("healthrecord between", value1, value2, "healthrecord");
            return (Criteria) this;
        }

        public Criteria andHealthrecordNotBetween(String value1, String value2) {
            addCriterion("healthrecord not between", value1, value2, "healthrecord");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNull() {
            addCriterion("delflag is null");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNotNull() {
            addCriterion("delflag is not null");
            return (Criteria) this;
        }

        public Criteria andDelflagEqualTo(Boolean value) {
            addCriterion("delflag =", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotEqualTo(Boolean value) {
            addCriterion("delflag <>", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThan(Boolean value) {
            addCriterion("delflag >", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delflag >=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThan(Boolean value) {
            addCriterion("delflag <", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThanOrEqualTo(Boolean value) {
            addCriterion("delflag <=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagIn(List<Boolean> values) {
            addCriterion("delflag in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotIn(List<Boolean> values) {
            addCriterion("delflag not in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagBetween(Boolean value1, Boolean value2) {
            addCriterion("delflag between", value1, value2, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delflag not between", value1, value2, "delflag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bp_data
     *
     * @mbg.generated do_not_delete_during_merge Tue Jul 18 05:07:32 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bp_data
     *
     * @mbg.generated Tue Jul 18 05:07:32 CST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}