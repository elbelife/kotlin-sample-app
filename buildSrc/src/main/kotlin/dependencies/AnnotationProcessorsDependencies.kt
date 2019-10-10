/*
 * Copyright 2019 vmadalin.com
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

object AnnotationProcessorsDependencies {
    const val DAGGER = "com.google.dagger:dagger-compiler:${DependenciesVersions.DAGGER}"
    const val DATABINDING = "com.android.databinding:compiler:${DependenciesVersions.DATABINDING}"
    const val GLIDE = "com.github.bumptech.glide:compiler:${DependenciesVersions.GLIDE}"
    const val ROOM = "androidx.room:room-compiler:${DependenciesVersions.ROOM}"
}