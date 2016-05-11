/*
 This file is part of Subsonic.

 Subsonic is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Subsonic is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Subsonic.  If not, see <http://www.gnu.org/licenses/>.

 Copyright 2010 (C) Sindre Mehus
 */
package org.moire.ultrasonic.provider;

import org.moire.ultrasonic.R;

public class UltraSonicAppWidgetProvider4x4 extends UltraSonicAppWidgetProvider
{

	public UltraSonicAppWidgetProvider4x4()
	{
		super();
		this.layoutId = R.layout.appwidget4x4;
	}

	private static UltraSonicAppWidgetProvider4x4 instance;

	public static synchronized UltraSonicAppWidgetProvider4x4 getInstance()
	{
		if (instance == null)
		{
			instance = new UltraSonicAppWidgetProvider4x4();
		}
		return instance;
	}
}