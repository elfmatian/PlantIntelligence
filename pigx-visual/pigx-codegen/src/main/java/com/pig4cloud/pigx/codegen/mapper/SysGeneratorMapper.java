/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.pig4cloud.pigx.codegen.mapper;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 *
 * @author lengleng
 * @date 2018-07-30
 */
public interface SysGeneratorMapper {

	/**
	 * 分页查询表格
	 *
	 * @param query
	 * @return
	 */
	List<Map<String, Object>> queryList(Map query);

	/**
	 * 查询表数量
	 *
	 * @param query
	 * @return
	 */
	int queryTotal(Map query);

	Map<String, String> queryTable(String tableName);

	List<Map<String, String>> queryColumns(String tableName);
}