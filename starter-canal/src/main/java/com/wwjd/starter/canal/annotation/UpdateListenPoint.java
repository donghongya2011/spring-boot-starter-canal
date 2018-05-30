package com.wwjd.starter.canal.annotation;

import com.alibaba.otter.canal.protocol.CanalEntry;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * 更新操作监听器
 *
 * @author 阿导
 * @CopyRight 杭州弧途科技有限公司(万物皆导)
 * @created 2018/5/28 19:25
 * @Modified_By 阿导 2018/5/28 19:25
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ListenPoint(eventType = CanalEntry.EventType.UPDATE)
public @interface UpdateListenPoint {

    /**
     * canal 指令
     * default for all
     *
     * @return canal destination
     * @author 阿导
     * @time 2018/5/28 15:49
     * @CopyRight 万物皆导
     */
    @AliasFor(annotation = ListenPoint.class)
    String destination() default "";

    /**
     * 数据库实例
     *
     * @return canal destination
     * @author 阿导
     * @time 2018/5/28 15:49
     * @CopyRight 万物皆导
     */
    @AliasFor(annotation = ListenPoint.class)
    String[] schema() default {};

    /**
     * 监听的表
     * default for all
     *
     * @return canal destination
     * @author 阿导
     * @time 2018/5/28 15:50
     * @CopyRight 万物皆导
     */
    @AliasFor(annotation = ListenPoint.class)
    String[] table() default {};

}
