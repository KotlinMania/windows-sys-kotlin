package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class Dsktlsystemtime(
    public var wYear: UShort = 0u,
    public var wMonth: UShort = 0u,
    public var wDayOfWeek: UShort = 0u,
    public var wDay: UShort = 0u,
    public var wHour: UShort = 0u,
    public var wMinute: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var wMilliseconds: UShort = 0u,
    public var wResult: UShort = 0u,
)

public data class Pvaluea(
    public var pvValuename: Pstr = null,
    public var pvValuelen: Int = 0,
    public var pvValueContext: COpaquePointer? = null,
    public var pvType: UInt = 0u,
)

public data class Pvaluew(
    public var pvValuename: Pwstr = null,
    public var pvValuelen: Int = 0,
    public var pvValueContext: COpaquePointer? = null,
    public var pvType: UInt = 0u,
)

public data class RegProvider(
    public var piR01val: Pqueryhandler = null,
    public var piR0Allvals: Pqueryhandler = null,
    public var piR31val: Pqueryhandler = null,
    public var piR3Allvals: Pqueryhandler = null,
    public var piFlags: UInt = 0u,
    public var piKeyContext: COpaquePointer? = null,
)

public data class Valenta(
    public var veValuename: Pstr = null,
    public var veValuelen: UInt = 0u,
    public var veValueptr: Int = 0,
    public var veType: RegValueType = 0u,
)

public data class Valentw(
    public var veValuename: Pwstr = null,
    public var veValuelen: UInt = 0u,
    public var veValueptr: Int = 0,
    public var veType: RegValueType = 0u,
)

public data class ValContext(
    public var valuelen: Int = 0,
    public var valueContext: COpaquePointer? = null,
    public var valBuffPtr: COpaquePointer? = null,
)
