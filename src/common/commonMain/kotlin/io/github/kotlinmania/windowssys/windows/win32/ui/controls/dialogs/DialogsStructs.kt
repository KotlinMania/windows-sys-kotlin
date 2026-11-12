package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfonta
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfontw
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hpropsheetpage
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Nmhdr

public class Choosecolora internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hInstanceCtorArg: Hwnd,
    public var rgbResult: Colorref,
    lpCustColorsCtorArg: MutPtr<Colorref>,
    public var flags: ChoosecolorFlags,
    public var lCustData: Lparam,
    public var lpfnHook: Lpcchookproc,
    lpTemplateNameCtorArg: Pcstr,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hInstance: Hwnd = hInstanceCtorArg
        internal set

    public var lpCustColors: MutPtr<Colorref> = lpCustColorsCtorArg
        internal set

    public var lpTemplateName: Pcstr = lpTemplateNameCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        rgbResult = 0u,
        lpCustColorsCtorArg = MutPtr(0L),
        flags = 0u,
        lCustData = 0L,
        lpfnHook = null,
        lpTemplateNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.lStructSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): Hwnd = this.hInstance

    public operator fun component4(): Colorref = this.rgbResult

    public operator fun component5(): MutPtr<Colorref> = this.lpCustColors

    public operator fun component6(): ChoosecolorFlags = this.flags

    public operator fun component7(): Lparam = this.lCustData

    public operator fun component8(): Lpcchookproc = this.lpfnHook

    public operator fun component9(): Pcstr = this.lpTemplateName

    public fun copy(lStructSize: UInt = this.lStructSize, hwndOwner: Hwnd = this.hwndOwner, hInstance: Hwnd = this.hInstance, rgbResult: Colorref = this.rgbResult, lpCustColors: MutPtr<Colorref> = this.lpCustColors, flags: ChoosecolorFlags = this.flags, lCustData: Lparam = this.lCustData, lpfnHook: Lpcchookproc = this.lpfnHook, lpTemplateName: Pcstr = this.lpTemplateName): Choosecolora = Choosecolora(lStructSize = lStructSize, hwndOwnerCtorArg = hwndOwner, hInstanceCtorArg = hInstance, rgbResult = rgbResult, lpCustColorsCtorArg = lpCustColors, flags = flags, lCustData = lCustData, lpfnHook = lpfnHook, lpTemplateNameCtorArg = lpTemplateName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Choosecolora) return false
        if (this.lStructSize != other.lStructSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.hInstance != other.hInstance) return false
        if (this.rgbResult != other.rgbResult) return false
        if (this.lpCustColors != other.lpCustColors) return false
        if (this.flags != other.flags) return false
        if (this.lCustData != other.lCustData) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lpTemplateName != other.lpTemplateName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lStructSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.rgbResult.hashCode()
        result = 31 * result + this.lpCustColors.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lpTemplateName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hInstance: Hwnd = MutPtr(0L),
            rgbResult: Colorref = 0u,
            lpCustColors: MutPtr<Colorref> = MutPtr(0L),
            flags: ChoosecolorFlags = 0u,
            lCustData: Lparam = 0L,
            lpfnHook: Lpcchookproc = null,
            lpTemplateName: Pcstr = ConstPtr(0L),
        ): Choosecolora =
            Choosecolora(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hInstanceCtorArg = hInstance,
                rgbResult = rgbResult,
                lpCustColorsCtorArg = lpCustColors,
                flags = flags,
                lCustData = lCustData,
                lpfnHook = lpfnHook,
                lpTemplateNameCtorArg = lpTemplateName,
            )
    }
}

public class Choosecolorw internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hInstanceCtorArg: Hwnd,
    public var rgbResult: Colorref,
    lpCustColorsCtorArg: MutPtr<Colorref>,
    public var flags: ChoosecolorFlags,
    public var lCustData: Lparam,
    public var lpfnHook: Lpcchookproc,
    lpTemplateNameCtorArg: Pcwstr,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hInstance: Hwnd = hInstanceCtorArg
        internal set

    public var lpCustColors: MutPtr<Colorref> = lpCustColorsCtorArg
        internal set

    public var lpTemplateName: Pcwstr = lpTemplateNameCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        rgbResult = 0u,
        lpCustColorsCtorArg = MutPtr(0L),
        flags = 0u,
        lCustData = 0L,
        lpfnHook = null,
        lpTemplateNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.lStructSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): Hwnd = this.hInstance

    public operator fun component4(): Colorref = this.rgbResult

    public operator fun component5(): MutPtr<Colorref> = this.lpCustColors

    public operator fun component6(): ChoosecolorFlags = this.flags

    public operator fun component7(): Lparam = this.lCustData

    public operator fun component8(): Lpcchookproc = this.lpfnHook

    public operator fun component9(): Pcwstr = this.lpTemplateName

    public fun copy(lStructSize: UInt = this.lStructSize, hwndOwner: Hwnd = this.hwndOwner, hInstance: Hwnd = this.hInstance, rgbResult: Colorref = this.rgbResult, lpCustColors: MutPtr<Colorref> = this.lpCustColors, flags: ChoosecolorFlags = this.flags, lCustData: Lparam = this.lCustData, lpfnHook: Lpcchookproc = this.lpfnHook, lpTemplateName: Pcwstr = this.lpTemplateName): Choosecolorw = Choosecolorw(lStructSize = lStructSize, hwndOwnerCtorArg = hwndOwner, hInstanceCtorArg = hInstance, rgbResult = rgbResult, lpCustColorsCtorArg = lpCustColors, flags = flags, lCustData = lCustData, lpfnHook = lpfnHook, lpTemplateNameCtorArg = lpTemplateName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Choosecolorw) return false
        if (this.lStructSize != other.lStructSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.hInstance != other.hInstance) return false
        if (this.rgbResult != other.rgbResult) return false
        if (this.lpCustColors != other.lpCustColors) return false
        if (this.flags != other.flags) return false
        if (this.lCustData != other.lCustData) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lpTemplateName != other.lpTemplateName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lStructSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.rgbResult.hashCode()
        result = 31 * result + this.lpCustColors.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lpTemplateName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hInstance: Hwnd = MutPtr(0L),
            rgbResult: Colorref = 0u,
            lpCustColors: MutPtr<Colorref> = MutPtr(0L),
            flags: ChoosecolorFlags = 0u,
            lCustData: Lparam = 0L,
            lpfnHook: Lpcchookproc = null,
            lpTemplateName: Pcwstr = ConstPtr(0L),
        ): Choosecolorw =
            Choosecolorw(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hInstanceCtorArg = hInstance,
                rgbResult = rgbResult,
                lpCustColorsCtorArg = lpCustColors,
                flags = flags,
                lCustData = lCustData,
                lpfnHook = lpfnHook,
                lpTemplateNameCtorArg = lpTemplateName,
            )
    }
}

public class Choosefonta internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hDCCtorArg: Hdc,
    lpLogFontCtorArg: MutPtr<Logfonta>,
    public var iPointSize: Int,
    public var flags: ChoosefontFlags,
    public var rgbColors: Colorref,
    public var lCustData: Lparam,
    public var lpfnHook: Lpcfhookproc,
    lpTemplateNameCtorArg: Pcstr,
    hInstanceCtorArg: Hinstance,
    lpszStyleCtorArg: Pstr,
    public var nFontType: ChoosefontFontType,
    public var missingAlignment: UShort,
    public var nSizeMin: Int,
    public var nSizeMax: Int,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hDC: Hdc = hDCCtorArg
        internal set

    public var lpLogFont: MutPtr<Logfonta> = lpLogFontCtorArg
        internal set

    public var lpTemplateName: Pcstr = lpTemplateNameCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszStyle: Pstr = lpszStyleCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hDCCtorArg = MutPtr(0L),
        lpLogFontCtorArg = MutPtr(0L),
        iPointSize = 0,
        flags = 0u,
        rgbColors = 0u,
        lCustData = 0L,
        lpfnHook = null,
        lpTemplateNameCtorArg = ConstPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        lpszStyleCtorArg = MutPtr(0L),
        nFontType = 0u,
        missingAlignment = 0u,
        nSizeMin = 0,
        nSizeMax = 0,
    )

    public operator fun component1(): UInt = this.lStructSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): Hdc = this.hDC

    public operator fun component4(): MutPtr<Logfonta> = this.lpLogFont

    public operator fun component5(): Int = this.iPointSize

    public operator fun component6(): ChoosefontFlags = this.flags

    public operator fun component7(): Colorref = this.rgbColors

    public operator fun component8(): Lparam = this.lCustData

    public operator fun component9(): Lpcfhookproc = this.lpfnHook

    public operator fun component10(): Pcstr = this.lpTemplateName

    public operator fun component11(): Hinstance = this.hInstance

    public operator fun component12(): Pstr = this.lpszStyle

    public operator fun component13(): ChoosefontFontType = this.nFontType

    public operator fun component14(): UShort = this.missingAlignment

    public operator fun component15(): Int = this.nSizeMin

    public operator fun component16(): Int = this.nSizeMax

    public fun copy(lStructSize: UInt = this.lStructSize, hwndOwner: Hwnd = this.hwndOwner, hDC: Hdc = this.hDC, lpLogFont: MutPtr<Logfonta> = this.lpLogFont, iPointSize: Int = this.iPointSize, flags: ChoosefontFlags = this.flags, rgbColors: Colorref = this.rgbColors, lCustData: Lparam = this.lCustData, lpfnHook: Lpcfhookproc = this.lpfnHook, lpTemplateName: Pcstr = this.lpTemplateName, hInstance: Hinstance = this.hInstance, lpszStyle: Pstr = this.lpszStyle, nFontType: ChoosefontFontType = this.nFontType, missingAlignment: UShort = this.missingAlignment, nSizeMin: Int = this.nSizeMin, nSizeMax: Int = this.nSizeMax): Choosefonta = Choosefonta(lStructSize = lStructSize, hwndOwnerCtorArg = hwndOwner, hDCCtorArg = hDC, lpLogFontCtorArg = lpLogFont, iPointSize = iPointSize, flags = flags, rgbColors = rgbColors, lCustData = lCustData, lpfnHook = lpfnHook, lpTemplateNameCtorArg = lpTemplateName, hInstanceCtorArg = hInstance, lpszStyleCtorArg = lpszStyle, nFontType = nFontType, missingAlignment = missingAlignment, nSizeMin = nSizeMin, nSizeMax = nSizeMax)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Choosefonta) return false
        if (this.lStructSize != other.lStructSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.hDC != other.hDC) return false
        if (this.lpLogFont != other.lpLogFont) return false
        if (this.iPointSize != other.iPointSize) return false
        if (this.flags != other.flags) return false
        if (this.rgbColors != other.rgbColors) return false
        if (this.lCustData != other.lCustData) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lpTemplateName != other.lpTemplateName) return false
        if (this.hInstance != other.hInstance) return false
        if (this.lpszStyle != other.lpszStyle) return false
        if (this.nFontType != other.nFontType) return false
        if (this.missingAlignment != other.missingAlignment) return false
        if (this.nSizeMin != other.nSizeMin) return false
        if (this.nSizeMax != other.nSizeMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lStructSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.hDC.hashCode()
        result = 31 * result + this.lpLogFont.hashCode()
        result = 31 * result + this.iPointSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.rgbColors.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lpTemplateName.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.lpszStyle.hashCode()
        result = 31 * result + this.nFontType.hashCode()
        result = 31 * result + this.missingAlignment.hashCode()
        result = 31 * result + this.nSizeMin.hashCode()
        result = 31 * result + this.nSizeMax.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hDC: Hdc = MutPtr(0L),
            lpLogFont: MutPtr<Logfonta> = MutPtr(0L),
            iPointSize: Int = 0,
            flags: ChoosefontFlags = 0u,
            rgbColors: Colorref = 0u,
            lCustData: Lparam = 0L,
            lpfnHook: Lpcfhookproc = null,
            lpTemplateName: Pcstr = ConstPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            lpszStyle: Pstr = MutPtr(0L),
            nFontType: ChoosefontFontType = 0u,
            missingAlignment: UShort = 0u,
            nSizeMin: Int = 0,
            nSizeMax: Int = 0,
        ): Choosefonta =
            Choosefonta(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hDCCtorArg = hDC,
                lpLogFontCtorArg = lpLogFont,
                iPointSize = iPointSize,
                flags = flags,
                rgbColors = rgbColors,
                lCustData = lCustData,
                lpfnHook = lpfnHook,
                lpTemplateNameCtorArg = lpTemplateName,
                hInstanceCtorArg = hInstance,
                lpszStyleCtorArg = lpszStyle,
                nFontType = nFontType,
                missingAlignment = missingAlignment,
                nSizeMin = nSizeMin,
                nSizeMax = nSizeMax,
            )
    }
}

