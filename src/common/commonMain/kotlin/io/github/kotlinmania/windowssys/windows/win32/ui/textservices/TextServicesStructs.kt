@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.Hkl

public data class TfDaColor(public var type: TfDaColortype = 0, public var anonymous: TfDaColor0 = TfDaColor0())

public data class TfDaColor0(public var nIndex: Int = 0, public var cr: Colorref = 0u)

public data class TfDisplayattribute(
    public var crText: TfDaColor = TfDaColor(),
    public var crBk: TfDaColor = TfDaColor(),
    public var lsStyle: TfDaLinestyle = 0,
    public var fBoldLine: Bool = 0,
    public var crLine: TfDaColor = TfDaColor(),
    public var bAttr: TfDaAttrInfo = 0,
)

public data class TfHaltcond(
    public var pHaltRange: COpaquePointer? = null,
    public var aHaltPos: TfAnchor = 0,
    public var dwFlags: UInt = 0u,
)

public data class TfInputprocessorprofile(
    public var dwProfileType: UInt = 0u,
    public var langid: UShort = 0u,
    public var clsid: Guid = Guid(),
    public var guidProfile: Guid = Guid(),
    public var catid: Guid = Guid(),
    public var hklSubstitute: Hkl = null,
    public var dwCaps: UInt = 0u,
    public var hkl: Hkl = null,
    public var dwFlags: UInt = 0u,
)

public data class TfLangbariteminfo(
    public var clsidService: Guid = Guid(),
    public var guidItem: Guid = Guid(),
    public var dwStyle: UInt = 0u,
    public var ulSort: UInt = 0u,
    public var szDescription: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TfLangbariteminfo) return false
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

public data class TfLanguageprofile(
    public var clsid: Guid = Guid(),
    public var langid: UShort = 0u,
    public var catid: Guid = Guid(),
    public var fActive: Bool = 0,
    public var guidProfile: Guid = Guid(),
)

public data class TfLbballooninfo(public var style: TfLBBalloonStyle = 0, public var bstrText: Bstr = null)

public data class TfLmlattelement(
    public var dwFrameStart: UInt = 0u,
    public var dwFrameLen: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var anonymous: TfLmlattelement0 = TfLmlattelement0(),
    public var bstrText: Bstr = null,
)

public data class TfLmlattelement0(public var iCost: Int = 0)

public data class TfPersistentPropertyHeaderAcp(
    public var guidType: Guid = Guid(),
    public var ichStart: Int = 0,
    public var cch: Int = 0,
    public var cb: UInt = 0u,
    public var dwPrivate: UInt = 0u,
    public var clsidTIP: Guid = Guid(),
)

public data class TfPreservedkey(public var uVKey: UInt = 0u, public var uModifiers: UInt = 0u)

public data class TfPropertyval(public var guidId: Guid = Guid(), public var varValue: Variant = Variant())

public data class TfSelection(public var range: COpaquePointer? = null, public var style: TfSelectionstyle = TfSelectionstyle())

public data class TfSelectionstyle(public var ase: TfActiveSelEnd = 0, public var fInterimChar: Bool = 0)

public data class TsAttrval(
    public var idAttr: Guid = Guid(),
    public var dwOverlapId: UInt = 0u,
    public var varValue: Variant = Variant(),
)

public data class TsRuninfo(public var uCount: UInt = 0u, public var type: TsRunType = 0)

public data class TsSelectionstyle(public var ase: TsActiveSelEnd = 0, public var fInterimChar: Bool = 0)

public data class TsSelectionAcp(
    public var acpStart: Int = 0,
    public var acpEnd: Int = 0,
    public var style: TsSelectionstyle = TsSelectionstyle(),
)

public data class TsSelectionAnchor(
    public var paStart: COpaquePointer? = null,
    public var paEnd: COpaquePointer? = null,
    public var style: TsSelectionstyle = TsSelectionstyle(),
)

public data class TsStatus(public var dwDynamicFlags: UInt = 0u, public var dwStaticFlags: UInt = 0u)

public data class TsTextchange(
    public var acpStart: Int = 0,
    public var acpOldEnd: Int = 0,
    public var acpNewEnd: Int = 0,
)
