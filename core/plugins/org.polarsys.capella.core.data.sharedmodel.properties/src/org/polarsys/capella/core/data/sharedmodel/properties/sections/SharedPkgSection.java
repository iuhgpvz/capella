/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.data.sharedmodel.properties.sections;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.core.properties.sections.StructureSection;
import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;

/**
 * The SharedPkg section.
 */
public class SharedPkgSection extends StructureSection {
  /**
   * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
   */
  @Override
  public boolean select(Object toTest) {
    EObject eObjectToTest = super.selection(toTest);
    return ((eObjectToTest != null) && (eObjectToTest.eClass() == SharedmodelPackage.eINSTANCE.getSharedPkg()));
  }
}
