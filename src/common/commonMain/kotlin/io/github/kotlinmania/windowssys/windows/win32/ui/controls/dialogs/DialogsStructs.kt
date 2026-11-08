package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.COLORREF
import io.github.kotlinmania.windowssys.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.NMHDR

public data class CHOOSECOLORA(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hInstance: HWND = 0L,
    public var rgbResult: COLORREF = 0u,
    public var lpCustColors: Long = 0L,
    public var Flags: CHOOSECOLOR_FLAGS = 0u,
    public var lCustData: LPARAM = 0L,
    public var lpfnHook: LPCCHOOKPROC = null,
    public var lpTemplateName: PCSTR = 0L,
)

public data class CHOOSECOLORW(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hInstance: HWND = 0L,
    public var rgbResult: COLORREF = 0u,
    public var lpCustColors: Long = 0L,
    public var Flags: CHOOSECOLOR_FLAGS = 0u,
    public var lCustData: LPARAM = 0L,
    public var lpfnHook: LPCCHOOKPROC = null,
    public var lpTemplateName: PCWSTR = 0L,
)

public data class CHOOSEFONTA(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hDC: HDC = 0L,
    public var lpLogFont: Long = 0L,
    public var iPointSize: Int = 0,
    public var Flags: CHOOSEFONT_FLAGS = 0u,
    public var rgbColors: COLORREF = 0u,
    public var lCustData: LPARAM = 0L,
    public var lpfnHook: LPCFHOOKPROC = null,
    public var lpTemplateName: PCSTR = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszStyle: PSTR = 0L,
    public var nFontType: CHOOSEFONT_FONT_TYPE = 0u,
    public var ___MISSING_ALIGNMENT__: UShort = 0u,
    public var nSizeMin: Int = 0,
    public var nSizeMax: Int = 0,
)

public data class CHOOSEFONTW(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hDC: HDC = 0L,
    public var lpLogFont: Long = 0L,
    public var iPointSize: Int = 0,
    public var Flags: CHOOSEFONT_FLAGS = 0u,
    public var rgbColors: COLORREF = 0u,
    public var lCustData: LPARAM = 0L,
    public var lpfnHook: LPCFHOOKPROC = null,
    public var lpTemplateName: PCWSTR = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszStyle: PWSTR = 0L,
    public var nFontType: CHOOSEFONT_FONT_TYPE = 0u,
    public var ___MISSING_ALIGNMENT__: UShort = 0u,
    public var nSizeMin: Int = 0,
    public var nSizeMax: Int = 0,
)

public data class DEVNAMES(
    public var wDriverOffset: UShort = 0u,
    public var wDeviceOffset: UShort = 0u,
    public var wOutputOffset: UShort = 0u,
    public var wDefault: UShort = 0u,
)

public data class FINDREPLACEA(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var Flags: FINDREPLACE_FLAGS = 0u,
    public var lpstrFindWhat: PSTR = 0L,
    public var lpstrReplaceWith: PSTR = 0L,
    public var wFindWhatLen: UShort = 0u,
    public var wReplaceWithLen: UShort = 0u,
    public var lCustData: LPARAM = 0L,
    public var lpfnHook: LPFRHOOKPROC = null,
    public var lpTemplateName: PCSTR = 0L,
)

public data class FINDREPLACEW(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var Flags: FINDREPLACE_FLAGS = 0u,
    public var lpstrFindWhat: PWSTR = 0L,
    public var lpstrReplaceWith: PWSTR = 0L,
    public var wFindWhatLen: UShort = 0u,
    public var wReplaceWithLen: UShort = 0u,
    public var lCustData: LPARAM = 0L,
    public var lpfnHook: LPFRHOOKPROC = null,
    public var lpTemplateName: PCWSTR = 0L,
)

public data class OFNOTIFYA(
    public var hdr: NMHDR = NMHDR(),
    public var lpOFN: Long = 0L,
    public var pszFile: PSTR = 0L,
)

public data class OFNOTIFYEXA(
    public var hdr: NMHDR = NMHDR(),
    public var lpOFN: Long = 0L,
    public var psf: Long = 0L,
    public var pidl: Long = 0L,
)

public data class OFNOTIFYEXW(
    public var hdr: NMHDR = NMHDR(),
    public var lpOFN: Long = 0L,
    public var psf: Long = 0L,
    public var pidl: Long = 0L,
)

public data class OFNOTIFYW(
    public var hdr: NMHDR = NMHDR(),
    public var lpOFN: Long = 0L,
    public var pszFile: PWSTR = 0L,
)