public class Choosefontw internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hDCCtorArg: Hdc,
    lpLogFontCtorArg: MutPtr<Logfontw>,
    public var iPointSize: Int,
    public var flags: ChoosefontFlags,
    public var rgbColors: Colorref,
    public var lCustData: Lparam,
    public var lpfnHook: Lpcfhookproc,
    lpTemplateNameCtorArg: Pcwstr,
    hInstanceCtorArg: Hinstance,
    lpszStyleCtorArg: Pwstr,
    public var nFontType: ChoosefontFontType,
    public var missingAlignment: UShort,
    public var nSizeMin: Int,
    public var nSizeMax: Int,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hDC: Hdc = hDCCtorArg
        internal set

    public var lpLogFont: MutPtr<Logfontw> = lpLogFontCtorArg
        internal set

    public var lpTemplateName: Pcwstr = lpTemplateNameCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszStyle: Pwstr = lpszStyleCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hDCCtorArg = MutPtr(0L),
        lpLogFontCtorArg = MutPtr(0L),
        iPointSize = 0,
        flags = 0u,
        rgbColors = 0u,
        lCustData = 0L,
        lpfnHook = null,
        lpTemplateNameCtorArg = ConstPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        lpszStyleCtorArg = MutPtr(0L),
        nFontType = 0u,
        missingAlignment = 0u,
        nSizeMin = 0,
        nSizeMax = 0,
    )

    public operator fun component1(): UInt = this.lStructSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): Hdc = this.hDC

    public operator fun component4(): MutPtr<Logfontw> = this.lpLogFont

    public operator fun component5(): Int = this.iPointSize

    public operator fun component6(): ChoosefontFlags = this.flags

    public operator fun component7(): Colorref = this.rgbColors

    public operator fun component8(): Lparam = this.lCustData

    public operator fun component9(): Lpcfhookproc = this.lpfnHook

    public operator fun component10(): Pcwstr = this.lpTemplateName

    public operator fun component11(): Hinstance = this.hInstance

    public operator fun component12(): Pwstr = this.lpszStyle

    public operator fun component13(): ChoosefontFontType = this.nFontType

    public operator fun component14(): UShort = this.missingAlignment

    public operator fun component15(): Int = this.nSizeMin

    public operator fun component16(): Int = this.nSizeMax

    public fun copy(lStructSize: UInt = this.lStructSize, hwndOwner: Hwnd = this.hwndOwner, hDC: Hdc = this.hDC, lpLogFont: MutPtr<Logfontw> = this.lpLogFont, iPointSize: Int = this.iPointSize, flags: ChoosefontFlags = this.flags, rgbColors: Colorref = this.rgbColors, lCustData: Lparam = this.lCustData, lpfnHook: Lpcfhookproc = this.lpfnHook, lpTemplateName: Pcwstr = this.lpTemplateName, hInstance: Hinstance = this.hInstance, lpszStyle: Pwstr = this.lpszStyle, nFontType: ChoosefontFontType = this.nFontType, missingAlignment: UShort = this.missingAlignment, nSizeMin: Int = this.nSizeMin, nSizeMax: Int = this.nSizeMax): Choosefontw = Choosefontw(lStructSize = lStructSize, hwndOwnerCtorArg = hwndOwner, hDCCtorArg = hDC, lpLogFontCtorArg = lpLogFont, iPointSize = iPointSize, flags = flags, rgbColors = rgbColors, lCustData = lCustData, lpfnHook = lpfnHook, lpTemplateNameCtorArg = lpTemplateName, hInstanceCtorArg = hInstance, lpszStyleCtorArg = lpszStyle, nFontType = nFontType, missingAlignment = missingAlignment, nSizeMin = nSizeMin, nSizeMax = nSizeMax)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Choosefontw) return false
        if (this.lStructSize != other.lStructSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.hDC != other.hDC) return false
        if (this.lpLogFont != other.lpLogFont) return false
        if (this.iPointSize != other.iPointSize) return false
        if (this.flags != other.flags) return false
        if (this.rgbColors != other.rgbColors) return false
        if (this.lCustData != other.lCustData) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lpTemplateName != other.lpTemplateName) return false
        if (this.hInstance != other.hInstance) return false
        if (this.lpszStyle != other.lpszStyle) return false
        if (this.nFontType != other.nFontType) return false
        if (this.missingAlignment != other.missingAlignment) return false
        if (this.nSizeMin != other.nSizeMin) return false
        if (this.nSizeMax != other.nSizeMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lStructSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.hDC.hashCode()
        result = 31 * result + this.lpLogFont.hashCode()
        result = 31 * result + this.iPointSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.rgbColors.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lpTemplateName.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.lpszStyle.hashCode()
        result = 31 * result + this.nFontType.hashCode()
        result = 31 * result + this.missingAlignment.hashCode()
        result = 31 * result + this.nSizeMin.hashCode()
        result = 31 * result + this.nSizeMax.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hDC: Hdc = MutPtr(0L),
            lpLogFont: MutPtr<Logfontw> = MutPtr(0L),
            iPointSize: Int = 0,
            flags: ChoosefontFlags = 0u,
            rgbColors: Colorref = 0u,
            lCustData: Lparam = 0L,
            lpfnHook: Lpcfhookproc = null,
            lpTemplateName: Pcwstr = ConstPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            lpszStyle: Pwstr = MutPtr(0L),
            nFontType: ChoosefontFontType = 0u,
            missingAlignment: UShort = 0u,
            nSizeMin: Int = 0,
            nSizeMax: Int = 0,
        ): Choosefontw =
            Choosefontw(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hDCCtorArg = hDC,
                lpLogFontCtorArg = lpLogFont,
                iPointSize = iPointSize,
                flags = flags,
                rgbColors = rgbColors,
                lCustData = lCustData,
                lpfnHook = lpfnHook,
                lpTemplateNameCtorArg = lpTemplateName,
                hInstanceCtorArg = hInstance,
                lpszStyleCtorArg = lpszStyle,
                nFontType = nFontType,
                missingAlignment = missingAlignment,
                nSizeMin = nSizeMin,
                nSizeMax = nSizeMax,
            )
    }
}

public data class Devnames(
    public var wDriverOffset: UShort = 0u,
    public var wDeviceOffset: UShort = 0u,
    public var wOutputOffset: UShort = 0u,
    public var wDefault: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Devnames> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Devnames> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Devnames =
                    Devnames(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Devnames) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wDriverOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wDeviceOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wOutputOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wDefault)
                }
            }
    }
}

