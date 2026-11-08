@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME

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
        if (this.Bias != other.Bias) return false
        if (!this.StandardName.contentEquals(other.StandardName)) return false
        if (this.StandardDate != other.StandardDate) return false
        if (this.StandardBias != other.StandardBias) return false
        if (!this.DaylightName.contentEquals(other.DaylightName)) return false
        if (this.DaylightDate != other.DaylightDate) return false
        if (this.DaylightBias != other.DaylightBias) return false
        if (!this.TimeZoneKeyName.contentEquals(other.TimeZoneKeyName)) return false
        if (this.DynamicDaylightTimeDisabled != other.DynamicDaylightTimeDisabled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Bias.hashCode()
        result = 31 * result + this.StandardName.contentHashCode()
        result = 31 * result + this.StandardDate.hashCode()
        result = 31 * result + this.StandardBias.hashCode()
        result = 31 * result + this.DaylightName.contentHashCode()
        result = 31 * result + this.DaylightDate.hashCode()
        result = 31 * result + this.DaylightBias.hashCode()
        result = 31 * result + this.TimeZoneKeyName.contentHashCode()
        result = 31 * result + this.DynamicDaylightTimeDisabled.hashCode()
        return result
    }
}

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
        if (this.Bias != other.Bias) return false
        if (!this.StandardName.contentEquals(other.StandardName)) return false
        if (this.StandardDate != other.StandardDate) return false
        if (this.StandardBias != other.StandardBias) return false
        if (!this.DaylightName.contentEquals(other.DaylightName)) return false
        if (this.DaylightDate != other.DaylightDate) return false
        if (this.DaylightBias != other.DaylightBias) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Bias.hashCode()
        result = 31 * result + this.StandardName.contentHashCode()
        result = 31 * result + this.StandardDate.hashCode()
        result = 31 * result + this.StandardBias.hashCode()
        result = 31 * result + this.DaylightName.contentHashCode()
        result = 31 * result + this.DaylightDate.hashCode()
        result = 31 * result + this.DaylightBias.hashCode()
        return result
    }
}
