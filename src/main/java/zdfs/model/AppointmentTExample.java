package zdfs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AppointmentTExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    public AppointmentTExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
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
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andP_idIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andP_idIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andP_idEqualTo(Integer value) {
            addCriterion("p_id =", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idGreaterThan(Integer value) {
            addCriterion("p_id >", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idLessThan(Integer value) {
            addCriterion("p_id <", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idIn(List<Integer> values) {
            addCriterion("p_id in", values, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "p_id");
            return (Criteria) this;
        }

        public Criteria andD_idIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andD_idIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andD_idEqualTo(Integer value) {
            addCriterion("d_id =", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idGreaterThan(Integer value) {
            addCriterion("d_id >", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idLessThan(Integer value) {
            addCriterion("d_id <", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idIn(List<Integer> values) {
            addCriterion("d_id in", values, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "d_id");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andAppoint_dateIsNull() {
            addCriterion("appoint_date is null");
            return (Criteria) this;
        }

        public Criteria andAppoint_dateIsNotNull() {
            addCriterion("appoint_date is not null");
            return (Criteria) this;
        }

        public Criteria andAppoint_dateEqualTo(Date value) {
            addCriterionForJDBCDate("appoint_date =", value, "appoint_date");
            return (Criteria) this;
        }

        public Criteria andAppoint_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("appoint_date <>", value, "appoint_date");
            return (Criteria) this;
        }

        public Criteria andAppoint_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("appoint_date >", value, "appoint_date");
            return (Criteria) this;
        }

        public Criteria andAppoint_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("appoint_date >=", value, "appoint_date");
            return (Criteria) this;
        }

        public Criteria andAppoint_dateLessThan(Date value) {
            addCriterionForJDBCDate("appoint_date <", value, "appoint_date");
            return (Criteria) this;
        }

        public Criteria andAppoint_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("appoint_date <=", value, "appoint_date");
            return (Criteria) this;
        }

        public Criteria andAppoint_dateIn(List<Date> values) {
            addCriterionForJDBCDate("appoint_date in", values, "appoint_date");
            return (Criteria) this;
        }

        public Criteria andAppoint_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("appoint_date not in", values, "appoint_date");
            return (Criteria) this;
        }

        public Criteria andAppoint_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("appoint_date between", value1, value2, "appoint_date");
            return (Criteria) this;
        }

        public Criteria andAppoint_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("appoint_date not between", value1, value2, "appoint_date");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_startIsNull() {
            addCriterion("appoint_time_start is null");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_startIsNotNull() {
            addCriterion("appoint_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_startEqualTo(Date value) {
            addCriterionForJDBCTime("appoint_time_start =", value, "appoint_time_start");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_startNotEqualTo(Date value) {
            addCriterionForJDBCTime("appoint_time_start <>", value, "appoint_time_start");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_startGreaterThan(Date value) {
            addCriterionForJDBCTime("appoint_time_start >", value, "appoint_time_start");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_startGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("appoint_time_start >=", value, "appoint_time_start");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_startLessThan(Date value) {
            addCriterionForJDBCTime("appoint_time_start <", value, "appoint_time_start");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_startLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("appoint_time_start <=", value, "appoint_time_start");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_startIn(List<Date> values) {
            addCriterionForJDBCTime("appoint_time_start in", values, "appoint_time_start");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_startNotIn(List<Date> values) {
            addCriterionForJDBCTime("appoint_time_start not in", values, "appoint_time_start");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_startBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("appoint_time_start between", value1, value2, "appoint_time_start");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_startNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("appoint_time_start not between", value1, value2, "appoint_time_start");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_endIsNull() {
            addCriterion("appoint_time_end is null");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_endIsNotNull() {
            addCriterion("appoint_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_endEqualTo(Date value) {
            addCriterionForJDBCTime("appoint_time_end =", value, "appoint_time_end");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_endNotEqualTo(Date value) {
            addCriterionForJDBCTime("appoint_time_end <>", value, "appoint_time_end");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_endGreaterThan(Date value) {
            addCriterionForJDBCTime("appoint_time_end >", value, "appoint_time_end");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_endGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("appoint_time_end >=", value, "appoint_time_end");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_endLessThan(Date value) {
            addCriterionForJDBCTime("appoint_time_end <", value, "appoint_time_end");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_endLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("appoint_time_end <=", value, "appoint_time_end");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_endIn(List<Date> values) {
            addCriterionForJDBCTime("appoint_time_end in", values, "appoint_time_end");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_endNotIn(List<Date> values) {
            addCriterionForJDBCTime("appoint_time_end not in", values, "appoint_time_end");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_endBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("appoint_time_end between", value1, value2, "appoint_time_end");
            return (Criteria) this;
        }

        public Criteria andAppoint_time_endNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("appoint_time_end not between", value1, value2, "appoint_time_end");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonIsNull() {
            addCriterion("refuse_reason is null");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonIsNotNull() {
            addCriterion("refuse_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonEqualTo(Integer value) {
            addCriterion("refuse_reason =", value, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonNotEqualTo(Integer value) {
            addCriterion("refuse_reason <>", value, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonGreaterThan(Integer value) {
            addCriterion("refuse_reason >", value, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("refuse_reason >=", value, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonLessThan(Integer value) {
            addCriterion("refuse_reason <", value, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonLessThanOrEqualTo(Integer value) {
            addCriterion("refuse_reason <=", value, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonIn(List<Integer> values) {
            addCriterion("refuse_reason in", values, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonNotIn(List<Integer> values) {
            addCriterion("refuse_reason not in", values, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonBetween(Integer value1, Integer value2) {
            addCriterion("refuse_reason between", value1, value2, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonNotBetween(Integer value1, Integer value2) {
            addCriterion("refuse_reason not between", value1, value2, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
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
     * This class corresponds to the database table appointment_t
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 17 17:25:09 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
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