public class OPENFILENAMEA(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpstrFilter: PCSTR = 0L,
    public var lpstrCustomFilter: PSTR = 0L,
    public var nMaxCustFilter: UInt = 0u,
    public var nFilterIndex: UInt = 0u,
    public var lpstrFile: PSTR = 0L,
    public var nMaxFile: UInt = 0u,
    public var lpstrFileTitle: PSTR = 0L,
    public var nMaxFileTitle: UInt = 0u,
    public var lpstrInitialDir: PCSTR = 0L,
    public var lpstrTitle: PCSTR = 0L,
    public var Flags: OPEN_FILENAME_FLAGS = 0u,
    public var nFileOffset: UShort = 0u,
    public var nFileExtension: UShort = 0u,
    public var lpstrDefExt: PCSTR = 0L,
    public var lCustData: LPARAM = 0L,
    public var lpfnHook: LPOFNHOOKPROC = null,
    public var lpTemplateName: PCSTR = 0L,
    public var pvReserved: Long = 0L,
    public var dwReserved: UInt = 0u,
    public var FlagsEx: OPEN_FILENAME_FLAGS_EX = 0u,
)

public class OPENFILENAMEW(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpstrFilter: PCWSTR = 0L,
    public var lpstrCustomFilter: PWSTR = 0L,
    public var nMaxCustFilter: UInt = 0u,
    public var nFilterIndex: UInt = 0u,
    public var lpstrFile: PWSTR = 0L,
    public var nMaxFile: UInt = 0u,
    public var lpstrFileTitle: PWSTR = 0L,
    public var nMaxFileTitle: UInt = 0u,
    public var lpstrInitialDir: PCWSTR = 0L,
    public var lpstrTitle: PCWSTR = 0L,
    public var Flags: OPEN_FILENAME_FLAGS = 0u,
    public var nFileOffset: UShort = 0u,
    public var nFileExtension: UShort = 0u,
    public var lpstrDefExt: PCWSTR = 0L,
    public var lCustData: LPARAM = 0L,
    public var lpfnHook: LPOFNHOOKPROC = null,
    public var lpTemplateName: PCWSTR = 0L,
    public var pvReserved: Long = 0L,
    public var dwReserved: UInt = 0u,
    public var FlagsEx: OPEN_FILENAME_FLAGS_EX = 0u,
)

public class OPENFILENAME_NT4A(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpstrFilter: PCSTR = 0L,
    public var lpstrCustomFilter: PSTR = 0L,
    public var nMaxCustFilter: UInt = 0u,
    public var nFilterIndex: UInt = 0u,
    public var lpstrFile: PSTR = 0L,
    public var nMaxFile: UInt = 0u,
    public var lpstrFileTitle: PSTR = 0L,
    public var nMaxFileTitle: UInt = 0u,
    public var lpstrInitialDir: PCSTR = 0L,
    public var lpstrTitle: PCSTR = 0L,
    public var Flags: UInt = 0u,
    public var nFileOffset: UShort = 0u,
    public var nFileExtension: UShort = 0u,
    public var lpstrDefExt: PCSTR = 0L,
    public var lCustData: LPARAM = 0L,
    public var lpfnHook: LPOFNHOOKPROC = null,
    public var lpTemplateName: PCSTR = 0L,
)

public class OPENFILENAME_NT4W(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpstrFilter: PCWSTR = 0L,
    public var lpstrCustomFilter: PWSTR = 0L,
    public var nMaxCustFilter: UInt = 0u,
    public var nFilterIndex: UInt = 0u,
    public var lpstrFile: PWSTR = 0L,
    public var nMaxFile: UInt = 0u,
    public var lpstrFileTitle: PWSTR = 0L,
    public var nMaxFileTitle: UInt = 0u,
    public var lpstrInitialDir: PCWSTR = 0L,
    public var lpstrTitle: PCWSTR = 0L,
    public var Flags: UInt = 0u,
    public var nFileOffset: UShort = 0u,
    public var nFileExtension: UShort = 0u,
    public var lpstrDefExt: PCWSTR = 0L,
    public var lCustData: LPARAM = 0L,
    public var lpfnHook: LPOFNHOOKPROC = null,
    public var lpTemplateName: PCWSTR = 0L,
)

public data class PAGESETUPDLGA(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hDevMode: HGLOBAL = 0L,
    public var hDevNames: HGLOBAL = 0L,
    public var Flags: PAGESETUPDLG_FLAGS = 0u,
    public var ptPaperSize: POINT = POINT(),
    public var rtMinMargin: RECT = RECT(),
    public var rtMargin: RECT = RECT(),
    public var hInstance: HINSTANCE = 0L,
    public var lCustData: LPARAM = 0L,
    public var lpfnPageSetupHook: LPPAGESETUPHOOK = null,
    public var lpfnPagePaintHook: LPPAGEPAINTHOOK = null,
    public var lpPageSetupTemplateName: PCSTR = 0L,
    public var hPageSetupTemplate: HGLOBAL = 0L,
)

