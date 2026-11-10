package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.COpaquePointer
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

public data class Choosecolora(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hInstance: Hwnd = null,
    public var rgbResult: Colorref = 0u,
    public var lpCustColors: Colorref? = null,
    public var flags: ChoosecolorFlags = 0u,
    public var lCustData: Lparam = 0L,
    public var lpfnHook: Lpcchookproc = null,
    public var lpTemplateName: Pcstr = null,
)

public data class Choosecolorw(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hInstance: Hwnd = null,
    public var rgbResult: Colorref = 0u,
    public var lpCustColors: Colorref? = null,
    public var flags: ChoosecolorFlags = 0u,
    public var lCustData: Lparam = 0L,
    public var lpfnHook: Lpcchookproc = null,
    public var lpTemplateName: Pcwstr = null,
)

public data class Choosefonta(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hDC: Hdc = null,
    public var lpLogFont: Logfonta? = null,
    public var iPointSize: Int = 0,
    public var flags: ChoosefontFlags = 0u,
    public var rgbColors: Colorref = 0u,
    public var lCustData: Lparam = 0L,
    public var lpfnHook: Lpcfhookproc = null,
    public var lpTemplateName: Pcstr = null,
    public var hInstance: Hinstance = null,
    public var lpszStyle: Pstr = null,
    public var nFontType: ChoosefontFontType = 0u,
    public var missingAlignment: UShort = 0u,
    public var nSizeMin: Int = 0,
    public var nSizeMax: Int = 0,
)

public data class Choosefontw(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hDC: Hdc = null,
    public var lpLogFont: Logfontw? = null,
    public var iPointSize: Int = 0,
    public var flags: ChoosefontFlags = 0u,
    public var rgbColors: Colorref = 0u,
    public var lCustData: Lparam = 0L,
    public var lpfnHook: Lpcfhookproc = null,
    public var lpTemplateName: Pcwstr = null,
    public var hInstance: Hinstance = null,
    public var lpszStyle: Pwstr = null,
    public var nFontType: ChoosefontFontType = 0u,
    public var missingAlignment: UShort = 0u,
    public var nSizeMin: Int = 0,
    public var nSizeMax: Int = 0,
)

public data class Devnames(
    public var wDriverOffset: UShort = 0u,
    public var wDeviceOffset: UShort = 0u,
    public var wOutputOffset: UShort = 0u,
    public var wDefault: UShort = 0u,
)

public data class Findreplacea(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var flags: FindreplaceFlags = 0u,
    public var lpstrFindWhat: Pstr = null,
    public var lpstrReplaceWith: Pstr = null,
    public var wFindWhatLen: UShort = 0u,
    public var wReplaceWithLen: UShort = 0u,
    public var lCustData: Lparam = 0L,
    public var lpfnHook: Lpfrhookproc = null,
    public var lpTemplateName: Pcstr = null,
)

public data class Findreplacew(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var flags: FindreplaceFlags = 0u,
    public var lpstrFindWhat: Pwstr = null,
    public var lpstrReplaceWith: Pwstr = null,
    public var wFindWhatLen: UShort = 0u,
    public var wReplaceWithLen: UShort = 0u,
    public var lCustData: Lparam = 0L,
    public var lpfnHook: Lpfrhookproc = null,
    public var lpTemplateName: Pcwstr = null,
)

public data class Ofnotifya(
    public var hdr: Nmhdr = Nmhdr(),
    public var lpOFN: Openfilenamea? = null,
    public var pszFile: Pstr = null,
)

public data class Ofnotifyexa(
    public var hdr: Nmhdr = Nmhdr(),
    public var lpOFN: Openfilenamea? = null,
    public var psf: COpaquePointer? = null,
    public var pidl: COpaquePointer? = null,
)

public data class Ofnotifyexw(
    public var hdr: Nmhdr = Nmhdr(),
    public var lpOFN: Openfilenamew? = null,
    public var psf: COpaquePointer? = null,
    public var pidl: COpaquePointer? = null,
)

public data class Ofnotifyw(
    public var hdr: Nmhdr = Nmhdr(),
    public var lpOFN: Openfilenamew? = null,
    public var pszFile: Pwstr = null,
)

