@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Nmhdr

public data class Columnstatus(
    public var cPropCount: Int = 0,
    public var cPropsLoaded: Int = 0,
)

public data class CProperty(
    public var dwPropID: UInt = 0u,
    public var cbData: UInt = 0u,
    public var dwType: UInt = 0u,
    public var anonymous: Cproperty0 = Cproperty0(),
    public var fPersist: Bool = 0,
)

public data class Cproperty0(
    public var lpszwData: Pwstr = null,
    public var lpvData: COpaquePointer? = null,
    public var dwValue: UInt = 0u,
)

public data class Hhntrack(
    public var hdr: Nmhdr = Nmhdr(),
    public var pszCurUrl: Pcstr = null,
    public var idAction: Int = 0,
    public var phhWinType: HhWintype? = null,
)

public data class HhnNotify(
    public var hdr: Nmhdr = Nmhdr(),
    public var pszUrl: Pcstr = null,
)

public data class HhAklink(
    public var cbStruct: Int = 0,
    public var fReserved: Bool = 0,
    public var pszKeywords: COpaquePointer? = null,
    public var pszUrl: COpaquePointer? = null,
    public var pszMsgText: COpaquePointer? = null,
    public var pszMsgTitle: COpaquePointer? = null,
    public var pszWindow: COpaquePointer? = null,
    public var fIndexOnFail: Bool = 0,
)

public data class HhEnumCat(
    public var cbStruct: Int = 0,
    public var pszCatName: Pcstr = null,
    public var pszCatDescription: Pcstr = null,
)

public data class HhEnumIt(
    public var cbStruct: Int = 0,
    public var iType: Int = 0,
    public var pszCatName: Pcstr = null,
    public var pszITName: Pcstr = null,
    public var pszITDescription: Pcstr = null,
)

public data class HhFtsQuery(
    public var cbStruct: Int = 0,
    public var fUniCodeStrings: Bool = 0,
    public var pszSearchQuery: COpaquePointer? = null,
    public var iProximity: Int = 0,
    public var fStemmedSearch: Bool = 0,
    public var fTitleOnly: Bool = 0,
    public var fExecute: Bool = 0,
    public var pszWindow: COpaquePointer? = null,
)

public data class HhGlobalProperty(
    public var id: HhGpropid = 0,
    public var variable: Variant = Variant(),
)

public data class HhPopup(
    public var cbStruct: Int = 0,
    public var hinst: Hinstance = null,
    public var idString: UInt = 0u,
    public var pszText: COpaquePointer? = null,
    public var pt: Point = Point(),
    public var clrForeground: Colorref = 0u,
    public var clrBackground: Colorref = 0u,
    public var rcMargins: Rect = Rect(),
    public var pszFont: COpaquePointer? = null,
)

public data class HhSetInfotype(
    public var cbStruct: Int = 0,
    public var pszCatName: Pcstr = null,
    public var pszInfoTypeName: Pcstr = null,
)

public class HhWintype(
    public var cbStruct: Int = 0,
    public var fUniCodeStrings: Bool = 0,
    public var pszType: COpaquePointer? = null,
    public var fsValidMembers: UInt = 0u,
    public var fsWinProperties: UInt = 0u,
    public var pszCaption: COpaquePointer? = null,
    public var dwStyles: UInt = 0u,
    public var dwExStyles: UInt = 0u,
    public var rcWindowPos: Rect = Rect(),
    public var nShowState: Int = 0,
    public var hwndHelp: Hwnd = null,
    public var hwndCaller: Hwnd = null,
    public var paInfoTypes: UInt? = null,
    public var hwndToolBar: Hwnd = null,
    public var hwndNavigation: Hwnd = null,
    public var hwndHTML: Hwnd = null,
    public var iNavWidth: Int = 0,
    public var rcHTML: Rect = Rect(),
    public var pszToc: COpaquePointer? = null,
    public var pszIndex: COpaquePointer? = null,
    public var pszFile: COpaquePointer? = null,
    public var pszHome: COpaquePointer? = null,
    public var fsToolBarFlags: UInt = 0u,
    public var fNotExpanded: Bool = 0,
    public var curNavType: Int = 0,
    public var tabpos: Int = 0,
    public var idNotify: Int = 0,
    public var tabOrder: UByteArray = UByteArray(20),
    public var cHistory: Int = 0,
    public var pszJump1: COpaquePointer? = null,
    public var pszJump2: COpaquePointer? = null,
    public var pszUrlJump1: COpaquePointer? = null,
    public var pszUrlJump2: COpaquePointer? = null,
    public var rcMinSize: Rect = Rect(),
    public var cbInfoTypes: Int = 0,
    public var pszCustomTabs: COpaquePointer? = null,
)

public data class Rowstatus(
    public var lRowFirst: Int = 0,
    public var cRows: Int = 0,
    public var cProperties: Int = 0,
    public var cRowsTotal: Int = 0,
)
