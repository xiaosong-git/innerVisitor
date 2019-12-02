/**
 * Copyright (c) 2011-2019, James Zhan 詹波 (jfinal@126.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xiaosong.util.config;

import java.util.ArrayList;
import java.util.List;
import com.jfinal.plugin.IPlugin;

/**
 * Plugins.
 */
final public class Plugins {
	
	private final List<IPlugin> pluginList = new ArrayList<IPlugin>();
	
	public Plugins add(IPlugin plugin) {
		if (plugin == null) {
			throw new IllegalArgumentException("plugin can not be null");
		}
		pluginList.add(plugin);
		return this;
	}
	
	public List<IPlugin> getPluginList() {
		return pluginList;
	}
}