public class Openfilenamea(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var lpstrFilter: Pcstr = null,
    public var lpstrCustomFilter: Pstr = null,
    public var nMaxCustFilter: UInt = 0u,
    public var nFilterIndex: UInt = 0u,
    public var lpstrFile: Pstr = null,
    public var nMaxFile: UInt = 0u,
    public var lpstrFileTitle: Pstr = null,
    public var nMaxFileTitle: UInt = 0u,
    public var lpstrInitialDir: Pcstr = null,
    public var lpstrTitle: Pcstr = null,
    public var flags: OpenFilenameFlags = 0u,
    public var nFileOffset: UShort = 0u,
    public var nFileExtension: UShort = 0u,
    public var lpstrDefExt: Pcstr = null,
    public var lCustData: Lparam = 0L,
    public var lpfnHook: Lpofnhookproc = null,
    public var lpTemplateName: Pcstr = null,
    public var pvReserved: COpaquePointer? = null,
    public var dwReserved: UInt = 0u,
    public var flagsEx: OpenFilenameFlagsEx = 0u,
)

public class Openfilenamew(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var lpstrFilter: Pcwstr = null,
    public var lpstrCustomFilter: Pwstr = null,
    public var nMaxCustFilter: UInt = 0u,
    public var nFilterIndex: UInt = 0u,
    public var lpstrFile: Pwstr = null,
    public var nMaxFile: UInt = 0u,
    public var lpstrFileTitle: Pwstr = null,
    public var nMaxFileTitle: UInt = 0u,
    public var lpstrInitialDir: Pcwstr = null,
    public var lpstrTitle: Pcwstr = null,
    public var flags: OpenFilenameFlags = 0u,
    public var nFileOffset: UShort = 0u,
    public var nFileExtension: UShort = 0u,
    public var lpstrDefExt: Pcwstr = null,
    public var lCustData: Lparam = 0L,
    public var lpfnHook: Lpofnhookproc = null,
    public var lpTemplateName: Pcwstr = null,
    public var pvReserved: COpaquePointer? = null,
    public var dwReserved: UInt = 0u,
    public var flagsEx: OpenFilenameFlagsEx = 0u,
)

public class OpenfilenameNt4a(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var lpstrFilter: Pcstr = null,
    public var lpstrCustomFilter: Pstr = null,
    public var nMaxCustFilter: UInt = 0u,
    public var nFilterIndex: UInt = 0u,
    public var lpstrFile: Pstr = null,
    public var nMaxFile: UInt = 0u,
    public var lpstrFileTitle: Pstr = null,
    public var nMaxFileTitle: UInt = 0u,
    public var lpstrInitialDir: Pcstr = null,
    public var lpstrTitle: Pcstr = null,
    public var flags: UInt = 0u,
    public var nFileOffset: UShort = 0u,
    public var nFileExtension: UShort = 0u,
    public var lpstrDefExt: Pcstr = null,
    public var lCustData: Lparam = 0L,
    public var lpfnHook: Lpofnhookproc = null,
    public var lpTemplateName: Pcstr = null,
)

public class OpenfilenameNt4w(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var lpstrFilter: Pcwstr = null,
    public var lpstrCustomFilter: Pwstr = null,
    public var nMaxCustFilter: UInt = 0u,
    public var nFilterIndex: UInt = 0u,
    public var lpstrFile: Pwstr = null,
    public var nMaxFile: UInt = 0u,
    public var lpstrFileTitle: Pwstr = null,
    public var nMaxFileTitle: UInt = 0u,
    public var lpstrInitialDir: Pcwstr = null,
    public var lpstrTitle: Pcwstr = null,
    public var flags: UInt = 0u,
    public var nFileOffset: UShort = 0u,
    public var nFileExtension: UShort = 0u,
    public var lpstrDefExt: Pcwstr = null,
    public var lCustData: Lparam = 0L,
    public var lpfnHook: Lpofnhookproc = null,
    public var lpTemplateName: Pcwstr = null,
)

public data class Pagesetupdlga(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hDevMode: Hglobal = null,
    public var hDevNames: Hglobal = null,
    public var flags: PagesetupdlgFlags = 0u,
    public var ptPaperSize: Point = Point(),
    public var rtMinMargin: Rect = Rect(),
    public var rtMargin: Rect = Rect(),
    public var hInstance: Hinstance = null,
    public var lCustData: Lparam = 0L,
    public var lpfnPageSetupHook: Lppagesetuphook = null,
    public var lpfnPagePaintHook: Lppagepainthook = null,
    public var lpPageSetupTemplateName: Pcstr = null,
    public var hPageSetupTemplate: Hglobal = null,
)

