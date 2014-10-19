/*
 * Copyright 2014 agwlvssainokuni
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cherry.parser.worksheet;

import static com.google.common.base.CaseFormat.LOWER_CAMEL;
import static com.google.common.base.CaseFormat.LOWER_UNDERSCORE;
import static com.google.common.base.CaseFormat.UPPER_CAMEL;
import static com.google.common.base.CaseFormat.UPPER_UNDERSCORE;

import java.util.LinkedHashMap;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ItemDef extends LinkedHashMap<String, String> {

	private static final long serialVersionUID = 1L;

	public String upperCamel(String key) {
		return LOWER_CAMEL.to(UPPER_CAMEL, get(key));
	}

	public String lowerUnderscore(String key) {
		return LOWER_CAMEL.to(LOWER_UNDERSCORE, get(key));
	}

	public String upperUnderscore(String key) {
		return LOWER_CAMEL.to(UPPER_UNDERSCORE, get(key));
	}

}
