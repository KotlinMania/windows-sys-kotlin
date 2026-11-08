package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.PROPVARIANT

public data class MQCOLUMNSET(public var cCol: UInt = 0u, public var aCol: Long = 0L)

public data class MQMGMTPROPS(
    public var cProp: UInt = 0u,
    public var aPropID: Long = 0L,
    public var aPropVar: Long = 0L,
    public var aStatus: Long = 0L,
)

public data class MQMSGPROPS(
    public var cProp: UInt = 0u,
    public var aPropID: Long = 0L,
    public var aPropVar: Long = 0L,
    public var aStatus: Long = 0L,
)

public data class MQPRIVATEPROPS(
    public var cProp: UInt = 0u,
    public var aPropID: Long = 0L,
    public var aPropVar: Long = 0L,
    public var aStatus: Long = 0L,
)

public data class MQPROPERTYRESTRICTION(
    public var rel: UInt = 0u,
    public var prop: UInt = 0u,
    public var prval: PROPVARIANT = PROPVARIANT(),
)

public data class MQQMPROPS(
    public var cProp: UInt = 0u,
    public var aPropID: Long = 0L,
    public var aPropVar: Long = 0L,
    public var aStatus: Long = 0L,
)

public data class MQQUEUEPROPS(
    public var cProp: UInt = 0u,
    public var aPropID: Long = 0L,
    public var aPropVar: Long = 0L,
    public var aStatus: Long = 0L,
)

public data class MQRESTRICTION(public var cRes: UInt = 0u, public var paPropRes: Long = 0L)

public data class MQSORTKEY(public var propColumn: UInt = 0u, public var dwOrder: UInt = 0u)

public data class MQSORTSET(public var cCol: UInt = 0u, public var aCol: Long = 0L)

public data class SEQUENCE_INFO(
    public var SeqID: Long = 0L,
    public var SeqNo: UInt = 0u,
    public var PrevNo: UInt = 0u,
)
