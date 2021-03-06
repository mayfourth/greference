/*
 * Copyright [2005] [University Corporation for Advanced Internet Development, Inc.]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensaml.saml2.core.validator;

import org.joda.time.DateTime;
import org.opensaml.common.BaseSAMLObjectValidatorTestCase;
import org.opensaml.saml2.core.RequestAbstractType;

/**
 * Base test for testing RequestAbstractType objects.
 */
public abstract class RequestSchemaTestBase extends BaseSAMLObjectValidatorTestCase {

    /**
     * Constructor
     * 
     */
    public RequestSchemaTestBase() {
        super();
    }

    /** {@inheritDoc} */
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Populate the XMLObject argument with valid values for required elements and attributes. Useful to subclasses of
     * this test.
     */
    protected void populateRequiredData() {
        RequestAbstractType request = (RequestAbstractType) target;
        request.setID("abc123");
        request.setIssueInstant(new DateTime());
    }

    /**
     * Tests empty ID attribute
     */
    public void testIDFailure() {
        RequestAbstractType request = (RequestAbstractType) target;

        request.setID(null);
        assertValidationFail("ID attribute was null");

        request.setID("");
        assertValidationFail("ID attribute was empty string");

        request.setID("               ");
        assertValidationFail("ID attribute was all whitespace");
    }

    /**
     * Tests invalid IssueInstant attribute
     */
    public void testIssueInstantFailure() {
        RequestAbstractType request = (RequestAbstractType) target;
        request.setIssueInstant(null);
        assertValidationFail("IssueInstant attribute was null");
    }
}