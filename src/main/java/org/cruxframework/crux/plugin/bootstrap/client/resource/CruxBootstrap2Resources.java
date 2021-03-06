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
import org.cruxframework.crux.plugin.bootstrap.client.resource.css.v2.CssBootstrap2;
import org.cruxframework.crux.plugin.bootstrap.client.resource.css.v2.CssBootstrap2Responsive;
import org.cruxframework.crux.plugin.bootstrap.client.resource.css.v3.CssBootstrapModal;
import org.cruxframework.crux.plugin.bootstrap.client.resource.css.v3.CssBootstrapSelect;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.TextResource;

/**
 * @author wesley.diniz
 * This class is responsible to wrap all required bootstrap's 2.3.2 resources
 */
@Resource("CruxBootstrap2Resources")
public interface CruxBootstrap2Resources extends ClientBundle
{
	@Source("js/html5shiv.js")
	TextResource html5shiv();
	
	@Source("css/v2/bootstrap.min.css")
	CssBootstrap2 css();
	
	@Source("css/v2/bootstrap-responsive.min.css")
	CssBootstrap2Responsive cssResponsive();
	
	@Source("js/v2/bootstrap.min.js")
	TextResource bootstrap2JS();

	@Source("img/v2/glyphicons-halflings-white.png")
	DataResource glyphIconsWhite();
	
	@Source("img/v2/glyphicons-halflings.png")
	DataResource glyphIcons();
	
	@Source("js/jquery.js")
	TextResource jquery();
	
	@Source("css/bootstrap-modal.css")
	CssBootstrapModal bootstrapModalCSS();
	
	@Source("css/bootstrap-select.min.css")
	CssBootstrapSelect bootstrapSelectCSS();
	
	@Source("js/bootstrap-modal.js")
	TextResource bootstrapModal();
	
	@Source("js/bootstrap-modalmanager.js")
	TextResource bootstrapModalManager();
	
	@Source("js/bootstrap-select.min.js")
	TextResource bootstrapSelect();
}
