package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

public val CCH_RM_MAX_APP_NAME: UInt = 255u

public val CCH_RM_MAX_SVC_NAME: UInt = 63u

public val CCH_RM_SESSION_KEY: UInt = 32u

public val RM_INVALID_PROCESS: Int = -1

public val RM_INVALID_TS_SESSION: Int = -1

public val RM_CONSOLE: RmAppType = 5

public val RM_CRITICAL: RmAppType = 1000

public val RM_EXPLORER: RmAppType = 4

public val RM_FILTER_TRIGGER_FILE: RmFilterTrigger = 1

public val RM_FILTER_TRIGGER_INVALID: RmFilterTrigger = 0

public val RM_FILTER_TRIGGER_PROCESS: RmFilterTrigger = 2

public val RM_FILTER_TRIGGER_SERVICE: RmFilterTrigger = 3

public val RM_FORCE_SHUTDOWN: RmShutdownType = 1

public val RM_INVALID_FILTER_ACTION: RmFilterAction = 0

public val RM_MAIN_WINDOW: RmAppType = 1

public val RM_NO_RESTART: RmFilterAction = 1

public val RM_NO_SHUTDOWN: RmFilterAction = 2

public val RM_OTHER_WINDOW: RmAppType = 2

public val RM_REBOOT_REASON_CRITICAL_PROCESS: RmRebootReason = 4

public val RM_REBOOT_REASON_CRITICAL_SERVICE: RmRebootReason = 8

public val RM_REBOOT_REASON_DETECTED_SELF: RmRebootReason = 16

public val RM_REBOOT_REASON_NONE: RmRebootReason = 0

public val RM_REBOOT_REASON_PERMISSION_DENIED: RmRebootReason = 1

public val RM_REBOOT_REASON_SESSION_MISMATCH: RmRebootReason = 2

public val RM_SERVICE: RmAppType = 3

public val RM_SHUTDOWN_ONLY_REGISTERED: RmShutdownType = 16

public val RM_STATUS_ERROR_ON_RESTART: RmAppStatus = 32

public val RM_STATUS_ERROR_ON_STOP: RmAppStatus = 16

public val RM_STATUS_RESTART_MASKED: RmAppStatus = 128

public val RM_STATUS_RESTARTED: RmAppStatus = 8

public val RM_STATUS_RUNNING: RmAppStatus = 1

public val RM_STATUS_SHUTDOWN_MASKED: RmAppStatus = 64

public val RM_STATUS_STOPPED: RmAppStatus = 2

public val RM_STATUS_STOPPED_OTHER: RmAppStatus = 4

public val RM_STATUS_UNKNOWN: RmAppStatus = 0

public val RM_UNKNOWN_APP: RmAppType = 0
