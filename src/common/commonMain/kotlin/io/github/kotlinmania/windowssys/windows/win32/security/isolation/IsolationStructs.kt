package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID

public data class IsolatedAppLauncherTelemetryParameters(public var EnableForLaunch: BOOL = 0, public var CorrelationGUID: GUID = GUID())
