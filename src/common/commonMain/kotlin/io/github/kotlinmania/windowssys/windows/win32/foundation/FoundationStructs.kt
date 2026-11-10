@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr

public data class AppLocalDeviceId(
    public var value: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AppLocalDeviceId) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()
}

public data class Decimal(
    public var wReserved: UShort = 0u,
    public var anonymous1: Decimal0 = Decimal0(),
    public var hi32: UInt = 0u,
    public var anonymous2: Decimal1 = Decimal1(),
)

public data class Decimal0(
    public var anonymous: Decimal00 = Decimal00(),
    public var signscale: UShort = 0u,
)

public data class Decimal00(
    public var scale: UByte = 0u,
    public var sign: UByte = 0u,
)

public data class Decimal1(
    public var anonymous: Decimal10 = Decimal10(),
    public var lo64: ULong = 0uL,
)

public data class Decimal10(
    public var lo32: UInt = 0u,
    public var mid32: UInt = 0u,
)

public data class Devpropkey(
    public var fmtid: Guid = Guid(),
    public var pid: UInt = 0u,
)

public data class Filetime(
    public var dwLowDateTime: UInt = 0u,
    public var dwHighDateTime: UInt = 0u,
)

public data class Float128(
    public var lowPart: Long = 0L,
    public var highPart: Long = 0L,
)

public data class Luid(
    public var lowPart: UInt = 0u,
    public var highPart: Int = 0,
)

public data class Point(
    public var x: Int = 0,
    public var y: Int = 0,
)

public data class Pointl(
    public var x: Int = 0,
    public var y: Int = 0,
)

public data class Points(
    public var x: Short = 0,
    public var y: Short = 0,
)

public data class Propertykey(
    public var fmtid: Guid = Guid(),
    public var pid: UInt = 0u,
)

public data class Rect(
    public var left: Int = 0,
    public var top: Int = 0,
    public var right: Int = 0,
    public var bottom: Int = 0,
)

public data class Rectl(
    public var left: Int = 0,
    public var top: Int = 0,
    public var right: Int = 0,
    public var bottom: Int = 0,
)

public data class Size(
    public var cx: Int = 0,
    public var cy: Int = 0,
)

public data class Systemtime(
    public var wYear: UShort = 0u,
    public var wMonth: UShort = 0u,
    public var wDayOfWeek: UShort = 0u,
    public var wDay: UShort = 0u,
    public var wHour: UShort = 0u,
    public var wMinute: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var wMilliseconds: UShort = 0u,
)

public data class UnicodeString(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var buffer: Pwstr = null,
)