public class Findreplacea internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    public var flags: FindreplaceFlags,
    lpstrFindWhatCtorArg: Pstr,
    lpstrReplaceWithCtorArg: Pstr,
    public var wFindWhatLen: UShort,
    public var wReplaceWithLen: UShort,
    public var lCustData: Lparam,
    public var lpfnHook: Lpfrhookproc,
    lpTemplateNameCtorArg: Pcstr,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpstrFindWhat: Pstr = lpstrFindWhatCtorArg
        internal set

    public var lpstrReplaceWith: Pstr = lpstrReplaceWithCtorArg
        internal set

    public var lpTemplateName: Pcstr = lpTemplateNameCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        flags = 0u,
        lpstrFindWhatCtorArg = MutPtr(0L),
        lpstrReplaceWithCtorArg = MutPtr(0L),
        wFindWhatLen = 0u,
        wReplaceWithLen = 0u,
        lCustData = 0L,
        lpfnHook = null,
        lpTemplateNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.lStructSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): Hinstance = this.hInstance

    public operator fun component4(): FindreplaceFlags = this.flags

    public operator fun component5(): Pstr = this.lpstrFindWhat

    public operator fun component6(): Pstr = this.lpstrReplaceWith

    public operator fun component7(): UShort = this.wFindWhatLen

    public operator fun component8(): UShort = this.wReplaceWithLen

    public operator fun component9(): Lparam = this.lCustData

    public operator fun component10(): Lpfrhookproc = this.lpfnHook

    public operator fun component11(): Pcstr = this.lpTemplateName

    public fun copy(lStructSize: UInt = this.lStructSize, hwndOwner: Hwnd = this.hwndOwner, hInstance: Hinstance = this.hInstance, flags: FindreplaceFlags = this.flags, lpstrFindWhat: Pstr = this.lpstrFindWhat, lpstrReplaceWith: Pstr = this.lpstrReplaceWith, wFindWhatLen: UShort = this.wFindWhatLen, wReplaceWithLen: UShort = this.wReplaceWithLen, lCustData: Lparam = this.lCustData, lpfnHook: Lpfrhookproc = this.lpfnHook, lpTemplateName: Pcstr = this.lpTemplateName): Findreplacea = Findreplacea(lStructSize = lStructSize, hwndOwnerCtorArg = hwndOwner, hInstanceCtorArg = hInstance, flags = flags, lpstrFindWhatCtorArg = lpstrFindWhat, lpstrReplaceWithCtorArg = lpstrReplaceWith, wFindWhatLen = wFindWhatLen, wReplaceWithLen = wReplaceWithLen, lCustData = lCustData, lpfnHook = lpfnHook, lpTemplateNameCtorArg = lpTemplateName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Findreplacea) return false
        if (this.lStructSize != other.lStructSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.hInstance != other.hInstance) return false
        if (this.flags != other.flags) return false
        if (this.lpstrFindWhat != other.lpstrFindWhat) return false
        if (this.lpstrReplaceWith != other.lpstrReplaceWith) return false
        if (this.wFindWhatLen != other.wFindWhatLen) return false
        if (this.wReplaceWithLen != other.wReplaceWithLen) return false
        if (this.lCustData != other.lCustData) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lpTemplateName != other.lpTemplateName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lStructSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.lpstrFindWhat.hashCode()
        result = 31 * result + this.lpstrReplaceWith.hashCode()
        result = 31 * result + this.wFindWhatLen.hashCode()
        result = 31 * result + this.wReplaceWithLen.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lpTemplateName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            flags: FindreplaceFlags = 0u,
            lpstrFindWhat: Pstr = MutPtr(0L),
            lpstrReplaceWith: Pstr = MutPtr(0L),
            wFindWhatLen: UShort = 0u,
            wReplaceWithLen: UShort = 0u,
            lCustData: Lparam = 0L,
            lpfnHook: Lpfrhookproc = null,
            lpTemplateName: Pcstr = ConstPtr(0L),
        ): Findreplacea =
            Findreplacea(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hInstanceCtorArg = hInstance,
                flags = flags,
                lpstrFindWhatCtorArg = lpstrFindWhat,
                lpstrReplaceWithCtorArg = lpstrReplaceWith,
                wFindWhatLen = wFindWhatLen,
                wReplaceWithLen = wReplaceWithLen,
                lCustData = lCustData,
                lpfnHook = lpfnHook,
                lpTemplateNameCtorArg = lpTemplateName,
            )
    }
}

public class Findreplacew internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    public var flags: FindreplaceFlags,
    lpstrFindWhatCtorArg: Pwstr,
    lpstrReplaceWithCtorArg: Pwstr,
    public var wFindWhatLen: UShort,
    public var wReplaceWithLen: UShort,
    public var lCustData: Lparam,
    public var lpfnHook: Lpfrhookproc,
    lpTemplateNameCtorArg: Pcwstr,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpstrFindWhat: Pwstr = lpstrFindWhatCtorArg
        internal set

    public var lpstrReplaceWith: Pwstr = lpstrReplaceWithCtorArg
        internal set

    public var lpTemplateName: Pcwstr = lpTemplateNameCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        flags = 0u,
        lpstrFindWhatCtorArg = MutPtr(0L),
        lpstrReplaceWithCtorArg = MutPtr(0L),
        wFindWhatLen = 0u,
        wReplaceWithLen = 0u,
        lCustData = 0L,
        lpfnHook = null,
        lpTemplateNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.lStructSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): Hinstance = this.hInstance

    public operator fun component4(): FindreplaceFlags = this.flags

    public operator fun component5(): Pwstr = this.lpstrFindWhat

    public operator fun component6(): Pwstr = this.lpstrReplaceWith

    public operator fun component7(): UShort = this.wFindWhatLen

    public operator fun component8(): UShort = this.wReplaceWithLen

    public operator fun component9(): Lparam = this.lCustData

    public operator fun component10(): Lpfrhookproc = this.lpfnHook

    public operator fun component11(): Pcwstr = this.lpTemplateName

    public fun copy(lStructSize: UInt = this.lStructSize, hwndOwner: Hwnd = this.hwndOwner, hInstance: Hinstance = this.hInstance, flags: FindreplaceFlags = this.flags, lpstrFindWhat: Pwstr = this.lpstrFindWhat, lpstrReplaceWith: Pwstr = this.lpstrReplaceWith, wFindWhatLen: UShort = this.wFindWhatLen, wReplaceWithLen: UShort = this.wReplaceWithLen, lCustData: Lparam = this.lCustData, lpfnHook: Lpfrhookproc = this.lpfnHook, lpTemplateName: Pcwstr = this.lpTemplateName): Findreplacew = Findreplacew(lStructSize = lStructSize, hwndOwnerCtorArg = hwndOwner, hInstanceCtorArg = hInstance, flags = flags, lpstrFindWhatCtorArg = lpstrFindWhat, lpstrReplaceWithCtorArg = lpstrReplaceWith, wFindWhatLen = wFindWhatLen, wReplaceWithLen = wReplaceWithLen, lCustData = lCustData, lpfnHook = lpfnHook, lpTemplateNameCtorArg = lpTemplateName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Findreplacew) return false
        if (this.lStructSize != other.lStructSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.hInstance != other.hInstance) return false
        if (this.flags != other.flags) return false
        if (this.lpstrFindWhat != other.lpstrFindWhat) return false
        if (this.lpstrReplaceWith != other.lpstrReplaceWith) return false
        if (this.wFindWhatLen != other.wFindWhatLen) return false
        if (this.wReplaceWithLen != other.wReplaceWithLen) return false
        if (this.lCustData != other.lCustData) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lpTemplateName != other.lpTemplateName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lStructSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.lpstrFindWhat.hashCode()
        result = 31 * result + this.lpstrReplaceWith.hashCode()
        result = 31 * result + this.wFindWhatLen.hashCode()
        result = 31 * result + this.wReplaceWithLen.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lpTemplateName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            flags: FindreplaceFlags = 0u,
            lpstrFindWhat: Pwstr = MutPtr(0L),
            lpstrReplaceWith: Pwstr = MutPtr(0L),
            wFindWhatLen: UShort = 0u,
            wReplaceWithLen: UShort = 0u,
            lCustData: Lparam = 0L,
            lpfnHook: Lpfrhookproc = null,
            lpTemplateName: Pcwstr = ConstPtr(0L),
        ): Findreplacew =
            Findreplacew(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hInstanceCtorArg = hInstance,
                flags = flags,
                lpstrFindWhatCtorArg = lpstrFindWhat,
                lpstrReplaceWithCtorArg = lpstrReplaceWith,
                wFindWhatLen = wFindWhatLen,
                wReplaceWithLen = wReplaceWithLen,
                lCustData = lCustData,
                lpfnHook = lpfnHook,
                lpTemplateNameCtorArg = lpTemplateName,
            )
    }
}

public class Ofnotifya internal constructor(
    public var hdr: Nmhdr,
    lpOFNCtorArg: MutPtr<Openfilenamea>,
    pszFileCtorArg: Pstr,
) {
    public var lpOFN: MutPtr<Openfilenamea> = lpOFNCtorArg
        internal set

    public var pszFile: Pstr = pszFileCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        lpOFNCtorArg = MutPtr(0L),
        pszFileCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): MutPtr<Openfilenamea> = this.lpOFN

    public operator fun component3(): Pstr = this.pszFile

    public fun copy(hdr: Nmhdr = this.hdr, lpOFN: MutPtr<Openfilenamea> = this.lpOFN, pszFile: Pstr = this.pszFile): Ofnotifya = Ofnotifya(hdr = hdr, lpOFNCtorArg = lpOFN, pszFileCtorArg = pszFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ofnotifya) return false
        if (this.hdr != other.hdr) return false
        if (this.lpOFN != other.lpOFN) return false
        if (this.pszFile != other.pszFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.lpOFN.hashCode()
        result = 31 * result + this.pszFile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            lpOFN: MutPtr<Openfilenamea> = MutPtr(0L),
            pszFile: Pstr = MutPtr(0L),
        ): Ofnotifya =
            Ofnotifya(
                hdr = hdr,
                lpOFNCtorArg = lpOFN,
                pszFileCtorArg = pszFile,
            )
    }
}

public class Ofnotifyexa internal constructor(
    public var hdr: Nmhdr,
    lpOFNCtorArg: MutPtr<Openfilenamea>,
    psfCtorArg: MutPtr<CVoid>,
    pidlCtorArg: MutPtr<CVoid>,
) {
    public var lpOFN: MutPtr<Openfilenamea> = lpOFNCtorArg
        internal set

    public var psf: MutPtr<CVoid> = psfCtorArg
        internal set

    public var pidl: MutPtr<CVoid> = pidlCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        lpOFNCtorArg = MutPtr(0L),
        psfCtorArg = MutPtr(0L),
        pidlCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): MutPtr<Openfilenamea> = this.lpOFN

    public operator fun component3(): MutPtr<CVoid> = this.psf

    public operator fun component4(): MutPtr<CVoid> = this.pidl

    public fun copy(hdr: Nmhdr = this.hdr, lpOFN: MutPtr<Openfilenamea> = this.lpOFN, psf: MutPtr<CVoid> = this.psf, pidl: MutPtr<CVoid> = this.pidl): Ofnotifyexa = Ofnotifyexa(hdr = hdr, lpOFNCtorArg = lpOFN, psfCtorArg = psf, pidlCtorArg = pidl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ofnotifyexa) return false
        if (this.hdr != other.hdr) return false
        if (this.lpOFN != other.lpOFN) return false
        if (this.psf != other.psf) return false
        if (this.pidl != other.pidl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.lpOFN.hashCode()
        result = 31 * result + this.psf.hashCode()
        result = 31 * result + this.pidl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            lpOFN: MutPtr<Openfilenamea> = MutPtr(0L),
            psf: MutPtr<CVoid> = MutPtr(0L),
            pidl: MutPtr<CVoid> = MutPtr(0L),
        ): Ofnotifyexa =
            Ofnotifyexa(
                hdr = hdr,
                lpOFNCtorArg = lpOFN,
                psfCtorArg = psf,
                pidlCtorArg = pidl,
            )
    }
}

