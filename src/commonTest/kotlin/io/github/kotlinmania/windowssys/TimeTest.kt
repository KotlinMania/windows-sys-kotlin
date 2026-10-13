// port-lint: tests Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME
import io.github.kotlinmania.windowssys.windows.win32.system.time.DYNAMIC_TIME_ZONE_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.system.time.TIME_ZONE_ID_INVALID
import io.github.kotlinmania.windowssys.windows.win32.system.time.TIME_ZONE_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.system.time.TSF_Authenticated
import io.github.kotlinmania.windowssys.windows.win32.system.time.TSF_Hardware
import io.github.kotlinmania.windowssys.windows.win32.system.time.TSF_IPv6
import io.github.kotlinmania.windowssys.windows.win32.system.time.TSF_SignatureAuthenticated
import io.github.kotlinmania.windowssys.windows.win32.system.time.wszW32TimeRegKeyPolicyTimeProviders
import io.github.kotlinmania.windowssys.windows.win32.system.time.wszW32TimeRegKeyTimeProviders
import io.github.kotlinmania.windowssys.windows.win32.system.time.wszW32TimeRegValueDllName
import io.github.kotlinmania.windowssys.windows.win32.system.time.wszW32TimeRegValueEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.time.wszW32TimeRegValueInputProvider
import io.github.kotlinmania.windowssys.windows.win32.system.time.wszW32TimeRegValueMetaDataProvider
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class TimeTest {
    @Test
    fun testTimeConstants() {
        assertEquals(4294967295u, TIME_ZONE_ID_INVALID)
        assertEquals(1u, TSF_Hardware)
        assertEquals(2u, TSF_Authenticated)
        assertEquals(4u, TSF_IPv6)
        assertEquals(8u, TSF_SignatureAuthenticated)

        assertNotEquals(0L, wszW32TimeRegKeyPolicyTimeProviders)
        assertNotEquals(0L, wszW32TimeRegKeyTimeProviders)
        assertNotEquals(0L, wszW32TimeRegValueDllName)
        assertNotEquals(0L, wszW32TimeRegValueEnabled)
        assertNotEquals(0L, wszW32TimeRegValueInputProvider)
        assertNotEquals(0L, wszW32TimeRegValueMetaDataProvider)
    }

    @Test
    fun testTimeZoneInformation() {
        val st = SYSTEMTIME(wYear = 2026u, wMonth = 10u, wDay = 12u)
        val tzi =
            TIME_ZONE_INFORMATION(
                Bias = 480,
                StandardBias = 0,
                DaylightBias = -60,
                StandardDate = st,
                DaylightDate = st,
            )
        assertEquals(480, tzi.Bias)
        assertEquals(0, tzi.StandardBias)
        assertEquals(-60, tzi.DaylightBias)
        assertEquals(2026u, tzi.StandardDate.wYear)

        val tzi2 =
            TIME_ZONE_INFORMATION(
                Bias = 480,
                StandardBias = 0,
                DaylightBias = -60,
                StandardDate = st,
                DaylightDate = st,
            )
        assertEquals(tzi, tzi2)
        assertEquals(tzi.hashCode(), tzi2.hashCode())
    }

    @Test
    fun testDynamicTimeZoneInformation() {
        val st = SYSTEMTIME(wYear = 2026u, wMonth = 10u, wDay = 12u)
        val dtzi =
            DYNAMIC_TIME_ZONE_INFORMATION(
                Bias = 480,
                StandardBias = 0,
                DaylightBias = -60,
                StandardDate = st,
                DaylightDate = st,
                DynamicDaylightTimeDisabled = false,
            )
        assertEquals(480, dtzi.Bias)
        assertEquals(false, dtzi.DynamicDaylightTimeDisabled)

        val dtzi2 =
            DYNAMIC_TIME_ZONE_INFORMATION(
                Bias = 480,
                StandardBias = 0,
                DaylightBias = -60,
                StandardDate = st,
                DaylightDate = st,
                DynamicDaylightTimeDisabled = false,
            )
        assertEquals(dtzi, dtzi2)
        assertEquals(dtzi.hashCode(), dtzi2.hashCode())
    }
}
