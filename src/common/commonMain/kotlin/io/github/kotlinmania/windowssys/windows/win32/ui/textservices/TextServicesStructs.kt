@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.COLORREF
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARIANT
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.HKL

public data class TF_DA_COLOR(public var type: TF_DA_COLORTYPE = 0, public var Anonymous: TF_DA_COLOR_0 = TF_DA_COLOR_0())

public data class TF_DA_COLOR_0(public var nIndex: Int = 0, public var cr: COLORREF = 0u)

public data class TF_DISPLAYATTRIBUTE(
    public var crText: TF_DA_COLOR = TF_DA_COLOR(),
    public var crBk: TF_DA_COLOR = TF_DA_COLOR(),
    public var lsStyle: TF_DA_LINESTYLE = 0,
    public var fBoldLine: BOOL = 0,
    public var crLine: TF_DA_COLOR = TF_DA_COLOR(),
    public var bAttr: TF_DA_ATTR_INFO = 0,
)

public data class TF_HALTCOND(
    public var pHaltRange: Long = 0L,
    public var aHaltPos: TfAnchor = 0,
    public var dwFlags: UInt = 0u,
)

public data class TF_INPUTPROCESSORPROFILE(
    public var dwProfileType: UInt = 0u,
    public var langid: UShort = 0u,
    public var clsid: GUID = GUID(),
    public var guidProfile: GUID = GUID(),
    public var catid: GUID = GUID(),
    public var hklSubstitute: HKL = 0L,
    public var dwCaps: UInt = 0u,
    public var hkl: HKL = 0L,
    public var dwFlags: UInt = 0u,
)

public data class TF_LANGBARITEMINFO(
    public var clsidService: GUID = GUID(),
    public var guidItem: GUID = GUID(),
    public var dwStyle: UInt = 0u,
    public var ulSort: UInt = 0u,
    public var szDescription: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TF_LANGBARITEMINFO) return false
        if (this.clsidService != other.clsidService) return false
        if (this.guidItem != other.guidItem) return false
        if (this.dwStyle != other.dwStyle) return false
        if (this.ulSort != other.ulSort) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clsidService.hashCode()
        result = 31 * result + this.guidItem.hashCode()
        result = 31 * result + this.dwStyle.hashCode()
        result = 31 * result + this.ulSort.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }
}

public data class TF_LANGUAGEPROFILE(
    public var clsid: GUID = GUID(),
    public var langid: UShort = 0u,
    public var catid: GUID = GUID(),
    public var fActive: BOOL = 0,
    public var guidProfile: GUID = GUID(),
)

public data class TF_LBBALLOONINFO(public var style: TfLBBalloonStyle = 0, public var bstrText: BSTR = 0L)

public data class TF_LMLATTELEMENT(
    public var dwFrameStart: UInt = 0u,
    public var dwFrameLen: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var Anonymous: TF_LMLATTELEMENT_0 = TF_LMLATTELEMENT_0(),
    public var bstrText: BSTR = 0L,
)

public data class TF_LMLATTELEMENT_0(public var iCost: Int = 0)

public data class TF_PERSISTENT_PROPERTY_HEADER_ACP(
    public var guidType: GUID = GUID(),
    public var ichStart: Int = 0,
    public var cch: Int = 0,
    public var cb: UInt = 0u,
    public var dwPrivate: UInt = 0u,
    public var clsidTIP: GUID = GUID(),
)

public data class TF_PRESERVEDKEY(public var uVKey: UInt = 0u, public var uModifiers: UInt = 0u)

public data class TF_PROPERTYVAL(public var guidId: GUID = GUID(), public var varValue: VARIANT = VARIANT())

public data class TF_SELECTION(public var range: Long = 0L, public var style: TF_SELECTIONSTYLE = TF_SELECTIONSTYLE())

public data class TF_SELECTIONSTYLE(public var ase: TfActiveSelEnd = 0, public var fInterimChar: BOOL = 0)

public data class TS_ATTRVAL(
    public var idAttr: GUID = GUID(),
    public var dwOverlapId: UInt = 0u,
    public var varValue: VARIANT = VARIANT(),
)

public data class TS_RUNINFO(public var uCount: UInt = 0u, public var type: TsRunType = 0)

public data class TS_SELECTIONSTYLE(public var ase: TsActiveSelEnd = 0, public var fInterimChar: BOOL = 0)

public data class TS_SELECTION_ACP(
    public var acpStart: Int = 0,
    public var acpEnd: Int = 0,
    public var style: TS_SELECTIONSTYLE = TS_SELECTIONSTYLE(),
)

public data class TS_SELECTION_ANCHOR(
    public var paStart: Long = 0L,
    public var paEnd: Long = 0L,
    public var style: TS_SELECTIONSTYLE = TS_SELECTIONSTYLE(),
)

public data class TS_STATUS(public var dwDynamicFlags: UInt = 0u, public var dwStaticFlags: UInt = 0u)

public data class TS_TEXTCHANGE(
    public var acpStart: Int = 0,
    public var acpOldEnd: Int = 0,
    public var acpNewEnd: Int = 0,
)