public class Ofnotifyexw internal constructor(
    public var hdr: Nmhdr,
    lpOFNCtorArg: MutPtr<Openfilenamew>,
    psfCtorArg: MutPtr<CVoid>,
    pidlCtorArg: MutPtr<CVoid>,
) {
    public var lpOFN: MutPtr<Openfilenamew> = lpOFNCtorArg
        internal set

    public var psf: MutPtr<CVoid> = psfCtorArg
        internal set

    public var pidl: MutPtr<CVoid> = pidlCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        lpOFNCtorArg = MutPtr(0L),
        psfCtorArg = MutPtr(0L),
        pidlCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): MutPtr<Openfilenamew> = this.lpOFN

    public operator fun component3(): MutPtr<CVoid> = this.psf

    public operator fun component4(): MutPtr<CVoid> = this.pidl

    public fun copy(hdr: Nmhdr = this.hdr, lpOFN: MutPtr<Openfilenamew> = this.lpOFN, psf: MutPtr<CVoid> = this.psf, pidl: MutPtr<CVoid> = this.pidl): Ofnotifyexw = Ofnotifyexw(hdr = hdr, lpOFNCtorArg = lpOFN, psfCtorArg = psf, pidlCtorArg = pidl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ofnotifyexw) return false
        if (this.hdr != other.hdr) return false
        if (this.lpOFN != other.lpOFN) return false
        if (this.psf != other.psf) return false
        if (this.pidl != other.pidl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.lpOFN.hashCode()
        result = 31 * result + this.psf.hashCode()
        result = 31 * result + this.pidl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            lpOFN: MutPtr<Openfilenamew> = MutPtr(0L),
            psf: MutPtr<CVoid> = MutPtr(0L),
            pidl: MutPtr<CVoid> = MutPtr(0L),
        ): Ofnotifyexw =
            Ofnotifyexw(
                hdr = hdr,
                lpOFNCtorArg = lpOFN,
                psfCtorArg = psf,
                pidlCtorArg = pidl,
            )
    }
}

public class Ofnotifyw internal constructor(
    public var hdr: Nmhdr,
    lpOFNCtorArg: MutPtr<Openfilenamew>,
    pszFileCtorArg: Pwstr,
) {
    public var lpOFN: MutPtr<Openfilenamew> = lpOFNCtorArg
        internal set

    public var pszFile: Pwstr = pszFileCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        lpOFNCtorArg = MutPtr(0L),
        pszFileCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): MutPtr<Openfilenamew> = this.lpOFN

    public operator fun component3(): Pwstr = this.pszFile

    public fun copy(hdr: Nmhdr = this.hdr, lpOFN: MutPtr<Openfilenamew> = this.lpOFN, pszFile: Pwstr = this.pszFile): Ofnotifyw = Ofnotifyw(hdr = hdr, lpOFNCtorArg = lpOFN, pszFileCtorArg = pszFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ofnotifyw) return false
        if (this.hdr != other.hdr) return false
        if (this.lpOFN != other.lpOFN) return false
        if (this.pszFile != other.pszFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.lpOFN.hashCode()
        result = 31 * result + this.pszFile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            lpOFN: MutPtr<Openfilenamew> = MutPtr(0L),
            pszFile: Pwstr = MutPtr(0L),
        ): Ofnotifyw =
            Ofnotifyw(
                hdr = hdr,
                lpOFNCtorArg = lpOFN,
                pszFileCtorArg = pszFile,
            )
    }
}

public class Openfilenamea internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    lpstrFilterCtorArg: Pcstr,
    lpstrCustomFilterCtorArg: Pstr,
    public var nMaxCustFilter: UInt,
    public var nFilterIndex: UInt,
    lpstrFileCtorArg: Pstr,
    public var nMaxFile: UInt,
    lpstrFileTitleCtorArg: Pstr,
    public var nMaxFileTitle: UInt,
    lpstrInitialDirCtorArg: Pcstr,
    lpstrTitleCtorArg: Pcstr,
    public var flags: OpenFilenameFlags,
    public var nFileOffset: UShort,
    public var nFileExtension: UShort,
    lpstrDefExtCtorArg: Pcstr,
    public var lCustData: Lparam,
    public var lpfnHook: Lpofnhookproc,
    lpTemplateNameCtorArg: Pcstr,
    pvReservedCtorArg: MutPtr<CVoid>,
    public var dwReserved: UInt,
    public var flagsEx: OpenFilenameFlagsEx,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpstrFilter: Pcstr = lpstrFilterCtorArg
        internal set

    public var lpstrCustomFilter: Pstr = lpstrCustomFilterCtorArg
        internal set

    public var lpstrFile: Pstr = lpstrFileCtorArg
        internal set

    public var lpstrFileTitle: Pstr = lpstrFileTitleCtorArg
        internal set

    public var lpstrInitialDir: Pcstr = lpstrInitialDirCtorArg
        internal set

    public var lpstrTitle: Pcstr = lpstrTitleCtorArg
        internal set

    public var lpstrDefExt: Pcstr = lpstrDefExtCtorArg
        internal set

    public var lpTemplateName: Pcstr = lpTemplateNameCtorArg
        internal set

    public var pvReserved: MutPtr<CVoid> = pvReservedCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        lpstrFilterCtorArg = ConstPtr(0L),
        lpstrCustomFilterCtorArg = MutPtr(0L),
        nMaxCustFilter = 0u,
        nFilterIndex = 0u,
        lpstrFileCtorArg = MutPtr(0L),
        nMaxFile = 0u,
        lpstrFileTitleCtorArg = MutPtr(0L),
        nMaxFileTitle = 0u,
        lpstrInitialDirCtorArg = ConstPtr(0L),
        lpstrTitleCtorArg = ConstPtr(0L),
        flags = 0u,
        nFileOffset = 0u,
        nFileExtension = 0u,
        lpstrDefExtCtorArg = ConstPtr(0L),
        lCustData = 0L,
        lpfnHook = null,
        lpTemplateNameCtorArg = ConstPtr(0L),
        pvReservedCtorArg = MutPtr(0L),
        dwReserved = 0u,
        flagsEx = 0u,
    )

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            lpstrFilter: Pcstr = ConstPtr(0L),
            lpstrCustomFilter: Pstr = MutPtr(0L),
            nMaxCustFilter: UInt = 0u,
            nFilterIndex: UInt = 0u,
            lpstrFile: Pstr = MutPtr(0L),
            nMaxFile: UInt = 0u,
            lpstrFileTitle: Pstr = MutPtr(0L),
            nMaxFileTitle: UInt = 0u,
            lpstrInitialDir: Pcstr = ConstPtr(0L),
            lpstrTitle: Pcstr = ConstPtr(0L),
            flags: OpenFilenameFlags = 0u,
            nFileOffset: UShort = 0u,
            nFileExtension: UShort = 0u,
            lpstrDefExt: Pcstr = ConstPtr(0L),
            lCustData: Lparam = 0L,
            lpfnHook: Lpofnhookproc = null,
            lpTemplateName: Pcstr = ConstPtr(0L),
            pvReserved: MutPtr<CVoid> = MutPtr(0L),
            dwReserved: UInt = 0u,
            flagsEx: OpenFilenameFlagsEx = 0u,
        ): Openfilenamea =
            Openfilenamea(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hInstanceCtorArg = hInstance,
                lpstrFilterCtorArg = lpstrFilter,
                lpstrCustomFilterCtorArg = lpstrCustomFilter,
                nMaxCustFilter = nMaxCustFilter,
                nFilterIndex = nFilterIndex,
                lpstrFileCtorArg = lpstrFile,
                nMaxFile = nMaxFile,
                lpstrFileTitleCtorArg = lpstrFileTitle,
                nMaxFileTitle = nMaxFileTitle,
                lpstrInitialDirCtorArg = lpstrInitialDir,
                lpstrTitleCtorArg = lpstrTitle,
                flags = flags,
                nFileOffset = nFileOffset,
                nFileExtension = nFileExtension,
                lpstrDefExtCtorArg = lpstrDefExt,
                lCustData = lCustData,
                lpfnHook = lpfnHook,
                lpTemplateNameCtorArg = lpTemplateName,
                pvReservedCtorArg = pvReserved,
                dwReserved = dwReserved,
                flagsEx = flagsEx,
            )
    }
}

