@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR

public data class APP_LOCAL_DEVICE_ID(public var value: UByteArray = UByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is APP_LOCAL_DEVICE_ID) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class DECIMAL(
    public var wReserved: UShort = 0u,
    public var Anonymous1: DECIMAL_0 = DECIMAL_0(),
    public var Hi32: UInt = 0u,
    public var Anonymous2: DECIMAL_1 = DECIMAL_1(),
)

public data class DECIMAL_0(public var Anonymous: DECIMAL_0_0 = DECIMAL_0_0(), public var signscale: UShort = 0u)

public data class DECIMAL_0_0(public var scale: UByte = 0u, public var sign: UByte = 0u)

public data class DECIMAL_1(public var Anonymous: DECIMAL_1_0 = DECIMAL_1_0(), public var Lo64: ULong = 0uL)

public data class DECIMAL_1_0(public var Lo32: UInt = 0u, public var Mid32: UInt = 0u)

public data class DEVPROPKEY(public var fmtid: GUID = GUID(), public var pid: UInt = 0u)

public data class FILETIME(public var dwLowDateTime: UInt = 0u, public var dwHighDateTime: UInt = 0u)

public data class FLOAT128(public var LowPart: Long = 0L, public var HighPart: Long = 0L)

public data class LUID(public var LowPart: UInt = 0u, public var HighPart: Int = 0)

public data class POINT(public var x: Int = 0, public var y: Int = 0)

public data class POINTL(public var x: Int = 0, public var y: Int = 0)

public data class POINTS(public var x: Short = 0, public var y: Short = 0)

public data class PROPERTYKEY(public var fmtid: GUID = GUID(), public var pid: UInt = 0u)

public data class RECT(
    public var left: Int = 0,
    public var top: Int = 0,
    public var right: Int = 0,
    public var bottom: Int = 0,
)

public data class RECTL(
    public var left: Int = 0,
    public var top: Int = 0,
    public var right: Int = 0,
    public var bottom: Int = 0,
)

public data class SIZE(public var cx: Int = 0, public var cy: Int = 0)

public data class SYSTEMTIME(
    public var wYear: UShort = 0u,
    public var wMonth: UShort = 0u,
    public var wDayOfWeek: UShort = 0u,
    public var wDay: UShort = 0u,
    public var wHour: UShort = 0u,
    public var wMinute: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var wMilliseconds: UShort = 0u,
)

public data class UNICODE_STRING(
    public var Length: UShort = 0u,
    public var MaximumLength: UShort = 0u,
    public var Buffer: PWSTR = 0L,
)
