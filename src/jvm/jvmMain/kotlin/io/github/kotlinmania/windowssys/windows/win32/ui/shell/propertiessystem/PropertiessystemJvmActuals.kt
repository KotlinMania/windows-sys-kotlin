@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARENUM

private object WindowsWin32UiShellPropertiessystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSCoerceToCanonicalValue(key: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSCreateAdapterFromPropertyStore(pps: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSCreateDelayedMultiplexPropertyStore(flags: Int, pdpsf: Long, rgstoreids: Long, cstores: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSCreateMemoryPropertyStore(riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSCreateMultiplexPropertyStore(prgpunkstores: Long, cstores: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyChangeArray(rgpropkey: Long, rgflags: Long, rgpropvar: Long, cchanges: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyStoreFromObject(punk: Long, grfmode: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyStoreFromPropertySetStorage(ppss: Long, grfmode: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSCreateSimplePropertyChange(flags: Int, key: Long, propvar: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSEnumeratePropertyDescriptions(filteron: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSFormatForDisplay(propkey: Long, propvar: Long, pdfflags: Int, pwsztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSFormatForDisplayAlloc(key: Long, propvar: Long, pdff: Int, ppszdisplay: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSFormatPropertyValue(pps: Long, ppd: Long, pdff: Int, ppszdisplay: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSGetImageReferenceForValue(propkey: Long, propvar: Long, ppszimageres: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSGetItemPropertyHandler(punkitem: Long, freadwrite: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSGetItemPropertyHandlerWithCreateObject(punkitem: Long, freadwrite: Int, punkcreateobject: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSGetNameFromPropertyKey(propkey: Long, ppszcanonicalname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSGetNamedPropertyFromPropertyStorage(psps: Long, cb: Int, pszname: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescription(propkey: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescriptionByName(pszcanonicalname: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescriptionListFromString(pszproplist: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyFromPropertyStorage(psps: Long, cb: Int, rpkey: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyKeyFromName(pszname: Long, ppropkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertySystem(riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyValue(pps: Long, ppd: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSLookupPropertyHandlerCLSID(pszfilepath: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_Delete(propbag: Long, propname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadBOOL(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadBSTR(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadDWORD(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadGUID(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadInt(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadLONG(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPOINTL(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPOINTS(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPropertyKey(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadRECTL(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadSHORT(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStr(propbag: Long, propname: Long, value: Long, charactercount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStrAlloc(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStream(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadType(propbag: Long, propname: Long, variable: Long, type: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadULONGLONG(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadUnknown(propbag: Long, propname: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteBOOL(propbag: Long, propname: Long, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteBSTR(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteDWORD(propbag: Long, propname: Long, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteGUID(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteInt(propbag: Long, propname: Long, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteLONG(propbag: Long, propname: Long, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePOINTL(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePOINTS(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePropertyKey(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteRECTL(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteSHORT(propbag: Long, propname: Long, value: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteStr(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteStream(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteULONGLONG(propbag: Long, propname: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteUnknown(propbag: Long, propname: Long, punk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyKeyFromString(pszstring: Long, pkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSRefreshPropertySchema(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSRegisterPropertySchema(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSSetPropertyValue(pps: Long, ppd: Long, propvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSStringFromPropertyKey(pkey: Long, psz: Long, cch: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PSUnregisterPropertySchema(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_CloseProperties(hprops: Long, flopt: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_GetProperties(hprops: Long, pszgroup: Long, lpprops: Long, cbprops: Int, flopt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_OpenProperties(pszapp: Long, pszpif: Long, hinf: Int, flopt: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_SetProperties(hprops: Long, pszgroup: Long, lpprops: Long, cbprops: Int, flopt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_SHAddDefaultPropertiesByExt(pszext: Long, ppropstore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreForWindow(hwnd: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreFromIDList(pidl: Long, flags: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreFromParsingName(pszpath: Long, pbc: Long, flags: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgCreate(psstg: Long, fmtid: Long, pclsid: Long, grfflags: Int, grfmode: Int, dwdisposition: Int, ppstg: Long, pucodepage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgReadMultiple(pps: Long, ucodepage: Int, cpspec: Int, rgpspec: Long, rgvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgWriteMultiple(pps: Long, pucodepage: Long, cpspec: Int, rgpspec: Long, rgvar: Long, propidnamefirst: Int): Int
}

public actual fun PSCoerceToCanonicalValue(key: Long, ppropvar: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSCoerceToCanonicalValue(key, ppropvar)

public actual fun PSCreateAdapterFromPropertyStore(pps: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSCreateAdapterFromPropertyStore(pps, riid, ppv)

public actual fun PSCreateDelayedMultiplexPropertyStore(flags: GETPROPERTYSTOREFLAGS, pdpsf: Long, rgstoreids: Long, cstores: UInt, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSCreateDelayedMultiplexPropertyStore(flags, pdpsf, rgstoreids, cstores.toInt(), riid, ppv)

public actual fun PSCreateMemoryPropertyStore(riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSCreateMemoryPropertyStore(riid, ppv)

public actual fun PSCreateMultiplexPropertyStore(prgpunkstores: Long, cstores: UInt, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSCreateMultiplexPropertyStore(prgpunkstores, cstores.toInt(), riid, ppv)

public actual fun PSCreatePropertyChangeArray(rgpropkey: Long, rgflags: Long, rgpropvar: Long, cchanges: UInt, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyChangeArray(rgpropkey, rgflags, rgpropvar, cchanges.toInt(), riid, ppv)

public actual fun PSCreatePropertyStoreFromObject(punk: Long, grfmode: UInt, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyStoreFromObject(punk, grfmode.toInt(), riid, ppv)

public actual fun PSCreatePropertyStoreFromPropertySetStorage(ppss: Long, grfmode: UInt, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSCreatePropertyStoreFromPropertySetStorage(ppss, grfmode.toInt(), riid, ppv)

public actual fun PSCreateSimplePropertyChange(flags: PKA_FLAGS, key: Long, propvar: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSCreateSimplePropertyChange(flags, key, propvar, riid, ppv)

public actual fun PSEnumeratePropertyDescriptions(filteron: PROPDESC_ENUMFILTER, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSEnumeratePropertyDescriptions(filteron, riid, ppv)

public actual fun PSFormatForDisplay(propkey: Long, propvar: Long, pdfflags: PROPDESC_FORMAT_FLAGS, pwsztext: PWSTR, cchtext: UInt): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSFormatForDisplay(propkey, propvar, pdfflags, pwsztext, cchtext.toInt())

public actual fun PSFormatForDisplayAlloc(key: Long, propvar: Long, pdff: PROPDESC_FORMAT_FLAGS, ppszdisplay: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSFormatForDisplayAlloc(key, propvar, pdff, ppszdisplay)

public actual fun PSFormatPropertyValue(pps: Long, ppd: Long, pdff: PROPDESC_FORMAT_FLAGS, ppszdisplay: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSFormatPropertyValue(pps, ppd, pdff, ppszdisplay)

public actual fun PSGetImageReferenceForValue(propkey: Long, propvar: Long, ppszimageres: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSGetImageReferenceForValue(propkey, propvar, ppszimageres)

public actual fun PSGetItemPropertyHandler(punkitem: Long, freadwrite: BOOL, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSGetItemPropertyHandler(punkitem, freadwrite, riid, ppv)

public actual fun PSGetItemPropertyHandlerWithCreateObject(punkitem: Long, freadwrite: BOOL, punkcreateobject: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSGetItemPropertyHandlerWithCreateObject(punkitem, freadwrite, punkcreateobject, riid, ppv)

public actual fun PSGetNameFromPropertyKey(propkey: Long, ppszcanonicalname: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSGetNameFromPropertyKey(propkey, ppszcanonicalname)

public actual fun PSGetNamedPropertyFromPropertyStorage(psps: PCUSERIALIZEDPROPSTORAGE, cb: UInt, pszname: PCWSTR, ppropvar: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSGetNamedPropertyFromPropertyStorage(psps, cb.toInt(), pszname, ppropvar)

public actual fun PSGetPropertyDescription(propkey: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescription(propkey, riid, ppv)

public actual fun PSGetPropertyDescriptionByName(pszcanonicalname: PCWSTR, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescriptionByName(pszcanonicalname, riid, ppv)

public actual fun PSGetPropertyDescriptionListFromString(pszproplist: PCWSTR, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyDescriptionListFromString(pszproplist, riid, ppv)

public actual fun PSGetPropertyFromPropertyStorage(psps: PCUSERIALIZEDPROPSTORAGE, cb: UInt, rpkey: Long, ppropvar: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyFromPropertyStorage(psps, cb.toInt(), rpkey, ppropvar)

public actual fun PSGetPropertyKeyFromName(pszname: PCWSTR, ppropkey: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyKeyFromName(pszname, ppropkey)

public actual fun PSGetPropertySystem(riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertySystem(riid, ppv)

public actual fun PSGetPropertyValue(pps: Long, ppd: Long, ppropvar: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSGetPropertyValue(pps, ppd, ppropvar)

public actual fun PSLookupPropertyHandlerCLSID(pszfilepath: PCWSTR, pclsid: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSLookupPropertyHandlerCLSID(pszfilepath, pclsid)

public actual fun PSPropertyBag_Delete(propbag: Long, propname: PCWSTR): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_Delete(propbag, propname)

public actual fun PSPropertyBag_ReadBOOL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadBOOL(propbag, propname, value)

public actual fun PSPropertyBag_ReadBSTR(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadBSTR(propbag, propname, value)

public actual fun PSPropertyBag_ReadDWORD(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadDWORD(propbag, propname, value)

public actual fun PSPropertyBag_ReadGUID(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadGUID(propbag, propname, value)

public actual fun PSPropertyBag_ReadInt(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadInt(propbag, propname, value)

public actual fun PSPropertyBag_ReadLONG(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadLONG(propbag, propname, value)

public actual fun PSPropertyBag_ReadPOINTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPOINTL(propbag, propname, value)

public actual fun PSPropertyBag_ReadPOINTS(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPOINTS(propbag, propname, value)

public actual fun PSPropertyBag_ReadPropertyKey(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadPropertyKey(propbag, propname, value)

public actual fun PSPropertyBag_ReadRECTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadRECTL(propbag, propname, value)

public actual fun PSPropertyBag_ReadSHORT(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadSHORT(propbag, propname, value)

public actual fun PSPropertyBag_ReadStr(propbag: Long, propname: PCWSTR, value: PWSTR, charactercount: Int): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStr(propbag, propname, value, charactercount)

public actual fun PSPropertyBag_ReadStrAlloc(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStrAlloc(propbag, propname, value)

public actual fun PSPropertyBag_ReadStream(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadStream(propbag, propname, value)

public actual fun PSPropertyBag_ReadType(propbag: Long, propname: PCWSTR, variable: Long, type: VARENUM): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadType(propbag, propname, variable, type.toShort())

public actual fun PSPropertyBag_ReadULONGLONG(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadULONGLONG(propbag, propname, value)

public actual fun PSPropertyBag_ReadUnknown(propbag: Long, propname: PCWSTR, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_ReadUnknown(propbag, propname, riid, ppv)

public actual fun PSPropertyBag_WriteBOOL(propbag: Long, propname: PCWSTR, value: BOOL): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteBOOL(propbag, propname, value)

public actual fun PSPropertyBag_WriteBSTR(propbag: Long, propname: PCWSTR, value: BSTR): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteBSTR(propbag, propname, value)

public actual fun PSPropertyBag_WriteDWORD(propbag: Long, propname: PCWSTR, value: UInt): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteDWORD(propbag, propname, value.toInt())

public actual fun PSPropertyBag_WriteGUID(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteGUID(propbag, propname, value)

public actual fun PSPropertyBag_WriteInt(propbag: Long, propname: PCWSTR, value: Int): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteInt(propbag, propname, value)

public actual fun PSPropertyBag_WriteLONG(propbag: Long, propname: PCWSTR, value: Int): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteLONG(propbag, propname, value)

public actual fun PSPropertyBag_WritePOINTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePOINTL(propbag, propname, value)

public actual fun PSPropertyBag_WritePOINTS(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePOINTS(propbag, propname, value)

public actual fun PSPropertyBag_WritePropertyKey(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WritePropertyKey(propbag, propname, value)

public actual fun PSPropertyBag_WriteRECTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteRECTL(propbag, propname, value)

public actual fun PSPropertyBag_WriteSHORT(propbag: Long, propname: PCWSTR, value: Short): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteSHORT(propbag, propname, value)

public actual fun PSPropertyBag_WriteStr(propbag: Long, propname: PCWSTR, value: PCWSTR): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteStr(propbag, propname, value)

public actual fun PSPropertyBag_WriteStream(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteStream(propbag, propname, value)

public actual fun PSPropertyBag_WriteULONGLONG(propbag: Long, propname: PCWSTR, value: ULong): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteULONGLONG(propbag, propname, value.toLong())

public actual fun PSPropertyBag_WriteUnknown(propbag: Long, propname: PCWSTR, punk: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyBag_WriteUnknown(propbag, propname, punk)

public actual fun PSPropertyKeyFromString(pszstring: PCWSTR, pkey: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSPropertyKeyFromString(pszstring, pkey)

public actual fun PSRefreshPropertySchema(): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSRefreshPropertySchema()

public actual fun PSRegisterPropertySchema(pszpath: PCWSTR): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSRegisterPropertySchema(pszpath)

public actual fun PSSetPropertyValue(pps: Long, ppd: Long, propvar: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSSetPropertyValue(pps, ppd, propvar)

public actual fun PSStringFromPropertyKey(pkey: Long, psz: PWSTR, cch: UInt): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSStringFromPropertyKey(pkey, psz, cch.toInt())

public actual fun PSUnregisterPropertySchema(pszpath: PCWSTR): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PSUnregisterPropertySchema(pszpath)

public actual fun PifMgr_CloseProperties(hprops: HANDLE, flopt: UInt): HANDLE =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_CloseProperties(hprops, flopt.toInt())

public actual fun PifMgr_GetProperties(hprops: HANDLE, pszgroup: PCSTR, lpprops: Long, cbprops: Int, flopt: UInt): Int =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_GetProperties(hprops, pszgroup, lpprops, cbprops, flopt.toInt())

public actual fun PifMgr_OpenProperties(pszapp: PCWSTR, pszpif: PCWSTR, hinf: UInt, flopt: UInt): HANDLE =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_OpenProperties(pszapp, pszpif, hinf.toInt(), flopt.toInt())

public actual fun PifMgr_SetProperties(hprops: HANDLE, pszgroup: PCSTR, lpprops: Long, cbprops: Int, flopt: UInt): Int =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_PifMgr_SetProperties(hprops, pszgroup, lpprops, cbprops, flopt.toInt())

public actual fun SHAddDefaultPropertiesByExt(pszext: PCWSTR, ppropstore: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_SHAddDefaultPropertiesByExt(pszext, ppropstore)

public actual fun SHGetPropertyStoreForWindow(hwnd: HWND, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreForWindow(hwnd, riid, ppv)

public actual fun SHGetPropertyStoreFromIDList(pidl: Long, flags: GETPROPERTYSTOREFLAGS, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreFromIDList(pidl, flags, riid, ppv)

public actual fun SHGetPropertyStoreFromParsingName(pszpath: PCWSTR, pbc: Long, flags: GETPROPERTYSTOREFLAGS, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_SHGetPropertyStoreFromParsingName(pszpath, pbc, flags, riid, ppv)

public actual fun SHPropStgCreate(psstg: Long, fmtid: Long, pclsid: Long, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: Long, pucodepage: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgCreate(psstg, fmtid, pclsid, grfflags.toInt(), grfmode.toInt(), dwdisposition.toInt(), ppstg, pucodepage)

public actual fun SHPropStgReadMultiple(pps: Long, ucodepage: UInt, cpspec: UInt, rgpspec: Long, rgvar: Long): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgReadMultiple(pps, ucodepage.toInt(), cpspec.toInt(), rgpspec, rgvar)

public actual fun SHPropStgWriteMultiple(pps: Long, pucodepage: Long, cpspec: UInt, rgpspec: Long, rgvar: Long, propidnamefirst: UInt): HRESULT =
    WindowsWin32UiShellPropertiessystemJniBridge.windowssys_windows_win32_ui_shell_propertiessystem_SHPropStgWriteMultiple(pps, pucodepage, cpspec.toInt(), rgpspec, rgvar, propidnamefirst.toInt())