public data class Pagesetupdlgw(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hDevMode: Hglobal = null,
    public var hDevNames: Hglobal = null,
    public var flags: PagesetupdlgFlags = 0u,
    public var ptPaperSize: Point = Point(),
    public var rtMinMargin: Rect = Rect(),
    public var rtMargin: Rect = Rect(),
    public var hInstance: Hinstance = null,
    public var lCustData: Lparam = 0L,
    public var lpfnPageSetupHook: Lppagesetuphook = null,
    public var lpfnPagePaintHook: Lppagepainthook = null,
    public var lpPageSetupTemplateName: Pcwstr = null,
    public var hPageSetupTemplate: Hglobal = null,
)

public class Printdlga(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hDevMode: Hglobal = null,
    public var hDevNames: Hglobal = null,
    public var hDC: Hdc = null,
    public var flags: PrintdlgexFlags = 0u,
    public var nFromPage: UShort = 0u,
    public var nToPage: UShort = 0u,
    public var nMinPage: UShort = 0u,
    public var nMaxPage: UShort = 0u,
    public var nCopies: UShort = 0u,
    public var hInstance: Hinstance = null,
    public var lCustData: Lparam = 0L,
    public var lpfnPrintHook: Lpprinthookproc = null,
    public var lpfnSetupHook: Lpsetuphookproc = null,
    public var lpPrintTemplateName: Pcstr = null,
    public var lpSetupTemplateName: Pcstr = null,
    public var hPrintTemplate: Hglobal = null,
    public var hSetupTemplate: Hglobal = null,
)

public class Printdlgexa(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hDevMode: Hglobal = null,
    public var hDevNames: Hglobal = null,
    public var hDC: Hdc = null,
    public var flags: PrintdlgexFlags = 0u,
    public var flags2: UInt = 0u,
    public var exclusionFlags: UInt = 0u,
    public var nPageRanges: UInt = 0u,
    public var nMaxPageRanges: UInt = 0u,
    public var lpPageRanges: Printpagerange? = null,
    public var nMinPage: UInt = 0u,
    public var nMaxPage: UInt = 0u,
    public var nCopies: UInt = 0u,
    public var hInstance: Hinstance = null,
    public var lpPrintTemplateName: Pcstr = null,
    public var lpCallback: COpaquePointer? = null,
    public var nPropertyPages: UInt = 0u,
    public var lphPropertyPages: Hpropsheetpage? = null,
    public var nStartPage: UInt = 0u,
    public var dwResultAction: UInt = 0u,
)

public class Printdlgexw(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hDevMode: Hglobal = null,
    public var hDevNames: Hglobal = null,
    public var hDC: Hdc = null,
    public var flags: PrintdlgexFlags = 0u,
    public var flags2: UInt = 0u,
    public var exclusionFlags: UInt = 0u,
    public var nPageRanges: UInt = 0u,
    public var nMaxPageRanges: UInt = 0u,
    public var lpPageRanges: Printpagerange? = null,
    public var nMinPage: UInt = 0u,
    public var nMaxPage: UInt = 0u,
    public var nCopies: UInt = 0u,
    public var hInstance: Hinstance = null,
    public var lpPrintTemplateName: Pcwstr = null,
    public var lpCallback: COpaquePointer? = null,
    public var nPropertyPages: UInt = 0u,
    public var lphPropertyPages: Hpropsheetpage? = null,
    public var nStartPage: UInt = 0u,
    public var dwResultAction: UInt = 0u,
)

public class Printdlgw(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hDevMode: Hglobal = null,
    public var hDevNames: Hglobal = null,
    public var hDC: Hdc = null,
    public var flags: PrintdlgexFlags = 0u,
    public var nFromPage: UShort = 0u,
    public var nToPage: UShort = 0u,
    public var nMinPage: UShort = 0u,
    public var nMaxPage: UShort = 0u,
    public var nCopies: UShort = 0u,
    public var hInstance: Hinstance = null,
    public var lCustData: Lparam = 0L,
    public var lpfnPrintHook: Lpprinthookproc = null,
    public var lpfnSetupHook: Lpsetuphookproc = null,
    public var lpPrintTemplateName: Pcwstr = null,
    public var lpSetupTemplateName: Pcwstr = null,
    public var hPrintTemplate: Hglobal = null,
    public var hSetupTemplate: Hglobal = null,
)

public data class Printpagerange(public var nFromPage: UInt = 0u, public var nToPage: UInt = 0u)
