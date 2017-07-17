package zdfs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zdfs.model.MetaDepartmentTypeT;
import zdfs.model.MetaDepartmentTypeTExample;

public interface MetaDepartmentTypeTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meta_department_type_t
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    long countByExample(MetaDepartmentTypeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meta_department_type_t
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    int deleteByExample(MetaDepartmentTypeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meta_department_type_t
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meta_department_type_t
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    int insert(MetaDepartmentTypeT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meta_department_type_t
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    int insertSelective(MetaDepartmentTypeT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meta_department_type_t
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    List<MetaDepartmentTypeT> selectByExample(MetaDepartmentTypeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meta_department_type_t
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    MetaDepartmentTypeT selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meta_department_type_t
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    int updateByExampleSelective(@Param("record") MetaDepartmentTypeT record, @Param("example") MetaDepartmentTypeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meta_department_type_t
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    int updateByExample(@Param("record") MetaDepartmentTypeT record, @Param("example") MetaDepartmentTypeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meta_department_type_t
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    int updateByPrimaryKeySelective(MetaDepartmentTypeT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meta_department_type_t
     *
     * @mbg.generated Mon Jul 17 20:14:02 CST 2017
     */
    int updateByPrimaryKey(MetaDepartmentTypeT record);
}