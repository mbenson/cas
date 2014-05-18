/*
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.cas.util;

import java.util.Date;

import org.apache.commons.lang.time.FastDateFormat;

/**
 * A fast date format based on the ISO-8601 standard.
 * @author Misagh Moayyed
 */
public final class ISOStandardDateFormat extends FastDateFormat {

    private static final long serialVersionUID = 9196017562782775535L;
     * Instantiates a new SAML date utils.
     */

    public ISOStandardDateFormat() {
        super("yyyy-MM-dd'T'HH:mm:ss'Z'", null, null);
        super.init();
    }
    
    public String getCurrentDateAndTime() {
        return format(new Date());
     *
     * @param date the date
     * @return the formatted date and time
     */
    }
}