public class Openfilenamew internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    lpstrFilterCtorArg: Pcwstr,
    lpstrCustomFilterCtorArg: Pwstr,
    public var nMaxCustFilter: UInt,
    public var nFilterIndex: UInt,
    lpstrFileCtorArg: Pwstr,
    public var nMaxFile: UInt,
    lpstrFileTitleCtorArg: Pwstr,
    public var nMaxFileTitle: UInt,
    lpstrInitialDirCtorArg: Pcwstr,
    lpstrTitleCtorArg: Pcwstr,
    public var flags: OpenFilenameFlags,
    public var nFileOffset: UShort,
    public var nFileExtension: UShort,
    lpstrDefExtCtorArg: Pcwstr,
    public var lCustData: Lparam,
    public var lpfnHook: Lpofnhookproc,
    lpTemplateNameCtorArg: Pcwstr,
    pvReservedCtorArg: MutPtr<CVoid>,
    public var dwReserved: UInt,
    public var flagsEx: OpenFilenameFlagsEx,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpstrFilter: Pcwstr = lpstrFilterCtorArg
        internal set

    public var lpstrCustomFilter: Pwstr = lpstrCustomFilterCtorArg
        internal set

    public var lpstrFile: Pwstr = lpstrFileCtorArg
        internal set

    public var lpstrFileTitle: Pwstr = lpstrFileTitleCtorArg
        internal set

    public var lpstrInitialDir: Pcwstr = lpstrInitialDirCtorArg
        internal set

    public var lpstrTitle: Pcwstr = lpstrTitleCtorArg
        internal set

    public var lpstrDefExt: Pcwstr = lpstrDefExtCtorArg
        internal set

    public var lpTemplateName: Pcwstr = lpTemplateNameCtorArg
        internal set

    public var pvReserved: MutPtr<CVoid> = pvReservedCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        lpstrFilterCtorArg = ConstPtr(0L),
        lpstrCustomFilterCtorArg = MutPtr(0L),
        nMaxCustFilter = 0u,
        nFilterIndex = 0u,
        lpstrFileCtorArg = MutPtr(0L),
        nMaxFile = 0u,
        lpstrFileTitleCtorArg = MutPtr(0L),
        nMaxFileTitle = 0u,
        lpstrInitialDirCtorArg = ConstPtr(0L),
        lpstrTitleCtorArg = ConstPtr(0L),
        flags = 0u,
        nFileOffset = 0u,
        nFileExtension = 0u,
        lpstrDefExtCtorArg = ConstPtr(0L),
        lCustData = 0L,
        lpfnHook = null,
        lpTemplateNameCtorArg = ConstPtr(0L),
        pvReservedCtorArg = MutPtr(0L),
        dwReserved = 0u,
        flagsEx = 0u,
    )

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            lpstrFilter: Pcwstr = ConstPtr(0L),
            lpstrCustomFilter: Pwstr = MutPtr(0L),
            nMaxCustFilter: UInt = 0u,
            nFilterIndex: UInt = 0u,
            lpstrFile: Pwstr = MutPtr(0L),
            nMaxFile: UInt = 0u,
            lpstrFileTitle: Pwstr = MutPtr(0L),
            nMaxFileTitle: UInt = 0u,
            lpstrInitialDir: Pcwstr = ConstPtr(0L),
            lpstrTitle: Pcwstr = ConstPtr(0L),
            flags: OpenFilenameFlags = 0u,
            nFileOffset: UShort = 0u,
            nFileExtension: UShort = 0u,
            lpstrDefExt: Pcwstr = ConstPtr(0L),
            lCustData: Lparam = 0L,
            lpfnHook: Lpofnhookproc = null,
            lpTemplateName: Pcwstr = ConstPtr(0L),
            pvReserved: MutPtr<CVoid> = MutPtr(0L),
            dwReserved: UInt = 0u,
            flagsEx: OpenFilenameFlagsEx = 0u,
        ): Openfilenamew =
            Openfilenamew(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hInstanceCtorArg = hInstance,
                lpstrFilterCtorArg = lpstrFilter,
                lpstrCustomFilterCtorArg = lpstrCustomFilter,
                nMaxCustFilter = nMaxCustFilter,
                nFilterIndex = nFilterIndex,
                lpstrFileCtorArg = lpstrFile,
                nMaxFile = nMaxFile,
                lpstrFileTitleCtorArg = lpstrFileTitle,
                nMaxFileTitle = nMaxFileTitle,
                lpstrInitialDirCtorArg = lpstrInitialDir,
                lpstrTitleCtorArg = lpstrTitle,
                flags = flags,
                nFileOffset = nFileOffset,
                nFileExtension = nFileExtension,
                lpstrDefExtCtorArg = lpstrDefExt,
                lCustData = lCustData,
                lpfnHook = lpfnHook,
                lpTemplateNameCtorArg = lpTemplateName,
                pvReservedCtorArg = pvReserved,
                dwReserved = dwReserved,
                flagsEx = flagsEx,
            )
    }
}

public class OpenfilenameNt4a internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    lpstrFilterCtorArg: Pcstr,
    lpstrCustomFilterCtorArg: Pstr,
    public var nMaxCustFilter: UInt,
    public var nFilterIndex: UInt,
    lpstrFileCtorArg: Pstr,
    public var nMaxFile: UInt,
    lpstrFileTitleCtorArg: Pstr,
    public var nMaxFileTitle: UInt,
    lpstrInitialDirCtorArg: Pcstr,
    lpstrTitleCtorArg: Pcstr,
    public var flags: UInt,
    public var nFileOffset: UShort,
    public var nFileExtension: UShort,
    lpstrDefExtCtorArg: Pcstr,
    public var lCustData: Lparam,
    public var lpfnHook: Lpofnhookproc,
    lpTemplateNameCtorArg: Pcstr,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpstrFilter: Pcstr = lpstrFilterCtorArg
        internal set

    public var lpstrCustomFilter: Pstr = lpstrCustomFilterCtorArg
        internal set

    public var lpstrFile: Pstr = lpstrFileCtorArg
        internal set

    public var lpstrFileTitle: Pstr = lpstrFileTitleCtorArg
        internal set

    public var lpstrInitialDir: Pcstr = lpstrInitialDirCtorArg
        internal set

    public var lpstrTitle: Pcstr = lpstrTitleCtorArg
        internal set

    public var lpstrDefExt: Pcstr = lpstrDefExtCtorArg
        internal set

    public var lpTemplateName: Pcstr = lpTemplateNameCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        lpstrFilterCtorArg = ConstPtr(0L),
        lpstrCustomFilterCtorArg = MutPtr(0L),
        nMaxCustFilter = 0u,
        nFilterIndex = 0u,
        lpstrFileCtorArg = MutPtr(0L),
        nMaxFile = 0u,
        lpstrFileTitleCtorArg = MutPtr(0L),
        nMaxFileTitle = 0u,
        lpstrInitialDirCtorArg = ConstPtr(0L),
        lpstrTitleCtorArg = ConstPtr(0L),
        flags = 0u,
        nFileOffset = 0u,
        nFileExtension = 0u,
        lpstrDefExtCtorArg = ConstPtr(0L),
        lCustData = 0L,
        lpfnHook = null,
        lpTemplateNameCtorArg = ConstPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            lpstrFilter: Pcstr = ConstPtr(0L),
            lpstrCustomFilter: Pstr = MutPtr(0L),
            nMaxCustFilter: UInt = 0u,
            nFilterIndex: UInt = 0u,
            lpstrFile: Pstr = MutPtr(0L),
            nMaxFile: UInt = 0u,
            lpstrFileTitle: Pstr = MutPtr(0L),
            nMaxFileTitle: UInt = 0u,
            lpstrInitialDir: Pcstr = ConstPtr(0L),
            lpstrTitle: Pcstr = ConstPtr(0L),
            flags: UInt = 0u,
            nFileOffset: UShort = 0u,
            nFileExtension: UShort = 0u,
            lpstrDefExt: Pcstr = ConstPtr(0L),
            lCustData: Lparam = 0L,
            lpfnHook: Lpofnhookproc = null,
            lpTemplateName: Pcstr = ConstPtr(0L),
        ): OpenfilenameNt4a =
            OpenfilenameNt4a(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hInstanceCtorArg = hInstance,
                lpstrFilterCtorArg = lpstrFilter,
                lpstrCustomFilterCtorArg = lpstrCustomFilter,
                nMaxCustFilter = nMaxCustFilter,
                nFilterIndex = nFilterIndex,
                lpstrFileCtorArg = lpstrFile,
                nMaxFile = nMaxFile,
                lpstrFileTitleCtorArg = lpstrFileTitle,
                nMaxFileTitle = nMaxFileTitle,
                lpstrInitialDirCtorArg = lpstrInitialDir,
                lpstrTitleCtorArg = lpstrTitle,
                flags = flags,
                nFileOffset = nFileOffset,
                nFileExtension = nFileExtension,
                lpstrDefExtCtorArg = lpstrDefExt,
                lCustData = lCustData,
                lpfnHook = lpfnHook,
                lpTemplateNameCtorArg = lpTemplateName,
            )
    }
}

public class OpenfilenameNt4w internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    lpstrFilterCtorArg: Pcwstr,
    lpstrCustomFilterCtorArg: Pwstr,
    public var nMaxCustFilter: UInt,
    public var nFilterIndex: UInt,
    lpstrFileCtorArg: Pwstr,
    public var nMaxFile: UInt,
    lpstrFileTitleCtorArg: Pwstr,
    public var nMaxFileTitle: UInt,
    lpstrInitialDirCtorArg: Pcwstr,
    lpstrTitleCtorArg: Pcwstr,
    public var flags: UInt,
    public var nFileOffset: UShort,
    public var nFileExtension: UShort,
    lpstrDefExtCtorArg: Pcwstr,
    public var lCustData: Lparam,
    public var lpfnHook: Lpofnhookproc,
    lpTemplateNameCtorArg: Pcwstr,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpstrFilter: Pcwstr = lpstrFilterCtorArg
        internal set

    public var lpstrCustomFilter: Pwstr = lpstrCustomFilterCtorArg
        internal set

    public var lpstrFile: Pwstr = lpstrFileCtorArg
        internal set

    public var lpstrFileTitle: Pwstr = lpstrFileTitleCtorArg
        internal set

    public var lpstrInitialDir: Pcwstr = lpstrInitialDirCtorArg
        internal set

    public var lpstrTitle: Pcwstr = lpstrTitleCtorArg
        internal set

    public var lpstrDefExt: Pcwstr = lpstrDefExtCtorArg
        internal set

    public var lpTemplateName: Pcwstr = lpTemplateNameCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        lpstrFilterCtorArg = ConstPtr(0L),
        lpstrCustomFilterCtorArg = MutPtr(0L),
        nMaxCustFilter = 0u,
        nFilterIndex = 0u,
        lpstrFileCtorArg = MutPtr(0L),
        nMaxFile = 0u,
        lpstrFileTitleCtorArg = MutPtr(0L),
        nMaxFileTitle = 0u,
        lpstrInitialDirCtorArg = ConstPtr(0L),
        lpstrTitleCtorArg = ConstPtr(0L),
        flags = 0u,
        nFileOffset = 0u,
        nFileExtension = 0u,
        lpstrDefExtCtorArg = ConstPtr(0L),
        lCustData = 0L,
        lpfnHook = null,
        lpTemplateNameCtorArg = ConstPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            lpstrFilter: Pcwstr = ConstPtr(0L),
            lpstrCustomFilter: Pwstr = MutPtr(0L),
            nMaxCustFilter: UInt = 0u,
            nFilterIndex: UInt = 0u,
            lpstrFile: Pwstr = MutPtr(0L),
            nMaxFile: UInt = 0u,
            lpstrFileTitle: Pwstr = MutPtr(0L),
            nMaxFileTitle: UInt = 0u,
            lpstrInitialDir: Pcwstr = ConstPtr(0L),
            lpstrTitle: Pcwstr = ConstPtr(0L),
            flags: UInt = 0u,
            nFileOffset: UShort = 0u,
            nFileExtension: UShort = 0u,
            lpstrDefExt: Pcwstr = ConstPtr(0L),
            lCustData: Lparam = 0L,
            lpfnHook: Lpofnhookproc = null,
            lpTemplateName: Pcwstr = ConstPtr(0L),
        ): OpenfilenameNt4w =
            OpenfilenameNt4w(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hInstanceCtorArg = hInstance,
                lpstrFilterCtorArg = lpstrFilter,
                lpstrCustomFilterCtorArg = lpstrCustomFilter,
                nMaxCustFilter = nMaxCustFilter,
                nFilterIndex = nFilterIndex,
                lpstrFileCtorArg = lpstrFile,
                nMaxFile = nMaxFile,
                lpstrFileTitleCtorArg = lpstrFileTitle,
                nMaxFileTitle = nMaxFileTitle,
                lpstrInitialDirCtorArg = lpstrInitialDir,
                lpstrTitleCtorArg = lpstrTitle,
                flags = flags,
                nFileOffset = nFileOffset,
                nFileExtension = nFileExtension,
                lpstrDefExtCtorArg = lpstrDefExt,
                lCustData = lCustData,
                lpfnHook = lpfnHook,
                lpTemplateNameCtorArg = lpTemplateName,
            )
    }
}

