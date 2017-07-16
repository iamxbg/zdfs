package zdfs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zdfs.model.RDoctorAnychatT;
import zdfs.model.RDoctorAnychatTExample;

public interface RDoctorAnychatTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_doctor_anychat_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    long countByExample(RDoctorAnychatTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_doctor_anychat_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int deleteByExample(RDoctorAnychatTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_doctor_anychat_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int deleteByPrimaryKey(Integer doc_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_doctor_anychat_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int insert(RDoctorAnychatT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_doctor_anychat_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int insertSelective(RDoctorAnychatT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_doctor_anychat_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    List<RDoctorAnychatT> selectByExample(RDoctorAnychatTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_doctor_anychat_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    RDoctorAnychatT selectByPrimaryKey(Integer doc_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_doctor_anychat_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int updateByExampleSelective(@Param("record") RDoctorAnychatT record, @Param("example") RDoctorAnychatTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_doctor_anychat_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int updateByExample(@Param("record") RDoctorAnychatT record, @Param("example") RDoctorAnychatTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_doctor_anychat_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int updateByPrimaryKeySelective(RDoctorAnychatT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_doctor_anychat_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int updateByPrimaryKey(RDoctorAnychatT record);
}