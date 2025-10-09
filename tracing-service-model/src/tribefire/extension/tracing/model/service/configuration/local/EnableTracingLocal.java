// ============================================================================
// Copyright BRAINTRIBE TECHNOLOGY GMBH, Austria, 2002-2022
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
//     http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// ============================================================================
package tribefire.extension.tracing.model.service.configuration.local;

import com.braintribe.model.generic.annotation.meta.Description;
import com.braintribe.model.generic.annotation.meta.Name;
import com.braintribe.model.generic.eval.EvalContext;
import com.braintribe.model.generic.eval.Evaluator;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.service.api.ServiceRequest;
import com.braintribe.model.time.TimeSpan;

import tribefire.extension.tracing.model.service.TracingRequest;

public interface EnableTracingLocal extends TracingRequest {

	EntityType<EnableTracingLocal> T = EntityTypes.T(EnableTracingLocal.class);

	@Override
	EvalContext<? extends EnableTracingLocalResult> eval(Evaluator<ServiceRequest> evaluator);

	String enableDuration = "enableDuration";

	@Name("Enable Tracing Duration")
	@Description("Duration when the tracing gets automatically disabled again - if not set it stays enabled forever")
	TimeSpan getEnableDuration();
	void setEnableDuration(TimeSpan enableDuration);
}
