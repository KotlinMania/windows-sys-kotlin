package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

public val EWX_ARSO: ExitWindowsFlags = 67108864u

public val EWX_BOOTOPTIONS: ExitWindowsFlags = 16777216u

public val EWX_CHECK_SAFE_FOR_SERVER: ExitWindowsFlags = 134217728u

public val EWX_FORCE: ExitWindowsFlags = 4u

public val EWX_FORCEIFHUNG: ExitWindowsFlags = 16u

public val EWX_HYBRID_SHUTDOWN: ExitWindowsFlags = 4194304u

public val EWX_LOGOFF: ExitWindowsFlags = 0u

public val EWX_POWEROFF: ExitWindowsFlags = 8u

public val EWX_QUICKRESOLVE: ExitWindowsFlags = 32u

public val EWX_REBOOT: ExitWindowsFlags = 2u

public val EWX_RESTARTAPPS: ExitWindowsFlags = 64u

public val EWX_SHUTDOWN: ExitWindowsFlags = 1u

public val EWX_SYSTEM_INITIATED: ExitWindowsFlags = 268435456u

public val MAX_NUM_REASONS: UInt = 256u

public val MAX_REASON_BUGID_LEN: UInt = 32u

public val MAX_REASON_COMMENT_LEN: UInt = 512u

public val MAX_REASON_DESC_LEN: UInt = 256u

public val MAX_REASON_NAME_LEN: UInt = 64u

public val POLICY_SHOWREASONUI_ALWAYS: UInt = 1u

public val POLICY_SHOWREASONUI_NEVER: UInt = 0u

public val POLICY_SHOWREASONUI_SERVERONLY: UInt = 3u

public val POLICY_SHOWREASONUI_WORKSTATIONONLY: UInt = 2u

public val SHTDN_REASON_FLAG_CLEAN_UI: ShutdownReason = 67108864u

public val SHTDN_REASON_FLAG_COMMENT_REQUIRED: ShutdownReason = 16777216u

public val SHTDN_REASON_FLAG_DIRTY_PROBLEM_ID_REQUIRED: ShutdownReason = 33554432u

public val SHTDN_REASON_FLAG_DIRTY_UI: ShutdownReason = 134217728u

public val SHTDN_REASON_FLAG_MOBILE_UI_RESERVED: ShutdownReason = 268435456u

public val SHTDN_REASON_FLAG_PLANNED: ShutdownReason = 2147483648u

public val SHTDN_REASON_FLAG_USER_DEFINED: ShutdownReason = 1073741824u

public val SHTDN_REASON_LEGACY_API: ShutdownReason = 2147942400u

public val SHTDN_REASON_MAJOR_APPLICATION: ShutdownReason = 262144u

public val SHTDN_REASON_MAJOR_HARDWARE: ShutdownReason = 65536u

public val SHTDN_REASON_MAJOR_LEGACY_API: ShutdownReason = 458752u

public val SHTDN_REASON_MAJOR_NONE: ShutdownReason = 0u

public val SHTDN_REASON_MAJOR_OPERATINGSYSTEM: ShutdownReason = 131072u

public val SHTDN_REASON_MAJOR_OTHER: ShutdownReason = 0u

public val SHTDN_REASON_MAJOR_POWER: ShutdownReason = 393216u

public val SHTDN_REASON_MAJOR_SOFTWARE: ShutdownReason = 196608u

public val SHTDN_REASON_MAJOR_SYSTEM: ShutdownReason = 327680u

public val SHTDN_REASON_MINOR_BLUESCREEN: ShutdownReason = 15u

public val SHTDN_REASON_MINOR_CORDUNPLUGGED: ShutdownReason = 11u

public val SHTDN_REASON_MINOR_DC_DEMOTION: ShutdownReason = 34u

public val SHTDN_REASON_MINOR_DC_PROMOTION: ShutdownReason = 33u

public val SHTDN_REASON_MINOR_DISK: ShutdownReason = 7u

public val SHTDN_REASON_MINOR_ENVIRONMENT: ShutdownReason = 12u

public val SHTDN_REASON_MINOR_HARDWARE_DRIVER: ShutdownReason = 13u

public val SHTDN_REASON_MINOR_HOTFIX: ShutdownReason = 17u

