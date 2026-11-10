package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant

public data class Mqcolumnset(public var cCol: UInt = 0u, public var aCol: UInt? = null)

public data class Mqmgmtprops(
    public var cProp: UInt = 0u,
    public var aPropID: UInt? = null,
    public var aPropVar: Propvariant? = null,
    public var aStatus: Hresult? = null,
)

public data class Mqmsgprops(
    public var cProp: UInt = 0u,
    public var aPropID: UInt? = null,
    public var aPropVar: Propvariant? = null,
    public var aStatus: Hresult? = null,
)

public data class Mqprivateprops(
    public var cProp: UInt = 0u,
    public var aPropID: UInt? = null,
    public var aPropVar: Propvariant? = null,
    public var aStatus: Hresult? = null,
)

public data class Mqpropertyrestriction(
    public var rel: UInt = 0u,
    public var prop: UInt = 0u,
    public var prval: Propvariant = Propvariant(),
)

public data class Mqqmprops(
    public var cProp: UInt = 0u,
    public var aPropID: UInt? = null,
    public var aPropVar: Propvariant? = null,
    public var aStatus: Hresult? = null,
)

public data class Mqqueueprops(
    public var cProp: UInt = 0u,
    public var aPropID: UInt? = null,
    public var aPropVar: Propvariant? = null,
    public var aStatus: Hresult? = null,
)

public data class Mqrestriction(public var cRes: UInt = 0u, public var paPropRes: Mqpropertyrestriction? = null)

public data class Mqsortkey(public var propColumn: UInt = 0u, public var dwOrder: UInt = 0u)

public data class Mqsortset(public var cCol: UInt = 0u, public var aCol: Mqsortkey? = null)

public data class SequenceInfo(
    public var seqID: Long = 0L,
    public var seqNo: UInt = 0u,
    public var prevNo: UInt = 0u,
)
