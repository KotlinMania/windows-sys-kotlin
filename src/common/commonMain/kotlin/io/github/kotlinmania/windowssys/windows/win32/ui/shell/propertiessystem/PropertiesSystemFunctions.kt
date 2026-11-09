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

public expect fun PSCoerceToCanonicalValue(key: Long, ppropvar: Long): HRESULT

public expect fun PSCreateAdapterFromPropertyStore(pps: Long, riid: Long, ppv: Long): HRESULT

public expect fun PSCreateDelayedMultiplexPropertyStore(flags: GETPROPERTYSTOREFLAGS, pdpsf: Long, rgstoreids: Long, cstores: UInt, riid: Long, ppv: Long): HRESULT

public expect fun PSCreateMemoryPropertyStore(riid: Long, ppv: Long): HRESULT

public expect fun PSCreateMultiplexPropertyStore(prgpunkstores: Long, cstores: UInt, riid: Long, ppv: Long): HRESULT

public expect fun PSCreatePropertyChangeArray(rgpropkey: Long, rgflags: Long, rgpropvar: Long, cchanges: UInt, riid: Long, ppv: Long): HRESULT

public expect fun PSCreatePropertyStoreFromObject(punk: Long, grfmode: UInt, riid: Long, ppv: Long): HRESULT

public expect fun PSCreatePropertyStoreFromPropertySetStorage(ppss: Long, grfmode: UInt, riid: Long, ppv: Long): HRESULT

public expect fun PSCreateSimplePropertyChange(flags: PKA_FLAGS, key: Long, propvar: Long, riid: Long, ppv: Long): HRESULT

public expect fun PSEnumeratePropertyDescriptions(filteron: PROPDESC_ENUMFILTER, riid: Long, ppv: Long): HRESULT

public expect fun PSFormatForDisplay(propkey: Long, propvar: Long, pdfflags: PROPDESC_FORMAT_FLAGS, pwsztext: PWSTR, cchtext: UInt): HRESULT

public expect fun PSFormatForDisplayAlloc(key: Long, propvar: Long, pdff: PROPDESC_FORMAT_FLAGS, ppszdisplay: Long): HRESULT

public expect fun PSFormatPropertyValue(pps: Long, ppd: Long, pdff: PROPDESC_FORMAT_FLAGS, ppszdisplay: Long): HRESULT

public expect fun PSGetImageReferenceForValue(propkey: Long, propvar: Long, ppszimageres: Long): HRESULT

public expect fun PSGetItemPropertyHandler(punkitem: Long, freadwrite: BOOL, riid: Long, ppv: Long): HRESULT

public expect fun PSGetItemPropertyHandlerWithCreateObject(punkitem: Long, freadwrite: BOOL, punkcreateobject: Long, riid: Long, ppv: Long): HRESULT

public expect fun PSGetNameFromPropertyKey(propkey: Long, ppszcanonicalname: Long): HRESULT

public expect fun PSGetNamedPropertyFromPropertyStorage(psps: PCUSERIALIZEDPROPSTORAGE, cb: UInt, pszname: PCWSTR, ppropvar: Long): HRESULT

public expect fun PSGetPropertyDescription(propkey: Long, riid: Long, ppv: Long): HRESULT

public expect fun PSGetPropertyDescriptionByName(pszcanonicalname: PCWSTR, riid: Long, ppv: Long): HRESULT

public expect fun PSGetPropertyDescriptionListFromString(pszproplist: PCWSTR, riid: Long, ppv: Long): HRESULT

public expect fun PSGetPropertyFromPropertyStorage(psps: PCUSERIALIZEDPROPSTORAGE, cb: UInt, rpkey: Long, ppropvar: Long): HRESULT

public expect fun PSGetPropertyKeyFromName(pszname: PCWSTR, ppropkey: Long): HRESULT

public expect fun PSGetPropertySystem(riid: Long, ppv: Long): HRESULT

public expect fun PSGetPropertyValue(pps: Long, ppd: Long, ppropvar: Long): HRESULT

public expect fun PSLookupPropertyHandlerCLSID(pszfilepath: PCWSTR, pclsid: Long): HRESULT

public expect fun PSPropertyBag_Delete(propbag: Long, propname: PCWSTR): HRESULT