public class Pagesetupdlga internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hDevModeCtorArg: Hglobal,
    hDevNamesCtorArg: Hglobal,
    public var flags: PagesetupdlgFlags,
    public var ptPaperSize: Point,
    public var rtMinMargin: Rect,
    public var rtMargin: Rect,
    hInstanceCtorArg: Hinstance,
    public var lCustData: Lparam,
    public var lpfnPageSetupHook: Lppagesetuphook,
    public var lpfnPagePaintHook: Lppagepainthook,
    lpPageSetupTemplateNameCtorArg: Pcstr,
    hPageSetupTemplateCtorArg: Hglobal,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hDevMode: Hglobal = hDevModeCtorArg
        internal set

    public var hDevNames: Hglobal = hDevNamesCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpPageSetupTemplateName: Pcstr = lpPageSetupTemplateNameCtorArg
        internal set

    public var hPageSetupTemplate: Hglobal = hPageSetupTemplateCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hDevModeCtorArg = MutPtr(0L),
        hDevNamesCtorArg = MutPtr(0L),
        flags = 0u,
        ptPaperSize = Point(),
        rtMinMargin = Rect(),
        rtMargin = Rect(),
        hInstanceCtorArg = MutPtr(0L),
        lCustData = 0L,
        lpfnPageSetupHook = null,
        lpfnPagePaintHook = null,
        lpPageSetupTemplateNameCtorArg = ConstPtr(0L),
        hPageSetupTemplateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.lStructSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): Hglobal = this.hDevMode

    public operator fun component4(): Hglobal = this.hDevNames

    public operator fun component5(): PagesetupdlgFlags = this.flags

    public operator fun component6(): Point = this.ptPaperSize

    public operator fun component7(): Rect = this.rtMinMargin

    public operator fun component8(): Rect = this.rtMargin

    public operator fun component9(): Hinstance = this.hInstance

    public operator fun component10(): Lparam = this.lCustData

    public operator fun component11(): Lppagesetuphook = this.lpfnPageSetupHook

    public operator fun component12(): Lppagepainthook = this.lpfnPagePaintHook

    public operator fun component13(): Pcstr = this.lpPageSetupTemplateName

    public operator fun component14(): Hglobal = this.hPageSetupTemplate

    public fun copy(lStructSize: UInt = this.lStructSize, hwndOwner: Hwnd = this.hwndOwner, hDevMode: Hglobal = this.hDevMode, hDevNames: Hglobal = this.hDevNames, flags: PagesetupdlgFlags = this.flags, ptPaperSize: Point = this.ptPaperSize, rtMinMargin: Rect = this.rtMinMargin, rtMargin: Rect = this.rtMargin, hInstance: Hinstance = this.hInstance, lCustData: Lparam = this.lCustData, lpfnPageSetupHook: Lppagesetuphook = this.lpfnPageSetupHook, lpfnPagePaintHook: Lppagepainthook = this.lpfnPagePaintHook, lpPageSetupTemplateName: Pcstr = this.lpPageSetupTemplateName, hPageSetupTemplate: Hglobal = this.hPageSetupTemplate): Pagesetupdlga = Pagesetupdlga(lStructSize = lStructSize, hwndOwnerCtorArg = hwndOwner, hDevModeCtorArg = hDevMode, hDevNamesCtorArg = hDevNames, flags = flags, ptPaperSize = ptPaperSize, rtMinMargin = rtMinMargin, rtMargin = rtMargin, hInstanceCtorArg = hInstance, lCustData = lCustData, lpfnPageSetupHook = lpfnPageSetupHook, lpfnPagePaintHook = lpfnPagePaintHook, lpPageSetupTemplateNameCtorArg = lpPageSetupTemplateName, hPageSetupTemplateCtorArg = hPageSetupTemplate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pagesetupdlga) return false
        if (this.lStructSize != other.lStructSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.hDevMode != other.hDevMode) return false
        if (this.hDevNames != other.hDevNames) return false
        if (this.flags != other.flags) return false
        if (this.ptPaperSize != other.ptPaperSize) return false
        if (this.rtMinMargin != other.rtMinMargin) return false
        if (this.rtMargin != other.rtMargin) return false
        if (this.hInstance != other.hInstance) return false
        if (this.lCustData != other.lCustData) return false
        if (this.lpfnPageSetupHook != other.lpfnPageSetupHook) return false
        if (this.lpfnPagePaintHook != other.lpfnPagePaintHook) return false
        if (this.lpPageSetupTemplateName != other.lpPageSetupTemplateName) return false
        if (this.hPageSetupTemplate != other.hPageSetupTemplate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lStructSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.hDevMode.hashCode()
        result = 31 * result + this.hDevNames.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.ptPaperSize.hashCode()
        result = 31 * result + this.rtMinMargin.hashCode()
        result = 31 * result + this.rtMargin.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.lpfnPageSetupHook.hashCode()
        result = 31 * result + this.lpfnPagePaintHook.hashCode()
        result = 31 * result + this.lpPageSetupTemplateName.hashCode()
        result = 31 * result + this.hPageSetupTemplate.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hDevMode: Hglobal = MutPtr(0L),
            hDevNames: Hglobal = MutPtr(0L),
            flags: PagesetupdlgFlags = 0u,
            ptPaperSize: Point = Point(),
            rtMinMargin: Rect = Rect(),
            rtMargin: Rect = Rect(),
            hInstance: Hinstance = MutPtr(0L),
            lCustData: Lparam = 0L,
            lpfnPageSetupHook: Lppagesetuphook = null,
            lpfnPagePaintHook: Lppagepainthook = null,
            lpPageSetupTemplateName: Pcstr = ConstPtr(0L),
            hPageSetupTemplate: Hglobal = MutPtr(0L),
        ): Pagesetupdlga =
            Pagesetupdlga(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hDevModeCtorArg = hDevMode,
                hDevNamesCtorArg = hDevNames,
                flags = flags,
                ptPaperSize = ptPaperSize,
                rtMinMargin = rtMinMargin,
                rtMargin = rtMargin,
                hInstanceCtorArg = hInstance,
                lCustData = lCustData,
                lpfnPageSetupHook = lpfnPageSetupHook,
                lpfnPagePaintHook = lpfnPagePaintHook,
                lpPageSetupTemplateNameCtorArg = lpPageSetupTemplateName,
                hPageSetupTemplateCtorArg = hPageSetupTemplate,
            )
    }
}

