/*
 * Copyright 2014 mango.jfaster.org
 *
 * The Mango Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.jfaster.mango.operator;

import java.util.Set;

/**
 * @author ash
 */
public interface CacheMultiKey {

    /**
     * 获得唯一的缓存
     */
    public Class<?> getOnlyCacheByClassForMulti();

    public Set<String> getCacheKeysForMulti(InvocationContext context);

    public Object getOnlyCacheByObjForMulti(InvocationContext context);

    public void setOnlyCacheByObjForMulti(InvocationContext context, Object obj);

    /**
     * 获得使用in语句的字段，需要通过这个字段将从db中取出的数据放入缓存
     */
    public String getInterableProperty();


}
