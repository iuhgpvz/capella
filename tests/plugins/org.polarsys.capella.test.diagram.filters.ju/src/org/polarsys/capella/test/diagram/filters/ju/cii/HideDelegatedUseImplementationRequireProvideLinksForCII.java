/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
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
package org.polarsys.capella.test.diagram.filters.ju.cii;

import java.util.Arrays;
import java.util.List;

import org.polarsys.capella.core.sirius.analysis.constants.IFilterNameConstants;

public class HideDelegatedUseImplementationRequireProvideLinksForCII extends FiltersForCII {

  @Override
  protected String getFilterName() {
    return IFilterNameConstants.FILTER_LCCII_HIDE_DELEGATED_USE_IMPLEMENTATION_LINKS;
  }

  @Override
  protected List<String> getFilteredObjetIDs() {
    return Arrays
        .asList(new String[] { DELEGATED_IMPLEMENT_ID, DELEGATED_USE_ID, DELEGATED_PROVIDE_ID, DELEGATED_REQUIRE_ID });
  }
}