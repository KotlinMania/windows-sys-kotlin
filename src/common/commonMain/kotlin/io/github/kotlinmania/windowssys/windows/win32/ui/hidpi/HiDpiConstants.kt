package io.github.kotlinmania.windowssys.windows.win32.ui.hidpi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public val DCDC_DEFAULT: DialogControlDpiChangeBehaviors = 0

public val DCDC_DISABLE_FONT_UPDATE: DialogControlDpiChangeBehaviors = 1

public val DCDC_DISABLE_RELAYOUT: DialogControlDpiChangeBehaviors = 2

public val DDC_DEFAULT: DialogDpiChangeBehaviors = 0

public val DDC_DISABLE_ALL: DialogDpiChangeBehaviors = 1

public val DDC_DISABLE_CONTROL_RELAYOUT: DialogDpiChangeBehaviors = 4

public val DDC_DISABLE_RESIZE: DialogDpiChangeBehaviors = 2

public val DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE: DpiAwarenessContext = MutPtr<CVoid>((-3).toLong())

public val DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE_V2: DpiAwarenessContext = MutPtr<CVoid>((-4).toLong())

public val DPI_AWARENESS_CONTEXT_SYSTEM_AWARE: DpiAwarenessContext = MutPtr<CVoid>((-2).toLong())

public val DPI_AWARENESS_CONTEXT_UNAWARE: DpiAwarenessContext = MutPtr<CVoid>((-1).toLong())

public val DPI_AWARENESS_CONTEXT_UNAWARE_GDISCALED: DpiAwarenessContext = MutPtr<CVoid>((-5).toLong())

public val DPI_AWARENESS_INVALID: DpiAwareness = -1

public val DPI_AWARENESS_PER_MONITOR_AWARE: DpiAwareness = 2

public val DPI_AWARENESS_SYSTEM_AWARE: DpiAwareness = 1

public val DPI_AWARENESS_UNAWARE: DpiAwareness = 0

public val DPI_HOSTING_BEHAVIOR_DEFAULT: DpiHostingBehavior = 0

public val DPI_HOSTING_BEHAVIOR_INVALID: DpiHostingBehavior = -1

public val DPI_HOSTING_BEHAVIOR_MIXED: DpiHostingBehavior = 1

public val MDT_ANGULAR_DPI: MonitorDpiType = 1

public val MDT_DEFAULT: MonitorDpiType = 0

public val MDT_EFFECTIVE_DPI: MonitorDpiType = 0

public val MDT_RAW_DPI: MonitorDpiType = 2

public val PROCESS_DPI_UNAWARE: ProcessDpiAwareness = 0

public val PROCESS_PER_MONITOR_DPI_AWARE: ProcessDpiAwareness = 2

public val PROCESS_SYSTEM_DPI_AWARE: ProcessDpiAwareness = 1