public expect fun PSPropertyBag_ReadBOOL(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_ReadBSTR(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_ReadDWORD(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_ReadGUID(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_ReadInt(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_ReadLONG(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_ReadPOINTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_ReadPOINTS(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_ReadPropertyKey(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_ReadRECTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_ReadSHORT(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_ReadStr(propbag: Long, propname: PCWSTR, value: PWSTR, charactercount: Int): HRESULT

public expect fun PSPropertyBag_ReadStrAlloc(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_ReadStream(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_ReadType(propbag: Long, propname: PCWSTR, variable: Long, type: VARENUM): HRESULT

public expect fun PSPropertyBag_ReadULONGLONG(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_ReadUnknown(propbag: Long, propname: PCWSTR, riid: Long, ppv: Long): HRESULT

public expect fun PSPropertyBag_WriteBOOL(propbag: Long, propname: PCWSTR, value: BOOL): HRESULT

public expect fun PSPropertyBag_WriteBSTR(propbag: Long, propname: PCWSTR, value: BSTR): HRESULT

public expect fun PSPropertyBag_WriteDWORD(propbag: Long, propname: PCWSTR, value: UInt): HRESULT

public expect fun PSPropertyBag_WriteGUID(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_WriteInt(propbag: Long, propname: PCWSTR, value: Int): HRESULT

public expect fun PSPropertyBag_WriteLONG(propbag: Long, propname: PCWSTR, value: Int): HRESULT

public expect fun PSPropertyBag_WritePOINTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_WritePOINTS(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_WritePropertyKey(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_WriteRECTL(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_WriteSHORT(propbag: Long, propname: PCWSTR, value: Short): HRESULT

public expect fun PSPropertyBag_WriteStr(propbag: Long, propname: PCWSTR, value: PCWSTR): HRESULT

public expect fun PSPropertyBag_WriteStream(propbag: Long, propname: PCWSTR, value: Long): HRESULT

public expect fun PSPropertyBag_WriteULONGLONG(propbag: Long, propname: PCWSTR, value: ULong): HRESULT

public expect fun PSPropertyBag_WriteUnknown(propbag: Long, propname: PCWSTR, punk: Long): HRESULT

public expect fun PSPropertyKeyFromString(pszstring: PCWSTR, pkey: Long): HRESULT

public expect fun PSRefreshPropertySchema(): HRESULT

public expect fun PSRegisterPropertySchema(pszpath: PCWSTR): HRESULT

public expect fun PSSetPropertyValue(pps: Long, ppd: Long, propvar: Long): HRESULT

public expect fun PSStringFromPropertyKey(pkey: Long, psz: PWSTR, cch: UInt): HRESULT

public expect fun PSUnregisterPropertySchema(pszpath: PCWSTR): HRESULT

public expect fun PifMgr_CloseProperties(hprops: HANDLE, flopt: UInt): HANDLE

public expect fun PifMgr_GetProperties(hprops: HANDLE, pszgroup: PCSTR, lpprops: Long, cbprops: Int, flopt: UInt): Int

public expect fun PifMgr_OpenProperties(pszapp: PCWSTR, pszpif: PCWSTR, hinf: UInt, flopt: UInt): HANDLE

public expect fun PifMgr_SetProperties(hprops: HANDLE, pszgroup: PCSTR, lpprops: Long, cbprops: Int, flopt: UInt): Int

public expect fun SHAddDefaultPropertiesByExt(pszext: PCWSTR, ppropstore: Long): HRESULT

public expect fun SHGetPropertyStoreForWindow(hwnd: HWND, riid: Long, ppv: Long): HRESULT

public expect fun SHGetPropertyStoreFromIDList(pidl: Long, flags: GETPROPERTYSTOREFLAGS, riid: Long, ppv: Long): HRESULT

public expect fun SHGetPropertyStoreFromParsingName(pszpath: PCWSTR, pbc: Long, flags: GETPROPERTYSTOREFLAGS, riid: Long, ppv: Long): HRESULT

public expect fun SHPropStgCreate(psstg: Long, fmtid: Long, pclsid: Long, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: Long, pucodepage: Long): HRESULT

public expect fun SHPropStgReadMultiple(pps: Long, ucodepage: UInt, cpspec: UInt, rgpspec: Long, rgvar: Long): HRESULT

public expect fun SHPropStgWriteMultiple(pps: Long, pucodepage: Long, cpspec: UInt, rgpspec: Long, rgvar: Long, propidnamefirst: UInt): HRESULT
