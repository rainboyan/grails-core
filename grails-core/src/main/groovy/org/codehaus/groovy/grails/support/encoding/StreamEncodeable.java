/* Copyright 2013 the original author or authors.
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
package org.codehaus.groovy.grails.support.encoding;

import java.io.IOException;

/**
 * Marks a class capable of encoding itself with given Encoder 
 * to given EncodedAppender instance
 * 
 * @author Lari Hotari
 * @since 2.3
 */
public interface StreamEncodeable {
    
    /**
     * Calls the encoder to encode the current content of the StreamEncodable instance (itself)
     * to the EncodedAppender.
     * It is recommended that the implementation checks if Encoder is a {@link StreamingEncoder} instance and takes use
     * of that interface.
     *
     * @param appender the EncodedAppender instance
     * @param encoder the encoder
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void encodeTo(EncodedAppender appender, Encoder encoder) throws IOException;
}
