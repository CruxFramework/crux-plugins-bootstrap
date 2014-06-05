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
package org.cruxframework.crux.plugin.bootstrap.client.resource;

import org.cruxframework.crux.core.client.resources.Resource;
import org.cruxframework.crux.plugin.bootstrap.client.resource.css.v3.CssBootstrapCommon;
import org.cruxframework.crux.plugin.bootstrap.client.resource.css.v3.CssBootstrapModal;
import org.cruxframework.crux.plugin.bootstrap.client.resource.css.v3.CssBootstrapSelect;
import org.cruxframework.crux.plugin.bootstrap.client.resource.css.v3.CssThemeBootstrap;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.TextResource;

/**
 * @author wesley.diniz
 * This class is responsible to wrap all required bootstrap's 3 resources
 */
@Resource("CruxBootstrap3Resources")
public interface CruxBootstrap3Resources extends ClientBundle
{
	@Source("js/html5shiv.js")
	TextResource html5shiv();
	
	@Source("css/v3/bootstrap-min.css")
	CssBootstrapCommon css();
	
	@Source("css/v3/bootstrap-theme-min.css")
	CssThemeBootstrap themeCss();
	
	@Source("css/bootstrap-modal.css")
	CssBootstrapModal bootstrapModalCSS();
	
	@Source("css/bootstrap-select.min.css")
	CssBootstrapSelect bootstrapSelectCSS();
	
	@Source("js/v3/bootstrap-min.js")
	TextResource bootstrapJS();
	
	@Source("js/jquery.js")
	TextResource jquery();
	
	@Source("js/bootstrap-modal.js")
	TextResource bootstrapModal();
	
	@Source("js/bootstrap-modalmanager.js")
	TextResource bootstrapModalManager();
	
	@Source("js/bootstrap-select.min.js")
	TextResource bootstrapSelect();
	
	@Source("img/v3/glyphicons-halflings-regular.eot")
	DataResource glyphIconsHalflingsRegularEOT();
	
	@Source("img/v3/glyphicons-halflings-regular.svg")
	DataResource glyphIconsHalflingsRegularSVG();
	
	@Source("img/v3/glyphicons-halflings-regular.ttf")
	DataResource glyphIconsHalflingsRegularTTF();
	
	@Source("img/v3/glyphicons-halflings-regular.woff")
	DataResource glyphIconsHalflingsRegularWOFF();
	
}
