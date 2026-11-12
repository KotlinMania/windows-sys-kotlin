package io.github.kotlinmania.windowssys.windows.win32.system.ole

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

public typealias Activateflags = Int

public typealias ActiveobjectFlags = UInt

public typealias Bindspeed = Int

public typealias BusyDialogFlags = UInt

public typealias Changekind = Int

public typealias ChangeIconFlags = UInt

public typealias ChangeSourceFlags = UInt

public typealias ClipboardFormat = UShort

public typealias Ctrlinfo = Int

public typealias Discardcache = Int

public typealias Docmisc = Int

public typealias Dropeffect = UInt

public typealias Dvaspectinfoflag = Int

public typealias Dvextentmode = Int

public typealias EditLinksFlags = UInt

public typealias EmbdhlpFlags = UInt

public typealias EnumControlsWhichFlags = UInt

public typealias FdexPropFlags = UInt

public typealias Guidkind = Int

public typealias Hitresult = Int

public typealias Ignoremime = Int

public typealias InsertObjectFlags = UInt

public typealias Keymodifiers = UInt

public typealias Libflags = Int

public typealias LoadPictureFlags = UInt

public fun interface LpfnoleuihookFn {
    public operator fun invoke(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): UInt
}

public typealias Lpfnoleuihook = LpfnoleuihookFn?

public typealias MediaplaybackState = Int

public typealias MulticlassinfoFlags = UInt

public typealias NumparseFlags = UInt

public typealias ObjectPropertiesFlags = UInt

public typealias Oleclose = Int

public typealias Olecmdexecopt = Int

public typealias Olecmdf = Int

public typealias Olecmdid = Int

public typealias OlecmdidBrowserstateflag = Int

public typealias OlecmdidOpticalZoomflag = Int

public typealias OlecmdidPageactionflag = Int

public typealias OlecmdidRefreshflag = Int

public typealias OlecmdidViewportModeFlag = Int

public typealias OlecmdidWindowstateFlag = Int

public typealias Olecmdtextf = Int

public typealias Olecontf = Int

public typealias Olecreate = UInt

public typealias Oledcflags = Int

public typealias Olegetmoniker = Int

public typealias Oleiverb = Int

public typealias Olelinkbind = Int

public typealias Olemisc = Int

public typealias Olerender = Int

public fun interface OlestreamqueryconvertolelinkcallbackFn {
    public operator fun invoke(pclsid: ConstPtr, szclass: Pcwstr, sztopicname: Pcwstr, szitemname: Pcwstr, szuncname: Pcwstr, linkupdatingoption: UInt, pvcontext: ConstPtr): Hresult
}

public typealias Olestreamqueryconvertolelinkcallback = OlestreamqueryconvertolelinkcallbackFn?

public typealias Oleuipasteflag = Int

public typealias Oleupdate = Int

public typealias Oleverbattrib = Int

public typealias Olewhichmk = Int

public typealias OleHandle = UInt

public typealias OleTristate = Int

public typealias PageactionUi = Int

public typealias Paramflags = UShort

public typealias PasteSpecialFlags = UInt

public typealias Pictureattributes = Int

public typealias Pictype = Short

public typealias Pointerinactive = Int

public typealias Printflag = Int

public typealias Propbag2Type = Int

public typealias Proppagestatus = Int

public typealias Qacontainerflags = Int

public typealias Readystate = Int

public typealias Regkind = Int

public typealias SfType = Int

public typealias Typeflags = Int

public typealias Uasflags = Int

public typealias UiConvertFlags = UInt

public typealias UpdfcacheFlags = UInt

public typealias Userclasstype = Int

public typealias Varcmp = UInt

public typealias VarformatFirstDay = Int

public typealias VarformatFirstWeek = Int

public typealias VarformatGroup = Int

public typealias VarformatLeadingDigit = Int

public typealias VarformatNamedFormat = Int

public typealias VarformatParentheses = Int

public typealias Viewstatus = Int

public typealias ViewObjectPropertiesFlags = UInt

public typealias Wpcsetting = Int

public typealias Xformcoords = Int
