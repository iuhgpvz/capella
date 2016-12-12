/*******************************************************************************
 * Copyright (c) 2006, 2017 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.data.fa.ui.quickfix.resolver;

import org.polarsys.capella.common.ui.actions.AbstractTigAction;
import org.polarsys.capella.core.platform.sirius.ui.actions.PropagateExchangeItemAllocationsAction;

/**
 */
public class ExchangeItemAllocationOnPortsResolver extends ActionResolver {

  @Override
  protected AbstractTigAction createAction() {
    return new PropagateExchangeItemAllocationsAction();
  }
}