public class Pagesetupdlgw internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hDevModeCtorArg: Hglobal,
    hDevNamesCtorArg: Hglobal,
    public var flags: PagesetupdlgFlags,
    public var ptPaperSize: Point,
    public var rtMinMargin: Rect,
    public var rtMargin: Rect,
    hInstanceCtorArg: Hinstance,
    public var lCustData: Lparam,
    public var lpfnPageSetupHook: Lppagesetuphook,
    public var lpfnPagePaintHook: Lppagepainthook,
    lpPageSetupTemplateNameCtorArg: Pcwstr,
    hPageSetupTemplateCtorArg: Hglobal,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hDevMode: Hglobal = hDevModeCtorArg
        internal set

    public var hDevNames: Hglobal = hDevNamesCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpPageSetupTemplateName: Pcwstr = lpPageSetupTemplateNameCtorArg
        internal set

    public var hPageSetupTemplate: Hglobal = hPageSetupTemplateCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hDevModeCtorArg = MutPtr(0L),
        hDevNamesCtorArg = MutPtr(0L),
        flags = 0u,
        ptPaperSize = Point(),
        rtMinMargin = Rect(),
        rtMargin = Rect(),
        hInstanceCtorArg = MutPtr(0L),
        lCustData = 0L,
        lpfnPageSetupHook = null,
        lpfnPagePaintHook = null,
        lpPageSetupTemplateNameCtorArg = ConstPtr(0L),
        hPageSetupTemplateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.lStructSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): Hglobal = this.hDevMode

    public operator fun component4(): Hglobal = this.hDevNames

    public operator fun component5(): PagesetupdlgFlags = this.flags

    public operator fun component6(): Point = this.ptPaperSize

    public operator fun component7(): Rect = this.rtMinMargin

    public operator fun component8(): Rect = this.rtMargin

    public operator fun component9(): Hinstance = this.hInstance

    public operator fun component10(): Lparam = this.lCustData

    public operator fun component11(): Lppagesetuphook = this.lpfnPageSetupHook

    public operator fun component12(): Lppagepainthook = this.lpfnPagePaintHook

    public operator fun component13(): Pcwstr = this.lpPageSetupTemplateName

    public operator fun component14(): Hglobal = this.hPageSetupTemplate

    public fun copy(lStructSize: UInt = this.lStructSize, hwndOwner: Hwnd = this.hwndOwner, hDevMode: Hglobal = this.hDevMode, hDevNames: Hglobal = this.hDevNames, flags: PagesetupdlgFlags = this.flags, ptPaperSize: Point = this.ptPaperSize, rtMinMargin: Rect = this.rtMinMargin, rtMargin: Rect = this.rtMargin, hInstance: Hinstance = this.hInstance, lCustData: Lparam = this.lCustData, lpfnPageSetupHook: Lppagesetuphook = this.lpfnPageSetupHook, lpfnPagePaintHook: Lppagepainthook = this.lpfnPagePaintHook, lpPageSetupTemplateName: Pcwstr = this.lpPageSetupTemplateName, hPageSetupTemplate: Hglobal = this.hPageSetupTemplate): Pagesetupdlgw = Pagesetupdlgw(lStructSize = lStructSize, hwndOwnerCtorArg = hwndOwner, hDevModeCtorArg = hDevMode, hDevNamesCtorArg = hDevNames, flags = flags, ptPaperSize = ptPaperSize, rtMinMargin = rtMinMargin, rtMargin = rtMargin, hInstanceCtorArg = hInstance, lCustData = lCustData, lpfnPageSetupHook = lpfnPageSetupHook, lpfnPagePaintHook = lpfnPagePaintHook, lpPageSetupTemplateNameCtorArg = lpPageSetupTemplateName, hPageSetupTemplateCtorArg = hPageSetupTemplate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pagesetupdlgw) return false
        if (this.lStructSize != other.lStructSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.hDevMode != other.hDevMode) return false
        if (this.hDevNames != other.hDevNames) return false
        if (this.flags != other.flags) return false
        if (this.ptPaperSize != other.ptPaperSize) return false
        if (this.rtMinMargin != other.rtMinMargin) return false
        if (this.rtMargin != other.rtMargin) return false
        if (this.hInstance != other.hInstance) return false
        if (this.lCustData != other.lCustData) return false
        if (this.lpfnPageSetupHook != other.lpfnPageSetupHook) return false
        if (this.lpfnPagePaintHook != other.lpfnPagePaintHook) return false
        if (this.lpPageSetupTemplateName != other.lpPageSetupTemplateName) return false
        if (this.hPageSetupTemplate != other.hPageSetupTemplate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lStructSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.hDevMode.hashCode()
        result = 31 * result + this.hDevNames.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.ptPaperSize.hashCode()
        result = 31 * result + this.rtMinMargin.hashCode()
        result = 31 * result + this.rtMargin.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.lpfnPageSetupHook.hashCode()
        result = 31 * result + this.lpfnPagePaintHook.hashCode()
        result = 31 * result + this.lpPageSetupTemplateName.hashCode()
        result = 31 * result + this.hPageSetupTemplate.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hDevMode: Hglobal = MutPtr(0L),
            hDevNames: Hglobal = MutPtr(0L),
            flags: PagesetupdlgFlags = 0u,
            ptPaperSize: Point = Point(),
            rtMinMargin: Rect = Rect(),
            rtMargin: Rect = Rect(),
            hInstance: Hinstance = MutPtr(0L),
            lCustData: Lparam = 0L,
            lpfnPageSetupHook: Lppagesetuphook = null,
            lpfnPagePaintHook: Lppagepainthook = null,
            lpPageSetupTemplateName: Pcwstr = ConstPtr(0L),
            hPageSetupTemplate: Hglobal = MutPtr(0L),
        ): Pagesetupdlgw =
            Pagesetupdlgw(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hDevModeCtorArg = hDevMode,
                hDevNamesCtorArg = hDevNames,
                flags = flags,
                ptPaperSize = ptPaperSize,
                rtMinMargin = rtMinMargin,
                rtMargin = rtMargin,
                hInstanceCtorArg = hInstance,
                lCustData = lCustData,
                lpfnPageSetupHook = lpfnPageSetupHook,
                lpfnPagePaintHook = lpfnPagePaintHook,
                lpPageSetupTemplateNameCtorArg = lpPageSetupTemplateName,
                hPageSetupTemplateCtorArg = hPageSetupTemplate,
            )
    }
}

public class Printdlga internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hDevModeCtorArg: Hglobal,
    hDevNamesCtorArg: Hglobal,
    hDCCtorArg: Hdc,
    public var flags: PrintdlgexFlags,
    public var nFromPage: UShort,
    public var nToPage: UShort,
    public var nMinPage: UShort,
    public var nMaxPage: UShort,
    public var nCopies: UShort,
    hInstanceCtorArg: Hinstance,
    public var lCustData: Lparam,
    public var lpfnPrintHook: Lpprinthookproc,
    public var lpfnSetupHook: Lpsetuphookproc,
    lpPrintTemplateNameCtorArg: Pcstr,
    lpSetupTemplateNameCtorArg: Pcstr,
    hPrintTemplateCtorArg: Hglobal,
    hSetupTemplateCtorArg: Hglobal,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hDevMode: Hglobal = hDevModeCtorArg
        internal set

    public var hDevNames: Hglobal = hDevNamesCtorArg
        internal set

    public var hDC: Hdc = hDCCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpPrintTemplateName: Pcstr = lpPrintTemplateNameCtorArg
        internal set

    public var lpSetupTemplateName: Pcstr = lpSetupTemplateNameCtorArg
        internal set

    public var hPrintTemplate: Hglobal = hPrintTemplateCtorArg
        internal set

    public var hSetupTemplate: Hglobal = hSetupTemplateCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hDevModeCtorArg = MutPtr(0L),
        hDevNamesCtorArg = MutPtr(0L),
        hDCCtorArg = MutPtr(0L),
        flags = 0u,
        nFromPage = 0u,
        nToPage = 0u,
        nMinPage = 0u,
        nMaxPage = 0u,
        nCopies = 0u,
        hInstanceCtorArg = MutPtr(0L),
        lCustData = 0L,
        lpfnPrintHook = null,
        lpfnSetupHook = null,
        lpPrintTemplateNameCtorArg = ConstPtr(0L),
        lpSetupTemplateNameCtorArg = ConstPtr(0L),
        hPrintTemplateCtorArg = MutPtr(0L),
        hSetupTemplateCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hDevMode: Hglobal = MutPtr(0L),
            hDevNames: Hglobal = MutPtr(0L),
            hDC: Hdc = MutPtr(0L),
            flags: PrintdlgexFlags = 0u,
            nFromPage: UShort = 0u,
            nToPage: UShort = 0u,
            nMinPage: UShort = 0u,
            nMaxPage: UShort = 0u,
            nCopies: UShort = 0u,
            hInstance: Hinstance = MutPtr(0L),
            lCustData: Lparam = 0L,
            lpfnPrintHook: Lpprinthookproc = null,
            lpfnSetupHook: Lpsetuphookproc = null,
            lpPrintTemplateName: Pcstr = ConstPtr(0L),
            lpSetupTemplateName: Pcstr = ConstPtr(0L),
            hPrintTemplate: Hglobal = MutPtr(0L),
            hSetupTemplate: Hglobal = MutPtr(0L),
        ): Printdlga =
            Printdlga(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hDevModeCtorArg = hDevMode,
                hDevNamesCtorArg = hDevNames,
                hDCCtorArg = hDC,
                flags = flags,
                nFromPage = nFromPage,
                nToPage = nToPage,
                nMinPage = nMinPage,
                nMaxPage = nMaxPage,
                nCopies = nCopies,
                hInstanceCtorArg = hInstance,
                lCustData = lCustData,
                lpfnPrintHook = lpfnPrintHook,
                lpfnSetupHook = lpfnSetupHook,
                lpPrintTemplateNameCtorArg = lpPrintTemplateName,
                lpSetupTemplateNameCtorArg = lpSetupTemplateName,
                hPrintTemplateCtorArg = hPrintTemplate,
                hSetupTemplateCtorArg = hSetupTemplate,
            )
    }
}

public class Printdlgexa internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hDevModeCtorArg: Hglobal,
    hDevNamesCtorArg: Hglobal,
    hDCCtorArg: Hdc,
    public var flags: PrintdlgexFlags,
    public var flags2: UInt,
    public var exclusionFlags: UInt,
    public var nPageRanges: UInt,
    public var nMaxPageRanges: UInt,
    lpPageRangesCtorArg: MutPtr<Printpagerange>,
    public var nMinPage: UInt,
    public var nMaxPage: UInt,
    public var nCopies: UInt,
    hInstanceCtorArg: Hinstance,
    lpPrintTemplateNameCtorArg: Pcstr,
    lpCallbackCtorArg: MutPtr<CVoid>,
    public var nPropertyPages: UInt,
    lphPropertyPagesCtorArg: MutPtr<Hpropsheetpage>,
    public var nStartPage: UInt,
    public var dwResultAction: UInt,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hDevMode: Hglobal = hDevModeCtorArg
        internal set

    public var hDevNames: Hglobal = hDevNamesCtorArg
        internal set

    public var hDC: Hdc = hDCCtorArg
        internal set

    public var lpPageRanges: MutPtr<Printpagerange> = lpPageRangesCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpPrintTemplateName: Pcstr = lpPrintTemplateNameCtorArg
        internal set

    public var lpCallback: MutPtr<CVoid> = lpCallbackCtorArg
        internal set

    public var lphPropertyPages: MutPtr<Hpropsheetpage> = lphPropertyPagesCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hDevModeCtorArg = MutPtr(0L),
        hDevNamesCtorArg = MutPtr(0L),
        hDCCtorArg = MutPtr(0L),
        flags = 0u,
        flags2 = 0u,
        exclusionFlags = 0u,
        nPageRanges = 0u,
        nMaxPageRanges = 0u,
        lpPageRangesCtorArg = MutPtr(0L),
        nMinPage = 0u,
        nMaxPage = 0u,
        nCopies = 0u,
        hInstanceCtorArg = MutPtr(0L),
        lpPrintTemplateNameCtorArg = ConstPtr(0L),
        lpCallbackCtorArg = MutPtr(0L),
        nPropertyPages = 0u,
        lphPropertyPagesCtorArg = MutPtr(0L),
        nStartPage = 0u,
        dwResultAction = 0u,
    )

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hDevMode: Hglobal = MutPtr(0L),
            hDevNames: Hglobal = MutPtr(0L),
            hDC: Hdc = MutPtr(0L),
            flags: PrintdlgexFlags = 0u,
            flags2: UInt = 0u,
            exclusionFlags: UInt = 0u,
            nPageRanges: UInt = 0u,
            nMaxPageRanges: UInt = 0u,
            lpPageRanges: MutPtr<Printpagerange> = MutPtr(0L),
            nMinPage: UInt = 0u,
            nMaxPage: UInt = 0u,
            nCopies: UInt = 0u,
            hInstance: Hinstance = MutPtr(0L),
            lpPrintTemplateName: Pcstr = ConstPtr(0L),
            lpCallback: MutPtr<CVoid> = MutPtr(0L),
            nPropertyPages: UInt = 0u,
            lphPropertyPages: MutPtr<Hpropsheetpage> = MutPtr(0L),
            nStartPage: UInt = 0u,
            dwResultAction: UInt = 0u,
        ): Printdlgexa =
            Printdlgexa(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hDevModeCtorArg = hDevMode,
                hDevNamesCtorArg = hDevNames,
                hDCCtorArg = hDC,
                flags = flags,
                flags2 = flags2,
                exclusionFlags = exclusionFlags,
                nPageRanges = nPageRanges,
                nMaxPageRanges = nMaxPageRanges,
                lpPageRangesCtorArg = lpPageRanges,
                nMinPage = nMinPage,
                nMaxPage = nMaxPage,
                nCopies = nCopies,
                hInstanceCtorArg = hInstance,
                lpPrintTemplateNameCtorArg = lpPrintTemplateName,
                lpCallbackCtorArg = lpCallback,
                nPropertyPages = nPropertyPages,
                lphPropertyPagesCtorArg = lphPropertyPages,
                nStartPage = nStartPage,
                dwResultAction = dwResultAction,
            )
    }
}

