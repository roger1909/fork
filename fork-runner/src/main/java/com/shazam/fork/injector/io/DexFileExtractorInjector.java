/*
 * Copyright 2019 Apple Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.shazam.fork.injector.io;

import com.shazam.fork.io.ClassesDexFileExtractor;
import com.shazam.fork.io.DexFileExtractor;

import static com.shazam.fork.injector.ConfigurationInjector.configuredOutput;

public class DexFileExtractorInjector {

    private DexFileExtractorInjector() {}

    public static DexFileExtractor dexFileExtractor() {
        return new ClassesDexFileExtractor(configuredOutput());
    }
}
