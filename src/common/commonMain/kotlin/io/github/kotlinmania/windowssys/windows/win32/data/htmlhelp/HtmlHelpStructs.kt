@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class COLUMNSTATUS(public var cPropCount: Int = 0, public var cPropsLoaded: Int = 0)

public data class CProperty(
    public var dwPropID: UInt = 0u,
    public var cbData: UInt = 0u,
    public var dwType: UInt = 0u,
    public var Anonymous: CProperty_0 = CProperty_0(),
    public var fPersist: BOOL = 0,
)

public data class CProperty_0(
    public var lpszwData: PWSTR = 0L,
    public var lpvData: Long = 0L,
    public var dwValue: UInt = 0u,
)

public data class HHNTRACK(
    public var hdr: UI.Controls.NMHDR = UI.Controls.NMHDR(),
    public var pszCurUrl: PCSTR = 0L,
    public var idAction: Int = 0,
    public var phhWinType: Long = 0L,
)

public data class HHN_NOTIFY(public var hdr: UI.Controls.NMHDR = UI.Controls.NMHDR(), public var pszUrl: PCSTR = 0L)

public data class HH_AKLINK(
    public var cbStruct: Int = 0,
    public var fReserved: BOOL = 0,
    public var pszKeywords: Long = 0L,
    public var pszUrl: Long = 0L,
    public var pszMsgText: Long = 0L,
    public var pszMsgTitle: Long = 0L,
    public var pszWindow: Long = 0L,
    public var fIndexOnFail: BOOL = 0,
)

public data class HH_ENUM_CAT(
    public var cbStruct: Int = 0,
    public var pszCatName: PCSTR = 0L,
    public var pszCatDescription: PCSTR = 0L,
)

public data class HH_ENUM_IT(
    public var cbStruct: Int = 0,
    public var iType: Int = 0,
    public var pszCatName: PCSTR = 0L,
    public var pszITName: PCSTR = 0L,
    public var pszITDescription: PCSTR = 0L,
)

public data class HH_FTS_QUERY(
    public var cbStruct: Int = 0,
    public var fUniCodeStrings: BOOL = 0,
    public var pszSearchQuery: Long = 0L,
    public var iProximity: Int = 0,
    public var fStemmedSearch: BOOL = 0,
    public var fTitleOnly: BOOL = 0,
    public var fExecute: BOOL = 0,
    public var pszWindow: Long = 0L,
)

public data class HH_GLOBAL_PROPERTY(public var id: HH_GPROPID = 0, public var variable: System.Variant.VARIANT = System.Variant.VARIANT())

public data class HH_POPUP(
    public var cbStruct: Int = 0,
    public var hinst: Foundation.HINSTANCE = Foundation.HINSTANCE(),
    public var idString: UInt = 0u,
    public var pszText: Long = 0L,
    public var pt: Foundation.POINT = Foundation.POINT(),
    public var clrForeground: Foundation.COLORREF = Foundation.COLORREF(),
    public var clrBackground: Foundation.COLORREF = Foundation.COLORREF(),
    public var rcMargins: Foundation.RECT = Foundation.RECT(),
    public var pszFont: Long = 0L,
)

public data class HH_SET_INFOTYPE(
    public var cbStruct: Int = 0,
    public var pszCatName: PCSTR = 0L,
    public var pszInfoTypeName: PCSTR = 0L,
)

public class HH_WINTYPE(
    public var cbStruct: Int = 0,
    public var fUniCodeStrings: BOOL = 0,
    public var pszType: Long = 0L,
    public var fsValidMembers: UInt = 0u,
    public var fsWinProperties: UInt = 0u,
    public var pszCaption: Long = 0L,
    public var dwStyles: UInt = 0u,
    public var dwExStyles: UInt = 0u,
    public var rcWindowPos: Foundation.RECT = Foundation.RECT(),
    public var nShowState: Int = 0,
    public var hwndHelp: Foundation.HWND = Foundation.HWND(),
    public var hwndCaller: Foundation.HWND = Foundation.HWND(),
    public var paInfoTypes: Long = 0L,
    public var hwndToolBar: Foundation.HWND = Foundation.HWND(),
    public var hwndNavigation: Foundation.HWND = Foundation.HWND(),
    public var hwndHTML: Foundation.HWND = Foundation.HWND(),
    public var iNavWidth: Int = 0,
    public var rcHTML: Foundation.RECT = Foundation.RECT(),
    public var pszToc: Long = 0L,
    public var pszIndex: Long = 0L,
    public var pszFile: Long = 0L,
    public var pszHome: Long = 0L,
    public var fsToolBarFlags: UInt = 0u,
    public var fNotExpanded: BOOL = 0,
    public var curNavType: Int = 0,
    public var tabpos: Int = 0,
    public var idNotify: Int = 0,
    public var tabOrder: UByteArray = UByteArray(20),
    public var cHistory: Int = 0,
    public var pszJump1: Long = 0L,
    public var pszJump2: Long = 0L,
    public var pszUrlJump1: Long = 0L,
    public var pszUrlJump2: Long = 0L,
    public var rcMinSize: Foundation.RECT = Foundation.RECT(),
    public var cbInfoTypes: Int = 0,
    public var pszCustomTabs: Long = 0L,
)

public data class ROWSTATUS(
    public var lRowFirst: Int = 0,
    public var cRows: Int = 0,
    public var cProperties: Int = 0,
    public var cRowsTotal: Int = 0,
)
