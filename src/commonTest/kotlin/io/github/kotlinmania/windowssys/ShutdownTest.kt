// port-lint: tests Windows/Win32/System/Shutdown/mod.rs
package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.EWX_ARSO
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.EWX_BOOTOPTIONS
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.EWX_CHECK_SAFE_FOR_SERVER
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.EWX_FORCE
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.EWX_FORCEIFHUNG
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.EWX_HYBRID_SHUTDOWN
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.EWX_LOGOFF
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.EWX_POWEROFF
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.EWX_QUICKRESOLVE
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.EWX_REBOOT
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.EWX_RESTARTAPPS
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.EWX_SHUTDOWN
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.EWX_SYSTEM_INITIATED
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.MAX_NUM_REASONS
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.MAX_REASON_BUGID_LEN
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.MAX_REASON_COMMENT_LEN
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.MAX_REASON_DESC_LEN
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.MAX_REASON_NAME_LEN
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.POLICY_SHOWREASONUI_ALWAYS
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.POLICY_SHOWREASONUI_NEVER
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.POLICY_SHOWREASONUI_SERVERONLY
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.POLICY_SHOWREASONUI_WORKSTATIONONLY
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_FLAG_CLEAN_UI
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_FLAG_COMMENT_REQUIRED
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_FLAG_DIRTY_PROBLEM_ID_REQUIRED
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_FLAG_DIRTY_UI
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_FLAG_MOBILE_UI_RESERVED
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_FLAG_PLANNED
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_FLAG_USER_DEFINED
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_LEGACY_API
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MAJOR_APPLICATION
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MAJOR_HARDWARE
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MAJOR_LEGACY_API
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MAJOR_NONE
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MAJOR_OPERATINGSYSTEM
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MAJOR_OTHER
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MAJOR_POWER
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MAJOR_SOFTWARE
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MAJOR_SYSTEM
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_BLUESCREEN
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_CORDUNPLUGGED
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_DC_DEMOTION
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_DC_PROMOTION
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_DISK
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_ENVIRONMENT
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_HARDWARE_DRIVER
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_HOTFIX
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_HOTFIX_UNINSTALL
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_HUNG
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_INSTALLATION
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_MAINTENANCE
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_MMC
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_NETWORKCARD
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_NETWORK_CONNECTIVITY
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_NONE
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_OTHER
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_OTHERDRIVER
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_POWER_SUPPLY
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_PROCESSOR
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_RECONFIG
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_SECURITY
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_SECURITYFIX
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_SECURITYFIX_UNINSTALL
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_SERVICEPACK
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_SERVICEPACK_UNINSTALL
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_SYSTEMRESTORE
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_TERMSRV
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_UNSTABLE
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_UPGRADE
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_MINOR_WMI
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_NONE
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_UNKNOWN
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHTDN_REASON_VALID_BIT_MASK
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_ARSO
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_CHECK_SAFE_FOR_SERVER
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_FORCE_OTHERS
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_FORCE_SELF
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_GRACE_OVERRIDE
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_HYBRID
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_INSTALL_UPDATES
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_MOBILE_UI
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_NOREBOOT
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_POWEROFF
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_RESTART
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_RESTARTAPPS
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_RESTART_BOOTOPTIONS
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_SKIP_SVC_PRESHUTDOWN
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_SOFT_REBOOT
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_SYSTEM_INITIATED
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_TYPE_LEN
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SHUTDOWN_VAIL_CONTAINER
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SNAPSHOT_POLICY_ALWAYS
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SNAPSHOT_POLICY_NEVER
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.SNAPSHOT_POLICY_UNPLANNED
import kotlin.test.Test
import kotlin.test.assertEquals

