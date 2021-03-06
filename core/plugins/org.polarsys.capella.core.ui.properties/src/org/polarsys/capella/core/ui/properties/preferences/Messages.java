/*******************************************************************************
 * Copyright (c) 2006, 2016 THALES GLOBAL SERVICES.
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
package org.polarsys.capella.core.ui.properties.preferences;

import org.eclipse.osgi.util.NLS;

/**
 * I18n support.
 */
public class Messages extends NLS {
  private static final String BUNDLE_NAME = "org.polarsys.capella.core.ui.properties.preferences.messages"; //$NON-NLS-1$

  public static String TransfertViewerPreferencePage_Title;
  public static String TransfertViewerPreferencePage_Description;

  public static String SingleTransfertViewerPreferencePage_Description;
  public static String LeftTransfertViewerPreferencePage_Description;
  public static String RightTransfertViewerPreferencePage_Description;
  public static String DisableLabelComputation;

  public static String SingleSelectionDialogPreferencePage_Group_Title;
  public static String MultipleSelectionDialogPreferencePage_Group_Title;

  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  private Messages() {
    // Private constructor.
  }
}
