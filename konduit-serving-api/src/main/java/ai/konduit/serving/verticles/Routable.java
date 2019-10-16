/*
 *
 *  * ******************************************************************************
 *  *  * Copyright (c) 2015-2019 Skymind Inc.
 *  *  * Copyright (c) 2019 Konduit AI.
 *  *  *
 *  *  * This program and the accompanying materials are made available under the
 *  *  * terms of the Apache License, Version 2.0 which is available at
 *  *  * https://www.apache.org/licenses/LICENSE-2.0.
 *  *  *
 *  *  * Unless required by applicable law or agreed to in writing, software
 *  *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  *  * License for the specific language governing permissions and limitations
 *  *  * under the License.
 *  *  *
 *  *  * SPDX-License-Identifier: Apache-2.0
 *  *  *****************************************************************************
 *
 *
 */

package ai.konduit.serving.verticles;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

/**
 * An interface representing an object
 * with a {@link Router}
 * instance and a {@link Vertx}
 *  instance
 *
 *  @author Adam Gibson
 */
public interface Routable {


    /**
     * Returns the {@link Router}
     * associated with this object
     * @return router
     */
    Router router();

    /**
     * Returns the {@link Vertx}
     * instance associated with this object
     * @return router
     */
    Vertx vertx();

}
