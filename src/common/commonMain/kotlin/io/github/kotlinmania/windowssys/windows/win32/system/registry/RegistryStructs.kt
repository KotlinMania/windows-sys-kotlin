package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class DSKTLSYSTEMTIME(
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

public data class PVALUEA(
    public var pv_valuename: PSTR = 0L,
    public var pv_valuelen: Int = 0,
    public var pv_value_context: Long = 0L,
    public var pv_type: UInt = 0u,
)

public data class PVALUEW(
    public var pv_valuename: PWSTR = 0L,
    public var pv_valuelen: Int = 0,
    public var pv_value_context: Long = 0L,
    public var pv_type: UInt = 0u,
)

public data class REG_PROVIDER(
    public var pi_R0_1val: PQUERYHANDLER = null,
    public var pi_R0_allvals: PQUERYHANDLER = null,
    public var pi_R3_1val: PQUERYHANDLER = null,
    public var pi_R3_allvals: PQUERYHANDLER = null,
    public var pi_flags: UInt = 0u,
    public var pi_key_context: Long = 0L,
)

public data class VALENTA(
    public var ve_valuename: PSTR = 0L,
    public var ve_valuelen: UInt = 0u,
    public var ve_valueptr: ULong = 0uL,
    public var ve_type: REG_VALUE_TYPE = 0u,
)

public data class VALENTW(
    public var ve_valuename: PWSTR = 0L,
    public var ve_valuelen: UInt = 0u,
    public var ve_valueptr: ULong = 0uL,
    public var ve_type: REG_VALUE_TYPE = 0u,
)

public data class val_context(
    public var valuelen: Int = 0,
    public var value_context: Long = 0L,
    public var val_buff_ptr: Long = 0L,
)