public val SHTDN_REASON_MINOR_HOTFIX_UNINSTALL: ShutdownReason = 23u

public val SHTDN_REASON_MINOR_HUNG: ShutdownReason = 5u

public val SHTDN_REASON_MINOR_INSTALLATION: ShutdownReason = 2u

public val SHTDN_REASON_MINOR_MAINTENANCE: ShutdownReason = 1u

public val SHTDN_REASON_MINOR_MMC: ShutdownReason = 25u

public val SHTDN_REASON_MINOR_NETWORKCARD: ShutdownReason = 9u

public val SHTDN_REASON_MINOR_NETWORK_CONNECTIVITY: ShutdownReason = 20u

public val SHTDN_REASON_MINOR_NONE: ShutdownReason = 255u

public val SHTDN_REASON_MINOR_OTHER: ShutdownReason = 0u

public val SHTDN_REASON_MINOR_OTHERDRIVER: ShutdownReason = 14u

public val SHTDN_REASON_MINOR_POWER_SUPPLY: ShutdownReason = 10u

public val SHTDN_REASON_MINOR_PROCESSOR: ShutdownReason = 8u

public val SHTDN_REASON_MINOR_RECONFIG: ShutdownReason = 4u

public val SHTDN_REASON_MINOR_SECURITY: ShutdownReason = 19u

public val SHTDN_REASON_MINOR_SECURITYFIX: ShutdownReason = 18u

public val SHTDN_REASON_MINOR_SECURITYFIX_UNINSTALL: ShutdownReason = 24u

public val SHTDN_REASON_MINOR_SERVICEPACK: ShutdownReason = 16u

public val SHTDN_REASON_MINOR_SERVICEPACK_UNINSTALL: ShutdownReason = 22u

public val SHTDN_REASON_MINOR_SYSTEMRESTORE: ShutdownReason = 26u

public val SHTDN_REASON_MINOR_TERMSRV: ShutdownReason = 32u

public val SHTDN_REASON_MINOR_UNSTABLE: ShutdownReason = 6u

public val SHTDN_REASON_MINOR_UPGRADE: ShutdownReason = 3u

public val SHTDN_REASON_MINOR_WMI: ShutdownReason = 21u

public val SHTDN_REASON_NONE: ShutdownReason = 0u

public val SHTDN_REASON_UNKNOWN: ShutdownReason = 255u

public val SHTDN_REASON_VALID_BIT_MASK: ShutdownReason = 3238002687u

public val SHUTDOWN_ARSO: ShutdownFlags = 8192u

public val SHUTDOWN_CHECK_SAFE_FOR_SERVER: ShutdownFlags = 16384u

public val SHUTDOWN_FORCE_OTHERS: ShutdownFlags = 1u

public val SHUTDOWN_FORCE_SELF: ShutdownFlags = 2u

public val SHUTDOWN_GRACE_OVERRIDE: ShutdownFlags = 32u

public val SHUTDOWN_HYBRID: ShutdownFlags = 512u

public val SHUTDOWN_INSTALL_UPDATES: ShutdownFlags = 64u

public val SHUTDOWN_MOBILE_UI: ShutdownFlags = 4096u

public val SHUTDOWN_NOREBOOT: ShutdownFlags = 16u

public val SHUTDOWN_POWEROFF: ShutdownFlags = 8u

public val SHUTDOWN_RESTART: ShutdownFlags = 4u

public val SHUTDOWN_RESTARTAPPS: ShutdownFlags = 128u

public val SHUTDOWN_RESTART_BOOTOPTIONS: ShutdownFlags = 1024u

public val SHUTDOWN_SKIP_SVC_PRESHUTDOWN: ShutdownFlags = 256u

public val SHUTDOWN_SOFT_REBOOT: ShutdownFlags = 2048u

public val SHUTDOWN_SYSTEM_INITIATED: ShutdownFlags = 65536u

public val SHUTDOWN_TYPE_LEN: UInt = 32u

public val SHUTDOWN_VAIL_CONTAINER: ShutdownFlags = 32768u

public val SNAPSHOT_POLICY_ALWAYS: UInt = 1u

public val SNAPSHOT_POLICY_NEVER: UInt = 0u

public val SNAPSHOT_POLICY_UNPLANNED: UInt = 2u
