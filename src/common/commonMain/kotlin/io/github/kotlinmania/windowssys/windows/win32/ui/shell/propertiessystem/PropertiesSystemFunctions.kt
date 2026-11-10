package io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum

public expect fun pSCoerceToCanonicalValue(key: COpaquePointer?, ppropvar: COpaquePointer?): Hresult

public expect fun pSCreateAdapterFromPropertyStore(pps: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pSCreateDelayedMultiplexPropertyStore(flags: Getpropertystoreflags, pdpsf: COpaquePointer?, rgstoreids: COpaquePointer?, cstores: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pSCreateMemoryPropertyStore(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pSCreateMultiplexPropertyStore(prgpunkstores: COpaquePointer?, cstores: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pSCreatePropertyChangeArray(rgpropkey: COpaquePointer?, rgflags: COpaquePointer?, rgpropvar: COpaquePointer?, cchanges: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pSCreatePropertyStoreFromObject(punk: COpaquePointer?, grfmode: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pSCreatePropertyStoreFromPropertySetStorage(ppss: COpaquePointer?, grfmode: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pSCreateSimplePropertyChange(flags: PkaFlags, key: COpaquePointer?, propvar: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pSEnumeratePropertyDescriptions(filteron: PropdescEnumfilter, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pSFormatForDisplay(propkey: COpaquePointer?, propvar: COpaquePointer?, pdfflags: PropdescFormatFlags, pwsztext: Pwstr, cchtext: UInt): Hresult

public expect fun pSFormatForDisplayAlloc(key: COpaquePointer?, propvar: COpaquePointer?, pdff: PropdescFormatFlags, ppszdisplay: COpaquePointer?): Hresult

public expect fun pSFormatPropertyValue(pps: COpaquePointer?, ppd: COpaquePointer?, pdff: PropdescFormatFlags, ppszdisplay: COpaquePointer?): Hresult

public expect fun pSGetImageReferenceForValue(propkey: COpaquePointer?, propvar: COpaquePointer?, ppszimageres: COpaquePointer?): Hresult

public expect fun pSGetItemPropertyHandler(punkitem: COpaquePointer?, freadwrite: Bool, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pSGetItemPropertyHandlerWithCreateObject(punkitem: COpaquePointer?, freadwrite: Bool, punkcreateobject: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pSGetNameFromPropertyKey(propkey: COpaquePointer?, ppszcanonicalname: COpaquePointer?): Hresult

public expect fun pSGetNamedPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, pszname: Pcwstr, ppropvar: COpaquePointer?): Hresult

public expect fun pSGetPropertyDescription(propkey: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pSGetPropertyDescriptionByName(pszcanonicalname: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pSGetPropertyDescriptionListFromString(pszproplist: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pSGetPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, rpkey: COpaquePointer?, ppropvar: COpaquePointer?): Hresult

public expect fun pSGetPropertyKeyFromName(pszname: Pcwstr, ppropkey: COpaquePointer?): Hresult

public expect fun pSGetPropertySystem(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pSGetPropertyValue(pps: COpaquePointer?, ppd: COpaquePointer?, ppropvar: COpaquePointer?): Hresult

public expect fun pSLookupPropertyHandlerCLSID(pszfilepath: Pcwstr, pclsid: COpaquePointer?): Hresult

public expect fun pspropertyBagDelete(propbag: COpaquePointer?, propname: Pcwstr): Hresult

public expect fun pspropertyBagReadBool(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagReadBstr(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagReadDword(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagReadGuid(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagReadInt(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagReadLong(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagReadPointl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagReadPoints(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagReadPropertyKey(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagReadRectl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagReadShort(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagReadStr(propbag: COpaquePointer?, propname: Pcwstr, value: Pwstr, charactercount: Int): Hresult

public expect fun pspropertyBagReadStrAlloc(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagReadStream(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagReadType(propbag: COpaquePointer?, propname: Pcwstr, variable: COpaquePointer?, type: Varenum): Hresult

public expect fun pspropertyBagReadUlonglong(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagReadUnknown(propbag: COpaquePointer?, propname: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun pspropertyBagWriteBool(propbag: COpaquePointer?, propname: Pcwstr, value: Bool): Hresult

public expect fun pspropertyBagWriteBstr(propbag: COpaquePointer?, propname: Pcwstr, value: Bstr): Hresult

public expect fun pspropertyBagWriteDword(propbag: COpaquePointer?, propname: Pcwstr, value: UInt): Hresult

public expect fun pspropertyBagWriteGuid(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagWriteInt(propbag: COpaquePointer?, propname: Pcwstr, value: Int): Hresult

public expect fun pspropertyBagWriteLong(propbag: COpaquePointer?, propname: Pcwstr, value: Int): Hresult

public expect fun pspropertyBagWritePointl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagWritePoints(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagWritePropertyKey(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagWriteRectl(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagWriteShort(propbag: COpaquePointer?, propname: Pcwstr, value: Short): Hresult

public expect fun pspropertyBagWriteStr(propbag: COpaquePointer?, propname: Pcwstr, value: Pcwstr): Hresult

public expect fun pspropertyBagWriteStream(propbag: COpaquePointer?, propname: Pcwstr, value: COpaquePointer?): Hresult

public expect fun pspropertyBagWriteUlonglong(propbag: COpaquePointer?, propname: Pcwstr, value: ULong): Hresult

public expect fun pspropertyBagWriteUnknown(propbag: COpaquePointer?, propname: Pcwstr, punk: COpaquePointer?): Hresult

public expect fun pSPropertyKeyFromString(pszstring: Pcwstr, pkey: COpaquePointer?): Hresult

public expect fun pSRefreshPropertySchema(): Hresult

public expect fun pSRegisterPropertySchema(pszpath: Pcwstr): Hresult

public expect fun pSSetPropertyValue(pps: COpaquePointer?, ppd: COpaquePointer?, propvar: COpaquePointer?): Hresult

public expect fun pSStringFromPropertyKey(pkey: COpaquePointer?, psz: Pwstr, cch: UInt): Hresult

public expect fun pSUnregisterPropertySchema(pszpath: Pcwstr): Hresult

public expect fun pifMgrCloseProperties(hprops: Handle, flopt: UInt): Handle

public expect fun pifMgrGetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: COpaquePointer?, cbprops: Int, flopt: UInt): Int

public expect fun pifMgrOpenProperties(pszapp: Pcwstr, pszpif: Pcwstr, hinf: UInt, flopt: UInt): Handle

public expect fun pifMgrSetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: COpaquePointer?, cbprops: Int, flopt: UInt): Int

public expect fun sHAddDefaultPropertiesByExt(pszext: Pcwstr, ppropstore: COpaquePointer?): Hresult

public expect fun sHGetPropertyStoreForWindow(hwnd: Hwnd, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHGetPropertyStoreFromIDList(pidl: COpaquePointer?, flags: Getpropertystoreflags, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHGetPropertyStoreFromParsingName(pszpath: Pcwstr, pbc: COpaquePointer?, flags: Getpropertystoreflags, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHPropStgCreate(psstg: COpaquePointer?, fmtid: COpaquePointer?, pclsid: COpaquePointer?, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: COpaquePointer?, pucodepage: COpaquePointer?): Hresult

public expect fun sHPropStgReadMultiple(pps: COpaquePointer?, ucodepage: UInt, cpspec: UInt, rgpspec: COpaquePointer?, rgvar: COpaquePointer?): Hresult

public expect fun sHPropStgWriteMultiple(pps: COpaquePointer?, pucodepage: COpaquePointer?, cpspec: UInt, rgpspec: COpaquePointer?, rgvar: COpaquePointer?, propidnamefirst: UInt): Hresult
