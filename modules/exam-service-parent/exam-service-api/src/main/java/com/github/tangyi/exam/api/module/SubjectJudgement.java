package com.github.tangyi.exam.api.module;

import com.github.tangyi.common.core.persistence.BaseEntity;
import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 * 判断题
 *
 * @author tangyi
 * @date 2019-07-16 12:57
 */
@Data
public class SubjectJudgement extends BaseEntity<SubjectJudgement> {

  /**
   * 题目分类ID
   */
  private String categoryId;

  /**
   * 题目名称
   */
  @NotBlank(message = "题目名称不能为空")
  private String subjectName;

  /**
   * 参考答案
   */
  private String answer;

  /**
   * 分值
   */
  @NotBlank(message = "题目分值不能为空")
  private Integer score;

  /**
   * 解析
   */
  private String analysis;

  /**
   * 难度等级
   */
  private Integer level;
}
