package io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARENUM

public fun PSCoerceToCanonicalValue(key: Long, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSCoerceToCanonicalValue", longArrayOf(key, ppropvar)).toInt()
}

public fun PSCreateAdapterFromPropertyStore(pps: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSCreateAdapterFromPropertyStore", longArrayOf(pps, riid, ppv)).toInt()
}

public fun PSCreateDelayedMultiplexPropertyStore(flags: GETPROPERTYSTOREFLAGS, pdpsf: Long, rgstoreids: Long, cstores: UInt, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSCreateDelayedMultiplexPropertyStore", longArrayOf(flags.toLong(), pdpsf, rgstoreids, cstores.toLong(), riid, ppv)).toInt()
}

public fun PSCreateMemoryPropertyStore(riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSCreateMemoryPropertyStore", longArrayOf(riid, ppv)).toInt()
}

public fun PSCreateMultiplexPropertyStore(prgpunkstores: Long, cstores: UInt, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSCreateMultiplexPropertyStore", longArrayOf(prgpunkstores, cstores.toLong(), riid, ppv)).toInt()
}

public fun PSCreatePropertyChangeArray(rgpropkey: Long, rgflags: Long, rgpropvar: Long, cchanges: UInt, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSCreatePropertyChangeArray", longArrayOf(rgpropkey, rgflags, rgpropvar, cchanges.toLong(), riid, ppv)).toInt()
}

public fun PSCreatePropertyStoreFromObject(punk: Long, grfmode: UInt, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSCreatePropertyStoreFromObject", longArrayOf(punk, grfmode.toLong(), riid, ppv)).toInt()
}

public fun PSCreatePropertyStoreFromPropertySetStorage(ppss: Long, grfmode: UInt, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSCreatePropertyStoreFromPropertySetStorage", longArrayOf(ppss, grfmode.toLong(), riid, ppv)).toInt()
}

public fun PSCreateSimplePropertyChange(flags: PKA_FLAGS, key: Long, propvar: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSCreateSimplePropertyChange", longArrayOf(flags.toLong(), key, propvar, riid, ppv)).toInt()
}

public fun PSEnumeratePropertyDescriptions(filteron: PROPDESC_ENUMFILTER, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSEnumeratePropertyDescriptions", longArrayOf(filteron.toLong(), riid, ppv)).toInt()
}

public fun PSFormatForDisplay(propkey: Long, propvar: Long, pdfflags: PROPDESC_FORMAT_FLAGS, pwsztext: PWSTR, cchtext: UInt): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSFormatForDisplay", longArrayOf(propkey, propvar, pdfflags.toLong(), pwsztext, cchtext.toLong())).toInt()
}

public fun PSFormatForDisplayAlloc(key: Long, propvar: Long, pdff: PROPDESC_FORMAT_FLAGS, ppszdisplay: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSFormatForDisplayAlloc", longArrayOf(key, propvar, pdff.toLong(), ppszdisplay)).toInt()
}

public fun PSFormatPropertyValue(pps: Long, ppd: Long, pdff: PROPDESC_FORMAT_FLAGS, ppszdisplay: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSFormatPropertyValue", longArrayOf(pps, ppd, pdff.toLong(), ppszdisplay)).toInt()
}

public fun PSGetImageReferenceForValue(propkey: Long, propvar: Long, ppszimageres: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSGetImageReferenceForValue", longArrayOf(propkey, propvar, ppszimageres)).toInt()
}

public fun PSGetItemPropertyHandler(punkitem: Long, freadwrite: BOOL, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSGetItemPropertyHandler", longArrayOf(punkitem, freadwrite.toLong(), riid, ppv)).toInt()
}

public fun PSGetItemPropertyHandlerWithCreateObject(punkitem: Long, freadwrite: BOOL, punkcreateobject: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSGetItemPropertyHandlerWithCreateObject", longArrayOf(punkitem, freadwrite.toLong(), punkcreateobject, riid, ppv)).toInt()
}

public fun PSGetNameFromPropertyKey(propkey: Long, ppszcanonicalname: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSGetNameFromPropertyKey", longArrayOf(propkey, ppszcanonicalname)).toInt()
}

public fun PSGetNamedPropertyFromPropertyStorage(psps: PCUSERIALIZEDPROPSTORAGE, cb: UInt, pszname: PCWSTR, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSGetNamedPropertyFromPropertyStorage", longArrayOf(psps, cb.toLong(), pszname, ppropvar)).toInt()
}

