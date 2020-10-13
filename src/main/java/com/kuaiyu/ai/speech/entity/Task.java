package com.kuaiyu.ai.speech.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author yyk
 * @since 2020-10-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 任务id
     */
    private Integer taskId;

    /**
     * 使用的词组id
     */
    private Integer wordItemId;

    /**
     * 音频文件路径(转写好的音频文件)
     */
    private String audioFile;

    /**
     * 结果文件路径
     */
    private String contentFile;

    /**
     * 原始音频文件路径(三方传入的音频文件)
     */
    private String originalAudioFile;


}
