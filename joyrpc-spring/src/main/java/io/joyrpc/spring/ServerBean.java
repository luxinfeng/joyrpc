package io.joyrpc.spring;

/*-
 * #%L
 * joyrpc
 * %%
 * Copyright (C) 2019 joyrpc.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import io.joyrpc.config.ServerConfig;
import io.joyrpc.spring.annotation.Spring;
import org.springframework.beans.factory.BeanNameAware;

/**
 * 服务Bean
 *
 * @description:
 */
public class ServerBean extends ServerConfig implements BeanNameAware {

    @Override
    @Spring
    public void setBeanName(String name) {
        this.id = name;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getName() {
        return id;
    }

    public void setName(String name) {
        this.id = name;
    }
}