public fun PSGetPropertyDescription(propkey: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSGetPropertyDescription", longArrayOf(propkey, riid, ppv)).toInt()
}

public fun PSGetPropertyDescriptionByName(pszcanonicalname: PCWSTR, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSGetPropertyDescriptionByName", longArrayOf(pszcanonicalname, riid, ppv)).toInt()
}

public fun PSGetPropertyDescriptionListFromString(pszproplist: PCWSTR, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSGetPropertyDescriptionListFromString", longArrayOf(pszproplist, riid, ppv)).toInt()
}

public fun PSGetPropertyFromPropertyStorage(psps: PCUSERIALIZEDPROPSTORAGE, cb: UInt, rpkey: Long, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSGetPropertyFromPropertyStorage", longArrayOf(psps, cb.toLong(), rpkey, ppropvar)).toInt()
}

public fun PSGetPropertyKeyFromName(pszname: PCWSTR, ppropkey: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSGetPropertyKeyFromName", longArrayOf(pszname, ppropkey)).toInt()
}

public fun PSGetPropertySystem(riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSGetPropertySystem", longArrayOf(riid, ppv)).toInt()
}

public fun PSGetPropertyValue(pps: Long, ppd: Long, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSGetPropertyValue", longArrayOf(pps, ppd, ppropvar)).toInt()
}

public fun PSLookupPropertyHandlerCLSID(pszfilepath: PCWSTR, pclsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSLookupPropertyHandlerCLSID", longArrayOf(pszfilepath, pclsid)).toInt()
}

public fun PSPropertyBag_Delete(propbag: Long, propname: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_Delete", longArrayOf(propbag, propname)).toInt()
}

public fun PSPropertyBag_ReadBOOL(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadBOOL", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_ReadBSTR(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadBSTR", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_ReadDWORD(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadDWORD", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_ReadGUID(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadGUID", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_ReadInt(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadInt", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_ReadLONG(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadLONG", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_ReadPOINTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadPOINTL", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_ReadPOINTS(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadPOINTS", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_ReadPropertyKey(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadPropertyKey", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_ReadRECTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadRECTL", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_ReadSHORT(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadSHORT", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_ReadStr(propbag: Long, propname: PCWSTR, value: PWSTR, charactercount: Int): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadStr", longArrayOf(propbag, propname, value, charactercount.toLong())).toInt()
}

public fun PSPropertyBag_ReadStrAlloc(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadStrAlloc", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_ReadStream(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadStream", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_ReadType(propbag: Long, propname: PCWSTR, variable: Long, type: VARENUM): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadType", longArrayOf(propbag, propname, variable, type.toLong())).toInt()
}

public fun PSPropertyBag_ReadULONGLONG(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadULONGLONG", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_ReadUnknown(propbag: Long, propname: PCWSTR, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_ReadUnknown", longArrayOf(propbag, propname, riid, ppv)).toInt()
}

public fun PSPropertyBag_WriteBOOL(propbag: Long, propname: PCWSTR, value: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_WriteBOOL", longArrayOf(propbag, propname, value.toLong())).toInt()
}

public fun PSPropertyBag_WriteBSTR(propbag: Long, propname: PCWSTR, value: BSTR): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_WriteBSTR", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_WriteDWORD(propbag: Long, propname: PCWSTR, value: UInt): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_WriteDWORD", longArrayOf(propbag, propname, value.toLong())).toInt()
}

public fun PSPropertyBag_WriteGUID(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_WriteGUID", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_WriteInt(propbag: Long, propname: PCWSTR, value: Int): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_WriteInt", longArrayOf(propbag, propname, value.toLong())).toInt()
}

public fun PSPropertyBag_WriteLONG(propbag: Long, propname: PCWSTR, value: Int): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_WriteLONG", longArrayOf(propbag, propname, value.toLong())).toInt()
}

public fun PSPropertyBag_WritePOINTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_WritePOINTL", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_WritePOINTS(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_WritePOINTS", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_WritePropertyKey(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_WritePropertyKey", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_WriteRECTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_WriteRECTL", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_WriteSHORT(propbag: Long, propname: PCWSTR, value: Short): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_WriteSHORT", longArrayOf(propbag, propname, value.toLong())).toInt()
}

public fun PSPropertyBag_WriteStr(propbag: Long, propname: PCWSTR, value: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_WriteStr", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_WriteStream(propbag: Long, propname: PCWSTR, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_WriteStream", longArrayOf(propbag, propname, value)).toInt()
}

