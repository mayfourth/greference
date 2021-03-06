/*
 * Copyright 2008 University Corporation for Advanced Internet Development, Inc.
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

package org.opensaml.xacml.policy.impl;

import org.opensaml.xacml.policy.SubjectAttributeDesignatorType;
import org.opensaml.xml.XMLObject;
import org.opensaml.xml.io.MarshallingException;
import org.opensaml.xml.util.DatatypeHelper;
import org.w3c.dom.Element;

/**
 * Marshaller for {@link SubjectAttributeDesignatorType}.
 */
public class SubjectAttributeDesignatorTypeMarshaller extends AttributeDesignatorTypeMarshaller {

    /** Constructor. */
    public SubjectAttributeDesignatorTypeMarshaller() {
        super();
    }
    
    /** {@inheritDoc} */
    protected void marshallAttributes(XMLObject xmlObject, Element domElement) throws MarshallingException {       
        SubjectAttributeDesignatorType subjectAttributeDesignatorType = (SubjectAttributeDesignatorType) xmlObject;
        
        if(!DatatypeHelper.isEmpty(subjectAttributeDesignatorType.getSubjectCategory())){            
            domElement.setAttribute(SubjectAttributeDesignatorType.SUBJECT_CATEGORY_ATTRIB_NAME, 
                    subjectAttributeDesignatorType.getSubjectCategory());
        }
        super.marshallAttributes(xmlObject, domElement);
    }

    /** {@inheritDoc} */
    protected void marshallElementContent(XMLObject xmlObject, Element domElement) throws MarshallingException {

    }

}
