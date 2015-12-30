/*******************************************************************************
 * Copyright (c) 2016 Red Hat, Inc. 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * 	Contributors:
 * 		 Red Hat Inc. - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.wst.jsdt.js.common.build.system;

import org.eclipse.core.resources.IFile;

/**
 * @author "Ilya Buziuk (ibuziuk)"
 */
public class Task implements ITask {
	private String name;
	private boolean isDefault;
	private IFile buildFile;
	
	public Task(String name, IFile buildFile, boolean isDefault) {
		this.name = name;
		this.buildFile = buildFile;
		this.isDefault = isDefault;
	}
	
	@Override
	public String getName() {
		return name;
	}	

	@Override
	public boolean isDefault() {
		return isDefault;
	}

	@Override
	public IFile getBuildFile() {
		return buildFile;
	}

}
