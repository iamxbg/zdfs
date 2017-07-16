package zdfs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zdfs.model.DiagnoseT;
import zdfs.model.DiagnoseTExample;

public interface DiagnoseTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnose_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    long countByExample(DiagnoseTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnose_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int deleteByExample(DiagnoseTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnose_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnose_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int insert(DiagnoseT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnose_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int insertSelective(DiagnoseT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnose_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    List<DiagnoseT> selectByExample(DiagnoseTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnose_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    DiagnoseT selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnose_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int updateByExampleSelective(@Param("record") DiagnoseT record, @Param("example") DiagnoseTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnose_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int updateByExample(@Param("record") DiagnoseT record, @Param("example") DiagnoseTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnose_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int updateByPrimaryKeySelective(DiagnoseT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diagnose_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int updateByPrimaryKey(DiagnoseT record);
}