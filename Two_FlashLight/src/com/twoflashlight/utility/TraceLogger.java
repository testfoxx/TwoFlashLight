/**
 *   TwoFlashLight Android application
 *
 *   @author foxxtseng
 *   Copyright (C) 2015-2015  foxxtseng
 *   
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License version 2,
 *   as published by the Free Software Foundation.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.twoflashlight.utility;

import android.util.Log;

public class TraceLogger {

	private static final String LOG_IDENTIFY = "Trace Log";

	public static void print(String msg) {

		Log.v(LOG_IDENTIFY, msg);
	}
}
