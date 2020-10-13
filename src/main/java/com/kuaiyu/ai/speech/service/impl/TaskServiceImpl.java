package com.kuaiyu.ai.speech.service.impl;

import com.kuaiyu.ai.speech.entity.Task;
import com.kuaiyu.ai.speech.mapper.TaskMapper;
import com.kuaiyu.ai.speech.service.ITaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yyk
 * @since 2020-10-13
 */
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements ITaskService {

}
