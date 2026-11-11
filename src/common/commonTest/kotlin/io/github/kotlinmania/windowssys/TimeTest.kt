package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.system.time.DynamicTimeZoneInformation
import io.github.kotlinmania.windowssys.windows.win32.system.time.TIME_ZONE_ID_INVALID
import io.github.kotlinmania.windowssys.windows.win32.system.time.TSF_AUTHENTICATED
import io.github.kotlinmania.windowssys.windows.win32.system.time.TSF_HARDWARE
import io.github.kotlinmania.windowssys.windows.win32.system.time.TSF_I_PV6
import io.github.kotlinmania.windowssys.windows.win32.system.time.TSF_SIGNATURE_AUTHENTICATED
import io.github.kotlinmania.windowssys.windows.win32.system.time.TimeZoneInformation
import io.github.kotlinmania.windowssys.windows.win32.system.time.WSZ_W32TIME_REG_KEY_POLICY_TIME_PROVIDERS
import io.github.kotlinmania.windowssys.windows.win32.system.time.WSZ_W32TIME_REG_KEY_TIME_PROVIDERS
import io.github.kotlinmania.windowssys.windows.win32.system.time.WSZ_W32TIME_REG_VALUE_DLL_NAME
import io.github.kotlinmania.windowssys.windows.win32.system.time.WSZ_W32TIME_REG_VALUE_ENABLED
import io.github.kotlinmania.windowssys.windows.win32.system.time.WSZ_W32TIME_REG_VALUE_INPUT_PROVIDER
import io.github.kotlinmania.windowssys.windows.win32.system.time.WSZ_W32TIME_REG_VALUE_META_DATA_PROVIDER
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull

class TimeTest {
    @Test
    fun testTimeConstants() {
        assertEquals(4294967295u, TIME_ZONE_ID_INVALID)
        assertEquals(1u, TSF_HARDWARE)
        assertEquals(2u, TSF_AUTHENTICATED)
        assertEquals(4u, TSF_I_PV6)
        assertEquals(8u, TSF_SIGNATURE_AUTHENTICATED)

        assertNotNull(WSZ_W32TIME_REG_KEY_POLICY_TIME_PROVIDERS)
        assertNotEquals(COpaquePointer(0L), WSZ_W32TIME_REG_KEY_POLICY_TIME_PROVIDERS)
        assertNotNull(WSZ_W32TIME_REG_KEY_TIME_PROVIDERS)
        assertNotEquals(COpaquePointer(0L), WSZ_W32TIME_REG_KEY_TIME_PROVIDERS)
        assertNotNull(WSZ_W32TIME_REG_VALUE_DLL_NAME)
        assertNotEquals(COpaquePointer(0L), WSZ_W32TIME_REG_VALUE_DLL_NAME)
        assertNotNull(WSZ_W32TIME_REG_VALUE_ENABLED)
        assertNotEquals(COpaquePointer(0L), WSZ_W32TIME_REG_VALUE_ENABLED)
        assertNotNull(WSZ_W32TIME_REG_VALUE_INPUT_PROVIDER)
        assertNotEquals(COpaquePointer(0L), WSZ_W32TIME_REG_VALUE_INPUT_PROVIDER)
        assertNotNull(WSZ_W32TIME_REG_VALUE_META_DATA_PROVIDER)
        assertNotEquals(COpaquePointer(0L), WSZ_W32TIME_REG_VALUE_META_DATA_PROVIDER)
    }

    @Test
    fun testTimeZoneInformation() {
        val st = Systemtime(wYear = 2026u, wMonth = 10u, wDay = 12u)
        val tzi =
            TimeZoneInformation(
                bias = 480,
                standardBias = 0,
                daylightBias = -60,
                standardDate = st,
                daylightDate = st,
            )
        assertEquals(480, tzi.bias)
        assertEquals(0, tzi.standardBias)
        assertEquals(-60, tzi.daylightBias)
        assertEquals(2026u, tzi.standardDate.wYear)

        val tzi2 =
            TimeZoneInformation(
                bias = 480,
                standardBias = 0,
                daylightBias = -60,
                standardDate = st,
                daylightDate = st,
            )
        assertEquals(tzi, tzi2)
        assertEquals(tzi.hashCode(), tzi2.hashCode())
    }

    @Test
    fun testDynamicTimeZoneInformation() {
        val st = Systemtime(wYear = 2026u, wMonth = 10u, wDay = 12u)
        val dtzi =
            DynamicTimeZoneInformation(
                bias = 480,
                standardBias = 0,
                daylightBias = -60,
                standardDate = st,
                daylightDate = st,
                dynamicDaylightTimeDisabled = false,
            )
        assertEquals(480, dtzi.bias)
        assertEquals(false, dtzi.dynamicDaylightTimeDisabled)

        val dtzi2 =
            DynamicTimeZoneInformation(
                bias = 480,
                standardBias = 0,
                daylightBias = -60,
                standardDate = st,
                daylightDate = st,
                dynamicDaylightTimeDisabled = false,
            )
        assertEquals(dtzi, dtzi2)
        assertEquals(dtzi.hashCode(), dtzi2.hashCode())
    }
}
