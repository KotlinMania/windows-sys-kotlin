package io.github.kotlinmania.windowssys.windows.win32.system.ole

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM

public typealias ACTIVATEFLAGS = Int

public typealias ACTIVEOBJECT_FLAGS = UInt

public typealias BINDSPEED = Int

public typealias BUSY_DIALOG_FLAGS = UInt

public typealias CHANGEKIND = Int

public typealias CHANGE_ICON_FLAGS = UInt

public typealias CHANGE_SOURCE_FLAGS = UInt

public typealias CLIPBOARD_FORMAT = UShort

public typealias CTRLINFO = Int

public typealias DISCARDCACHE = Int

public typealias DOCMISC = Int

public typealias DROPEFFECT = UInt

public typealias DVASPECTINFOFLAG = Int

public typealias DVEXTENTMODE = Int

public typealias EDIT_LINKS_FLAGS = UInt

public typealias EMBDHLP_FLAGS = UInt

public typealias ENUM_CONTROLS_WHICH_FLAGS = UInt

public typealias FDEX_PROP_FLAGS = UInt

public typealias GUIDKIND = Int

public typealias HITRESULT = Int

public typealias IGNOREMIME = Int

public typealias INSERT_OBJECT_FLAGS = UInt

public typealias KEYMODIFIERS = UInt

public typealias LIBFLAGS = Int

public typealias LOAD_PICTURE_FLAGS = UInt

public fun interface LPFNOLEUIHOOKFn {
    public operator fun invoke(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): UInt
}

public typealias LPFNOLEUIHOOK = LPFNOLEUIHOOKFn?

public typealias MEDIAPLAYBACK_STATE = Int

public typealias MULTICLASSINFO_FLAGS = UInt

public typealias NUMPARSE_FLAGS = UInt

public typealias OBJECT_PROPERTIES_FLAGS = UInt

public typealias OLECLOSE = Int

public typealias OLECMDEXECOPT = Int

public typealias OLECMDF = Int

public typealias OLECMDID = Int

public typealias OLECMDID_BROWSERSTATEFLAG = Int

public typealias OLECMDID_OPTICAL_ZOOMFLAG = Int

public typealias OLECMDID_PAGEACTIONFLAG = Int

public typealias OLECMDID_REFRESHFLAG = Int

public typealias OLECMDID_VIEWPORT_MODE_FLAG = Int

public typealias OLECMDID_WINDOWSTATE_FLAG = Int

public typealias OLECMDTEXTF = Int

public typealias OLECONTF = Int

public typealias OLECREATE = UInt

public typealias OLEDCFLAGS = Int

public typealias OLEGETMONIKER = Int

public typealias OLEIVERB = Int

public typealias OLELINKBIND = Int

public typealias OLEMISC = Int

public typealias OLERENDER = Int

public fun interface OLESTREAMQUERYCONVERTOLELINKCALLBACKFn {
    public operator fun invoke(pclsid: Long, szclass: PCWSTR, sztopicname: PCWSTR, szitemname: PCWSTR, szuncname: PCWSTR, linkupdatingoption: UInt, pvcontext: Long): HRESULT
}

public typealias OLESTREAMQUERYCONVERTOLELINKCALLBACK = OLESTREAMQUERYCONVERTOLELINKCALLBACKFn?

public typealias OLEUIPASTEFLAG = Int

public typealias OLEUPDATE = Int

public typealias OLEVERBATTRIB = Int

public typealias OLEWHICHMK = Int

public typealias OLE_HANDLE = UInt

public typealias OLE_TRISTATE = Int

public typealias PAGEACTION_UI = Int

public typealias PARAMFLAGS = UShort

public typealias PASTE_SPECIAL_FLAGS = UInt

public typealias PICTUREATTRIBUTES = Int

public typealias PICTYPE = Short

public typealias POINTERINACTIVE = Int

public typealias PRINTFLAG = Int

public typealias PROPBAG2_TYPE = Int

public typealias PROPPAGESTATUS = Int

public typealias QACONTAINERFLAGS = Int

public typealias READYSTATE = Int

public typealias REGKIND = Int

public typealias SF_TYPE = Int

public typealias TYPEFLAGS = Int

public typealias UASFLAGS = Int

public typealias UI_CONVERT_FLAGS = UInt

public typealias UPDFCACHE_FLAGS = UInt

public typealias USERCLASSTYPE = Int

public typealias VARCMP = UInt

public typealias VARFORMAT_FIRST_DAY = Int

public typealias VARFORMAT_FIRST_WEEK = Int

public typealias VARFORMAT_GROUP = Int

public typealias VARFORMAT_LEADING_DIGIT = Int

public typealias VARFORMAT_NAMED_FORMAT = Int

public typealias VARFORMAT_PARENTHESES = Int

public typealias VIEWSTATUS = Int

public typealias VIEW_OBJECT_PROPERTIES_FLAGS = UInt

public typealias WPCSETTING = Int

public typealias XFORMCOORDS = Int
