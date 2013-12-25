/* ========================================================================
 * Author: Umer Farooq 
 * 
 * Website: www.wingoku.com
 *
 *
 * DISTRIBUTION OF CODE WITH CREDITS TO ORIGINAL AUTHOR
 *
 *
 *
 *
 * Copyright 2013 Twitter, Inc.
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
 * ======================================================================== */

package com.umer.androidxhalofloatingwindowframehelp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class AppWindowFrameBody extends FrameLayout {

	Context context;
	
	LayoutInflater viewInflater;
	
	String appName;
	
	public AppWindowFrameBody(Context con, String app_Name) {
		super(con);
		
		context = con;
		
		appName = app_Name;
		
		viewInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	
	public View windowFrame()
	{
		View appFrame = viewInflater.inflate(R.layout.window_frame, null); // because no parent
		
		TextView appTitle = (TextView) appFrame.findViewById(R.id.appName);
		
		appTitle.setText(appName);
		
		
		ImageView closeBut = (ImageView) appFrame.findViewById(R.id.closeBut);
		
		closeBut.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				// removeView using windowManager used to manage floating window
			}
		});
		
		
		// You might want to inflate the resizing triangle here or move this code to where you are inflating resizing triangle
		
		return appFrame;
	}


}
