package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid

public data class IsolatedAppLauncherTelemetryParameters(public var enableForLaunch: Bool = 0, public var correlationGUID: Guid = Guid())
