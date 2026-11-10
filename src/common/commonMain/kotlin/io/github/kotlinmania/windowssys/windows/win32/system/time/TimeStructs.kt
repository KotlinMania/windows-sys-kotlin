@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

public data class DynamicTimeZoneInformation(
    public var bias: Int = 0,
    public var standardName: UShortArray = UShortArray(32),
    public var standardDate: Systemtime = Systemtime(),
    public var standardBias: Int = 0,
    public var daylightName: UShortArray = UShortArray(32),
    public var daylightDate: Systemtime = Systemtime(),
    public var daylightBias: Int = 0,
    public var timeZoneKeyName: UShortArray = UShortArray(128),
    public var dynamicDaylightTimeDisabled: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DynamicTimeZoneInformation) return false
        if (this.bias != other.bias) return false
        if (!this.standardName.contentEquals(other.standardName)) return false
        if (this.standardDate != other.standardDate) return false
        if (this.standardBias != other.standardBias) return false
        if (!this.daylightName.contentEquals(other.daylightName)) return false
        if (this.daylightDate != other.daylightDate) return false
        if (this.daylightBias != other.daylightBias) return false
        if (!this.timeZoneKeyName.contentEquals(other.timeZoneKeyName)) return false
        if (this.dynamicDaylightTimeDisabled != other.dynamicDaylightTimeDisabled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bias.hashCode()
        result = 31 * result + this.standardName.contentHashCode()
        result = 31 * result + this.standardDate.hashCode()
        result = 31 * result + this.standardBias.hashCode()
        result = 31 * result + this.daylightName.contentHashCode()
        result = 31 * result + this.daylightDate.hashCode()
        result = 31 * result + this.daylightBias.hashCode()
        result = 31 * result + this.timeZoneKeyName.contentHashCode()
        result = 31 * result + this.dynamicDaylightTimeDisabled.hashCode()
        return result
    }
}

public data class TimeZoneInformation(
    public var bias: Int = 0,
    public var standardName: UShortArray = UShortArray(32),
    public var standardDate: Systemtime = Systemtime(),
    public var standardBias: Int = 0,
    public var daylightName: UShortArray = UShortArray(32),
    public var daylightDate: Systemtime = Systemtime(),
    public var daylightBias: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TimeZoneInformation) return false
        if (this.bias != other.bias) return false
        if (!this.standardName.contentEquals(other.standardName)) return false
        if (this.standardDate != other.standardDate) return false
        if (this.standardBias != other.standardBias) return false
        if (!this.daylightName.contentEquals(other.daylightName)) return false
        if (this.daylightDate != other.daylightDate) return false
        if (this.daylightBias != other.daylightBias) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bias.hashCode()
        result = 31 * result + this.standardName.contentHashCode()
        result = 31 * result + this.standardDate.hashCode()
        result = 31 * result + this.standardBias.hashCode()
        result = 31 * result + this.daylightName.contentHashCode()
        result = 31 * result + this.daylightDate.hashCode()
        result = 31 * result + this.daylightBias.hashCode()
        return result
    }
}
