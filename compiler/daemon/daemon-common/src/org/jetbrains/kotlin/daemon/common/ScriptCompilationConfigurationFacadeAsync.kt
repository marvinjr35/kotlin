/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.daemon.common

import kotlin.script.experimental.api.ResultWithDiagnostics
import kotlin.script.experimental.api.ScriptCompilationConfiguration
import kotlin.script.experimental.api.ScriptConfigurationRefinementContext

interface ScriptCompilationConfigurationFacadeAsync {

    suspend fun refineBeforeParsing(context: ScriptConfigurationRefinementContext): ResultWithDiagnostics<ScriptCompilationConfiguration>

    suspend fun refineOnAnnotations(context: ScriptConfigurationRefinementContext): ResultWithDiagnostics<ScriptCompilationConfiguration>

    suspend fun refineBeforeCompiling(context: ScriptConfigurationRefinementContext): ResultWithDiagnostics<ScriptCompilationConfiguration>
}