public class Printdlgexw internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hDevModeCtorArg: Hglobal,
    hDevNamesCtorArg: Hglobal,
    hDCCtorArg: Hdc,
    public var flags: PrintdlgexFlags,
    public var flags2: UInt,
    public var exclusionFlags: UInt,
    public var nPageRanges: UInt,
    public var nMaxPageRanges: UInt,
    lpPageRangesCtorArg: MutPtr<Printpagerange>,
    public var nMinPage: UInt,
    public var nMaxPage: UInt,
    public var nCopies: UInt,
    hInstanceCtorArg: Hinstance,
    lpPrintTemplateNameCtorArg: Pcwstr,
    lpCallbackCtorArg: MutPtr<CVoid>,
    public var nPropertyPages: UInt,
    lphPropertyPagesCtorArg: MutPtr<Hpropsheetpage>,
    public var nStartPage: UInt,
    public var dwResultAction: UInt,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hDevMode: Hglobal = hDevModeCtorArg
        internal set

    public var hDevNames: Hglobal = hDevNamesCtorArg
        internal set

    public var hDC: Hdc = hDCCtorArg
        internal set

    public var lpPageRanges: MutPtr<Printpagerange> = lpPageRangesCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpPrintTemplateName: Pcwstr = lpPrintTemplateNameCtorArg
        internal set

    public var lpCallback: MutPtr<CVoid> = lpCallbackCtorArg
        internal set

    public var lphPropertyPages: MutPtr<Hpropsheetpage> = lphPropertyPagesCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hDevModeCtorArg = MutPtr(0L),
        hDevNamesCtorArg = MutPtr(0L),
        hDCCtorArg = MutPtr(0L),
        flags = 0u,
        flags2 = 0u,
        exclusionFlags = 0u,
        nPageRanges = 0u,
        nMaxPageRanges = 0u,
        lpPageRangesCtorArg = MutPtr(0L),
        nMinPage = 0u,
        nMaxPage = 0u,
        nCopies = 0u,
        hInstanceCtorArg = MutPtr(0L),
        lpPrintTemplateNameCtorArg = ConstPtr(0L),
        lpCallbackCtorArg = MutPtr(0L),
        nPropertyPages = 0u,
        lphPropertyPagesCtorArg = MutPtr(0L),
        nStartPage = 0u,
        dwResultAction = 0u,
    )

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hDevMode: Hglobal = MutPtr(0L),
            hDevNames: Hglobal = MutPtr(0L),
            hDC: Hdc = MutPtr(0L),
            flags: PrintdlgexFlags = 0u,
            flags2: UInt = 0u,
            exclusionFlags: UInt = 0u,
            nPageRanges: UInt = 0u,
            nMaxPageRanges: UInt = 0u,
            lpPageRanges: MutPtr<Printpagerange> = MutPtr(0L),
            nMinPage: UInt = 0u,
            nMaxPage: UInt = 0u,
            nCopies: UInt = 0u,
            hInstance: Hinstance = MutPtr(0L),
            lpPrintTemplateName: Pcwstr = ConstPtr(0L),
            lpCallback: MutPtr<CVoid> = MutPtr(0L),
            nPropertyPages: UInt = 0u,
            lphPropertyPages: MutPtr<Hpropsheetpage> = MutPtr(0L),
            nStartPage: UInt = 0u,
            dwResultAction: UInt = 0u,
        ): Printdlgexw =
            Printdlgexw(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hDevModeCtorArg = hDevMode,
                hDevNamesCtorArg = hDevNames,
                hDCCtorArg = hDC,
                flags = flags,
                flags2 = flags2,
                exclusionFlags = exclusionFlags,
                nPageRanges = nPageRanges,
                nMaxPageRanges = nMaxPageRanges,
                lpPageRangesCtorArg = lpPageRanges,
                nMinPage = nMinPage,
                nMaxPage = nMaxPage,
                nCopies = nCopies,
                hInstanceCtorArg = hInstance,
                lpPrintTemplateNameCtorArg = lpPrintTemplateName,
                lpCallbackCtorArg = lpCallback,
                nPropertyPages = nPropertyPages,
                lphPropertyPagesCtorArg = lphPropertyPages,
                nStartPage = nStartPage,
                dwResultAction = dwResultAction,
            )
    }
}

public class Printdlgw internal constructor(
    public var lStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hDevModeCtorArg: Hglobal,
    hDevNamesCtorArg: Hglobal,
    hDCCtorArg: Hdc,
    public var flags: PrintdlgexFlags,
    public var nFromPage: UShort,
    public var nToPage: UShort,
    public var nMinPage: UShort,
    public var nMaxPage: UShort,
    public var nCopies: UShort,
    hInstanceCtorArg: Hinstance,
    public var lCustData: Lparam,
    public var lpfnPrintHook: Lpprinthookproc,
    public var lpfnSetupHook: Lpsetuphookproc,
    lpPrintTemplateNameCtorArg: Pcwstr,
    lpSetupTemplateNameCtorArg: Pcwstr,
    hPrintTemplateCtorArg: Hglobal,
    hSetupTemplateCtorArg: Hglobal,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hDevMode: Hglobal = hDevModeCtorArg
        internal set

    public var hDevNames: Hglobal = hDevNamesCtorArg
        internal set

    public var hDC: Hdc = hDCCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpPrintTemplateName: Pcwstr = lpPrintTemplateNameCtorArg
        internal set

    public var lpSetupTemplateName: Pcwstr = lpSetupTemplateNameCtorArg
        internal set

    public var hPrintTemplate: Hglobal = hPrintTemplateCtorArg
        internal set

    public var hSetupTemplate: Hglobal = hSetupTemplateCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hDevModeCtorArg = MutPtr(0L),
        hDevNamesCtorArg = MutPtr(0L),
        hDCCtorArg = MutPtr(0L),
        flags = 0u,
        nFromPage = 0u,
        nToPage = 0u,
        nMinPage = 0u,
        nMaxPage = 0u,
        nCopies = 0u,
        hInstanceCtorArg = MutPtr(0L),
        lCustData = 0L,
        lpfnPrintHook = null,
        lpfnSetupHook = null,
        lpPrintTemplateNameCtorArg = ConstPtr(0L),
        lpSetupTemplateNameCtorArg = ConstPtr(0L),
        hPrintTemplateCtorArg = MutPtr(0L),
        hSetupTemplateCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hDevMode: Hglobal = MutPtr(0L),
            hDevNames: Hglobal = MutPtr(0L),
            hDC: Hdc = MutPtr(0L),
            flags: PrintdlgexFlags = 0u,
            nFromPage: UShort = 0u,
            nToPage: UShort = 0u,
            nMinPage: UShort = 0u,
            nMaxPage: UShort = 0u,
            nCopies: UShort = 0u,
            hInstance: Hinstance = MutPtr(0L),
            lCustData: Lparam = 0L,
            lpfnPrintHook: Lpprinthookproc = null,
            lpfnSetupHook: Lpsetuphookproc = null,
            lpPrintTemplateName: Pcwstr = ConstPtr(0L),
            lpSetupTemplateName: Pcwstr = ConstPtr(0L),
            hPrintTemplate: Hglobal = MutPtr(0L),
            hSetupTemplate: Hglobal = MutPtr(0L),
        ): Printdlgw =
            Printdlgw(
                lStructSize = lStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hDevModeCtorArg = hDevMode,
                hDevNamesCtorArg = hDevNames,
                hDCCtorArg = hDC,
                flags = flags,
                nFromPage = nFromPage,
                nToPage = nToPage,
                nMinPage = nMinPage,
                nMaxPage = nMaxPage,
                nCopies = nCopies,
                hInstanceCtorArg = hInstance,
                lCustData = lCustData,
                lpfnPrintHook = lpfnPrintHook,
                lpfnSetupHook = lpfnSetupHook,
                lpPrintTemplateNameCtorArg = lpPrintTemplateName,
                lpSetupTemplateNameCtorArg = lpSetupTemplateName,
                hPrintTemplateCtorArg = hPrintTemplate,
                hSetupTemplateCtorArg = hSetupTemplate,
            )
    }
}

public data class Printpagerange(
    public var nFromPage: UInt = 0u,
    public var nToPage: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Printpagerange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Printpagerange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Printpagerange =
                    Printpagerange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Printpagerange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nFromPage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nToPage)
                }
            }
    }
}
