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

public actual fun PSCoerceToCanonicalValue(key: Long, ppropvar: Long): HRESULT =
    0

public actual fun PSCreateAdapterFromPropertyStore(pps: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSCreateDelayedMultiplexPropertyStore(flags: GETPROPERTYSTOREFLAGS, pdpsf: Long, rgstoreids: Long, cstores: UInt, riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSCreateMemoryPropertyStore(riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSCreateMultiplexPropertyStore(prgpunkstores: Long, cstores: UInt, riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSCreatePropertyChangeArray(rgpropkey: Long, rgflags: Long, rgpropvar: Long, cchanges: UInt, riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSCreatePropertyStoreFromObject(punk: Long, grfmode: UInt, riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSCreatePropertyStoreFromPropertySetStorage(ppss: Long, grfmode: UInt, riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSCreateSimplePropertyChange(flags: PKA_FLAGS, key: Long, propvar: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSEnumeratePropertyDescriptions(filteron: PROPDESC_ENUMFILTER, riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSFormatForDisplay(propkey: Long, propvar: Long, pdfflags: PROPDESC_FORMAT_FLAGS, pwsztext: PWSTR, cchtext: UInt): HRESULT =
    0

public actual fun PSFormatForDisplayAlloc(key: Long, propvar: Long, pdff: PROPDESC_FORMAT_FLAGS, ppszdisplay: Long): HRESULT =
    0

public actual fun PSFormatPropertyValue(pps: Long, ppd: Long, pdff: PROPDESC_FORMAT_FLAGS, ppszdisplay: Long): HRESULT =
    0

public actual fun PSGetImageReferenceForValue(propkey: Long, propvar: Long, ppszimageres: Long): HRESULT =
    0

public actual fun PSGetItemPropertyHandler(punkitem: Long, freadwrite: BOOL, riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSGetItemPropertyHandlerWithCreateObject(punkitem: Long, freadwrite: BOOL, punkcreateobject: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSGetNameFromPropertyKey(propkey: Long, ppszcanonicalname: Long): HRESULT =
    0

public actual fun PSGetNamedPropertyFromPropertyStorage(psps: PCUSERIALIZEDPROPSTORAGE, cb: UInt, pszname: PCWSTR, ppropvar: Long): HRESULT =
    0

public actual fun PSGetPropertyDescription(propkey: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSGetPropertyDescriptionByName(pszcanonicalname: PCWSTR, riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSGetPropertyDescriptionListFromString(pszproplist: PCWSTR, riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSGetPropertyFromPropertyStorage(psps: PCUSERIALIZEDPROPSTORAGE, cb: UInt, rpkey: Long, ppropvar: Long): HRESULT =
    0

public actual fun PSGetPropertyKeyFromName(pszname: PCWSTR, ppropkey: Long): HRESULT =
    0

public actual fun PSGetPropertySystem(riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSGetPropertyValue(pps: Long, ppd: Long, ppropvar: Long): HRESULT =
    0

public actual fun PSLookupPropertyHandlerCLSID(pszfilepath: PCWSTR, pclsid: Long): HRESULT =
    0

public actual fun PSPropertyBag_Delete(propbag: Long, propname: PCWSTR): HRESULT =
    0

public actual fun PSPropertyBag_ReadBOOL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_ReadBSTR(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_ReadDWORD(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_ReadGUID(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_ReadInt(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_ReadLONG(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_ReadPOINTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_ReadPOINTS(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_ReadPropertyKey(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_ReadRECTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_ReadSHORT(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_ReadStr(propbag: Long, propname: PCWSTR, value: PWSTR, charactercount: Int): HRESULT =
    0

public actual fun PSPropertyBag_ReadStrAlloc(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_ReadStream(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_ReadType(propbag: Long, propname: PCWSTR, variable: Long, type: VARENUM): HRESULT =
    0

public actual fun PSPropertyBag_ReadULONGLONG(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_ReadUnknown(propbag: Long, propname: PCWSTR, riid: Long, ppv: Long): HRESULT =
    0

public actual fun PSPropertyBag_WriteBOOL(propbag: Long, propname: PCWSTR, value: BOOL): HRESULT =
    0

public actual fun PSPropertyBag_WriteBSTR(propbag: Long, propname: PCWSTR, value: BSTR): HRESULT =
    0

public actual fun PSPropertyBag_WriteDWORD(propbag: Long, propname: PCWSTR, value: UInt): HRESULT =
    0

public actual fun PSPropertyBag_WriteGUID(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_WriteInt(propbag: Long, propname: PCWSTR, value: Int): HRESULT =
    0

public actual fun PSPropertyBag_WriteLONG(propbag: Long, propname: PCWSTR, value: Int): HRESULT =
    0

public actual fun PSPropertyBag_WritePOINTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_WritePOINTS(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_WritePropertyKey(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_WriteRECTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_WriteSHORT(propbag: Long, propname: PCWSTR, value: Short): HRESULT =
    0

public actual fun PSPropertyBag_WriteStr(propbag: Long, propname: PCWSTR, value: PCWSTR): HRESULT =
    0

public actual fun PSPropertyBag_WriteStream(propbag: Long, propname: PCWSTR, value: Long): HRESULT =
    0

public actual fun PSPropertyBag_WriteULONGLONG(propbag: Long, propname: PCWSTR, value: ULong): HRESULT =
    0

public actual fun PSPropertyBag_WriteUnknown(propbag: Long, propname: PCWSTR, punk: Long): HRESULT =
    0

public actual fun PSPropertyKeyFromString(pszstring: PCWSTR, pkey: Long): HRESULT =
    0

public actual fun PSRefreshPropertySchema(): HRESULT =
    0

public actual fun PSRegisterPropertySchema(pszpath: PCWSTR): HRESULT =
    0

public actual fun PSSetPropertyValue(pps: Long, ppd: Long, propvar: Long): HRESULT =
    0

public actual fun PSStringFromPropertyKey(pkey: Long, psz: PWSTR, cch: UInt): HRESULT =
    0

public actual fun PSUnregisterPropertySchema(pszpath: PCWSTR): HRESULT =
    0

public actual fun PifMgr_CloseProperties(hprops: HANDLE, flopt: UInt): HANDLE =
    0L

public actual fun PifMgr_GetProperties(hprops: HANDLE, pszgroup: PCSTR, lpprops: Long, cbprops: Int, flopt: UInt): Int =
    0

public actual fun PifMgr_OpenProperties(pszapp: PCWSTR, pszpif: PCWSTR, hinf: UInt, flopt: UInt): HANDLE =
    0L

public actual fun PifMgr_SetProperties(hprops: HANDLE, pszgroup: PCSTR, lpprops: Long, cbprops: Int, flopt: UInt): Int =
    0

public actual fun SHAddDefaultPropertiesByExt(pszext: PCWSTR, ppropstore: Long): HRESULT =
    0

public actual fun SHGetPropertyStoreForWindow(hwnd: HWND, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHGetPropertyStoreFromIDList(pidl: Long, flags: GETPROPERTYSTOREFLAGS, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHGetPropertyStoreFromParsingName(pszpath: PCWSTR, pbc: Long, flags: GETPROPERTYSTOREFLAGS, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHPropStgCreate(psstg: Long, fmtid: Long, pclsid: Long, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: Long, pucodepage: Long): HRESULT =
    0

public actual fun SHPropStgReadMultiple(pps: Long, ucodepage: UInt, cpspec: UInt, rgpspec: Long, rgvar: Long): HRESULT =
    0

public actual fun SHPropStgWriteMultiple(pps: Long, pucodepage: Long, cpspec: UInt, rgpspec: Long, rgvar: Long, propidnamefirst: UInt): HRESULT =
    0
