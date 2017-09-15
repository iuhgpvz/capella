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
package org.polarsys.capella.core.explorer.activity.ui.hyperlinkadapter;

import org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.AbstractNewDiagramHyperlinkAdapter;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.tools.api.ui.RefreshEditorsPrecommitListener;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.polarsys.capella.common.libraries.ILibraryManager;
import org.polarsys.capella.common.libraries.IModel;
import org.polarsys.capella.common.tools.report.appenders.usage.UsageMonitoringLogger;
import org.polarsys.capella.common.tools.report.appenders.usage.util.UsageMonitoring.EventStatus;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.libraries.model.ICapellaModel;
import org.polarsys.capella.shared.id.handler.IdManager;

public abstract class AbstractCapellaNewDiagramHyperlinkAdapter extends AbstractNewDiagramHyperlinkAdapter {


	public AbstractCapellaNewDiagramHyperlinkAdapter() {
		super(ActivityExplorerManager.INSTANCE.getRootSemanticModel());
	}

	@Override
	public void linkActivated(HyperlinkEvent event) {
		Session session = ActivityExplorerManager.INSTANCE.getSession();
		RefreshEditorsPrecommitListener repl = session.getRefreshEditorsListener();
		repl.notify(SessionListener.REPRESENTATION_CHANGE);
		repl.notify(SessionListener.SEMANTIC_CHANGE);
		
		IModel model = ILibraryManager.INSTANCE.getModel(session.getTransactionalEditingDomain());
		Project project = ((ICapellaModel) model).getProject(session.getTransactionalEditingDomain());
		
		String eventName = "Create Representation";
		String eventContext = getRepresentationName();
		String addendum = IdManager.getInstance().getId(getModelElement(project));
		
		UsageMonitoringLogger.getInstance().log(eventName, eventContext, EventStatus.NONE, addendum);
		linkPressed(event, getModelElement(project), session);
		UsageMonitoringLogger.getInstance().log(eventName, eventContext, EventStatus.OK, addendum);
	}
}
