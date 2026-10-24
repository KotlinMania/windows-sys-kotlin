// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR

// Upstream structs from Windows/Win32/Foundation/mod.rs.
// Pointer fields use Long per this port's pointer-typealias
// convention (cf. core/Core.kt).

public data class APP_LOCAL_DEVICE_ID(
    public var value: UByteArray = UByteArray(32),
)

public data class COLORREF_VALUE(
    public var value: UInt = 0u,
)

// DECIMAL — upstream lines 646-685
public data class DECIMAL_0_0(
    public var scale: UByte = 0u,
    public var sign: UByte = 0u,
)

public class DECIMAL_0(
    public var anonymous: DECIMAL_0_0 = DECIMAL_0_0(),
    public var signscale: UShort = 0u,
)

public class DECIMAL_1_0(
    public var lo32: UInt = 0u,
    public var mid32: UInt = 0u,
)

public class DECIMAL_1(
    public var anonymous: DECIMAL_1_0 = DECIMAL_1_0(),
    public var lo64: ULong = 0uL,
)

public class DECIMAL(
    public var wReserved: UShort = 0u,
    public var anonymous1: DECIMAL_0 = DECIMAL_0(),
    public var hi32: UInt = 0u,
    public var anonymous2: DECIMAL_1 = DECIMAL_1(),
)

public data class DEVPROPKEY(
    public var fmtid: GUID = GUID(),
    public var pid: UInt = 0u,
)

public data class FILETIME(
    public var dwLowDateTime: UInt = 0u,
    public var dwHighDateTime: UInt = 0u,
)

public data class FLOAT128(
    public var lowPart: Long = 0L,
    public var highPart: Long = 0L,
)

public data class POINT(
    public var x: Int = 0,
    public var y: Int = 0,
)

public data class POINTL(
    public var x: Int = 0,
    public var y: Int = 0,
)

public data class POINTS(
    public var x: Short = 0,
    public var y: Short = 0,
)

public data class PROPERTYKEY(
    public var fmtid: GUID = GUID(),
    public var pid: UInt = 0u,
)

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

public data class SIZE(
    public var cx: Int = 0,
    public var cy: Int = 0,
)

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

public class UNICODE_STRING(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var buffer: PWSTR = 0L,
)
