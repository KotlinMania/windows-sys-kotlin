package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

public val CCH_RM_MAX_APP_NAME: UInt = 255u

public val CCH_RM_MAX_SVC_NAME: UInt = 63u

public val CCH_RM_SESSION_KEY: UInt = 32u

public val RM_INVALID_PROCESS: Int = -1

public val RM_INVALID_TS_SESSION: Int = -1

public val RmConsole: RM_APP_TYPE = 5

public val RmCritical: RM_APP_TYPE = 1000

public val RmExplorer: RM_APP_TYPE = 4

public val RmFilterTriggerFile: RM_FILTER_TRIGGER = 1

public val RmFilterTriggerInvalid: RM_FILTER_TRIGGER = 0

public val RmFilterTriggerProcess: RM_FILTER_TRIGGER = 2

public val RmFilterTriggerService: RM_FILTER_TRIGGER = 3

public val RmForceShutdown: RM_SHUTDOWN_TYPE = 1

public val RmInvalidFilterAction: RM_FILTER_ACTION = 0

public val RmMainWindow: RM_APP_TYPE = 1

public val RmNoRestart: RM_FILTER_ACTION = 1

public val RmNoShutdown: RM_FILTER_ACTION = 2

public val RmOtherWindow: RM_APP_TYPE = 2

public val RmRebootReasonCriticalProcess: RM_REBOOT_REASON = 4

public val RmRebootReasonCriticalService: RM_REBOOT_REASON = 8

public val RmRebootReasonDetectedSelf: RM_REBOOT_REASON = 16

public val RmRebootReasonNone: RM_REBOOT_REASON = 0

public val RmRebootReasonPermissionDenied: RM_REBOOT_REASON = 1

public val RmRebootReasonSessionMismatch: RM_REBOOT_REASON = 2

public val RmService: RM_APP_TYPE = 3

public val RmShutdownOnlyRegistered: RM_SHUTDOWN_TYPE = 16

public val RmStatusErrorOnRestart: RM_APP_STATUS = 32

public val RmStatusErrorOnStop: RM_APP_STATUS = 16

public val RmStatusRestartMasked: RM_APP_STATUS = 128

public val RmStatusRestarted: RM_APP_STATUS = 8

public val RmStatusRunning: RM_APP_STATUS = 1

public val RmStatusShutdownMasked: RM_APP_STATUS = 64

public val RmStatusStopped: RM_APP_STATUS = 2

public val RmStatusStoppedOther: RM_APP_STATUS = 4

public val RmStatusUnknown: RM_APP_STATUS = 0

public val RmUnknownApp: RM_APP_TYPE = 0