class ShutdownTest {
    @Test
    fun testExitWindowsFlags() {
        assertEquals(0u, EWX_LOGOFF)
        assertEquals(1u, EWX_SHUTDOWN)
        assertEquals(2u, EWX_REBOOT)
        assertEquals(4u, EWX_FORCE)
        assertEquals(8u, EWX_POWEROFF)
        assertEquals(16u, EWX_FORCEIFHUNG)
        assertEquals(32u, EWX_QUICKRESOLVE)
        assertEquals(64u, EWX_RESTARTAPPS)
        assertEquals(4194304u, EWX_HYBRID_SHUTDOWN)
        assertEquals(16777216u, EWX_BOOTOPTIONS)
        assertEquals(67108864u, EWX_ARSO)
        assertEquals(134217728u, EWX_CHECK_SAFE_FOR_SERVER)
        assertEquals(268435456u, EWX_SYSTEM_INITIATED)
    }

    @Test
    fun testShutdownPoliciesAndLengths() {
        assertEquals(256u, MAX_NUM_REASONS)
        assertEquals(32u, MAX_REASON_BUGID_LEN)
        assertEquals(512u, MAX_REASON_COMMENT_LEN)
        assertEquals(256u, MAX_REASON_DESC_LEN)
        assertEquals(64u, MAX_REASON_NAME_LEN)

        assertEquals(0u, POLICY_SHOWREASONUI_NEVER)
        assertEquals(1u, POLICY_SHOWREASONUI_ALWAYS)
        assertEquals(2u, POLICY_SHOWREASONUI_WORKSTATIONONLY)
        assertEquals(3u, POLICY_SHOWREASONUI_SERVERONLY)

        assertEquals(0u, SNAPSHOT_POLICY_NEVER)
        assertEquals(1u, SNAPSHOT_POLICY_ALWAYS)
        assertEquals(2u, SNAPSHOT_POLICY_UNPLANNED)

        assertEquals(32u, SHUTDOWN_TYPE_LEN)
    }

    @Test
    fun testShutdownFlags() {
        assertEquals(1u, SHUTDOWN_FORCE_OTHERS)
        assertEquals(2u, SHUTDOWN_FORCE_SELF)
        assertEquals(4u, SHUTDOWN_RESTART)
        assertEquals(8u, SHUTDOWN_POWEROFF)
        assertEquals(16u, SHUTDOWN_NOREBOOT)
        assertEquals(32u, SHUTDOWN_GRACE_OVERRIDE)
        assertEquals(64u, SHUTDOWN_INSTALL_UPDATES)
        assertEquals(128u, SHUTDOWN_RESTARTAPPS)
        assertEquals(256u, SHUTDOWN_SKIP_SVC_PRESHUTDOWN)
        assertEquals(512u, SHUTDOWN_HYBRID)
        assertEquals(1024u, SHUTDOWN_RESTART_BOOTOPTIONS)
        assertEquals(2048u, SHUTDOWN_SOFT_REBOOT)
        assertEquals(4096u, SHUTDOWN_MOBILE_UI)
        assertEquals(8192u, SHUTDOWN_ARSO)
        assertEquals(16384u, SHUTDOWN_CHECK_SAFE_FOR_SERVER)
        assertEquals(32768u, SHUTDOWN_VAIL_CONTAINER)
        assertEquals(65536u, SHUTDOWN_SYSTEM_INITIATED)
    }

