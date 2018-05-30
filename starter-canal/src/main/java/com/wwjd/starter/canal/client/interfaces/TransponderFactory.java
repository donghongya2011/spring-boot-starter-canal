package com.wwjd.starter.canal.client.interfaces;

import com.alibaba.otter.canal.client.CanalConnector;
import com.wwjd.starter.canal.client.core.ListenerPoint;
import com.wwjd.starter.canal.config.CanalConfig;

import java.util.List;
import java.util.Map;

/**
 * 信息转换工厂类接口层
 *
 * @author 阿导
 * @CopyRight 杭州弧途科技有限公司(万物皆导)
 * @created 2018/5/28 14:33
 * @Modified_By 阿导 2018/5/28 14:33
 */
public interface TransponderFactory {
	
	/**
	 * @param connector     canal 连接工具
	 * @param config        canal 链接信息
	 * @param contentListeners     监听拦截（表数据）
	 * @param tableListeners     监听拦截（表结构）
	 * @param annoListeners 注解监听拦截
	 * @return
	 * @author 阿导
	 * @time 2018/5/28 14:43
	 * @CopyRight 万物皆导
	 */
	MessageTransponder newTransponder(CanalConnector connector, Map.Entry<String, CanalConfig.Instance> config, List<CanalContentEventListener> contentListeners, List<CanalTableEventListener> tableListeners, List<ListenerPoint> annoListeners);
}