public fun PSPropertyBag_WriteULONGLONG(propbag: Long, propname: PCWSTR, value: ULong): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_WriteULONGLONG", longArrayOf(propbag, propname, value.toLong())).toInt()
}

public fun PSPropertyBag_WriteUnknown(propbag: Long, propname: PCWSTR, punk: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyBag_WriteUnknown", longArrayOf(propbag, propname, punk)).toInt()
}

public fun PSPropertyKeyFromString(pszstring: PCWSTR, pkey: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSPropertyKeyFromString", longArrayOf(pszstring, pkey)).toInt()
}

public fun PSRefreshPropertySchema(): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSRefreshPropertySchema", longArrayOf()).toInt()
}

public fun PSRegisterPropertySchema(pszpath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSRegisterPropertySchema", longArrayOf(pszpath)).toInt()
}

public fun PSSetPropertyValue(pps: Long, ppd: Long, propvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSSetPropertyValue", longArrayOf(pps, ppd, propvar)).toInt()
}

public fun PSStringFromPropertyKey(pkey: Long, psz: PWSTR, cch: UInt): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSStringFromPropertyKey", longArrayOf(pkey, psz, cch.toLong())).toInt()
}

public fun PSUnregisterPropertySchema(pszpath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PSUnregisterPropertySchema", longArrayOf(pszpath)).toInt()
}

public fun PifMgr_CloseProperties(hprops: HANDLE, flopt: UInt): HANDLE {
    return Win32DynamicFfi.invoke("shell32.dll", "PifMgr_CloseProperties", longArrayOf(hprops, flopt.toLong()))
}

public fun PifMgr_GetProperties(hprops: HANDLE, pszgroup: PCSTR, lpprops: Long, cbprops: Int, flopt: UInt): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "PifMgr_GetProperties", longArrayOf(hprops, pszgroup, lpprops, cbprops.toLong(), flopt.toLong())).toInt()
}

public fun PifMgr_OpenProperties(pszapp: PCWSTR, pszpif: PCWSTR, hinf: UInt, flopt: UInt): HANDLE {
    return Win32DynamicFfi.invoke("shell32.dll", "PifMgr_OpenProperties", longArrayOf(pszapp, pszpif, hinf.toLong(), flopt.toLong()))
}

public fun PifMgr_SetProperties(hprops: HANDLE, pszgroup: PCSTR, lpprops: Long, cbprops: Int, flopt: UInt): Int {
    return Win32DynamicFfi.invoke("shell32.dll", "PifMgr_SetProperties", longArrayOf(hprops, pszgroup, lpprops, cbprops.toLong(), flopt.toLong())).toInt()
}

public fun SHAddDefaultPropertiesByExt(pszext: PCWSTR, ppropstore: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHAddDefaultPropertiesByExt", longArrayOf(pszext, ppropstore)).toInt()
}

public fun SHGetPropertyStoreForWindow(hwnd: HWND, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetPropertyStoreForWindow", longArrayOf(hwnd, riid, ppv)).toInt()
}

public fun SHGetPropertyStoreFromIDList(pidl: Long, flags: GETPROPERTYSTOREFLAGS, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetPropertyStoreFromIDList", longArrayOf(pidl, flags.toLong(), riid, ppv)).toInt()
}

public fun SHGetPropertyStoreFromParsingName(pszpath: PCWSTR, pbc: Long, flags: GETPROPERTYSTOREFLAGS, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHGetPropertyStoreFromParsingName", longArrayOf(pszpath, pbc, flags.toLong(), riid, ppv)).toInt()
}

public fun SHPropStgCreate(psstg: Long, fmtid: Long, pclsid: Long, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: Long, pucodepage: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHPropStgCreate", longArrayOf(psstg, fmtid, pclsid, grfflags.toLong(), grfmode.toLong(), dwdisposition.toLong(), ppstg, pucodepage)).toInt()
}

public fun SHPropStgReadMultiple(pps: Long, ucodepage: UInt, cpspec: UInt, rgpspec: Long, rgvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHPropStgReadMultiple", longArrayOf(pps, ucodepage.toLong(), cpspec.toLong(), rgpspec, rgvar)).toInt()
}

public fun SHPropStgWriteMultiple(pps: Long, pucodepage: Long, cpspec: UInt, rgpspec: Long, rgvar: Long, propidnamefirst: UInt): HRESULT {
    return Win32DynamicFfi.invoke("shell32.dll", "SHPropStgWriteMultiple", longArrayOf(pps, pucodepage, cpspec.toLong(), rgpspec, rgvar, propidnamefirst.toLong())).toInt()
}
