// Copyright (C) 2014 Dariusz Luksza
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.luksza.gerrit;

import com.google.gerrit.extensions.config.CapabilityDefinition;

public class RetriggerCapability extends CapabilityDefinition {
  public static final String NAME = "retrigger";

  @Override
  public String getDescription() {
    return "Retrigger CI jobs from Gerrit WEB UI";
  }
}
