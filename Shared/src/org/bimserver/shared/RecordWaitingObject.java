package org.bimserver.shared;

/******************************************************************************
 * Copyright (C) 2009-2014  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import org.bimserver.database.Record;
import org.eclipse.emf.ecore.EStructuralFeature;

public class RecordWaitingObject {
	// The object that has a missing reference
	private final Record record;

	// The structural feature (usually a reference) on which to 'connect' the object on
	private final EStructuralFeature structuralFeature;

	private int lineNumber;
	
	public RecordWaitingObject(int lineNumber, Record record, EStructuralFeature structuralFeature) {
		this.lineNumber = lineNumber;
		this.record = record;
		this.structuralFeature = structuralFeature;
	}

	public Record getRecord() {
		return record;
	}

	public EStructuralFeature getStructuralFeature() {
		return structuralFeature;
	}
	
	public int getLineNumber() {
		return lineNumber;
	}
	
	@Override
	public String toString() {
		return getRecord() + " " + getStructuralFeature().getName();
	}
}