public data class PAGESETUPDLGW(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hDevMode: HGLOBAL = 0L,
    public var hDevNames: HGLOBAL = 0L,
    public var Flags: PAGESETUPDLG_FLAGS = 0u,
    public var ptPaperSize: POINT = POINT(),
    public var rtMinMargin: RECT = RECT(),
    public var rtMargin: RECT = RECT(),
    public var hInstance: HINSTANCE = 0L,
    public var lCustData: LPARAM = 0L,
    public var lpfnPageSetupHook: LPPAGESETUPHOOK = null,
    public var lpfnPagePaintHook: LPPAGEPAINTHOOK = null,
    public var lpPageSetupTemplateName: PCWSTR = 0L,
    public var hPageSetupTemplate: HGLOBAL = 0L,
)

public class PRINTDLGA(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hDevMode: HGLOBAL = 0L,
    public var hDevNames: HGLOBAL = 0L,
    public var hDC: HDC = 0L,
    public var Flags: PRINTDLGEX_FLAGS = 0u,
    public var nFromPage: UShort = 0u,
    public var nToPage: UShort = 0u,
    public var nMinPage: UShort = 0u,
    public var nMaxPage: UShort = 0u,
    public var nCopies: UShort = 0u,
    public var hInstance: HINSTANCE = 0L,
    public var lCustData: LPARAM = 0L,
    public var lpfnPrintHook: LPPRINTHOOKPROC = null,
    public var lpfnSetupHook: LPSETUPHOOKPROC = null,
    public var lpPrintTemplateName: PCSTR = 0L,
    public var lpSetupTemplateName: PCSTR = 0L,
    public var hPrintTemplate: HGLOBAL = 0L,
    public var hSetupTemplate: HGLOBAL = 0L,
)

public class PRINTDLGEXA(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hDevMode: HGLOBAL = 0L,
    public var hDevNames: HGLOBAL = 0L,
    public var hDC: HDC = 0L,
    public var Flags: PRINTDLGEX_FLAGS = 0u,
    public var Flags2: UInt = 0u,
    public var ExclusionFlags: UInt = 0u,
    public var nPageRanges: UInt = 0u,
    public var nMaxPageRanges: UInt = 0u,
    public var lpPageRanges: Long = 0L,
    public var nMinPage: UInt = 0u,
    public var nMaxPage: UInt = 0u,
    public var nCopies: UInt = 0u,
    public var hInstance: HINSTANCE = 0L,
    public var lpPrintTemplateName: PCSTR = 0L,
    public var lpCallback: Long = 0L,
    public var nPropertyPages: UInt = 0u,
    public var lphPropertyPages: Long = 0L,
    public var nStartPage: UInt = 0u,
    public var dwResultAction: UInt = 0u,
)

public class PRINTDLGEXW(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hDevMode: HGLOBAL = 0L,
    public var hDevNames: HGLOBAL = 0L,
    public var hDC: HDC = 0L,
    public var Flags: PRINTDLGEX_FLAGS = 0u,
    public var Flags2: UInt = 0u,
    public var ExclusionFlags: UInt = 0u,
    public var nPageRanges: UInt = 0u,
    public var nMaxPageRanges: UInt = 0u,
    public var lpPageRanges: Long = 0L,
    public var nMinPage: UInt = 0u,
    public var nMaxPage: UInt = 0u,
    public var nCopies: UInt = 0u,
    public var hInstance: HINSTANCE = 0L,
    public var lpPrintTemplateName: PCWSTR = 0L,
    public var lpCallback: Long = 0L,
    public var nPropertyPages: UInt = 0u,
    public var lphPropertyPages: Long = 0L,
    public var nStartPage: UInt = 0u,
    public var dwResultAction: UInt = 0u,
)

public class PRINTDLGW(
    public var lStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hDevMode: HGLOBAL = 0L,
    public var hDevNames: HGLOBAL = 0L,
    public var hDC: HDC = 0L,
    public var Flags: PRINTDLGEX_FLAGS = 0u,
    public var nFromPage: UShort = 0u,
    public var nToPage: UShort = 0u,
    public var nMinPage: UShort = 0u,
    public var nMaxPage: UShort = 0u,
    public var nCopies: UShort = 0u,
    public var hInstance: HINSTANCE = 0L,
    public var lCustData: LPARAM = 0L,
    public var lpfnPrintHook: LPPRINTHOOKPROC = null,
    public var lpfnSetupHook: LPSETUPHOOKPROC = null,
    public var lpPrintTemplateName: PCWSTR = 0L,
    public var lpSetupTemplateName: PCWSTR = 0L,
    public var hPrintTemplate: HGLOBAL = 0L,
    public var hSetupTemplate: HGLOBAL = 0L,
)

public data class PRINTPAGERANGE(public var nFromPage: UInt = 0u, public var nToPage: UInt = 0u)
