// ============================================================================
// Copyright BRAINTRIBE TECHNOLOGY GMBH, Austria, 2002-2022
// 
// This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.
// 
// This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public License along with this library; See http://www.gnu.org/licenses/.
// ============================================================================
package tribefire.extension.tracing.templates.api.connector.senderconfiguration;

/**
 *
 */
public class TracingTemplateHttpSenderConfigurationContextImpl extends TracingTemplateSenderConfigurationContextImpl
		implements TracingTemplateHttpSenderConfigurationContext, TracingTemplateHttpSenderConfigurationContextBuilder {

	private String endpoint;

	@Override
	public TracingTemplateHttpSenderConfigurationContextBuilder setEndpoint(String endpoint) {
		this.endpoint = endpoint;
		return this;
	}

	@Override
	public String getEndpoint() {
		return endpoint;
	}

	@Override
	public TracingTemplateHttpSenderConfigurationContext build() {
		return this;
	}

	@Override
	public String toString() {
		return "TracingTemplateHttpSenderConfigurationContextImpl [endpoint=" + endpoint + "]";
	}

}