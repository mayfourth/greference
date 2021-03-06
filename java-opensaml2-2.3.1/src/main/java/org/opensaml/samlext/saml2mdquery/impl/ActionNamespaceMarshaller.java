/*
 * Copyright [2006] [University Corporation for Advanced Internet Development, Inc.]
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

package org.opensaml.samlext.saml2mdquery.impl;

import org.opensaml.common.impl.AbstractSAMLObjectMarshaller;
import org.opensaml.samlext.saml2mdquery.ActionNamespace;
import org.opensaml.xml.XMLObject;
import org.opensaml.xml.io.MarshallingException;
import org.opensaml.xml.util.DatatypeHelper;
import org.opensaml.xml.util.XMLHelper;
import org.w3c.dom.Element;

/**
 * Marshaller of {@link ActionNamespace} objects.
 */
public class ActionNamespaceMarshaller extends AbstractSAMLObjectMarshaller {

    /** {@inheritDoc} */
    protected void marshallElementContent(XMLObject xmlObject, Element domElement) throws MarshallingException {
        ActionNamespace actionNamespace = (ActionNamespace) xmlObject;

        if (!DatatypeHelper.isEmpty(actionNamespace.getValue())) {
            XMLHelper.appendTextContent(domElement, actionNamespace.getValue());
        }
    }
}