    @Test
    fun testShutdownReasons() {
        assertEquals(0u, SHTDN_REASON_NONE)
        assertEquals(16777216u, SHTDN_REASON_FLAG_COMMENT_REQUIRED)
        assertEquals(33554432u, SHTDN_REASON_FLAG_DIRTY_PROBLEM_ID_REQUIRED)
        assertEquals(67108864u, SHTDN_REASON_FLAG_CLEAN_UI)
        assertEquals(134217728u, SHTDN_REASON_FLAG_DIRTY_UI)
        assertEquals(268435456u, SHTDN_REASON_FLAG_MOBILE_UI_RESERVED)
        assertEquals(1073741824u, SHTDN_REASON_FLAG_USER_DEFINED)
        assertEquals(2147483648u, SHTDN_REASON_FLAG_PLANNED)
        assertEquals(2147942400u, SHTDN_REASON_LEGACY_API)

        assertEquals(0u, SHTDN_REASON_MAJOR_OTHER)
        assertEquals(0u, SHTDN_REASON_MAJOR_NONE)
        assertEquals(65536u, SHTDN_REASON_MAJOR_HARDWARE)
        assertEquals(131072u, SHTDN_REASON_MAJOR_OPERATINGSYSTEM)
        assertEquals(196608u, SHTDN_REASON_MAJOR_SOFTWARE)
        assertEquals(262144u, SHTDN_REASON_MAJOR_APPLICATION)
        assertEquals(327680u, SHTDN_REASON_MAJOR_SYSTEM)
        assertEquals(393216u, SHTDN_REASON_MAJOR_POWER)
        assertEquals(458752u, SHTDN_REASON_MAJOR_LEGACY_API)

        assertEquals(0u, SHTDN_REASON_MINOR_OTHER)
        assertEquals(255u, SHTDN_REASON_MINOR_NONE)
        assertEquals(1u, SHTDN_REASON_MINOR_MAINTENANCE)
        assertEquals(2u, SHTDN_REASON_MINOR_INSTALLATION)
        assertEquals(3u, SHTDN_REASON_MINOR_UPGRADE)
        assertEquals(4u, SHTDN_REASON_MINOR_RECONFIG)
        assertEquals(5u, SHTDN_REASON_MINOR_HUNG)
        assertEquals(6u, SHTDN_REASON_MINOR_UNSTABLE)
        assertEquals(7u, SHTDN_REASON_MINOR_DISK)
        assertEquals(8u, SHTDN_REASON_MINOR_PROCESSOR)
        assertEquals(9u, SHTDN_REASON_MINOR_NETWORKCARD)
        assertEquals(10u, SHTDN_REASON_MINOR_POWER_SUPPLY)
        assertEquals(11u, SHTDN_REASON_MINOR_CORDUNPLUGGED)
        assertEquals(12u, SHTDN_REASON_MINOR_ENVIRONMENT)
        assertEquals(13u, SHTDN_REASON_MINOR_HARDWARE_DRIVER)
        assertEquals(14u, SHTDN_REASON_MINOR_OTHERDRIVER)
        assertEquals(15u, SHTDN_REASON_MINOR_BLUESCREEN)
        assertEquals(16u, SHTDN_REASON_MINOR_SERVICEPACK)
        assertEquals(17u, SHTDN_REASON_MINOR_HOTFIX)
        assertEquals(18u, SHTDN_REASON_MINOR_SECURITYFIX)
        assertEquals(19u, SHTDN_REASON_MINOR_SECURITY)
        assertEquals(20u, SHTDN_REASON_MINOR_NETWORK_CONNECTIVITY)
        assertEquals(21u, SHTDN_REASON_MINOR_WMI)
        assertEquals(22u, SHTDN_REASON_MINOR_SERVICEPACK_UNINSTALL)
        assertEquals(23u, SHTDN_REASON_MINOR_HOTFIX_UNINSTALL)
        assertEquals(24u, SHTDN_REASON_MINOR_SECURITYFIX_UNINSTALL)
        assertEquals(25u, SHTDN_REASON_MINOR_MMC)
        assertEquals(26u, SHTDN_REASON_MINOR_SYSTEMRESTORE)
        assertEquals(32u, SHTDN_REASON_MINOR_TERMSRV)
        assertEquals(33u, SHTDN_REASON_MINOR_DC_PROMOTION)
        assertEquals(34u, SHTDN_REASON_MINOR_DC_DEMOTION)

        assertEquals(255u, SHTDN_REASON_UNKNOWN)
        assertEquals(3238002687u, SHTDN_REASON_VALID_BIT_MASK)
    }
}
