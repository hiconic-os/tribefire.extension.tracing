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
package tribefire.extension.tracing.model.service.demo;

import java.util.List;

import com.braintribe.model.generic.annotation.Initializer;
import com.braintribe.model.generic.annotation.meta.Mandatory;
import com.braintribe.model.generic.eval.EvalContext;
import com.braintribe.model.generic.eval.Evaluator;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.service.api.ServiceRequest;

public interface DemoTracing extends DemoTracingRequest {

	EntityType<DemoTracing> T = EntityTypes.T(DemoTracing.class);

	@Override
	EvalContext<? extends DemoTracingResult> eval(Evaluator<ServiceRequest> evaluator);

	String nestedTracings = "nestedTracings";
	String beforeDuration = "beforeDuration";
	String afterDuration = "afterDuration";
	String executeParallel = "executeParallel";
	String waitToFinish = "waitToFinish";

	List<DemoTracing> getNestedTracings();
	void setNestedTracings(List<DemoTracing> nestedTracings);

	@Mandatory
	@Initializer("0l")
	long getBeforeDuration();
	void setBeforeDuration(long beforeDuration);

	@Mandatory
	@Initializer("0l")
	long getAfterDuration();
	void setAfterDuration(long afterDuration);

	@Initializer("false")
	boolean getExecuteParallel();
	void setExecuteParallel(boolean executeParallel);

	@Initializer("false")
	boolean getWaitToFinish();
	void setWaitToFinish(boolean waitToFinish);

}
