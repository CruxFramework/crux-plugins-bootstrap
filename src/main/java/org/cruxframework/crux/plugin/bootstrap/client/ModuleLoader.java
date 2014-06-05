/*
 * Copyright 2011 cruxframework.org.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.cruxframework.crux.plugin.bootstrap.client;

import org.cruxframework.crux.plugin.bootstrap.client.resource.CruxBootstrap2Resources;
import org.cruxframework.crux.plugin.bootstrap.client.resource.CruxBootstrap3Resources;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.RepeatingCommand;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.StyleInjector;

/**
 * @author wesley.diniz
 *
 */
public class ModuleLoader implements EntryPoint
{

	@Override
	public void onModuleLoad()
	{
		//If you want to compile a bootstrap 2.3.2 version, just change the commented line bellow
		//injectBoostrap2();
		injectBoostrap3();
	}
	
	
	private void injectBoostrap3()
	{
		final CruxBootstrap3Resources resources = GWT.create(CruxBootstrap3Resources.class);
		
		Scheduler.get().scheduleFixedDelay(new RepeatingCommand() 
		{
			@Override
			public boolean execute() 
			{
				//Cascade Style Sheet
				String bootstrapCSS = resources.css().getText();
				String bootstrapModalCSS = resources.bootstrapModalCSS().getText();
				String bootstrapSelectCSS = resources.bootstrapSelectCSS().getText();
				String bootstrapThemeCSS = resources.themeCss().getText();
				
				StyleInjector.injectStylesheetAtEnd(bootstrapCSS);
				StyleInjector.injectStylesheetAtEnd(bootstrapThemeCSS);
				StyleInjector.injectStylesheetAtEnd(bootstrapSelectCSS);
				StyleInjector.injectStylesheetAtEnd(bootstrapModalCSS);
				
				//JavaScript
				String bootstrapJS = resources.bootstrapJS().getText();
				String jquery = resources.jquery().getText();
				String modalJS = resources.bootstrapModal().getText();
				String modalManagerJS = resources.bootstrapModalManager().getText();
				String selectJS = resources.bootstrapSelect().getText();
				String html5shiv = resources.html5shiv().getText();
				
				ScriptInjector.fromString(jquery).setWindow(ScriptInjector.TOP_WINDOW).inject();
				ScriptInjector.fromString(bootstrapJS).setWindow(ScriptInjector.TOP_WINDOW).inject();
				ScriptInjector.fromString(modalManagerJS).setWindow(ScriptInjector.TOP_WINDOW).inject();
				ScriptInjector.fromString(modalJS).setWindow(ScriptInjector.TOP_WINDOW).inject();
				ScriptInjector.fromString(selectJS).setWindow(ScriptInjector.TOP_WINDOW).inject();
				ScriptInjector.fromString(html5shiv).setWindow(ScriptInjector.TOP_WINDOW).inject();
				
				return false;
			}
		}, 300);
	}
	
	@SuppressWarnings("unused")
	private void injectBoostrap2()
	{
		final CruxBootstrap2Resources res = GWT.create(CruxBootstrap2Resources.class);
		
		Scheduler.get().scheduleFixedDelay(new RepeatingCommand() {

			@Override
			public boolean execute()
			{
				//JavaScript
				String jquery = res.jquery().getText();
				String bs2JS = res.bootstrap2JS().getText();
				String html5shiv = res.html5shiv().getText();
				String modal = res.bootstrapModal().getText();
				String modalManager = res.bootstrapModalManager().getText();
				String select = res.bootstrapSelect().getText();

				ScriptInjector.fromString(jquery).setWindow(ScriptInjector.TOP_WINDOW).inject();
				ScriptInjector.fromString(bs2JS).setWindow(ScriptInjector.TOP_WINDOW).inject();
				ScriptInjector.fromString(modalManager).setWindow(ScriptInjector.TOP_WINDOW).inject();
				ScriptInjector.fromString(modal).setWindow(ScriptInjector.TOP_WINDOW).inject();
				ScriptInjector.fromString(select).setWindow(ScriptInjector.TOP_WINDOW).inject();
				ScriptInjector.fromString(html5shiv).setWindow(ScriptInjector.TOP_WINDOW).inject();
				
				//Cascade Style Sheets
				String bs2Responsive = res.cssResponsive().getText();
				String bootstrapModalCSS = res.bootstrapModalCSS().getText();
				String bootstrapSelectCSS = res.bootstrapSelectCSS().getText();
				String bs2Css = res.css().getText();
						
				StyleInjector.injectStylesheetAtEnd(bs2Css);
				StyleInjector.injectStylesheetAtEnd(bs2Responsive);
				StyleInjector.injectStylesheetAtEnd(bootstrapSelectCSS);
				StyleInjector.injectStylesheetAtEnd(bootstrapModalCSS);
				
				return false;
			}
			
		},300);
	}
}
