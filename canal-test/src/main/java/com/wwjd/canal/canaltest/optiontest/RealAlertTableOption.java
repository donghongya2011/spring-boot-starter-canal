package com.wwjd.canal.canaltest.optiontest;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.wwjd.starter.canal.client.abstracts.option.table.AlertTableOption;
import org.springframework.stereotype.Component;

/**
 * 真正的修改表信息操作
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @created 2018年05月29日 15:02:00
 * @Modified_By 阿导 2018/5/29 15:02
 */
@Component
public class RealAlertTableOption extends AlertTableOption {
	/**
	 * 修改表字段操作
	 *
	 * @param rowChange
	 * @return
	 * @author 阿导
	 * @time 2018/5/29 08:59
	 * @CopyRight 万物皆导
	 */
	@Override
	public void doOption(CanalEntry.RowChange rowChange) {
		System.out.println("======================接口方式（修改表信息操作）==========================");
		System.out.println("use "+rowChange.getDdlSchemaName()+";\n"+rowChange.getSql());
		System.out.println("\n======================================================");
		
	}
}
