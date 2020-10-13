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
public class HotWord implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 词组id
     */
    private Integer itemId;

    /**
     * 热词
     */
    private String hotWord;


}
