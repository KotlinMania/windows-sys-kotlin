// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME

public data class TIME_ZONE_INFORMATION(
    public var Bias: Int = 0,
    public var StandardName: UShortArray = UShortArray(32),
    public var StandardDate: SYSTEMTIME = SYSTEMTIME(),
    public var StandardBias: Int = 0,
    public var DaylightName: UShortArray = UShortArray(32),
    public var DaylightDate: SYSTEMTIME = SYSTEMTIME(),
    public var DaylightBias: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TIME_ZONE_INFORMATION) return false
        if (Bias != other.Bias) return false
        if (!StandardName.contentEquals(other.StandardName)) return false
        if (StandardDate != other.StandardDate) return false
        if (StandardBias != other.StandardBias) return false
        if (!DaylightName.contentEquals(other.DaylightName)) return false
        if (DaylightDate != other.DaylightDate) return false
        if (DaylightBias != other.DaylightBias) return false
        return true
    }

    override fun hashCode(): Int {
        var result = Bias.hashCode()
        result = 31 * result + StandardName.contentHashCode()
        result = 31 * result + StandardDate.hashCode()
        result = 31 * result + StandardBias.hashCode()
        result = 31 * result + DaylightName.contentHashCode()
        result = 31 * result + DaylightDate.hashCode()
        result = 31 * result + DaylightBias.hashCode()
        return result
    }
}

public data class DYNAMIC_TIME_ZONE_INFORMATION(
    public var Bias: Int = 0,
    public var StandardName: UShortArray = UShortArray(32),
    public var StandardDate: SYSTEMTIME = SYSTEMTIME(),
    public var StandardBias: Int = 0,
    public var DaylightName: UShortArray = UShortArray(32),
    public var DaylightDate: SYSTEMTIME = SYSTEMTIME(),
    public var DaylightBias: Int = 0,
    public var TimeZoneKeyName: UShortArray = UShortArray(128),
    public var DynamicDaylightTimeDisabled: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DYNAMIC_TIME_ZONE_INFORMATION) return false
        if (Bias != other.Bias) return false
        if (!StandardName.contentEquals(other.StandardName)) return false
        if (StandardDate != other.StandardDate) return false
        if (StandardBias != other.StandardBias) return false
        if (!DaylightName.contentEquals(other.DaylightName)) return false
        if (DaylightDate != other.DaylightDate) return false
        if (DaylightBias != other.DaylightBias) return false
        if (!TimeZoneKeyName.contentEquals(other.TimeZoneKeyName)) return false
        if (DynamicDaylightTimeDisabled != other.DynamicDaylightTimeDisabled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = Bias.hashCode()
        result = 31 * result + StandardName.contentHashCode()
        result = 31 * result + StandardDate.hashCode()
        result = 31 * result + StandardBias.hashCode()
        result = 31 * result + DaylightName.contentHashCode()
        result = 31 * result + DaylightDate.hashCode()
        result = 31 * result + DaylightBias.hashCode()
        result = 31 * result + TimeZoneKeyName.contentHashCode()
        result = 31 * result + DynamicDaylightTimeDisabled.hashCode()
        return result
    }
}
